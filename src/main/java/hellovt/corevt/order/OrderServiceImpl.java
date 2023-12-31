package hellovt.corevt.order;

import hellovt.corevt.discount.DiscountPolicy;
import hellovt.corevt.discount.FixDiscountPolicy;
import hellovt.corevt.discount.RateDiscountPolicy;
import hellovt.corevt.member.Member;
import hellovt.corevt.member.MemberRepository;
import hellovt.corevt.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
