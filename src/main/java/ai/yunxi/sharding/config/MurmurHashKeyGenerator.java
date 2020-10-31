package ai.yunxi.sharding.config;


import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;

public class MurmurHashKeyGenerator {

    public Number generateKey() {
        SnowflakeShardingKeyGenerator sf = new SnowflakeShardingKeyGenerator();
        sf.generateKey();
        return null;
    }
}
