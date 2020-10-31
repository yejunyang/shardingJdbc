package ai.yunxi.sharding.mapper;

import ai.yunxi.sharding.model.Province;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProvinceMapper {
    int save(Province province);
}
