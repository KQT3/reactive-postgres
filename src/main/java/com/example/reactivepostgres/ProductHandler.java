package com.example.reactivepostgres;

import org.reactivestreams.Publisher;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;
//
//@Component
public class ProductHandler {

//    final ProductService productService;
//
//    public ProductHandler(ProductService productService) {
//        this.productService = productService;
//    }
//
//    public Mono<ServerResponse> create(ServerRequest request) {
//        Flux<Product> flux = request
//                .bodyToFlux(Product.class)
//                .flatMap(this.productService::updateProduct);
//        return defaultWriteResponse(flux);
//    }
//
//    public Mono<ServerResponse> all(ServerRequest r) {
//        return defaultReadResponse(this.productService.getAllProducts());
//    }
//
//    public Mono<ServerResponse> deleteById(ServerRequest r) {
//        return defaultReadResponse(this.productService.delete(id(r)));
//    }
//
//    private static Mono<ServerResponse> defaultReadResponse(Publisher<Product> products) {
//        return ServerResponse
//                .ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(products, Product.class);
//    }
//
//    private static Mono<ServerResponse> defaultWriteResponse(Publisher<Product> product) {
//        return Mono
//                .from(product)
//                .flatMap(p -> ServerResponse
//                        .created(URI.create("/product"))
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .build()
//                );
//    }
//
//    private static String id(ServerRequest r) {
//        return r.pathVariable("id");
////        return Integer.parseInt(r.pathVariable("id"));
//    }
}
