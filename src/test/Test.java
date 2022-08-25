package test;

import java.util.Scanner;

public class Test {

        public static void checkNumber () {
            System.out.print("Enter your k ");
            Scanner in = new Scanner(System.in);
            int k = in.nextInt();
            System.out.println("Enter your interval from n to m");
            System.out.print("Enter n ");
            int n = in.nextInt();
            System.out.print("Enter m ");
            int m = in.nextInt();
            if (k>n && k<m)
                System.out.println("Your k belongs to (n,m)");
            else if (k>n && k<=m)
                System.out.println("Your k belongs to (n,m]");
            else if (k>=n && k<m)
                System.out.println("Your k belongs to [n,m)");
            else if (k>=n && k<=m)
                System.out.println("Your k belongs to [n,m]");
            else
                System.out.println("Your k not belongs to interval n,m");
        }
    }















