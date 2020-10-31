package ai.yunxi.sharding;

import ai.yunxi.sharding.model.Company;
import ai.yunxi.sharding.service.CompanyService;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author yejunyang2012@163.com
 * @date 2020/3/14 0:44
 **/

@RunWith(SpringRunner.class)
@SpringBootTest(classes = VipShardingApplication.class)
public class CompanyApplicationTest {

    @Autowired
    private CompanyService companyService;

    @Test
    public void save(){
        Company company = new Company();
        company.setId(1);
        company.setCode("22");
        company.setName("牛逼公司");
        companyService.save(company);
    }

    @Test
    public void findAll(){
        List<Company> all = companyService.findAll();
        System.out.println(all);
    }
}
