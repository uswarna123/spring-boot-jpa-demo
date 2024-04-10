package com.demo.service;

import com.demo.DAO.DemoServiceRepository;
import com.demo.DAO.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoServiceImpl implements DemoService{


    @Autowired
    DemoServiceRepository demoServiceRepository;
    @Override
    public String getName() {
        Optional<Student> optional = demoServiceRepository.findById(2L);
        Student student= optional.get();
        return "Student Name:"+student.getFirstName() +" "+student.getLastName();
    }
}
