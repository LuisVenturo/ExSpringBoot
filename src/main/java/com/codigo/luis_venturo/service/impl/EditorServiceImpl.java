package com.codigo.luis_venturo.service.impl;

import com.codigo.luis_venturo.dao.EditorDAO;
import com.codigo.luis_venturo.entity.CategoriaEntity;
import com.codigo.luis_venturo.entity.EditorEntity;
import com.codigo.luis_venturo.service.EditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EditorServiceImpl implements EditorService {
    @Autowired
    private EditorDAO editorDAO;

    @Override
    public EditorEntity crearEditor(EditorEntity editorEntity) {
        return editorDAO.save(editorEntity);
    }

    @Override
    public EditorEntity LeerEditorPorId(Long id) throws Exception {
        Optional<EditorEntity> editorEntity = editorDAO.findById(id);
        if (editorEntity.isPresent()){
            return editorEntity.get();
        }else {
            throw new Exception("Error no existe");
        }
    }

    @Override
    public EditorEntity actualizarEditor(Long id, EditorEntity editorEntity) {
        EditorEntity editor = editorDAO.findById(id).orElse(null);

        if (editor != null){
            editor.setNombre(editorEntity.getNombre());
            editor.setEstado(editorEntity.getEstado());
            return editorDAO.save(editor);
        }
        return null;
    }

    @Override
    public EditorEntity eliminarEditor(Long id) {
        EditorEntity editor = editorDAO.findById(id).orElse(null);
        if (editor != null){
            editorDAO.deleteById(id);
            return editor;
        }
        return null;
    }

    @Override
    public List<EditorEntity> listarEditor() {
        List<EditorEntity> editorEntityList = new ArrayList<>();
        editorEntityList = editorDAO.findAll();
        return editorEntityList;
    }
}
