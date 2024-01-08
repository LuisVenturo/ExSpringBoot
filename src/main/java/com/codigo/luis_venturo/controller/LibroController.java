package com.codigo.luis_venturo.controller;

import com.codigo.luis_venturo.entity.LibroEntity;
import com.codigo.luis_venturo.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/libro")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @PostMapping("/crearLibro")
    LibroEntity crearLibro(@RequestBody LibroEntity libroEntity){
        return libroService.crearLibro(libroEntity);
    }

    @GetMapping("/leerLibro/{id}")
    LibroEntity LeerLibroPorId(@PathVariable Long id) throws Exception {
        return libroService.LeerLibroPorId(id);
    }

    @PutMapping("actualizarLibro/{id}")
    LibroEntity actualizarLibro(@PathVariable Long id, @RequestBody LibroEntity libroEntity){
        return libroService.actualizarLibro(id, libroEntity);
    }

    @DeleteMapping("/eliminarLibro/{id}")
    LibroEntity eliminarLibro(@PathVariable Long id){
        return libroService.eliminarLibro(id);
    }

    @GetMapping("/listarLibro")
    List<LibroEntity> listarLibro(){
        return libroService.listarLibro();
    }
}
