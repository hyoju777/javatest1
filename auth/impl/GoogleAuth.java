package auth.impl;

import auth.SnsAuth;
import dto.MemberDTO;

public class GoogleAuth implements SnsAuth{

    @Override
    public boolean login(MemberDTO member){
        System.out.println("구글 로그인 성공됨");
        return true;


    }

    
}
