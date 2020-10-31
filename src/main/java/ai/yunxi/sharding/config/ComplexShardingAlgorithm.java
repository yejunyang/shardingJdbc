package ai.yunxi.sharding.config;


import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.*;

public class ComplexShardingAlgorithm implements ComplexKeysShardingAlgorithm {

    @Override
    public Collection<String> doSharding(Collection collection, ComplexKeysShardingValue shardingValues) {
        System.out.println("collection:" + collection + ",shardingValues:" + shardingValues);
        Collection<Long> orderIdValues = getShardingValue(shardingValues, "order_id");
        Collection<Long> userIdValues = getShardingValue(shardingValues, "user_id");
        List<String> shardingSuffix = new ArrayList<>();
        // user_id，order_id分片键进行分表
        if ((orderIdValues == null || orderIdValues.size() == 0) && (userIdValues == null || userIdValues.size() == 0)){
            for (Object s : collection) {
                shardingSuffix.add((String) s);
            }
        }else if ((orderIdValues != null && orderIdValues.size() > 0) && (userIdValues == null || userIdValues.size() == 0) ){
            for (Long orderId : orderIdValues) {
                for (int i=0; i<2; i++){
                    String suffix = i + "_" + orderId % 2;
                    for (Object s : collection) {
                        String str = (String) s;
                        if (str.endsWith(suffix)) {
                            shardingSuffix.add(str);
                        }
                    }
                }
            }
        }else if ((orderIdValues == null || orderIdValues.size() == 0)){
            for (Long userId : userIdValues) {
                for (int i=0; i<2; i++){
                    String suffix = userId % 2 + "_" + i;
                    for (Object s : collection) {
                        String str = (String) s;
                        if (str.endsWith(suffix)) {
                            shardingSuffix.add(str);
                        }
                    }
                }
            }
        }else {
            for (Long userId : userIdValues) {
                for (Long orderId : orderIdValues) {
                    String suffix = userId % 2 + "_" + orderId % 2;
                    for (Object s : collection) {
                        String str = (String) s;
                        if (str.endsWith(suffix)) {
                            shardingSuffix.add(str);
                        }
                    }
                }
            }
        }
        return shardingSuffix;
    }

    private Collection<Long> getShardingValue(ComplexKeysShardingValue shardingValues, final String key) {
        Map columnNameAndShardingValuesMap = shardingValues.getColumnNameAndShardingValuesMap();
        Collection user_id = (Collection<Long>)columnNameAndShardingValuesMap.get(key);
        return user_id;
    }


}
