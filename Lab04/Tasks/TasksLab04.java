package Tasks;

import javax.lang.model.util.Elements;
import java.util.Arrays;

public class TasksLab04 {

    protected void Task1(int[] tab) {
        int suma = 0;
        double srednia = 0;
        for (int i : tab) {
            suma += i;
            srednia += i;
        }
        System.out.println("Suma elementów tablicy: " + suma);
        System.out.println("Srednia elementów tablicy: " + srednia / tab.length);
    }

    protected void Task2(int[] tab1, int[] tab2) {
        System.out.println("\nCo drugi element pierwszej tablicy: ");
        for (int i = 0; i < tab1.length; i += 2) {
            System.out.print(tab1[i] + " ");
        }
        System.out.println("\nCo drugi element drugiej tablicy: ");
        for (int i = 0; i < tab2.length; i += 2) {
            System.out.print(tab2[i] + " ");
        }
    }

    protected void Task3(String[] tab) {
        System.out.println("Elementy tablicy: ");
        for (String s : tab) {
            System.out.print(s + " ");
        }
        System.out.println("\nElementy tablicy po zamianie liter na wielkie: ");
        for (String s : tab) {
            System.out.print(s.toUpperCase() + " ");
        }
    }

    public String[] Task4(String[] array) {
        String[] result = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            String tmp = "";
            for (int j = array[i].length()-1; j >= 0; j--) {
                tmp += array[i].charAt(j);
            }
            result[i] = tmp;
        }
        return result;
    }

    public int[] Task5(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int tmp = array[j-1];
                if (tmp > array[j]){
                    array[j-1] = array[j];
                    array[j] = tmp;
                }

            }
        }
        return array;
    }

    public int Task6(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *=i;
        }
        return result;
    }

    public boolean Task7(String[] array1, String[] array2) {
        if(Arrays.equals(array1, array2)){
            return true;
        }
        return false;
    }
}