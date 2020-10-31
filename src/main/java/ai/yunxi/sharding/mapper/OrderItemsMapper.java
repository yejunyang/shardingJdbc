package ai.yunxi.sharding.mapper;

import ai.yunxi.sharding.model.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderItemsMapper {
     void save(OrderItem orderItem);
     List<OrderItem> findDetailAll();
}
