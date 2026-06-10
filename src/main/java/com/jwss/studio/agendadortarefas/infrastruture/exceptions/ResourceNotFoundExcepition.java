package com.jwss.studio.agendadortarefas.infrastruture.exceptions;

public class ResourceNotFoundExcepition  extends  RuntimeException{

    public ResourceNotFoundExcepition(String mensagem){
        super(mensagem);
    }
    public ResourceNotFoundExcepition(String mensagem, Throwable throwable){
        super(mensagem,throwable);
    }


}
