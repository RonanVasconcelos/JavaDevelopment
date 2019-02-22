package CornerstoneClasses.Lab1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("give me your name");
//        String name = in.nextLine(); // user input
//
//        System.out.println("Do you smoke?  y (yes)  n (No)");
//        String smoke = in.nextLine();
//        boolean smokeb;
//        if (smoke == "y") {
//            smokeb = true;
//        } else {
//            smokeb = false;
//        }


        Model m1 = new Model("Laurel", "Yanny", 70, 150, true, false);
        m1.setHeight(6, 10);
        m1.printDetails(true);
        m1.calculatePayDollarsPerHour();

    }


}
