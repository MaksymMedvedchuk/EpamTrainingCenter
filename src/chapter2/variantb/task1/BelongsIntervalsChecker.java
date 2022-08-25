package chapter2.variantb.task1;

import java.util.Scanner;

public class BelongsIntervalsChecker {
    public void printNumbers(){
        System.out.print("Enter your k: ");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        System.out.println("Enter your interval from n to m: ");
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter m: ");
        int m = in.nextInt();
        if (k>n && k<m)
            System.out.println("Your k belongs is (n,m)");
        else if (k>n && k<=m)
            System.out.println("Your k belongs is (n,m]");
        else if (k>=n && k<m)
            System.out.println("Your k belongs is [n,m)");
        else if (k>=n && k<=m)
            System.out.println("Your k belongs is [n,m]");
        else
            System.out.println("Your k don't belong to interval n,m");
    }
}
