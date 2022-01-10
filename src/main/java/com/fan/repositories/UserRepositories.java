package com.fan.repositories;

import com.fan.pojo.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepositories extends PagingAndSortingRepository<User,Long> {

    //根据名字查询

    List<User> queryAllByName(String name);


}
