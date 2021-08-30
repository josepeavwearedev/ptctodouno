package com.todouno.pruebatecnica;

import com.todouno.pruebatecnica.domain.model.ProductRepository;
import com.todouno.pruebatecnica.domain.usecase.ProductUseCase;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class BeanConfig {

    @Bean
    public ProductUseCase productUseCaseBean(ProductRepository productRepository) {
        return new ProductUseCase(productRepository);
    }
}
