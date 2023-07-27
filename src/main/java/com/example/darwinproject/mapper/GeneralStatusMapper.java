package com.example.darwinproject.mapper;

import com.example.darwinproject.domain.dto.GeneralStatus;
import com.example.darwinproject.domain.dto.GeneralType;
import com.example.darwinproject.domain.entities.GnlStEntity;
import com.example.darwinproject.domain.entities.GnlTpEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface GeneralStatusMapper {
    @Mappings({
            @Mapping(source = "descr", target = "description"),
            @Mapping(source = "shrtCode", target = "shortCode"),
            @Mapping(source = "is_actv", target = "isActive"),
            @Mapping(source = "prodOfrEntities", target = "productOffers"),
            @Mapping(source = "prodOfrChValEntities", target = "productOfferCharValues"),
            @Mapping(source = "userEntities", target = "users")
    })
    GeneralStatus sourceToDestination(GnlStEntity source);
    GnlStEntity destinationToSource(GeneralStatus destination);
}
