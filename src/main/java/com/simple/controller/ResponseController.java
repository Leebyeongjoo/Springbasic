package com.simple.controller;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.ReqVO;

@Controller
@RequestMapping("/response")
public class ResponseController {

	//ȭ��ó��
	//model������ - �޼����� �Ű������� Model�� ���� , addAttribute("Ű","��")�� �����ϸ� �˴ϴ�
	@RequestMapping("/res_ex01")
	public String res_ex01() {
		
		return "response/res_ex01";
	}
	
//
	@RequestMapping("/res_ex02")
	public String res_ex02(Model model) {
	
		model.addAttribute("servertime", new Date());
		model.addAttribute("name","ȫ�浿");
		
		return "response/res_ex02";
	}
	
	//ModelAndView���
	//Model�� ���� ������, ȭ�鿡 ���� ������ ���� �����ؼ� ������ ���
	@RequestMapping("/res_ex03")
	public ModelAndView res_ex03() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("servertime", new Date()); //����������
		mv.addObject("name","�̼���");
		
			mv.setViewName("response/res_ex03");//ȭ������
		
		return mv;
	}
	//ModelAttribute������̼� ���
	//req�� model�� ������ ����
	@RequestMapping("/res_ex04")
	public String res_ex04(@ModelAttribute("id") String id) {
		
		System.out.println("�Ѿ�°�" + id);
		
		return "response/res_ex04";
		
	}
	@RequestMapping("res_ex05")
	public String res_ex05(@ModelAttribute("info") ReqVO vo) {
		System.out.println(vo.getId());
		System.out.println(vo.getName());
		
		
		return "response/res_ex05";
				
	}
	
	//---------------------------redirect�� redireectAttribute------------------
	
	//ȭ��ó��
	@RequestMapping(value="/res_redirect_login")
	public String res_redirect() {
		return "response/res_redirect_login";
	}
	//�α���ó��
	@RequestMapping(value="/login", method =RequestMethod.POST)
	public String login(@RequestParam("id") String id,
						@RequestParam("pw") String pw, 
						RedirectAttributes RA
	){
		
		if(id.equals(pw)) {//�α��μ���
			return "response/res_redirect_ok";//����������
		}else {//�α��ν��� -> �ٽ� �α����ϸ����� �̵�
			//"redirect:/������" - �ٽ� ��Ʈ�ѷ��� Ÿ���� �̶� ȭ�鿡 ���� �����ϰ� �ʹٸ�
			//RedirectAttributes��ü�� addFlashAttribute�� �̿��ϸ� �˴ϴ�.
			//�����̷�Ʈ�� ���� ������ �� �����ϴ�.
			RA.addFlashAttribute("msg","���̵� ��й�ȣ�� Ȯ���ϽǷ���?");
			return "redirect:/response/res_redirect_login";//
		}
		
	}
	
	
	
	//����
	@RequestMapping(value="/res_quiz01")
	public String res_quiz01() {
		
		return "response/res_quiz01";
	}
	
	@RequestMapping(value="/res_login", method = RequestMethod.POST)
	public String login1(@RequestParam("id") String id, 
							@RequestParam("pw") String pw
							
	){
		
		if(id.equals("kim12") && pw.equals("1234")) {
			return "response/res_quiz03";
		}else {
			return "response/res_quiz04";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
