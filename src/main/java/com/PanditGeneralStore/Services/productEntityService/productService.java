package com.PanditGeneralStore.Services.productEntityService;

import com.PanditGeneralStore.Entities.ProductEntity.productEntity;
import com.PanditGeneralStore.Repository.ProdcutRepo.productRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class productService {
    private productRepo productRepo;
    public productService(productRepo productRepo) {
        this.productRepo = productRepo;
    }
    public List<productEntity> getProducts() {
        List<productEntity> products = productRepo.findAll();
        return  products;
    }

}
