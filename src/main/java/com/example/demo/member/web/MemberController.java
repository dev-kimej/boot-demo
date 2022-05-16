package com.example.demo.member.web;

import com.example.demo.member.service.MemberService;
import com.example.demo.member.service.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class MemberController {
    @Resource(name = "memberService")
    private MemberService memberService;

    /*@RequestMapping(value = "/member", method = RequestMethod.GET)
    public List<MemberVO> allMember() {
        List<MemberVO> members = memberService.getMembers();

        log.info("members size: {}", members.size());

        return members;
    }*/
}
