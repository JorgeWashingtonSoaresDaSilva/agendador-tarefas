package com.jwss.studio.agendadortarefas.business.mapper;


import com.jwss.studio.agendadortarefas.business.dto.TarefasDTO;
import com.jwss.studio.agendadortarefas.infrastruture.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Mapper(componentModel = "spring")

public interface TarefasConverter {
    @Mapping(source = "id", target = "id")
    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);

    List<TarefasEntity> paraListaTarefasEntity(List<TarefasDTO> dtos);

    List<TarefasDTO> paraListaTarefasDTO(List<TarefasEntity> entities);
}
