package com.example.demo.member.service.impl;

import com.example.demo.member.service.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    public List<MemberVO> selectMember();
}
