package com.jwss.studio.agendadortarefas.business;

import com.jwss.studio.agendadortarefas.business.dto.TarefasDTO;
import com.jwss.studio.agendadortarefas.business.mapper.TarefasConverter;
import com.jwss.studio.agendadortarefas.infrastruture.entity.TarefasEntity;
import com.jwss.studio.agendadortarefas.infrastruture.enums.StatusNotificacaoEnum;
import com.jwss.studio.agendadortarefas.infrastruture.repository.TarefasRepository;
import com.jwss.studio.agendadortarefas.infrastruture.security.JwtUtil;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@RequiredArgsConstructor
@Service
public class TarefasService {

    private final TarefasRepository tarefasRepository;

    private final TarefasConverter tarefasConverter;
    private final JwtUtil jwtUtil;

    public TarefasDTO gravarTarefa(String token, TarefasDTO dto) {
        String email = jwtUtil.exttraiEmailToken(token.substring(7));
        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
        dto.setEmailUsuario(email);
        TarefasEntity entity = tarefasConverter.paraTarefaEntity(dto);

        return tarefasConverter.paraTarefaDTO(tarefasRepository.save(entity));
    }


}
