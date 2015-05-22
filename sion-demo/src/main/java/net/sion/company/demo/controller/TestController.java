package net.sion.company.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import net.sion.company.demo.domain.User;
import net.sion.util.mvc.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/demo")
public class TestController {
	@RequestMapping(value = "/user/save")
	public @ResponseBody Response save(HttpSession session, @RequestBody User user) {
		System.out.println(user);
		return new Response(true);
	}  
	
	@RequestMapping(value = "/user/update")
	public @ResponseBody Response update(HttpSession session, @RequestBody User user) {
		System.out.println(user);
		return new Response(true);
	}  
	
	@RequestMapping(value = "/user/read")
	public @ResponseBody Response read(HttpSession session) {
		List<User> users = new ArrayList<User>();
		for (int i = 0;i<2;i++) {
			User user = new User();
			user.setId(String.valueOf(i));
			user.setName(i+"name");
			user.setAge(""+i);
			users.add(user);
		}
		
		return new Response("chenggong",users,true);
	}  
}
