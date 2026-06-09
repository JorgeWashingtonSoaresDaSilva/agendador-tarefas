package com.jwss.studio.agendadortarefas.infrastruture.repository;

import com.jwss.studio.agendadortarefas.infrastruture.entity.TarefasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends MongoRepository<TarefasEntity, String> {

}
