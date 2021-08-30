package com.todouno.pruebatecnica.domain.usecase;

import com.todouno.pruebatecnica.domain.model.Product;
import com.todouno.pruebatecnica.domain.model.ProductRepository;
import com.todouno.pruebatecnica.infraestucture.entrypoint.ProductDTO;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static com.todouno.pruebatecnica.domain.usecase.Convertidor.convertir;
import static com.todouno.pruebatecnica.domain.usecase.Convertidor.convertirDtoAData;

@AllArgsConstructor
public class ProductUseCase {
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return StreamSupport.stream(productRepository.getAllProducts().spliterator(), false)
                .map(Convertidor::convertir)
                .collect(Collectors.toList());
    }

    public Product saveProduct(ProductDTO productDto) {
        return convertir(productRepository.saveProduct(convertirDtoAData(productDto)));
    }

    public Product updateProduct(ProductDTO productDto) {
        return convertir(productRepository.saveProduct(convertirDtoAData(productDto)));
    }

    public void deleteProduct(ProductDTO productDto) {
        productRepository.deleteProduct(convertirDtoAData(productDto));
    }
}
