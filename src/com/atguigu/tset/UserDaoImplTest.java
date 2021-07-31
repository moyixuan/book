package com.atguigu.tset;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoImplTest {

    UserDao userDao = new UserDaoImpl();

    @Test
    public void queryUserByUsername() {
        System.out.println(userDao.queryUserByUsername("admin"));
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        System.out.println(userDao.queryUserByUsernameAndPassword("admin","admin"));
        System.out.println(" Hello Git! ");
        System.out.println(" Hello Git! Commit 3");
        System.out.println(" Hello Git! Commit 4");
        System.out.println(" hot-fix Git! Commit 4");
    }

    @Test
    public void saveUser() {
        System.out.println( userDao.saveUser(new User(null,"wyg", "123456", "wzg168@qq.com")) );
    }
}