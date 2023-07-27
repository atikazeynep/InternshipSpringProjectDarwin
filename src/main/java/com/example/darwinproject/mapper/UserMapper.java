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

@Mapper(uses = {GeneralStatusMapper.class})
public interface UserMapper {
    GeneralStatusMapper INSTANCE = Mappers.getMapper(GeneralStatusMapper.class);
    @Mappings({@Mapping(source = "scrName", target = "screenName"),
            @Mapping(source = "pwd", target = "password"),
            @Mapping(source = "uname", target = "userName"),
            @Mapping(source = "gnlStEntity", target = "status"),
            @Mapping(source = "gnlTpEntity", target = "userType")
    })
    DarwinUser toUser(DarwinUserEntity userEntity);

    @InheritInverseConfiguration
    DarwinUserEntity toUserEntity(DarwinUser user);
}
