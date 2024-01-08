package com.codigo.luis_venturo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "libro")
public class LibroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private int estado;

    @ManyToOne
    @JoinColumn(name = "editor_id", nullable = false)
    private EditorEntity editorEntity;

    @ManyToMany
    @JoinTable(
            name = "libro_autor",
            joinColumns = @JoinColumn(name = "libro_id"),
            inverseJoinColumns = @JoinColumn(name = "autor_id")
    )
    private Set<AutorEntity> autorEntities = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "libro_categoria",
            joinColumns = @JoinColumn(name = "libro_id"),
            inverseJoinColumns = @JoinColumn(name = "categoria_id")
    )
    private Set<CategoriaEntity> categoriaEntities = new HashSet<>();

}
