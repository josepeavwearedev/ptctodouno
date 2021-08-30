package com.todouno.pruebatecnica.domain.usecase;

import com.todouno.pruebatecnica.domain.model.Product;
import com.todouno.pruebatecnica.domain.model.ProductRepository;
import com.todouno.pruebatecnica.infraestucture.drivendadpter.ProductData;
import com.todouno.pruebatecnica.infraestucture.entrypoint.ProductDTO;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;

import static com.todouno.pruebatecnica.domain.usecase.Convertirdor.convertirDtoAData;

@AllArgsConstructor
public class ProductUseCase {
    private ProductRepository productRepository;

    public Flux<Product> getAllProducts() {
        return productRepository.getAllProducts().map(Convertirdor::convertir);
    }

    public ProductData saveProduct(ProductDTO productDto) {
        return productRepository.saveProduct(convertirDtoAData(productDto));
    }

    public ProductData updateProduct(ProductDTO productDto) {
        return productRepository.saveProduct(convertirDtoAData(productDto));
    }

    public void deleteProduct(ProductDTO productDto) {
        productRepository.deleteProduct(convertirDtoAData(productDto));;
    }
}
