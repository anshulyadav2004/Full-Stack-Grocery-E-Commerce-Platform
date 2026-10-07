package com.PanditGeneralStore.Entities.ProductEntity;

import com.PanditGeneralStore.Accessories.statusConverter;
import com.PanditGeneralStore.Entities.CategoryEntity.category;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Products")
public class productEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @ManyToOne(fetch = FetchType.EAGER)
    private category category;
    private String weight;
    private Double price;
    private Double originalPrice;
    private String discount;
    @Convert(converter = statusConverter.class)
    private boolean inStock;
    private String description;



}
