package com.todouno.pruebatecnica.domain.usecase;

import com.todouno.pruebatecnica.domain.model.ProductRepository;
import com.todouno.pruebatecnica.infraestucture.drivendadpter.ProductData;
import com.todouno.pruebatecnica.infraestucture.entrypoint.ProductDTO;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static com.todouno.pruebatecnica.domain.usecase.Convertirdor.convertirDtoAData;

@AllArgsConstructor
public class ProductUseCase {
    private ProductRepository productRepository;

    public List<ProductData> getAllProducts() {
        return StreamSupport.stream(productRepository.getAllProducts().spliterator(), false)
                .collect(Collectors.toList());
    }

    public ProductData saveProduct(ProductDTO productDto) {
        return productRepository.saveProduct(convertirDtoAData(productDto));
    }

    public ProductData updateProduct(ProductDTO productDto) {
        return productRepository.saveProduct(convertirDtoAData(productDto));
    }

    public void deleteProduct(ProductDTO productDto) {
        productRepository.deleteProduct(convertirDtoAData(productDto));
    }
}
