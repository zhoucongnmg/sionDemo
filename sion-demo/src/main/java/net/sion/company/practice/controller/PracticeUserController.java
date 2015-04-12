package net.sion.company.practice.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sion.boot.mongo.template.SessionMongoTemplate;
import net.sion.company.demo.domain.User;
import net.sion.company.practice.model.PracticeUser;
import net.sion.util.mvc.Response;

/**
 * @author ZW
 * 
 * process request for CURD
 *
 */

@Controller
@RequestMapping(value ="/practice")
public class PracticeUserController {
	
	@Autowired
	private SessionMongoTemplate mongoOps;
	
	@RequestMapping(value = "/user/create")
	public @ResponseBody Response save(HttpSession session, @RequestBody PracticeUser user ) {
		System.out.println("create");
		//System.out.println(user);		
		//System.out.println(o);
		
		user.setId(StringUtils.isBlank(user.getId()) ? null : user.getId());
		
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getSex());
		System.out.println(user.getAge());
		mongoOps.save(user);
		return new Response(true);
	}  
	
	@RequestMapping(value = "/user/update")
	public @ResponseBody Response update(HttpSession session, @RequestBody PracticeUser user) {
		System.out.println("update");
		System.out.println(user);
		mongoOps.save(user);
		return new Response("updateSuccess", user, true);
	}  
	
	@RequestMapping(value = "/user/read")
	public @ResponseBody Response read(HttpSession session) {
		
		System.out.println("load Data");
		
		List<PracticeUser> users = mongoOps.findAll(PracticeUser.class);
		
		return new Response("chenggong",users,true);
	}
	
	
	@RequestMapping(value = "/user/destroy")
	public @ResponseBody Response destroy(HttpSession session, @RequestBody PracticeUser user) {
		System.out.println("delete");
		mongoOps.remove(user);
		return new Response(true);
	}

	
//	@RequestMapping(value = "/user/read")
//	public @ResponseBody Response readPage(HttpSession session, @RequestParam int start, int limit) {
//		
//		System.out.println("load Data");
//		
//		System.out.println(start);
//
//		System.out.println(limit);
//		
//		Pageable pageable = new PageRequest(start, limit);
//		
//		//List<PracticeUser> users = mongoOps.findby
//		
//		return new Response("chenggong",users,true);
//	}
	


}
