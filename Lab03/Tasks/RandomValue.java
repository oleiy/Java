package Tasks;

import java.util.Random;

public class RandomValue {

    public static int[] RandomValue(int a, int b, int n){
        Random random = new Random();
        if(a>b){
            System.out.println("Początkowy zakres przedziału nie może być większy do końcowego!");
            return null;
        }

        if(n < 0){
            System.out.println("Ilość nie może być liczbą ujemną!");
            return null;
        }

        int[] values = new int[n];

        for(int i = 0; i < n; i++){
            values[i] = random.nextInt(b-a+1)+a;
        }

        return values;
    }

}
