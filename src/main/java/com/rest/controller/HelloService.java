package com.rest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.entity.Student;
import com.rest.entity.Teacher;

@Path("/hello")
public class HelloService {
	@GET
	@Path("/sayhello")
	@Produces(MediaType.TEXT_PLAIN)
	//http://localhost:8080/restproject1/webapi/hello/sayhello
	public String sayhi() {
		return "hello jersey";
	}
	
	@GET
	@Path("/getjson")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	//http://locallhost:8080/restproject1/webapi/hello/getjson
	public Student sayjson() {
		Student stu = new Student(22, "张三", true);
		return stu;
	}
	
	@GET
	@Path("/getteachersjson")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	//http://locallhost:8080/restproject1/webapi/hello/getjson
	public List<Teacher> sayteacherjson() {
		List<Teacher> list = new ArrayList<>();
		list.add(new Teacher(1,"李老师","大禹小学"));
		list.add(new Teacher(1,"雷老师","胜利小学"));
		return list;
	}
}
