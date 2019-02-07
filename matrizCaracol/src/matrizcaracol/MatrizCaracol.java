/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizcaracol;
import java.io.BufferedReader;
import java.io. FileNotFoundException; 
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */

public class MatrizCaracol {
 
 public static void main(String[] args) {
  new MatrizCaracol();
 }
 
 /*
 public MatrizCaracol() {
  int[][] matrizAR = {
   {1,  2,  3,  4,  5},
   {6,  7,  8,  9,  10},
   {11, 12, 13, 14, 15},
   {16, 17, 18, 19, 20},
   {21, 22, 23, 24, 25}
  };
   
  imprimirMatrizCaracol(matrizAR);
 } */

void matrizArchivo (String matrizAR) throws FileNotFoundException, IOException {
    String cadena;
    FileReader f = new FileReader ("src/matrizcaracol/matrizTexto.txt");
    BufferedReader b = new BufferedReader (f);
    while((cadena = b.readLine())!=null){
        /*String[] split = cadena.split("<%s>",4);*/
        String[] cadenaS = cadena.split(",");
        
    }
    imprimirMatrizCaracol(matriz);
    b.close();    
} 


 private void imprimirMatrizCaracol(int[][] matriz){
 
  int comienzoFila=0;
  int longitudFial=matriz.length-1;
   
  int comienzoColumna=0;
  int longitudColumna = matriz[0].length-1;
   
  while(comienzoFila <= longitudFial && comienzoColumna <= longitudColumna){
   
   for (int i = comienzoFila; i <= longitudColumna; i++) {
    System.out.print(matriz[comienzoFila][i] + " ");
   }
 
   for (int j = comienzoFila+1; j <= longitudFial; j++) {
    System.out.print(matriz[j][longitudColumna] + " ");
   }
    
   if(comienzoFila+1 <= longitudFial){
    for (int k = longitudColumna-1; k >= comienzoColumna; k--) {
     System.out.print(matriz[longitudFial][k] + " ");
    }
   }
   if(comienzoColumna+1 <= longitudColumna){
    for (int k = longitudFial-1; k > comienzoFila; k--) {
     System.out.print(matriz[k][comienzoColumna] + " ");
    }
   }
   
   comienzoFila++;
   longitudFial--;
   comienzoColumna++;
   longitudColumna--;
   
  }
 }
 
}

