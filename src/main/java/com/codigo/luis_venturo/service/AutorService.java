package com.codigo.luis_venturo.service;

import com.codigo.luis_venturo.entity.AutorEntity;

import java.util.List;

public interface AutorService {
    AutorEntity crearAutor(AutorEntity autorEntity);
    AutorEntity LeerAutorPorId(Long id) throws Exception;
    AutorEntity actualizarAutor(Long id, AutorEntity autorEntity);
    AutorEntity eliminarAutor(Long id);
    List<AutorEntity> listarAutor();


}
