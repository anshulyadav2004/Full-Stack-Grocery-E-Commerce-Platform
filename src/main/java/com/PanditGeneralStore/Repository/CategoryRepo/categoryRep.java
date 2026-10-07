package com.PanditGeneralStore.Repository.CategoryRepo;

import com.PanditGeneralStore.Entities.CategoryEntity.category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface categoryRep extends JpaRepository<category,Long> {
    List<category> findAll();
    List<category> findBySlug(String slug);

}
