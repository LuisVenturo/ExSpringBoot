package com.codigo.luis_venturo.service;

import com.codigo.luis_venturo.entity.AutorEntity;
import com.codigo.luis_venturo.entity.EditorEntity;

import java.util.List;

public interface EditorService {
    EditorEntity crearEditor(EditorEntity editorEntity);
    EditorEntity LeerEditorPorId(Long id) throws Exception;
    EditorEntity actualizarEditor(Long id, EditorEntity editorEntity);
    EditorEntity eliminarEditor(Long id);
    List<EditorEntity> listarEditor();
}
