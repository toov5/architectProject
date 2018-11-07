package com.toov5.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.toov5.api.member.service.MemberService;

public class OderToMemberTest {
   public static void main(String[] args) {
	
	  ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
	  applicationContext.start(); //ע��
	  MemberService memberService =  applicationContext.getBean(MemberService.class);
	  String resultUser = memberService.getUser(12L);
	  System.out.println("���÷����ķ��ؽ��"+resultUser);
} 
}