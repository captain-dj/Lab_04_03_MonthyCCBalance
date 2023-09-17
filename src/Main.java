public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Your credit card balance is 5000$ with intrest of 17%");

        double doubleOperandBase = 5000;
        double doubleOperandIntrest = 0.17;
        double doubleOperandTime = 30;
        double Month1Sum = 0;
        double Month2Sum = 0;

// I = principal * rate * time
        Month1Sum = doubleOperandBase * doubleOperandIntrest * doubleOperandTime;
        System.out.println("Your intrest after 1 month is "+ Month1Sum +" ");

        Month2Sum = Month1Sum * doubleOperandIntrest * doubleOperandTime;
        System.out.println("Your intrest after 2 months is "+ Month2Sum +" ");


    }
}