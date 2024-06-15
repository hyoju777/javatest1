package service;

import auth.impl.SnsAuth;
import auth.impl.GoogleAuth;
import auth.impl.KakaoAuth;
import auth.impl.NaverAuth;
import dto.MemberDTO;

public class MemberService {
     private SnsAuth snsAuth;



    public MemberService(SnsAuth snsAuth) {
        this.snsAuth = snsAuth;
    }


    public String loginMember(MemberDTO memberDTO){
        boolean result  = snsAuth.login(memberDTO);
        String type = String.valueOf(snsAuth.getClass()).split("impl.")[1];

        return type + "으로 로그인 " + result;
    }
}

    

