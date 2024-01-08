package com.codigo.luis_venturo.controller;

import com.codigo.luis_venturo.entity.CategoriaEntity;
import com.codigo.luis_venturo.entity.EditorEntity;
import com.codigo.luis_venturo.service.CategoriaService;
import com.codigo.luis_venturo.service.EditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/editor")
public class EditorController {

    @Autowired
    private EditorService editorService;

    @PostMapping("/crearEditor")
    EditorEntity crearEditor(@RequestBody EditorEntity editorEntity){
        return editorService.crearEditor(editorEntity);
    }

    @GetMapping("/leerEditor/{id}")
    EditorEntity LeerEditorPorId(@PathVariable Long id) throws Exception {
        return editorService.LeerEditorPorId(id);
    }

    @PutMapping("actualizarEditor/{id}")
    EditorEntity actualizarEditor(@PathVariable Long id, @RequestBody EditorEntity editorEntity){
        return editorService.actualizarEditor(id, editorEntity);
    }

    @DeleteMapping("/eliminarEditor/{id}")
    EditorEntity eliminarEditor(@PathVariable Long id){
        return editorService.eliminarEditor(id);
    }

    @GetMapping("/listarEditor")
    List<EditorEntity> listarEditor(){
        return editorService.listarEditor();
    }
}
