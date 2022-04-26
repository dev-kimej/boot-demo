package com.example.demo.member.service.impl;

import com.example.demo.member.service.MemberService;
import com.example.demo.member.service.MemberVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberMapper memberMapper;

    @Override
    public List<MemberVO> getMembers() {
        List<MemberVO> members = memberMapper.selectMember();

        return members;
    }
}
