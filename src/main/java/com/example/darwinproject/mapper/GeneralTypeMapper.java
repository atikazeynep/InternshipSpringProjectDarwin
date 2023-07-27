package com.example.darwinproject.mapper;

import com.example.darwinproject.domain.dto.GeneralType;
import com.example.darwinproject.domain.entities.GnlTpEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface GeneralTypeMapper {
    @Mappings({
            @Mapping(source = "descr", target = "description"),
            @Mapping(source = "prodOfrEntities", target = "productOffers"),
            @Mapping(source = "userEntities", target = "users")
   })
    GeneralType map(GnlTpEntity source);
    GnlTpEntity map(GeneralType destination);
}
