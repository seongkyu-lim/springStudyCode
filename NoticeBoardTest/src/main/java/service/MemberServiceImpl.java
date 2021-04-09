package service;

import dao.MemberDao;
import dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberDao memberDao;

    public MemberDto selectMember(String id) {

        MemberDto memberDto = memberDao.selectMember(id);

        return memberDto;
    }
}
