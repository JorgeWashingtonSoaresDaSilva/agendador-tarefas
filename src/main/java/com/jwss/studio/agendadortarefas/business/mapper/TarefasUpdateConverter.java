package com.jwss.studio.agendadortarefas.business.mapper;

import ch.qos.logback.core.model.ComponentModel;
import com.jwss.studio.agendadortarefas.business.dto.TarefasDTO;
import com.jwss.studio.agendadortarefas.infrastruture.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;


@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TarefasUpdateConverter {

    void updateTarefas(TarefasDTO dto, @MappingTarget TarefasEntity entity);


}
