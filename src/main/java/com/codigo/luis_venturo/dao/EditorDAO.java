package com.codigo.luis_venturo.dao;

import com.codigo.luis_venturo.entity.EditorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorDAO extends JpaRepository<EditorEntity, Long> {
}
