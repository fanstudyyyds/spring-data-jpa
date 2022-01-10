package com.fan;

import com.fan.pojo.Gender;
import com.fan.pojo.Goods;
import com.fan.pojo.User;
import com.fan.repositories.UserRepositories;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootTest
class SpringDataJpaDemoApplicationTests {

    @Autowired
    UserRepositories userRepositories;


    @Test
    void contextLoads() {
        //排序
        Sort sort = Sort.by(Sort.Direction.ASC, "id");

        //分頁
        Pageable pageable = PageRequest.of(0, 4, sort);

        Iterable<User> all = userRepositories.findAll(pageable);
        for (User user : all) {
            System.out.println(user);
        }
    }

    /**
     * 添加
     */
    @Test
    void add() {
        User user = new User();
        user.setPwd("123");
        user.setName("zgdhd");
        user.setId(16);
        user.setSexid(1);
        userRepositories.save(user);
    }


    /**
     * 根据ID删除
     */
    @Test
    void da() {
        userRepositories.deleteById(2L);
    }
}
