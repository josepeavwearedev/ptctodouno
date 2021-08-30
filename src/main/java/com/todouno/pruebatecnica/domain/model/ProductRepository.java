package com.todouno.pruebatecnica.domain.model;

import com.todouno.pruebatecnica.infraestucture.drivendadpter.ProductData;
import reactor.core.publisher.Flux;

public interface ProductRepository {
    Flux<ProductData> getAllProducts();

    ProductData saveProduct(ProductData product);

    void deleteProduct(ProductData productData);
}
