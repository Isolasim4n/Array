/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author WINDOWS 8.1
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai [] ={70,80,65};
        double ratarata = 0.0;
        for (int i=0; i<nilai.length; i++)ratarata+=nilai [i];
        ratarata/=nilai.length;
        System.out.println("Nilai rata rata = "+ratarata);
    }
    
}
