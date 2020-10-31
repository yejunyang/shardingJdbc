package ai.yunxi.sharding.mapper;

import ai.yunxi.sharding.model.Order;
import ai.yunxi.sharding.model.OrderItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface OrderMapper {
     void save(Order order);
     List<OrderItem> findDetail(@Param("orderIds") List<Long> orderIds);
     List<OrderItem> findDetailByOrderIdAndUserId(@Param("orderIds") List<Long> orderIds);
     List<OrderItem> findDetailAll();
}
