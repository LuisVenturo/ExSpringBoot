package com.codigo.luis_venturo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "editor")
public class EditorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int estado;

    @OneToMany(mappedBy = "editorEntity")
    private Set<LibroEntity> libroEntities = new HashSet<>();

}
