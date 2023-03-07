package view;

import java.util.Random;

import Controller.ETha;


public class Principal {

	public static void main(String[] args) {
		int [][] ma = new int [3][5];
		Random ran = new Random();
		 for ( int l= 0 ;l < 3 ; l ++) {
			 for (int c=0; c<5; c++) {
				 ma[l][c]= ran.nextInt(15);
				 System.out.println(ma[l][c]+" " );
			 }
			 
				 	System.out.println( "\n " );
			
		 }
		 for (int j= 0; j < 3 ; j ++) {
				
				ETha nn = new ETha(ma);
				nn.start();

	}

		
		 
		
	}
}
