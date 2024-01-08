package com.codigo.luis_venturo.service.impl;

import com.codigo.luis_venturo.dao.LibroDAO;
import com.codigo.luis_venturo.entity.EditorEntity;
import com.codigo.luis_venturo.entity.LibroEntity;
import com.codigo.luis_venturo.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImpl implements LibroService {
    @Autowired
    private LibroDAO libroDAO;


    @Override
    public LibroEntity crearLibro(LibroEntity libroEntity) {
        return libroDAO.save(libroEntity);

    }

    @Override
    public LibroEntity LeerLibroPorId(Long id) throws Exception {
        Optional<LibroEntity> libroEntity = libroDAO.findById(id);
        if (libroEntity.isPresent()){
            return libroEntity.get();
        }else {
            throw new Exception("Error no existe");
        }
    }

    @Override
    public LibroEntity actualizarLibro(Long id, LibroEntity libroEntity) {
        LibroEntity libro = libroDAO.findById(id).orElse(null);

        if (libro != null){
            libro.setTitulo(libroEntity.getTitulo());
            libro.setEstado(libroEntity.getEstado());
            libro.setEditorEntity(libroEntity.getEditorEntity());
            libro.setAutorEntities(libroEntity.getAutorEntities());
            libro.setCategoriaEntities(libroEntity.getCategoriaEntities());
            return libroDAO.save(libro);
        }
        return null;
    }

    @Override
    public LibroEntity eliminarLibro(Long id) {
        LibroEntity libro = libroDAO.findById(id).orElse(null);
        if (libro != null){
            libroDAO.deleteById(id);
            return libro;
        }
        return null;
    }

    @Override
    public List<LibroEntity> listarLibro() {
        List<LibroEntity> libroEntityList = new ArrayList<>();
        libroEntityList = libroDAO.findAll();
        return libroEntityList;
    }
}
