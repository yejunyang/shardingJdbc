package ai.yunxi.sharding.config;

import com.alibaba.druid.util.StringUtils;
import org.apache.shardingsphere.api.sharding.ShardingValue;
import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class HintShardingKeyAlgorithm implements HintShardingAlgorithm {

    @Override
    public Collection<String> doSharding(Collection availableTargetNames,
                                         HintShardingValue shardingValue) {
        System.out.println("shardingValue=" + shardingValue);
        System.out.println("availableTargetNames=" + availableTargetNames);
        List<String> shardingResult = new ArrayList<>();
        for (Object targetName : availableTargetNames) {
            String str = (String) targetName;
            String suffix = str.substring(str.length() - 1);
            if (StringUtils.isNumber(suffix)) {
                // hint分片算法的ShardingValue有两种具体类型:
                // ListShardingValue和RangeShardingValue
                // 使用哪种取决于HintManager.addDatabaseShardingValue(String, String, ShardingOperator,...),ShardingOperator的类型
                //ListShardingValue<Integer> tmpSharding = (ListShardingValue<Integer>) shardingValue;
                Collection values = shardingValue.getValues();
                for (Object value : values) {
                    int num = (Integer) value;
                    if (num % 2 == Integer.parseInt(suffix)) {
                        shardingResult.add(str);
                    }
                }
            }
        }
        return shardingResult;
    }


}
