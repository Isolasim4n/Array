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
public class Array4 {
    int nis [][]={{210651},{210652},{210653}};
    String nama [][]={{"Prasetya"},{"Adi"},{"Arfanto"},{"Pras"}};
    
    public void tampil(String n){
        System.out.println("Identitas Siswa Angkatan 24");
    }
    public void namanis(int n){
        for(int i=0; i<nis.length;i++){
            for(int j=0;j<1;j++){
                System.out.println(nama[i][j]+":"+nis[i][j]);
            }
        }
    }
     public static void main(String[] args) {
       Array4 siswa = new Array4();
       siswa.tampil(null);
       siswa.namanis(0);
    }
    
}
