package com.jwss.studio.agendadortarefas.infrastruture.repository;

import com.jwss.studio.agendadortarefas.infrastruture.entity.TarefasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TarefasRepository extends MongoRepository<TarefasEntity, String> {


    List<TarefasEntity> findByDataEventoBetween(LocalDateTime dataInicial, LocalDateTime dataFinal);


    List<TarefasEntity> findByEmailUsuario( String email);
}

