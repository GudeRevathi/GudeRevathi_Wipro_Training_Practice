package oops;

public class BankingSystem {
    public static void main(String[] args) {

        // Anonymous class for Simple Interest Calculation
        InterestCalculator interest = new InterestCalculator() {

            public double calculateSimpleInterest(double p, double r, double t) {
                return (p * r * t) / 100;
            }
        };
        System.out.println("Simple Interest: ₹" + interest.calculateSimpleInterest(10000, 5, 2));


        // Anonymous class for EMI Calculation
        EMICalculator emi = new EMICalculator() {

            public double calculateEMI(double principal, double annualRate, int months) {
                double monthlyRate = annualRate / (12 * 100);
                return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                        (Math.pow(1 + monthlyRate, months) - 1);
            }
        };
        System.out.println("Monthly EMI: "+emi.calculateEMI(50000, 10, 12));

        // Anonymous class for Currency Conversion
        CurrencyConverter converter = new CurrencyConverter() {

            public double convertToUSD(double inrAmount) {
                double conversionRate = 83.0; // Example rate: 1 USD = ₹83
                return inrAmount / conversionRate;
            }
        };
        System.out.println("INR 8300 in USD: "+ converter.convertToUSD(8300));
    }

}
