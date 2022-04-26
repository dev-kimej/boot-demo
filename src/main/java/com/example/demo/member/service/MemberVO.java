package com.example.demo.member.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberVO {

    private String mbr_id;		//회원ID
    private String mbr_ty;		//회원유형
    private String mbr_pwd;		//회원비밀번호
    private String mbr_nm;		//회원성명
    private String sex;			//성별
    private String pwd_expd_dt;	//비밀번호사용종료일자(만료일)
    private String mbr_tkn;		//액세스토큰
    private String email;		//이메일주소

}
