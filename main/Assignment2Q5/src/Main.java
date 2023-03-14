public class Main {
    public static void main(String[] args) {
            MyInteger num1 = new MyInteger(5);
            MyInteger num2 = new MyInteger(10);

            System.out.println(num1.getValue() + " is odd? " + num1.isOdd());
            System.out.println(num1.getValue() + " is even? " + num1.isEven());
            System.out.println(num1.getValue() + " is prime? " + num1.isPrime());
            System.out.println(num1.getValue() + " equals 5? " + num1.equals(5));
            System.out.println(num1.getValue() + " equals " + num2.getValue() + "? " + num1.equals(num2));

            System.out.println(num2.getValue() + " is odd? " + num2.isOdd());
            System.out.println(num2.getValue() + " is even? " + num2.isEven());
            System.out.println(num2.getValue() + " is prime? " + num2.isPrime());
            System.out.println(num2.getValue() + " equals 10? " + num2.equals(10));
          
}
}