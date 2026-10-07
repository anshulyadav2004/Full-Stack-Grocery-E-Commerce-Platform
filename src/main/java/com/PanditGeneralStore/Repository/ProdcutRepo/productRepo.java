package com.PanditGeneralStore.Repository.ProdcutRepo;

import com.PanditGeneralStore.Entities.ProductEntity.productEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface productRepo extends JpaRepository<productEntity,Long> {
    List<productEntity> findAll();
}
