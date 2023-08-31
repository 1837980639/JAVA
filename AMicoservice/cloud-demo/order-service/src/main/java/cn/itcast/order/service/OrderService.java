package cn.itcast.order.service;

import cn.itcast.order.clients.UserClient;
import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.pojo.Order;
import cn.itcast.order.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;


    @Autowired
    private UserClient userClient;
// 使用Feign调用
    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);

        String url = "http://userservice/user/"+order.getUserId();

        // 用Feign远程调用
        User user = userClient.FindById(order.getUserId());
        order.setUser(user);//存入order的user中
        // 4.返回
        return order;
    }

//    @Autowired
//    private RestTemplate restTemplate;
//
//    public Order queryOrderById(Long orderId) {
//        // 1.查询订单
//        Order order = orderMapper.findById(orderId);
//
//        String url = "http://userservice/user/"+order.getUserId();
//
//        User user = restTemplate.getForObject(url, User.class);//调用8081的开放接口，查询user的信息
//
//        User user = userClient.FindById(order.getUserId());
//
//        order.setUser(user);//存入order的user中
//        // 4.返回
//        return order;
//    }
}
