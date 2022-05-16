package com.example.demo.member.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberVO {

    private String mbrId;		//회원ID
    private String mbrTy;		//회원유형
    private String mbrPwd;		//회원비밀번호
    private String mbrNm;		//회원성명
    private String gender;			//성별
    private String pwdExpdDt;	//비밀번호사용종료일자(만료일)
    private String mbrTkn;		//액세스토큰
    private String email;		//이메일주소

}
