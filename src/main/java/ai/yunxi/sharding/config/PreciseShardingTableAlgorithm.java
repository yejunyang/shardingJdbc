package ai.yunxi.sharding.config;


import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

public class PreciseShardingTableAlgorithm implements PreciseShardingAlgorithm<Long> {
    @Override
    public String doSharding(Collection<String> tableNames,
                             PreciseShardingValue<Long> shardingValue) {
        for (String key : tableNames) {
            if (key.endsWith(shardingValue.getValue() % tableNames.size() + "")) {
                return key;
            }
        }
        throw new UnsupportedOperationException();
    }
}
