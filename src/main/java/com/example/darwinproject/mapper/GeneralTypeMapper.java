package com.example.darwinproject.mapper;

import com.example.darwinproject.domain.dto.GeneralType;
import com.example.darwinproject.domain.entities.GnlTpEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;

@Mapper
public interface GeneralTypeMapper {
    GeneralTypeMapper INSTANCE = Mappers.getMapper(GeneralTypeMapper.class);

    @Mappings({
            @Mapping(source = "descr", target = "description"),
            @Mapping(source = "prodOfrEntities", target = "productOffers"),
            @Mapping(source = "userEntities", target = "users")
   })
    GeneralType sourceToDestination(GnlTpEntity source);
    GnlTpEntity destinationToSource(GeneralType destination);
}
