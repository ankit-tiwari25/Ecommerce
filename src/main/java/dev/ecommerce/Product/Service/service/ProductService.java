package dev.ecommerce.Product.Service.service;

import dev.ecommerce.Product.Service.dto.FakeStoreResponseDTO;
import dev.ecommerce.Product.Service.entity.Product;

import java.util.List;

public interface ProductService {
     List<FakeStoreResponseDTO> getAllProducts();
     Product getProductById(int productId);
     Product createProduct(Product product);
     Product updateProduct(Product product, int productId);
     boolean deleteProduct(int productId);

}
