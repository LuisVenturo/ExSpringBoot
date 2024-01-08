package com.codigo.luis_venturo.controller;

import com.codigo.luis_venturo.entity.CategoriaEntity;
import com.codigo.luis_venturo.entity.LibroEntity;
import com.codigo.luis_venturo.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/crearCategoria")
    CategoriaEntity crearCategoria(@RequestBody CategoriaEntity categoriaEntity){
        return categoriaService.crearCategoria(categoriaEntity);
    }

    @GetMapping("/leerCategoria/{id}")
    CategoriaEntity LeerCategoriaPorId(@PathVariable Long id) throws Exception {
        return categoriaService.LeerCategoriaPorId(id);
    }

    @PutMapping("actualizarCategoria/{id}")
    CategoriaEntity actualizarCategoria(@PathVariable Long id, @RequestBody CategoriaEntity categoriaEntity){
        return categoriaService.actualizarCategoria(id, categoriaEntity);
    }

    @DeleteMapping("/eliminarCategoria/{id}")
    CategoriaEntity eliminarCategoria(@PathVariable Long id){
        return categoriaService.eliminarCategoria(id);
    }

    @GetMapping("/listarCategoria")
    List<CategoriaEntity> listarCategoria(){
        return categoriaService.listarCategoria();
    }
}
