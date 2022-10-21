import java.util.Scanner;
public class Problem3FaktorBilangan {
    public static void main (String[] args) {
        /*---- Initialization Variable ----*/
        int bilangan;
        /*---- Main Program ----*/
        Scanner input=new Scanner(System.in);
        System.out.print ("Masukkan Nilai Bilangan: ");
        bilangan=input.nextInt();
        for(int i=1;i<=bilangan;i++) {
            if (bilangan%i==0)
                System.out.println(i);
        }
    }
}
