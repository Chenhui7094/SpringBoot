package com.birdsh.chen.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.birdsh.chen.dao.IStudentDao;
import com.birdsh.chen.entity.Student;

/**
 * @ClassName:
 * @Description:
 * @author chenhui
 * @date 2017年8月2日下午4:08:01
 */
@RestController
public class StudentController {
	@Autowired
    private IStudentDao iStudentDao;
	/**
	 * 添加信息
	 * 
	 * @param name
	 * @param age
	 */
	@GetMapping(value = "/add")
	public void addStudent(@RequestParam(value="id") int id,@RequestParam(value = "name") String name,
			@RequestParam(value = "age") int age) {
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		student.setAge(age);
		iStudentDao.saveStudent(student);
	}

	/**
	 * 根据用户名进行查询
	 * 
	 * @param name
	 * @return
	 */
	@GetMapping(value = "/findStudentByName")
	public Student findStudentByName(@RequestParam(value="name") String name) {
		return iStudentDao.findStudentByName(name);
	}

	/**
	 * 更新学生信息
	 * 
	 * @param id
	 * @param name
	 * @param age
	 * @return
	 */
	@PutMapping(value = "/updateStudent")
	public void updateStudent(@RequestParam(value="id") int id,
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "age", required = true) int age) {
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		student.setAge(age);
		iStudentDao.updateStudent(student);
	}

	/**
	 * 根据id进行删除
	 * @param id
	 */
	@PostMapping(value = "/deleteStudentById")
	public void deleteStudentById(@RequestParam("id") Integer id) {
		iStudentDao.deleteStudentById(id);
	}

}
