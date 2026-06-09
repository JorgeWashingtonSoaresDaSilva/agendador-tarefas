package com.jwss.studio.agendadortarefas.business.mapper;


import com.jwss.studio.agendadortarefas.business.dto.TarefasDTO;
import com.jwss.studio.agendadortarefas.infrastruture.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@Mapper(componentModel = "spring")

public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);


}
