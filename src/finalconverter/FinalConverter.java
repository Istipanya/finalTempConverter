/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalconverter;

import java.util.Scanner;

/**
 *
 * @author IstipanyaGrasya
 */
public class FinalConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String baseTemp;
        double temp;
        double answer;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose Base Temperature: ");
        System.out.println("A: Celcius");
        System.out.println("B: Fahrenhiet");

        baseTemp = input.next();
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Temperature: ");
        temp = input2.nextInt();
        
        switch (baseTemp) {
            case "A":
                answer = (((temp * 9) / 5) + 32);
                System.out.println(temp + " Celcius = " + answer + " Fahrenheit");
                break;
            case "a":
                answer = (((temp * 9) / 5) + 32);
                System.out.println(temp + " Celcius = " + answer + " Fahrenheit");
                break;
    }
    
}
}
