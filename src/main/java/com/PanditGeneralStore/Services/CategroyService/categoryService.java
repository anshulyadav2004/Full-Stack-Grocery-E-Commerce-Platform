package com.PanditGeneralStore.Services.CategroyService;

import com.PanditGeneralStore.Entities.CategoryEntity.category;
import com.PanditGeneralStore.Repository.CategoryRepo.categoryRep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class categoryService {

    private categoryRep categoryRep;
    public categoryService( categoryRep categoryRep){
        this.categoryRep = categoryRep;
    }
 public List<category> getCategories(){

      return categoryRep.findAll();


 }

 public List<category> getBySlug(String slug){
        return categoryRep.findBySlug(slug);
 }

}
