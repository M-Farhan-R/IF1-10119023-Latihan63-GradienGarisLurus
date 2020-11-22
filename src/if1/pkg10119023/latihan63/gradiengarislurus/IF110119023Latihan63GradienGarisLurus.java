/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan63.gradiengarislurus;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : program menghitung gradien garis dengan 2 titik diketahui
 *
 */
public class IF110119023Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 100;
        
        Koordinat[] xy = new Koordinat[n];
        xy[0] = new Koordinat(2,10,5,7);
        xy[1] = new Koordinat(5,1,3,12);
        
        for (int i = 0; i < xy.length; i++){
            if(xy[i]==null){
                break;
            }
            System.out.println("Garis yang melalui titik "+
                    titik(xy[i].getX1(),xy[i].getY1(),xy[i].getX2(),xy[i].getY2()));
            System.out.println("memiliki gradien sebesar "+xy[i].hitungGradien()+"\n");
        }
    }
    
    static String titik(int x1, int y1, int x2, int y2){
        String titik = "("+x1+","+y1+") dan ("+x2+","+y2+")";
        return titik;
    }
        

}
