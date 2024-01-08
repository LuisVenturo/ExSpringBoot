package com.codigo.luis_venturo.controller;

import com.codigo.luis_venturo.entity.AutorEntity;
import com.codigo.luis_venturo.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/autor")
public class AutorController {
    @Autowired //inyeccion de dependencia del service
    private AutorService autorService;

    @PostMapping
    AutorEntity crearAutor(@RequestBody AutorEntity autorEntity){
        return autorService.crearAutor(autorEntity);
    }

    @GetMapping("/{id}")
    AutorEntity LeerAutorPorId(@PathVariable Long id) throws Exception {
        return autorService.LeerAutorPorId(id);
    }

    @PutMapping("/{id}")
    AutorEntity actualizarAutor(@PathVariable Long id, @RequestBody AutorEntity autorEntity){
        return autorService.actualizarAutor(id, autorEntity);
    }

    @DeleteMapping("/{id}")
    AutorEntity eliminarAutor(@PathVariable Long id){
        return autorService.eliminarAutor(id);
    }

    @GetMapping
    List<AutorEntity> listarAutor(){
        return autorService.listarAutor();
    }

}
