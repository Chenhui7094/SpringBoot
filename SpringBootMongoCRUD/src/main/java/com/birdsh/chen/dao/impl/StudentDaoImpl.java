package com.birdsh.chen.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import com.birdsh.chen.dao.IStudentDao;
import com.birdsh.chen.entity.Student;

/**
 * @ClassName:
 * @Description:
 * @author chenhui
 * @date 2017年8月2日下午3:38:17
 */
@Component
public class StudentDaoImpl implements IStudentDao {
	@Autowired
	private MongoTemplate mongoTemplate;

	/**
	 * 增加对象
	 * 
	 * @param student
	 */
	@Override
	public void saveStudent(Student student) {

		mongoTemplate.save(student);
	}

	/**
	 * 根据用户名查询对象
	 * 
	 * @param userName
	 * @return
	 */
	@Override
	public Student findStudentByName(String name) {
		Query query = new Query(Criteria.where("name").is(name));
		Student student = mongoTemplate.findOne(query, Student.class);
		return student;
	}

	/**
	 * 更新对象
	 * 
	 * @param student
	 */
	@Override
	public void updateStudent(Student student) {
		Query query=new Query(Criteria.where("id").is(student.getId()));
		Update update=new Update().set("name", student.getName()).set("age", student.getAge());
		//更新查询返回结果集的第一条
        mongoTemplate.updateFirst(query,update,Student.class);
        //更新查询返回结果集的所有
        // mongoTemplate.updateMulti(query,update,UserEntity.class);

	}
	
	/**
     * 删除对象
     * @param id
     */
	@Override
	public void deleteStudentById(int id) {
		Query query=new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,Student.class);
	}

}
