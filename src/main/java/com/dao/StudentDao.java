package com.dao;

import com.entity.TStudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDao {
    @Autowired
    HibernateTemplate hibernateTemplate;
    public void insert(TStudentEntity studentEntity){
        hibernateTemplate.saveOrUpdate(studentEntity);
    }

}
