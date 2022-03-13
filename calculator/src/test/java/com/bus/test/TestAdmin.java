package com.bus.test;

import com.bus.entity.Admin;
import com.bus.mapper.AdminMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestAdmin {

    @Autowired
    AdminMapper a;

    @Test
    public void  one(){
        List<Admin> list = a.selectAll();
        for (Admin admin : list) {
            System.out.println(admin);
        }
    }
}
