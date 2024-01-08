package com.codigo.luis_venturo.service;

import com.codigo.luis_venturo.entity.AutorEntity;
import com.codigo.luis_venturo.entity.CategoriaEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CategoriaService {
    CategoriaEntity crearCategoria(CategoriaEntity categoriaEntity);
    CategoriaEntity LeerCategoriaPorId(Long id) throws Exception;
    CategoriaEntity actualizarCategoria(Long id, CategoriaEntity categoriaEntity);
    CategoriaEntity eliminarCategoria(Long id);
    List<CategoriaEntity> listarCategoria();
}
