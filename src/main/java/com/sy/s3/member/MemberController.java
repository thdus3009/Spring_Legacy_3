package com.sy.s3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	//컨트롤러는 서비스가 없으면 일을 못함(의존성높음)
	
	@Autowired
	private MemberService memberService;

	@RequestMapping("test")
	public void test() {
		memberService.test();
	}
	
	//로그인
	
	//회원가입
	
	
}
