package com.PanditGeneralStore.Controllers.MyController;


import com.PanditGeneralStore.Entities.CategoryEntity.category;
import com.PanditGeneralStore.Entities.ProductEntity.productEntity;
import com.PanditGeneralStore.Repository.ProdcutRepo.productRepo;
import com.PanditGeneralStore.Services.CategroyService.categoryService;
import com.PanditGeneralStore.Services.productEntityService.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("/user")
public class Controller {
    @Autowired
    private  categoryService categoryService;
    @Autowired
    private productService productService;
    @GetMapping("index")
    public String index(Model model) {

        List<category> categories = categoryService.getCategories();
        model.addAttribute("categories", categories);
        return "index";
    }

    @GetMapping("/products")
    public String product(@RequestParam(required = false) String category, Model model) {


        System.out.println(category);
        List<category> categories;
          if(category == null){
                categories = categoryService.getCategories();
                model.addAttribute("categories", categories);
          }else {
              categories = categoryService.getBySlug(category);
              model.addAttribute("categories", categories);
          }


        return "products";
    }

    @GetMapping("/deals")
    public String deals() {
        return "deals";
    }
    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }
}
