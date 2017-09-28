package com.birdsh.chen.dao;


import com.birdsh.chen.entity.Student;

/**
 * @ClassName:
 * @Description:
 * @author chenhui
 * @date 2017年8月2日下午3:35:54
 */
public interface IStudentDao{
	void saveStudent(Student student);

    Student findStudentByName(String name);

    void updateStudent(Student student);

    void deleteStudentById(int id);

}
