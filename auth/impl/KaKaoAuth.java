package auth.impl;

import auth.SnsAuth;
import dto.MemberDTO;


public class KaKaoAuth implements SnsAuth{
    @Override
    public boolean login(MemberDTO member) {
        System.out.println("카카오 로그인됨");
        return true;
    }


    
}
