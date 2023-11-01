package hellovt.corevt.discount;

import hellovt.corevt.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);

}
