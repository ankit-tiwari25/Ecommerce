package dev.ecommerce.Product.Service.serviceImpl;

import dev.ecommerce.Product.Service.client.FakeStoreClient;
import dev.ecommerce.Product.Service.dto.FakeStoreResponseDTO;
import dev.ecommerce.Product.Service.entity.Product;
import dev.ecommerce.Product.Service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProductServiceImpl implements ProductService {
    @Autowired
    private FakeStoreClient fakeStoreClient;
    @Override
    public List<FakeStoreResponseDTO> getAllProducts() {
        return fakeStoreClient.getAllProducts();
    }

    @Override
    public Product getProductById(int productId) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product product, int productId) {
        return null;
    }

    @Override
    public boolean deleteProduct(int productId) {
        return false;
    }
}
