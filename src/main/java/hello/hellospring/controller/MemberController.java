package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    //@Autowired 필드 주입
    private final MemberService memberService; //생성자 주입

    //setter 주입 @Autowired + setMemberService

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}