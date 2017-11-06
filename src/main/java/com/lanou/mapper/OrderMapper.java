package com.lanou.mapper;

import com.lanou.domain.Order;
import com.lanou.domain_ext.OrderExt;

import java.util.List;

/**
 * Created by dllo on 17/11/6.
 */
public interface OrderMapper {
    /**
     * 根据id查找id对应的用户信息
     * @param ids 订单主键
     * @return 返回订单扩展类集合,该集合返回包含订单信息以及用户信息
     */
    List<Order> findOrderToUser(List<Integer> ids);

    /**
     * 根据id查找对应的订单详情(一对多)
     * @param ids 要查询的主键id
     * @return 返回订单的集合
     */
    List<Order> findOrderToOrderDetail(List<Integer> ids);
}
