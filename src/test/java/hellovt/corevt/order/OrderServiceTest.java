package hellovt.corevt.order;

import hellovt.corevt.AppConfig;
import hellovt.corevt.member.Grade;
import hellovt.corevt.member.Member;
import hellovt.corevt.member.MemberService;
import hellovt.corevt.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    /*AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    OrderService orderService = appConfig.orderService();*/

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }


    @Test
    void createOrder() {
        long memberId = 1;
        Member member = new Member(memberId, "testMember", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemN", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }


}