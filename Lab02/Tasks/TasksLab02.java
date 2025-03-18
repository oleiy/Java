package Tasks;

import java.awt.*;

public class TasksLab02 {

    protected int Task1(int a, int b, int c, int x){
        return a*x*x + b*x + c;
    }

    protected void Task2 (double x){

        if(x > 0){
            System.out.println("Wartość funkcji a(x) dla x = "+x+" = "+2*x);
        }else if(x==0){
            System.out.println("Wartość funkcji a(x) dla x = "+x+" = 0");
        }else {
            System.out.println("Wartość funkcji a(x) dla x = " + x + " = " + (-3)*x);
        }

        if(x >= 1){
            System.out.println("Wartość funkcji b(x) dla x = "+x+" = "+x*x);
        }else{
            System.out.println("Wartość funkcji b(x) dla x = "+x+" = "+x);
        }

        if(x > 2){
            System.out.println("Wartość funkcji c(x) dla x = "+x+" = "+(2+x));
        }else if(x==2){
            System.out.println("Wartość funkcji c(x) dla x = "+x+" = 8");
        }else {
            System.out.println("Wartość funkcji c(x) dla x = " + x + " = " + (x-4));
        }

        }

        protected void Task3(double x, double y, double z) {

            if (x > y) {
                double tmp = x;
                x = y;
                y = tmp;
            }
            if (x > z) {
                double tmp = x;
                x = z;
                z = tmp;
            }
            if (y > z) {
                double tmp = y;
                y = z;
                z = tmp;
            }

            System.out.println(x+" "+y+" "+z);
        }

        protected void Task4(boolean rain, boolean bus){
            if (rain && bus){
               System.out.println("Weź parasol, Dostaniesz się na uczelnie");
            } else if (rain && !bus){
                System.out.println("Nie dostaniesz się na uczelnie");
            } else if(!rain && bus){
                System.out.println("Dostaniesz się na uczelnie, Miłego dnia i pięknej pogody");
            }
        }

        protected void Task5(boolean discount, boolean raise){
            if(!discount || raise){
                System.out.println("Możesz kupić samochoód!, Zniżki na samochód nie ma");
            }else if(!discount || !raise){
                System.out.println("Zakup samochodu trzeba odłożyć na później..., Zniżki na samochód nie ma");
            }else if(discount || raise){
                System.out.println("Możesz kupić samochód!");
            }
        }

        protected double Task6(int id, int a, int b){
        int result = 0;
            switch (id) {
                case 1:
                    result = a + b;
                break; 
                case 2:
                    result = a - b;
                break;
                case 3:
                    result = a * b;
                break;
                case 4:
                    result = a / b;
                break;
                case 5:
                    result = a % b;
                break;
            }
            return result;
        }

}


