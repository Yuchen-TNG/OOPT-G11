public class P2Q4 {
    public static double calculateAverage(int num1, int num2){
        return((num1 + num2)/2);
    }
    public static double calculateAverage(int num1, int num2, int num3){
        return((num1 + num2 + num3)/3);
    }

    public static double calculateAverage(double num1, double num2){
        return((num1 + num2)/2);
    }

    public static double calculateAverage(double num1, double num2, double num3){
        return((num1 + num2 + num3)/3);
    }

    public static void main(String[] args) {
        System.out.println("Average of 2 integers:" + calculateAverage(6, 6));
        System.out.println("Average of 3 integers:" + calculateAverage(8, 6));
        System.out.println("Average of 2 double:" + calculateAverage(4.2, 5.2));
        System.out.println("Average of 3 integers:" + calculateAverage(6.5, 7.0));
    }
}
