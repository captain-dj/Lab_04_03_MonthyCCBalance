public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Your price is 50$ and a a 5% increese");

        double doubleOperandA = 100;
        double doubleOperandB = 0.05;
        double doubleOperandC = 50;
        double doubleSum = 0;
        double TaxSum = 0;

        doubleSum = doubleOperandB / doubleOperandA;
        TaxSum = doubleOperandC * doubleSum;
        System.out.println("After the Tax your item is "+ TaxSum +" ");


    }
}