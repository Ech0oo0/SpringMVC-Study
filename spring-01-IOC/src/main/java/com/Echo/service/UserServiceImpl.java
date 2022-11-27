package com.Echo.service;

import com.Echo.dao.UserDao;

public class UserServiceImpl implements UserService{
    // 将DAO引入到Service
//    private UserDao userDao = new UserDaoImpl();      //解耦前代码，由程序控制对象创建

    private UserDao userDao;

    // 利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    // 业务层调DAO层,实现接口
    public void getUser() {     // 这是UserService业务层接口的实现
        userDao.getUser();      // 这是DAO层，new userDaoXXXXImpl对UserDao接口的实现。
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "userDao=" + userDao +
                '}';
    }
}
