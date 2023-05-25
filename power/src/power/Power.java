
package power;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("enter base: ");
        int base=scan.nextInt();
        System.out.print("enter pow: ");
        int pow=scan.nextInt();
        int number=1;
        for (int i = 0; i < pow; i++) {
            
            number*=base;
        }
        System.out.printf("%s ^ %s = %s ",base,pow,number);
    }
    
}
