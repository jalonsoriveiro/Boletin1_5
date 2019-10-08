/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol1_5;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Bol1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //    5- Escribe un programa que lea o valor dunha distancia en millas mariñas e a pase a metros ( 1 milla mariña = 1852 m ).
        //Codifica o programa correspondente para executar o programa

        float valorMillaMetro = 1852;
        
        System.out.print("Millas =");
        Scanner milla= new Scanner(System.in);
        float millas = milla.nextFloat();  
        System.out.println("");         
        System.out.print("Valor millas en metros ="+valorMillaMetro*millas);
    }
    
}
