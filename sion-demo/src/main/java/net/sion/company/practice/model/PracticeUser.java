package net.sion.company.practice.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;

/*
 * practice User model
 * @author ZW
 */
@RooMongoEntity
@Document(collection="User")
public class PracticeUser {

	@Id
	public String id;
	
	public String name;
	
	public int age;
	
	public String sex;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
		
	
}
