public class OddEven {
    public void CheckNumberOddOrEven(int number) {
        String finalNumber = null;
        if (number % 2 == 1) {
            System.out.println(number);
        } else if (number < 0) {
            System.out.println("Error");
        } else {
            String string = Integer.toString(number);
            int length = string.length();
            finalNumber = Integer.toString((number / 10)+1);
            for (int i = 0; i < length - 1; i++) {
                finalNumber += "0";
            }
            System.out.println(finalNumber);
        }
    }
    public static void main(String[] args) {
        OddEven inputNumber=new OddEven();
        inputNumber.CheckNumberOddOrEven(-1);
        inputNumber.CheckNumberOddOrEven(47);
        inputNumber.CheckNumberOddOrEven(98);
    }
}
