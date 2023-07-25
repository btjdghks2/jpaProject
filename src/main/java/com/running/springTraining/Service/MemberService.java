package com.running.springTraining.Service;

import com.running.springTraining.Dto.MemberDto;
import com.running.springTraining.Repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public String Membersave(MemberDto memberDto) {

        //엔티티값을 바로 넣는게 아니라 디티오를 통해서 넣는다, 그렇다면
        return null;
    }
}
