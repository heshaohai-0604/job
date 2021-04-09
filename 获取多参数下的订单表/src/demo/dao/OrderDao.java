package demo.dao;

import demo.entity.Order;

import java.util.List;
import java.util.Map;

/**
 * @Auther: hsh
 * @Date: 2021/4/8 10:59
 * @Description: //TODO
 */
public interface OrderDao {
    List<Order> selectOrder(Map<String, String> orderMap);
}
