package demo.dao;

import demo.entity.Order;

import java.util.List;

/**
 * @Auther: hsh
 * @Date: 2021/4/8 10:59
 * @Description: //TODO
 */
public interface OrderDao {
    List<Order> selectOrder(List<Integer> id);
}
