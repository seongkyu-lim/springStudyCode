package mapper;

import dto.MemberDto;

public interface MemberMapper {

    MemberDto selectMember(String id);
}
