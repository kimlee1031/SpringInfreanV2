package hellovt.corevt.Singleton;

import hellovt.corevt.AppConfig;
import hellovt.corevt.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonTest {
    @Test
    @DisplayName("스프링 없는 순수한 DI 컨테이너")
    void pureContainer() {

        AppConfig appConfig = new AppConfig();

        MemberService memberService1 = appConfig.memberService();
        MemberService memberService2 = appConfig.memberService();

        System.out.println("memberService 1 = " + memberService1);
        System.out.println("memberService 2 = " + memberService2);

        Assertions.assertThat(memberService1).isEqualTo(memberService2);
    }
}
