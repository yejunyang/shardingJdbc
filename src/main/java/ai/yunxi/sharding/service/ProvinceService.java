package ai.yunxi.sharding.service;

import ai.yunxi.sharding.mapper.ProvinceMapper;
import ai.yunxi.sharding.model.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinceService   {
    @Autowired
    private ProvinceMapper provinceMapper;

    public void save(Province province) {
        provinceMapper.save(province);
    }
}
