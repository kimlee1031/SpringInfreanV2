package hellovt.corevt.member;

import hellovt.corevt.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    /*AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();*/

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {
        Member member = new Member(1L, "memberTest", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);

        Assertions.assertThat(findMember).isEqualTo(member);

    }

}
