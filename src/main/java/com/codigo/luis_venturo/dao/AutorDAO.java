package com.codigo.luis_venturo.dao;

import com.codigo.luis_venturo.entity.AutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorDAO extends JpaRepository<AutorEntity, Long> {
}
