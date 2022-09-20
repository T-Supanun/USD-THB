/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4Assign;
import java.util.Scanner;
/**
 *
 * @author supanuntinbaanmai
 */
public class Exchange {
    public static void main(String[] args){
        System.out.println("Welcome to money exchange program.");
        System.out.println("----------------------------------");
        System.out.println("1. USD to BAHT");
        System.out.println("2. BAHT to USD");
        System.out.println("----------------------------------");
        
        

        Scanner sc = new Scanner(System.in); //Create Objesct
        System.out.print("Select your choice : ");
        int X = sc.nextInt();
        System.out.println("----------------------------------");
        
        System.out.print("Enter money : ");
        float Y = sc.nextFloat();
        
        switch(X){
            case 1 : System.out.println("Your money is :"+ (Y*30)+" BAHT");
                    break;
            case 2 : System.out.println("Your money is :"+ (Y/30)+" USD");
                    break;
            default : System.out.println("Invalid choice");
        }  
    }
}
