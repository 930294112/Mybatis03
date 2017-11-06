package com.lanou.mapper;

import com.lanou.domain.User;

import java.util.List;

/**
 * Created by dllo on 17/11/6.
 */
public interface UserMapper {
    /**
     * 批量查询主键id
     * @param ids 要查询的id集合
      * @return
     */
    List<User> findByIds(List<Integer> ids);

    /**
     * 查询特定用户id名下购买的商品
     * @param ids 用户id集合
     * @return 返回包含了商品信息的集合
     */
    List<User> findUserToItem (List<Integer> ids);
}
