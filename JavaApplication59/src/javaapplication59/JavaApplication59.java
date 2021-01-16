/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59;
import java.util.Scanner;
/**
 *
 * @author WHITEKABAR
 */
public class JavaApplication59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0; double sum = 0;
        String enough;
        boolean neo = false;
        Scanner input = new Scanner (System.in);
        while(!neo) {
            System.out.println("Enter numbers "+(i+1)+": ");
            enough = input.next();
            if ((enough.length()==1) && (enough.charAt(0)=='q')) {
                neo = true;
            }else{
                i++;
                sum += Double.parseDouble(enough);
            }
        }
            System.out.println("Average is "+(sum/i));
    }
    }
