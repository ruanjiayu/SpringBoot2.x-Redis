package com.jing.modules.service.impl;

import com.jing.modules.dto.UsersDTO;
import com.jing.modules.mapper.UsersMapper;
import com.jing.modules.po.Users;
import com.jing.modules.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ruanjiayu
 * @dateTime 2019/6/6 8:53
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService{

    /**
     * 解决下划线问题可以在mapper层使用@Repository
     */
    @Resource
    private UsersMapper usersMapper;

    @Override
    public UsersDTO getUserById(String id) {
       Users users = usersMapper.selectByPrimaryKey(id);
        UsersDTO usersDTO = new UsersDTO();
        BeanUtils.copyProperties(users, usersDTO);
       log.info(usersDTO.toString());
        return usersDTO;
    }

    @Override
    public void clear() {

    }
}
