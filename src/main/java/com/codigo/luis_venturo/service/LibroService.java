package com.codigo.luis_venturo.service;

import com.codigo.luis_venturo.entity.AutorEntity;
import com.codigo.luis_venturo.entity.LibroEntity;

import java.util.List;

public interface LibroService {
    LibroEntity crearLibro(LibroEntity libroEntity);
    LibroEntity LeerLibroPorId(Long id) throws Exception;
    LibroEntity actualizarLibro(Long id, LibroEntity libroEntity);
    LibroEntity eliminarLibro(Long id);
    List<LibroEntity> listarLibro();
}
