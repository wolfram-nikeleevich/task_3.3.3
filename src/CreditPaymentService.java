public class CreditPaymentService {
    public double calculate(double amount, double period) {
        double percentageRate = 9.99;
        double i = percentageRate/1200;
        double k = i/(Math.pow(1+i,period) - 1) + i;
        return k*amount;
    }
}
