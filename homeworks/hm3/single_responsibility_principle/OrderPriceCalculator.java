public class OrderPriceCalculator {
    public double calculate(Order order) {
        return order.getQuantity() * order.getPrice() * 0.9;
    }
}
