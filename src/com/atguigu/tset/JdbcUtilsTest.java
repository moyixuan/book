package com.atguigu.tset;

import com.atguigu.utils.JdbcUtils;
import org.junit.Test;

public class JdbcUtilsTest {


    @Test
    public void testJdbcUtils(){
        for (int i = 0; i < 100 ; i++){
            System.out.println(JdbcUtils.getConnection());
        }

    }
}
