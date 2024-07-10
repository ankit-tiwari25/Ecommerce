package dev.ecommerce.Product.Service.mapper;

import dev.ecommerce.Product.Service.dto.ProductResponseDTO;
import dev.ecommerce.Product.Service.entity.Product;

public class ProductEntityDTOMapper {
    public  static ProductResponseDTO convertToProductDTO(Product product){
        ProductResponseDTO responseDTO = new ProductResponseDTO();
        responseDTO.setProductId(product.getId());
        responseDTO.setDescription(product.getDescription());
        responseDTO.setCategory(product.getCategory());
        responseDTO.setTitle(product.getTitle());
        responseDTO.setPrice(product.getPrice());
        responseDTO.setImage(product.getImage());
        return responseDTO;
    }
}
