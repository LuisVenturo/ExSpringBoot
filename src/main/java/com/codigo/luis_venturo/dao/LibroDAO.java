package com.codigo.luis_venturo.dao;

import com.codigo.luis_venturo.entity.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroDAO extends JpaRepository<LibroEntity, Long> {
}
