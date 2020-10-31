package ai.yunxi.sharding.service;

import ai.yunxi.sharding.mapper.CompanyMaper;
import ai.yunxi.sharding.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yejunyang2012@163.com
 * @date 2020/3/14 0:46
 **/

@Service
public class CompanyService {

    @Autowired
    private CompanyMaper companyMaper;

    public void save(Company company){
        companyMaper.save(company);
    }

    public List<Company> findAll(){
        return companyMaper.findAll();
    }
}
