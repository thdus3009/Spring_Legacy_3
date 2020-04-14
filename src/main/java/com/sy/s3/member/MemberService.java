package com.sy.s3.member;

public class MemberService {
//service는 memberdao의 의존성이 높다.
//의존성 주입
	private MemberDAO memberDAO;
	
	public MemberService() {//1
		memberDAO = new MemberDAO();
	}
	
	public void setMemberDAO(MemberDAO memberDAO) {//2
		this.memberDAO = memberDAO;
	}
	
	public void test() {
		memberDAO.test();
		System.out.println("MemberService");
	}
}
