public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int yourMonthPayment = (int) service.calculate(9.99F, 12, 1000000);
        System.out.println("Ваш ежемесячный платеж по кредиту на 1 год = " + yourMonthPayment);
        int yourMonthPayment1 = (int) service.calculate(9.99F, 24, 1000000);
        System.out.println("Ваш ежемесячный платеж по кредиту на 2 года = " + yourMonthPayment1);
        int yourMonthPayment2 = (int) service.calculate(9.99F, 36, 1000000);
        System.out.println("Ваш ежемесячный платеж по кредиту на 3 года = " + yourMonthPayment2);
    }
}
