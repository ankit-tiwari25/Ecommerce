package dev.ecommerce.Product.Service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDTO {
    private int productId;
    private String title;
    private double price;
    private  String description;
    private String image;
    private String category;
}
