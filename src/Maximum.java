import java.util.Scanner;
public class Maximum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){

        double ausgabeDouble;
        ausgabeDouble = Maximum.maxDouble();
        char c2 = 'a';
        System.out.println("Bitte Char nr. 2 eingeben");
        c2 = sc.next().charAt(0);
        char c1;
        System.out.println("Bitte Char nr. 1 eingeben");
        c1 = sc.next().charAt(0);
       /* char ausgabeChar;*/
        char ausgabeChar = Maximum.maxChar(c2,c1);
/*        char groesser = Maximum.maxChar();
        System.out.println("groesserer Char ist: " + groesser);*/
    }
    public static double maxDouble() {
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
    public static char maxChar(char c2, char c1) {
        char groesser = 'd';
        if(c1 > c2){
            System.out.println(c1 + " ist größer");
            groesser = c1;
        }else{
            System.out.println(c2 + " ist größer");
            groesser = c2;
        }
        return groesser;
    }
}
