public class Problem4BilanganPrima {
    private static boolean primeNumber(int number) {
        boolean primeNumber = false;
        if ((number % 2 != 0) && (number % 3 != 0) && (number % 5 != 0)) {
            primeNumber = true;
        } else if ((number == 2)||(number == 3)||(number == 5)){
            primeNumber=true;
        }
        return primeNumber;
    }
    public static void main (String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
    }
}
