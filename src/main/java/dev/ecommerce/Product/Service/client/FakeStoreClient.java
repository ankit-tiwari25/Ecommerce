package dev.ecommerce.Product.Service.client;

import dev.ecommerce.Product.Service.dto.FakeStoreProductRatingDTO;
import dev.ecommerce.Product.Service.dto.FakeStoreResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class FakeStoreClient {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @Value("${fakestore.api.base.url}")
    private String fakeStoreAPIBaseUrl;
    @Value("${fakestore.api.product.path}")
    private String fakeStorAPIProductPath;

    public List<FakeStoreResponseDTO> getAllProducts(){
        String fakeStoreGetAllProductUrl = fakeStoreAPIBaseUrl.concat(fakeStorAPIProductPath);
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreResponseDTO[]> productList = restTemplate.getForEntity(fakeStoreGetAllProductUrl, FakeStoreResponseDTO[].class);
        return  List.of(productList.getBody());
    }
}
