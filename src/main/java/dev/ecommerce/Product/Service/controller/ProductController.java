package dev.ecommerce.Product.Service.controller;

import dev.ecommerce.Product.Service.dto.FakeStoreResponseDTO;
import dev.ecommerce.Product.Service.entity.Product;
import dev.ecommerce.Product.Service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;
    @GetMapping("/product")
    ResponseEntity getAllProducts(){
        List<FakeStoreResponseDTO> productList = productService.getAllProducts();
        return ResponseEntity.ok(productList);
    }
}
