package com.order.data.service;

import com.order.data.dto.OrderRequest;
import com.order.data.entity.Order;

public interface OrderService {

    Order placeOrder(OrderRequest orderRequest);
}
