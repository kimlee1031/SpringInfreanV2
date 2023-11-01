package hellovt.corevt;

import hellovt.corevt.discount.DiscountPolicy;
import hellovt.corevt.discount.FixDiscountPolicy;
import hellovt.corevt.discount.RateDiscountPolicy;
import hellovt.corevt.member.MemberService;
import hellovt.corevt.member.MemberServiceImpl;
import hellovt.corevt.member.MemoryMemberRepository;
import hellovt.corevt.order.OrderService;
import hellovt.corevt.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public static MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
