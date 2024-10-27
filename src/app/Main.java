package app;

public class Main {

    private static final double CONV_K_M = 0.621371;

    public static void main(String[] args) {
        System.out.println("App for measures converting." );

        double kms = 5;

        double miles = convKmsToMiles(kms);

        System.out.println("Result is " + miles);


    }
    private static double convKmsToMiles(double kms) {
        return kms * CONV_K_M;
    }


}
