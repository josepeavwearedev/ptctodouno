package com.todouno.pruebatecnica.infraestucture.drivendadpter;

import com.todouno.pruebatecnica.domain.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public class ClientRepositoryAdapater implements ProductRepository {

    @Autowired
    ProductDataRepository productDataRepository;

    @Override
    public Flux<ProductData> getAllProducts() {
        return Flux.fromIterable(productDataRepository.findAll());
    }

    @Override
    public ProductData saveProduct(ProductData product) {
        return productDataRepository.save(product);
    }

    @Override
    public void deleteProduct(ProductData productData) {
        productDataRepository.delete(productData);
    }

}
