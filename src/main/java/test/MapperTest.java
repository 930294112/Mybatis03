package test;

import com.lanou.domain.Order;
import com.lanou.domain.OrderDetail;
import com.lanou.domain.User;
import com.lanou.domain_ext.OrderExt;
import com.lanou.mapper.OrderDetailMapper;
import com.lanou.mapper.OrderMapper;
import com.lanou.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 17/11/6.
 */
public class MapperTest {

    private SqlSession session;
    private UserMapper userMapper;
    private OrderMapper orderMapper;
    private OrderDetailMapper orderDetailMapper;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        session = sessionFactory.openSession(true);
        userMapper = session.getMapper(UserMapper.class);
        orderMapper = session.getMapper(OrderMapper.class);
       orderDetailMapper = session.getMapper(OrderDetailMapper.class);

    }

    @After
    public void close(){
        session.close();
    }

    /**
     * 订单表-用户信息
     * 一对一关系
     */
    @Test
    public void findOrderToUser(){
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);

        //根据订单id查询订单&用户信息
        List<Order> orders = orderMapper.findOrderToUser(ids);

        for (Order order  : orders) {
            System.out.println(order);
            System.out.println(order.getUser());
        }
    }

    @Test
    public void findOrderDetailToOrder(){
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        List<OrderDetail> orderDetails = orderDetailMapper.findOrderDetailToOrder(ids);
        for (OrderDetail orderDetail : orderDetails) {
            System.out.println(orderDetail);
            System.out.println(orderDetail.getOrder());
            System.out.println("****************");
        }
    }

    /**
     * 根据订单查询对应的订单详情
     * 一对多测试
     */
    @Test
    public void findOrderToOrderDetail(){
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);

        List<Order> orders = orderMapper.findOrderToOrderDetail(ids);
        for (Order order : orders) {
            System.out.println(order);
            for (OrderDetail orderDetail : order.getOrderDetails()) {
                System.out.println(orderDetail);
            }

        }
    }

    /**
     * 用户购买的商品列表  多对多查询
     */
    @Test
    public void findUserToItem(){
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(3);

        List<User> users = userMapper.findUserToItem(ids);
        for (User user : users) {
            System.out.println("**********客户***********");
            System.out.println(user);
            System.out.println("*********订单***********");
            for (Order order : user.getOrders()) {
                System.out.println(order);
                System.out.println("********订单明细************");
                for (OrderDetail orderDetail : order.getOrderDetails()) {
                    System.out.println(orderDetail);
                    System.out.println("*********商品明细***********");
                    System.out.println(orderDetail.getItem());
                }
            }
        }

    }

}
