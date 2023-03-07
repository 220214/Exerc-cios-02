package Controller;

public class ETha extends Thread {
	private int [][]Ma;

	public ETha(int [][]Ma ) {
		this.Ma=Ma;
		
	}
	public void run(){
		int soma= 0;
		
		for ( int l=0; l< 3;l ++) {
			soma =0;
			int linha = l;
			for (int c=0; c<5; c ++) {
				soma = soma + Ma [linha ][c];
				
			}
			System.out.println(" Soma da Linha "+ linha + " : "+ soma );
		}
		
	}
}
