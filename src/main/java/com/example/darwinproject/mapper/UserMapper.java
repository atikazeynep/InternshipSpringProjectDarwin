package com.example.darwinproject.mapper;

import com.example.darwinproject.domain.entities.DarwinUserEntity;
import com.example.darwinproject.domain.dto.DarwinUser;

import com.example.darwinproject.domain.dto.DarwinUser;
import com.example.darwinproject.domain.entities.DarwinUserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.springframework.data.convert.TypeMapper;

@Mapper(uses = {UserMapper.class})
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    @Mappings({@Mapping(source = "scrName", target = "screenName"),
            @Mapping(source = "pwd", target = "password"),
            @Mapping(source = "uname", target = "userName"),
            @Mapping(source = "gnlStEntity", target = "status"),
            @Mapping(source = "gnlTpEntity", target = "userType"),
            @Mapping(source = "cdate", target = "createDate"),
            @Mapping(source = "cuser", target = "createUser"),
            @Mapping(source = "udate", target = "updateDate"),
            @Mapping(source = "uuser", target = "updateUser"),
    })
    DarwinUser toUser(DarwinUserEntity userEntity);

    @InheritInverseConfiguration
    DarwinUserEntity toUserEntity(DarwinUser user);
}
