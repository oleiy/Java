package Tasks;

public class TasksLab03 {

    protected double Task1(int points, int n){
        return (double) points / n;
    }

    protected int Task3(int[] array, int n){
        int sum = 0;
        for(int i = 0; i<n;i++){
            if(array[i] % 2 == 0){
                sum += array[i];
            }
        }
        return sum;
    }

    protected int Task4(int[] array, int n){
        int sum = 0;
        for(int i = 0; i<n;i++){
            if(array[i] % 2 == 0){
                sum += array[i];
            }
        }
        return sum;
    }

    protected boolean Task5(String word){
        for (int i = 0; i < word.length()/2; i++) {
            if(word.charAt(i)!=word.charAt(word.length()-1-i))
                return false;
        }
        return true;
    }

}
