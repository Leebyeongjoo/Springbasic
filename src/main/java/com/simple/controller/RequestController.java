package com.simple.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ReqVO;

@Controller //component ��ĵ�� �ش� ������̼��� �о ������ ����
@RequestMapping("/request")
public class RequestController {

   //����û�� ��Ʈ�ѷ��� ������ �Ǵµ�, �� �޼��带 �����Ű�� �ʹٸ� /request/req_ex01 ��û�� ȭ�鿡�� ȣ��
   //�������� ���缭 ��û��� ����ϴ� ���� ����.
   //void���ΰ�� ȣ��� url�� ���ϰ�η� ������ ����   
   //req-ex01ȭ�麸�±��
   //   @RequestMapping("/req_ex01")
   //   public void req_ex01() {
   //      
   //      
   //   }

   //req_ex01ȭ�� ó��
   @RequestMapping("/req_ex01")
   public String req_ex01() {
      return "request/req_ex01";
   }

   //basic��ûó��(Get��û��ó��)
   @RequestMapping(value="/basic1",method=RequestMethod.GET)
   public void basic1() {
      System.out.println("basic1��û...");
   }

   //basic2��ûó��(Post��û��ó��)
   @RequestMapping(value="/basic2",method=RequestMethod.POST)
   public void basic2() {
      System.out.println("basic2��û...");
   }

   //basic3��ûó��(getMapping)
   @GetMapping("/basic3")
   public void basic3() {
      System.out.println("basic3��û..");
   }

   //basic4��ûó��(postMapping)
   @PostMapping("/basic4")
   public void basic4() {
      System.out.println("basic4��û..");
   }

   //      //���� ��û�� �����ϳ��� ó���ϰ� �ʹٸ� {}��θ� �����ָ� �˴ϴ�.
   //      @RequestMapping({"/basic1","/basic2","/basic3"})
   //      public void view() {
   //         System.out.println("�����..");
   //      }

   //---------------------------------------��û �Ķ���� �ޱ�-----------------------------------------------
   //req_ex02 ȭ��ó��
   @RequestMapping("/req_ex02")
   public String req_ex02() {
      return "request/req_ex02"; //������ ȭ��         
   }

   //      //param1 ��ûó��
   //      @RequestMapping(value="/param1",method=RequestMethod.POST)
   //      public String param1(HttpServletRequest request) {
   //         System.out.println(request.getParameter("id"));
   //         return"request/req_ex02_result";
   //      }
   //      
   //2nd
//   @RequestMapping("/param1")
//   public String param1(
//         @RequestParam("id")String id,
//         @RequestParam("pw")String pw,
//         @RequestParam("name")String name,
//         @RequestParam("age")String age,
//         @RequestParam(value="inter",required = false,defaultValue="") ArrayList<String> inter
//         ) {
//      System.out.println(id);
//      //�ʼ��� �ƴ� �Ķ���ʹ� required = false �Ӽ� �����ϸ� �Ǻ��.
//      //�ʼ��� �ƴ� �Ķ������ ��� null���� �����ϰ� �Ǵµ� �⺻���� �������� defaultValue�ɼ��� ����ϸ� �˴ϴ�.
//      System.out.println(inter.toString());
//      
//      return "request/req_ex02_result";   
//   }
//   3nd
//   @RequestMapping("/param1")
//   public String param1(ReqVO vo) {
//      System.out.println(vo.getId());
//      System.out.println(vo.getPw());
//      System.out.println(vo.getName());
//      System.out.println(vo.getAge());
//      System.out.println(vo.getInter().toString());//���߰��� ó��
//      
//      return "request/req_ex02_result";
//   }
   
   @RequestMapping("/req_quiz01")
   public String req_quiz01() {
      return "request/req_quiz01"; //������ ȭ��         
   }
   
   
   @RequestMapping("/login")
   public String login(ReqVO vo) {
	   System.out.println(vo.getId());
	   System.out.println(vo.getPw());
	   
	 

	   if(vo.getId().equals("abc123") && vo.getPw().equals("xxx123")){
		   
		   return "request/req_quiz01_ok";
		   
	   }else {
		   
		   return "request/req_quiz01_no";
	   }
   
   }
   
   
   
   
   

}