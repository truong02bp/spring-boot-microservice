package com.order.data.controller;

import com.order.data.dto.OrderRequest;
import com.order.data.entity.Order;
import com.order.data.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> placeOrder(@RequestBody OrderRequest orderRequest) {
        return ResponseEntity.ok(orderService.placeOrder(orderRequest));
    }
}
