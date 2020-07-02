package com.simple.command;

import java.util.ArrayList;

public class ReqVO {

		//������ name�� ��ġ�ϴ� ������ ��������� ����
	
	private String id;
	private String pw;
	private String name;
	private String age;
	private ArrayList<String> inter;//���߰��� ó���� list�� ó���մϴ�
	
	
	public ReqVO() {}

	public ReqVO(String id, String pw, String name, String age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public ArrayList<String> getInter() {
		return inter;
	}

	public void setInter(ArrayList<String> inter) {
		this.inter = inter;
	}
	
	
	
}
