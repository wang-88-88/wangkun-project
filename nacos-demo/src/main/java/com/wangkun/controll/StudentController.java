package com.wangkun.controll;

import com.wangkun.mapper.StudentMapper;
import com.wangkun.pojo.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController {

    @Resource
    private StudentMapper studentMapper;

    @GetMapping("/{id}")
    public Student findId(@PathVariable("id") Long id){
        return studentMapper.findById(id);
    }
}
