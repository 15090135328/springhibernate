package com.service;

import com.dao.StudentDao;
import com.entity.TStudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;
    @Transactional
    public void insert(TStudentEntity studentEntity){
        studentDao.insert(studentEntity);
    }
}
