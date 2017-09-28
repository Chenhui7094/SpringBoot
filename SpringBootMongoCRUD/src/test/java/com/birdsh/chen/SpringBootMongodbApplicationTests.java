package com.birdsh.chen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.birdsh.chen.dao.IStudentDao;
import com.birdsh.chen.entity.Student;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMongodbApplicationTests {
	@Autowired
    private IStudentDao iStudentDao;

    @Test
    public void testSaveUser() throws Exception {
        Student student=new Student();
        student.setId(21);
        student.setName("小明");
        student.setAge(22);
        iStudentDao.saveStudent(student);
    }

    @Test
    public void findStudentByName(){
       Student student= iStudentDao.findStudentByName("小明");
       System.out.println("student is "+student);
    }

    @Test
    public void updateStudent(){
    	Student student=new Student();
    	student.setId(21);
    	student.setName("天空");
    	student.setAge(29);
    	iStudentDao.updateStudent(student);
    }

    @Test
    public void deleteStudentById(){
    	iStudentDao.deleteStudentById(21);
    }

}


