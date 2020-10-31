package ai.yunxi.sharding.model;

import java.util.Random;

public class OrderGenerator {
    public static Order generate() {
        Order order = new Order();
        int orderId = random(1000000, 9000000);
        int userId = random(20000000, 70000000);
        int id = random(10000, 1000000);
        order.setOrderId(orderId);
        order.setUserId(userId);
        order.setId(id);
        return order;
    }

    private static int random(int min, int max) {
        Random random = new Random();
        return random.nextInt(max) % (max - min + 1) + min;
    }
}
