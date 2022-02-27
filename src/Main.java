public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amount = 1_000_000;
        //double[] period = new double[] {12,24,36};
        double period[] = {12, 24, 36};
        double[] mounthPayment = new double[3];
        for (int i = 0; i < 3; i++) {
            mounthPayment[i] = service.calculate(amount, period[i]);
            System.out.println(mounthPayment[i]);
        }
    }
}