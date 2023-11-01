package hellovt.corevt.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
