import java.util.Scanner;
public class Maximum {

    public static void main(String [] args){
        double ausgabe;
        ausgabe = Maximum.max();
    }
    public static double max() {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("gleit1 bitte");
        double gleit1 = sc.nextDouble();
        System.out.println("gleit2 bitte");
        double gleit2 = sc.nextDouble();
        int choose = 0;

        if(gleit1>gleit2){
            choose = 1;
        }else{
            choose = 0;
        }
        switch(choose) {
            case 1:
                System.out.println(gleit1 + " gleit1 ist größer");
                break;
            default:
                System.out.println(gleit2 + " gleit2 ist größer");
                break;
        }
        return 0;
    }
}