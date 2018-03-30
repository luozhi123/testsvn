package com.newer.dao;

import com.newer.bean.User;

import java.util.List;

public interface UserMapper {
     User findById(int userid);
     List<User> findAll();


}
