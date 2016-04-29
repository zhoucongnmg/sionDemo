package net.sion.company.demo.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import net.sion.boot.mongo.template.SessionMongoTemplate;
import net.sion.company.demo.domain.EmployInfo;
import net.sion.company.demo.domain.User;
import net.sion.company.demo.sessionrepository.EmployRepository;
import net.sion.util.mvc.Response;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/demo")
public class TestController {
	
	@Autowired
	private SessionMongoTemplate mongoOps;
	@Autowired
	private EmployRepository er;
	
	@RequestMapping(value = "/user/save")
	public @ResponseBody Response save(HttpSession session, @RequestBody User user) {
		System.out.println("9999");
		System.out.println(user);
		user.setId(StringUtils.isBlank(user.getId()) ? null : user.getId());
		mongoOps.save(user);
		return new Response(true);
	}  
	
	@RequestMapping(value = "/user/update",  method = RequestMethod.POST)
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
	
	@RequestMapping(value = "/emp/read")
	public @ResponseBody Response getData(HttpSession session) {
		List<EmployInfo> employInfo = mongoOps.findAll(EmployInfo.class);
		return new Response("chenggong",employInfo,true);
	}  
	
	@RequestMapping(value = "/emp/query")
	public @ResponseBody List<EmployInfo> getDataByName(String name) {
		List<EmployInfo> employInfo = new ArrayList<EmployInfo>();
		if(!name.isEmpty()){
			employInfo = this.er.findAllByName(name);
		}else{
			employInfo = mongoOps.findAll(EmployInfo.class);
		}
		return employInfo;
	}  
	
	@RequestMapping(value = "/emp/save")
	public @ResponseBody Response saveData(HttpSession session, @RequestBody EmployInfo employInfo) {
		System.out.println("9999");
		System.out.println(employInfo);
		employInfo.setId(StringUtils.isBlank(employInfo.getId()) ? null : employInfo.getId());
		mongoOps.save(employInfo);
		return new Response(true);
	}  
	
	@RequestMapping(value = "/emp/update",  method = RequestMethod.POST)
	public @ResponseBody Response updateData(HttpSession session, @RequestBody EmployInfo employInfo) {
		System.out.println(employInfo);
		mongoOps.save(employInfo);
		return new Response(true);
	}  
	
	@RequestMapping(value = "/emp/destroy")
	public @ResponseBody Response destroy(HttpSession session, @RequestBody EmployInfo employInfo) {
		System.out.println("delete");
		mongoOps.remove(employInfo);
		return new Response(true);
	}
}
