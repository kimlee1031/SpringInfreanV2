package hellovt.corevt;

import hellovt.corevt.member.Grade;
import hellovt.corevt.member.Member;
import hellovt.corevt.member.MemberService;
import hellovt.corevt.member.MemberServiceImpl;
import hellovt.corevt.order.Order;
import hellovt.corevt.order.OrderService;
import hellovt.corevt.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {
        /*AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService= appConfig.orderService();*/

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        long memberId = 1L;

        Member member = new Member(memberId, "memberB", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 200000);

        System.out.println("order = " + order);
    }
}
