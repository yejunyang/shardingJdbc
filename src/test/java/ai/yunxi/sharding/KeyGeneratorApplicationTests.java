package ai.yunxi.sharding;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = VipShardingApplication.class)
public class KeyGeneratorApplicationTests {

    @Test
    public void contextLoads() {
        /*DefaultKeyGenerator keyGenerator = new DefaultKeyGenerator();
        for (int i = 0; i < 20; i++) {
            System.out.println(keyGenerator.generateKey());
        }*/
    }

}

