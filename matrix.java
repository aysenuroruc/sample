package paralell;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class matrix {

 
	public static long[][] mult(long a[][], long b[][]){//a[m][n], b[n][p] // Çarpma methodu tanımlandı
		
		   if(a.length == 0) return new long[0][0];           //Standart matris kuralları uygulandı
		   if(a[0].length != b.length) return null;           //Standart matris kuralları uygulandı
		 
		   int n = a[0].length;  //Standart matris kuralları uygulandı
		   int m = a.length;//Standart matris kuralları uygulandı
		   int p = b[0].length;//Standart matris kuralları uygulandı
		 
		  long sonuc[][] = new long[m][p];   // Dinamik olarak  sonuç matrisi oluşturuldu
		 
		   for(int i = 0;i < m;i++){     // Çarpma işlemi için gerekli for döngüsü
		      for(int j = 0;j < p;j++){
		         for(int k = 0;k < n;k++){
		            sonuc[i][j] += a[i][k] * b[k][j];
		         }
		      }
		   }
		   return sonuc;  
		}
 
public static void main(String[] args) {

    Scanner klavye = new Scanner(System.in);

    System.out.println("Boyutu Giriniz : ");

    int boyut = klavye.nextInt();
    
    long matris1 [][] = new long [boyut][boyut];    //Matris oluşturma işlemi

    long matris2 [][] = new long [boyut][boyut];//Matris oluşturma işlemi
    for (int i = 0; i < boyut ; i++) {
         for (int j = 0; j < boyut; j++) {

            int random1 = (int)(Math.random()*10);  // Random olarak satır & sütun değerleri atamak
            int random2 = (int)(Math.random()*10);   // Random olarak satır & sütun değerleri atamak

            matris1[i][j] = random1;        // Random olarak satır & sütun değerleri atamak
            matris2[i][j] = random2;            // Random olarak satır & sütun değerleri atamak
        }
    }
      
       long startTime=System.currentTimeMillis();
    mult(matris1,matris2);
       long endTime=System.currentTimeMillis();
	   long estimatedTime=endTime-startTime;
	   double seconds=(double)estimatedTime/1000;
	   System.out.println(seconds+"saniyedir");
 }
}
