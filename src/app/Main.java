package app;

public class Main {

    private static final double CONV_K_M = 0.621371;
    private static final double CONV_K_K = 1.60934;

    public static void main(String[] args) {
        System.out.println("App for measures converting." );

        double kms = 5;
        double mls = 10;

        double miles = convKmsToMiles(kms);
        double kilometers = convMilesToKms(mls);

        System.out.println("Result is miles: " + miles);
        System.out.println("Result is kilometers: " + kilometers);

        System.out.println("Version 1.0.1");
    }
    private static double convKmsToMiles(double kms) {
        return kms * CONV_K_M;
    }

    private static double convMilesToKms(double miles) {
        return miles * CONV_K_K;
    }
}
