public class Problem6DrawXYZ {
    private static void DrawXYZ(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((i+j)%2!=0)
                    System.out.print("Z ");
                else if((i+j)%2==0)
                    System.out.print("Y ");
                else if ((i+j)==2)
                    System.out.print("X ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    public static void main (String[] args){
        DrawXYZ(3);
        DrawXYZ(5);
        DrawXYZ(1);
    }
}
