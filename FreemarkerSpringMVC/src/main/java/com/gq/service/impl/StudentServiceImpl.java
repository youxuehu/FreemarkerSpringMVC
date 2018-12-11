package com.gq.service.impl;

import com.gq.dao.mapper.StudentMapper;
import com.gq.dao.model.Student;
import com.gq.dao.model.StudentExample;
import com.gq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    public List<Student> findAll() {
        StudentExample example = new StudentExample();
        return studentMapper.selectByExample(example);
    }
}
