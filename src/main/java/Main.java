public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();

        String binaryNum1 = "101";
        String binaryNum2 = "110";

        String sumResult = binOps.sum(binaryNum1, binaryNum2);
        String multResult = binOps.mult(binaryNum1, binaryNum2);

        System.out.println("Сумма двух чисел " + binaryNum1 + " и " + binaryNum2 + " Будет: " + sumResult);
        System.out.println("Произведение двух чисел " + binaryNum1 + " и " + binaryNum2 + " Будет: " + multResult);
    }
}