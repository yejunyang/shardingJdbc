package ai.yunxi.sharding.mapper;

import ai.yunxi.sharding.model.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yejunyang2012@163.com
 * @date 2020/3/14 0:36
 **/
@Mapper
public interface CompanyMaper {

    int save(Company company);
    List<Company> findAll();
}
