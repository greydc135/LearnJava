import java.util.Scanner;
import java.util.ArrayList;

class Main {

    public static void program1(){
        System.out.println("Enter five names:");
        String nameIn;
        ArrayList<String> names = new ArrayList<String>();

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            nameIn = in.nextLine();
            names.add(nameIn);
        }
        System.out.println(names);
        System.out.println();
    }

    public static void program2(){
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number " + num + " is Even");
        }
        else {
            System.out.println("The number " + num + " is Odd");
        }

        System.out.println();
    }

    public static void program3(){
        System.out.println("I'm counting my menu system I made in 'main' as my third program :)");
        System.out.println();
    }

    public static void main(String[] args){
        int input = 4;
        while (input != 0) {
            System.out.println("0 - Quit");
            System.out.println("1 - Five Names");
            System.out.println("2 - Even or Odd");
            System.out.println("3 - Menu");

            // this is all to accept an input and set it equal to 'input'
            Scanner newIn = new Scanner(System.in);
            System.out.println("Input:");
            input = newIn.nextInt();
            System.out.println();

            if (input == 1) {
                program1();
            }
            if (input == 2) {
                program2();
            }
            if (input == 3) {
                program3();
            }
        }
    }
}