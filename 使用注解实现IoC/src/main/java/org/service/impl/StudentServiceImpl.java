package org.service.impl;

import org.dao.StudentDao;
import org.entity.Student;
import org.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: hsh
 * @Date: 2021/4/9 16:51
 * @Description: //TODO
 */
@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    /**
     * @Author hsh
     * @Date 16:52 2021/4/9
     * @Param
     * @return
     * @Description //TODO
     **/
    public StudentServiceImpl() {
    }

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void addStudent(Student student) {
        studentDao.saveStudent(student);
    }
}
