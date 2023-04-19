public class CreditPaymentService {
    public float calculate(float yearPercent, int months, int loan) {
        double monthPercent = yearPercent / 12 / 100;
        double x = (double) Math.pow(1 + monthPercent, months);
        double K = monthPercent * x / (x - 1);
        double monthPayment = K * loan;
        return (float) monthPayment;
    }
}
