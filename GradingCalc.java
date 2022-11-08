/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

//import java.util.Scanner;

package com.mycompany.gradingcalc;

/**
 *
 * @author User
 */

import java.util.Scanner;
public class GradingCalc {

    public static void main(String[] args) {
        Scanner shem = new Scanner(System.in);
        
        //Declaration of variables;
        int testScore;
        
        //User input
        System.out.println("Enter your test score:");
        testScore = shem.nextInt();
        
        //if statements;
        if (testScore < 60){
            System.out.println("Your grade is F");   
        
        } else if (testScore < 70){
            System.out.println("Your grade is D");
            
        }else if(testScore < 80){
            System.out.println("Your grade is C");  
            
        }else if(testScore < 90){
        
            System.out.println("Your grade is B");
        
        }else{
        System.out.println("Your grade is A");
    }
        
    }
}
