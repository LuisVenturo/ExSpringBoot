package com.codigo.luis_venturo.service.impl;

import com.codigo.luis_venturo.dao.CategoriaDAO;
import com.codigo.luis_venturo.entity.AutorEntity;
import com.codigo.luis_venturo.entity.CategoriaEntity;
import com.codigo.luis_venturo.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaDAO categoriaDAO;

    @Override
    public CategoriaEntity crearCategoria(CategoriaEntity categoriaEntity) {
        return categoriaDAO.save(categoriaEntity);
    }

    @Override
    public CategoriaEntity LeerCategoriaPorId(Long id) throws Exception {
        Optional<CategoriaEntity> categoriaEntity = categoriaDAO.findById(id);
        if(categoriaEntity.isPresent()){
            return categoriaEntity.get();
        }else{
            throw new Exception("Error No existe");
        }
    }

    @Override
    public CategoriaEntity actualizarCategoria(Long id, CategoriaEntity categoriaEntity) {
        CategoriaEntity categoria = categoriaDAO.findById(id).orElse(null);

        if (categoria != null){
            categoria.setNombre(categoriaEntity.getNombre());
            categoria.setEstado(categoriaEntity.getEstado());
            return categoriaDAO.save(categoria);
        }
        return null;
    }

    @Override
    public CategoriaEntity eliminarCategoria(Long id) {
        CategoriaEntity categoria = categoriaDAO.findById(id).orElse(null);
        if (categoria != null){
            categoriaDAO.deleteById(id);
            return categoria;
        }
        return null;
    }

    @Override
    public List<CategoriaEntity> listarCategoria() {
        List<CategoriaEntity> categoriaEntityList = new ArrayList<>();
        categoriaEntityList = categoriaDAO.findAll();
        return categoriaEntityList;
    }
}
