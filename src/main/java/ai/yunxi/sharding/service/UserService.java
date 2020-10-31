package ai.yunxi.sharding.service;

import ai.yunxi.sharding.mapper.UserMapper;
import ai.yunxi.sharding.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService  {
   @Autowired
    private UserMapper userMapper;

    public void save(User user) {
        userMapper.save(user);
    }
}
