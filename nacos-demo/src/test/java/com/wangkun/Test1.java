package com.wangkun;

import com.wangkun.mapper.StudentMapper;
import com.wangkun.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class Test1 {

    @Resource
    private StudentMapper mapper;

    @Test
    public void test1(){
        Student byId = mapper.findById(5L);
        System.out.println(byId);
    }
}
