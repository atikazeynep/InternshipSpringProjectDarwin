package com.example.darwinproject.service;

import com.example.darwinproject.config.CreateRequest;
import com.example.darwinproject.config.GenericListResponse;
import com.example.darwinproject.config.GenericResponse;
import com.example.darwinproject.config.CreateResponse;
import com.example.darwinproject.domain.dto.DarwinUser;
import com.example.darwinproject.domain.entities.DarwinUserEntity;
import com.example.darwinproject.exception.UserExistsException;
import com.example.darwinproject.mapper.*;
import com.example.darwinproject.repository.StatusRepository;
import com.example.darwinproject.repository.TypeRepository;
import com.example.darwinproject.repository.UserRepository;
import jakarta.validation.Valid;
import org.apache.catalina.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
@Validated
@Service
public class UserService {
    private final UserRepository userRepository;
    private final TypeRepository typeRepository;
    private final StatusRepository statusRepository;
    private GeneralStatusMapperImpl generalStatusMapper = new GeneralStatusMapperImpl();
    private GeneralTypeMapperImpl generalTypeMapper = new GeneralTypeMapperImpl();

    public UserService(UserRepository userRepository, TypeRepository typeRepository, StatusRepository statusRepository) {
        this.userRepository = userRepository;
        this.typeRepository = typeRepository;
        this.statusRepository = statusRepository;
    }

    public List<DarwinUser> findAll() {
        System.out.println("ALL USERS ARE SENT");
        List<DarwinUser> result = new ArrayList<DarwinUser>();
        for(DarwinUserEntity entity: userRepository.findAll()){
            result.add(UserMapper.INSTANCE.toUser(entity));
        }

        return result;
    }

    public GenericResponse<Object> createUser(@Valid @RequestBody CreateRequest request) throws SQLException {
        try{
            if(userRepository.findByUserId(request.getUserId()) != null){
                throw new UserExistsException("A user with this username already exists");
            }
            DarwinUser user = new DarwinUser(null
                    , request.getScreenName(), request.getUserName()
                    , generalStatusMapper.sourceToDestination(statusRepository.findByStatusId(request.getStatus()))
                    , generalTypeMapper.sourceToDestination(typeRepository.findByTypeId(request.getUserType()))
            );

            user.setPassword(generateCommonLangPassword());
            user.setCreateDate(LocalDate.now());
            DarwinUserEntity savedUser = userRepository.save(UserMapper.INSTANCE.toUserEntity(user));
            CreateResponse response = new CreateResponse(savedUser.getUserId(), savedUser.getScrName(), savedUser.getUname(), savedUser.getCdate());
            return GenericResponse.createSuccessResponse(response);
        }catch(UserExistsException e){
            return GenericResponse.createFailResponse(request);
        }
        catch (Exception e){
            System.out.println(e.toString());
            return GenericResponse.createFailResponse(request);
        }
    }

    public void deleteById(long id) {
        userRepository.removeByUserId(id);
    }

    public GenericListResponse<List> findById(long id) {
        DarwinUser user = UserMapper.INSTANCE.toUser(userRepository.findByUserId(id));
        List datas = new ArrayList();
        datas.add(user.getScreenName());
        datas.add(user.getUserName());
        datas.add(user.getCreateDate());
        datas.add(user.getUserType().getName());
        datas.add(user.getStatus().getName());

        return GenericListResponse.createSuccessResponse(datas);
    }

    public String generateCommonLangPassword() {
        String upperCaseLetters = RandomStringUtils.random(2, 65, 90, true, true);
        String lowerCaseLetters = RandomStringUtils.random(2, 97, 122, true, true);
        String numbers = RandomStringUtils.randomNumeric(2);
        String specialChar = RandomStringUtils.random(2, 33, 47, false, false);
        String totalChars = RandomStringUtils.randomAlphanumeric(2);
        String combinedChars = upperCaseLetters.concat(lowerCaseLetters)
                .concat(numbers)
                .concat(specialChar)
                .concat(totalChars);
        List<Character> pwdChars = combinedChars.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        Collections.shuffle(pwdChars);
        String password = pwdChars.stream()
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        return password;
    }

}
