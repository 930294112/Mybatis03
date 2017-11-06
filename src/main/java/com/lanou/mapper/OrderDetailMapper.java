package com.lanou.mapper;

import com.lanou.domain.OrderDetail;

import java.util.List;

/**
 * Created by dllo on 17/11/6.
 */
public interface OrderDetailMapper {

    List<OrderDetail> findOrderDetailToOrder();

    List<OrderDetail> findOrderDetailToOrder(List<Integer> ids);
}
