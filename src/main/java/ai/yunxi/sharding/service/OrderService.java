package ai.yunxi.sharding.service;

import ai.yunxi.sharding.mapper.OrderItemsMapper;
import ai.yunxi.sharding.mapper.OrderMapper;
import ai.yunxi.sharding.model.Order;
import ai.yunxi.sharding.model.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderItemsMapper orderItemsMapper;


    public void save(Order order, OrderItem item) {
        orderMapper.save(order);
        orderItemsMapper.save(item);
    }

    public List<Order> findHint() {
        //return orderMapper.selectHint();
        return null;
    }

    public List<OrderItem> findDetail(List<Long> orderIds){
        return orderMapper.findDetail(orderIds);
    }

    public List<OrderItem> findDetailByOrderIdAndUserId(List<Long> orderIds){
        return orderMapper.findDetailByOrderIdAndUserId(orderIds);
    }

    public List<OrderItem> findDetailAll(){
        return orderItemsMapper.findDetailAll();
    }
}
