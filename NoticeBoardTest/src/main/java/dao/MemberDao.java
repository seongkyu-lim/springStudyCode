package dao;

import dto.MemberDto;
import mapper.MemberMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {

    @Autowired
    private SqlSession sqlSession;

    public MemberDto selectMember(final String id){

        MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);

        MemberDto memberDto = mapper.selectMember(id);

        return  memberDto;
    }
}
