import java.util.Scanner;
public class Maximum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){

        double ausgabe;
        ausgabe = Maximum.max();
    }
    public static double max() {
        System.out.println("Hello world!");
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
    public static char max(char c1, char c2) {
         char c1 = sc.next().charAt(0);
        if(char c1 > char c2){
            System.out.println(c1 + " c1 ist größer");
        }else{
            System.out.println("c2 ist größer");
        }
        return 'a';
    }
}
