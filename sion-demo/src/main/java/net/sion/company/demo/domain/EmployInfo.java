package net.sion.company.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity
@Document(collection="empInfo")
public class EmployInfo {
	@Id
    String id;
    
	String name;
	
    String age;
    
    String sex;
    
    String email;
    
    String address;
}
