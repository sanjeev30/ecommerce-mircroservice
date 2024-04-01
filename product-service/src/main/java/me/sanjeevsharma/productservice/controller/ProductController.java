package me.sanjeevsharma.productservice.controller;

import lombok.RequiredArgsConstructor;
import me.sanjeevsharma.productservice.dto.ProductRequest;
import me.sanjeevsharma.productservice.dto.ProductResponse;
import me.sanjeevsharma.productservice.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest product) {
        service.createProduct(product);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return service.getAllProducts();
    }

}
