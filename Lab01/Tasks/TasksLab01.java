package Tasks;

public class TasksLab01 {

    //Method for Task1
    protected String Task1(String name, int age) {
        return "Imię: " + name + ", wiek: " + age + ".";
    }

    //Method for Task2
    protected void Task2(double value1, double value2) {
        double sum = value1 + value2;
        double diff = value1 - value2;
        double product = value1 * value2;
        System.out.println("Suma: " + sum);
        System.out.println("Różnica: " + diff);
        System.out.println("Iloczyn}: " + product);
    }

    //Method for Task3
    protected boolean Task3(int value) {
        return value % 2 == 0;
    }

    //Method for Task4
    protected boolean Task4(int value) {
        return (value % 3 == 0 && value % 5 == 0);
    }

    //Method for Task5
    protected int Task5(int value) {
        return value * value * value;
    }

    //Method for Task6
    protected double Task6(double value) {
        return Math.sqrt(value);
    }

    //Method for Task7
    protected boolean Task7(int num1, int num2, int num3) {
        /* 1. Musimy sprawdzić czy da się stworzyć trójkąt, sprwadzimy warunek na możliwość stworzenia trójkąta prostokątnego. */
        if ((num1 + num2) > num3 && (num1 + num3) > num2 && (num2 + num3) > num1) {
            if ((num1*num1+num2*num2) == num3*num3 || (num1*num1+num3*num3) == num2*num2 || (num2*num2+num3*num3) == num1*num1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }


    }

}