public class Problem7Mean {
    private static float Mean(float[] numbers){
        float sum = 0, mean=0;
        for (int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        mean=sum/ numbers.length;
        return mean;
    }
    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));
    }
}
