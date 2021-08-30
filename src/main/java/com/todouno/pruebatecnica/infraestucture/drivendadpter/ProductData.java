package com.todouno.pruebatecnica.infraestucture.drivendadpter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "products")
@AllArgsConstructor
@NoArgsConstructor
public class ProductData {
    @Id
    private String id;
    private String name;
    private String description;
    private Long quantity;
}
