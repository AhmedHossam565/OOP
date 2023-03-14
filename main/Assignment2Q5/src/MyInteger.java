public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger other) {
        return other.value == this.value;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value == 2 || value == 3)
            return true;

        if (value == 1 || value % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(value); i += 2) {
            if (value % i == 0)
                return false;
        }

        return true;
    }

    public static boolean isEven(MyInteger other) {
        return other.isEven();
    }

    public static boolean isOdd(MyInteger other) {
        return other.isOdd();
    }

    public static boolean isPrime(MyInteger other) {
        return other.isPrime();
    }
}
