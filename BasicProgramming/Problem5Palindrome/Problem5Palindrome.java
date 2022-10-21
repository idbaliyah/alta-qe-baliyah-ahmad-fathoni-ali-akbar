public class Problem5Palindrome {
    private static boolean palindrome(String value) {
        boolean palindrome;
        StringBuilder reverseValue=new StringBuilder(value);
        reverseValue.reverse();
        String rev=reverseValue.toString();
        if(value.equals(rev)){
            palindrome = true;
        }else{
            palindrome = false;
        }
        return palindrome;
    }
    public static void main (String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu"));
        System.out.println(palindrome("lion"));
    }
}
