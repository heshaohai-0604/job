package org.dao.impl;

import org.dao.StudentDao;
import org.entity.Student;
import org.springframework.stereotype.Repository;

/**
 * @Auther: hsh
 * @Date: 2021/4/9 16:39
 * @Description: //TODO
 */
@Repository
public class StudentDaoImpl implements StudentDao {
    @Override
    public void saveStudent(Student student) {
        System.out.println("保存成功");
        System.out.println("信息如下："+student.toString());
    }
}
