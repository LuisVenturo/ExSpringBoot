package com.codigo.luis_venturo.dao;

import com.codigo.luis_venturo.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaDAO extends JpaRepository<CategoriaEntity, Long> {
}
