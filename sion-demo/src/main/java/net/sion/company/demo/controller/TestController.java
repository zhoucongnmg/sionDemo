package net.sion.company.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import net.sion.boot.mongo.template.SessionMongoTemplate;
import net.sion.company.demo.domain.User;
import net.sion.util.mvc.Response;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/demo")
public class TestController {
	
	@Autowired
	private SessionMongoTemplate mongoOps;
	
	@RequestMapping(value = "/user/save")
	public @ResponseBody Response save(HttpSession session, @RequestBody User user) {
		System.out.println("111");
		System.out.println(user);
		user.setId(StringUtils.isBlank(user.getId()) ? null : user.getId());
		mongoOps.save(user);
		return new Response(true);
	}  
	
	@RequestMapping(value = "/user/update")
	public @ResponseBody Response update(HttpSession session, @RequestBody User user) {
		System.out.println(user);
		mongoOps.save(user);
		return new Response(true);
	}  
	
	@RequestMapping(value = "/user/read")
	public @ResponseBody Response read(HttpSession session) {
		List<User> users = mongoOps.findAll(User.class);
		return new Response("chenggong",users,true);
	}  
}
