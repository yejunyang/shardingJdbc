package ai.yunxi.sharding;

import ai.yunxi.sharding.model.ItemGenerator;
import ai.yunxi.sharding.model.Order;
import ai.yunxi.sharding.model.OrderGenerator;
import ai.yunxi.sharding.model.OrderItem;
import ai.yunxi.sharding.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = VipShardingApplication.class)
public class ComplexShardingApplicationTests {
    @Autowired
    private OrderService orderService;

    @Test
    public void test() {
        Order order = OrderGenerator.generate();
        order.setUserId(2L);
        order.setOrderId(3L);
        OrderItem orderItem = ItemGenerator.generate();
        orderItem.setUserId(order.getUserId());
        orderItem.setOrderId(order.getOrderId());
        orderService.save(order, orderItem);
    }

    @Test
    public void findDetails() {
        List<Long> ids = new ArrayList<>();
        ids.add(100100L);
        ids.add(100104L);
        List<OrderItem> detail = orderService.findDetail(ids);
        System.out.println(detail);
    }

    @Test
    public void findDetailByOrderIdAndUserId() {
        List<Long> ids = new ArrayList<>();
        ids.add(100100L);
        ids.add(100104L);
        List<OrderItem> detail = orderService.findDetailByOrderIdAndUserId(ids);
        System.out.println(detail);
    }

    @Test
    public void findDetailAll() {
        List<OrderItem> detail = orderService.findDetailAll();
        System.out.println(detail);
    }


}
