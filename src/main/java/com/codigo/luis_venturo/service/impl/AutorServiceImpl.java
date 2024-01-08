package com.codigo.luis_venturo.service.impl;

import com.codigo.luis_venturo.dao.AutorDAO;
import com.codigo.luis_venturo.entity.AutorEntity;
import com.codigo.luis_venturo.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AutorServiceImpl implements AutorService {
    @Autowired
    private AutorDAO autorDAO;


    @Override
    public AutorEntity crearAutor(AutorEntity autorEntity) {
        return autorDAO.save(autorEntity);
    }

    @Override
    public AutorEntity LeerAutorPorId(Long id) throws Exception {
        Optional<AutorEntity> autor = autorDAO.findById(id);
        if(autor.isPresent()){
            return autor.get();
        }else{
            throw new Exception("Error No existe");
        }
    }

    @Override
    public AutorEntity actualizarAutor(Long id, AutorEntity autorEntity) {

        AutorEntity autor = autorDAO.findById(id).orElse(null);

        if (autor != null){
            autor.setNombre(autorEntity.getNombre());
            autor.setEstado(autorEntity.getEstado());
            return autorDAO.save(autor);
        }
        return null;
    }

    @Override
    public AutorEntity eliminarAutor(Long id) {
        AutorEntity autor = autorDAO.findById(id).orElse(null);
        if (autor != null){
            autorDAO.deleteById(id);
            return autor;
        }
        return null;
    }

    @Override
    public List<AutorEntity> listarAutor() {
        List<AutorEntity> autorEntityList = new ArrayList<>();
        autorEntityList = autorDAO.findAll();
        return autorEntityList;
    }
}
