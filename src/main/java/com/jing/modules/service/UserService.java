package com.jing.modules.service;


import com.jing.modules.dto.UsersDTO;
import com.jing.modules.po.Users;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;

/**
 * @author ruanjiayu
 * @dateTime 2019/6/5 17:33
 */

@CacheConfig(cacheNames="users")
public interface UserService {

    /**
     * 通过id来获取用户
     * @param id
     * @return
     */

    @Cacheable(key = "#id")
    UsersDTO getUserById(String id);

    /**
     * 清除缓存
     */
    @CacheEvict(allEntries = true)
    void clear();

}
