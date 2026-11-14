import java.util.Scanner;

public class bab1 {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        int a= q.nextInt();
        for (int i = 1; i<=a; i++) {
            for (int j = a; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                if (j==1) {
                    System.out.print("*");
                }else if (i==a) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <=i; j++) {
                if (j==i) {
                    System.out.print("*");
                }else if (i==a) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i<=a; i++) {
            for (int j = 1; j <=a; j++) {
                if (i==1) {
                    System.out.print("* ");
                }else if (i==a) {
                    System.out.print("* ");
                }else if (j==1) {
                    System.out.print("* ");
                }else if (j==a) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int j = 1; j <=a; j++) {
                for (int j2 = a; j2 >=j; j2--) {
                    if (j2==a) {
                        System.out.print("*");
                    }else if (j2==j) {
                        System.out.print("*");
                    }else if (j==1) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
            System.out.println();
            for (int j = a; j >=1; j--) {
                for (int j2 = 1; j2 <=a; j2++) {
                    if (j2==a) {
                        System.out.print("*");
                    }else if (j2==j) {
                        System.out.print("*");
                    }else if (j==1) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
            System.out.println();
             for (int i = 1; i<=a; i++) {
            for (int j = 1; j <=a*2; j++) {
                if (i==1) {
                    System.out.print("* ");
                }else if (i==a) {
                    System.out.print("* ");
                }else if (j==1) {
                    System.out.print("*  ");
                }else if (j==a) {
                    System.out.print("*  ");
                }else{
                    System.out.print("     ");
                }
            }
            System.out.println();
            }
           
        q.close();
    }
}
