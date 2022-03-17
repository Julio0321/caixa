package caixa;

public class Caixa {
	
<<<<<<< HEAD
	private final int linhas;
	private final int colunas;
	private  String simbol;

=======
	private int linhas;
	private int colunas;
>>>>>>> origin/master
	
//	int linhas = 5;
//	int colunas = 5;

	
<<<<<<< HEAD
	public Caixa(int linhas,int colunas,String simbol) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.simbol = simbol;
	}
	
	public void setCaracter(String simbol) {
		this.simbol = simbol;	
=======
	public Caixa(int linhas,int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
>>>>>>> origin/master
	}
	
	public void imprimir() {
		//TOPO
<<<<<<< HEAD
		System.out.print(horizontal());
		
		//Lateral
		System.out.print(vertical());
		
		//Fim
		System.out.print(horizontal());
	}
	
	private  String horizontal() {
		String resultado = "";
		
		for(int i = 0; i < colunas; i++) {
			resultado = resultado.concat(simbol);
		}
		resultado = resultado.concat("\n");
		
		return resultado;
	}
	
	private  String vertical() {
		String resultado1 = "";
		
		for(int i = 0; i < linhas; i++) {
			resultado1 = resultado1.concat(simbol);
			
			for(int x = 0; x < colunas - 2 ; x++) {
			resultado1 = resultado1.concat(" ");
			}
			resultado1 = resultado1.concat(simbol + "\n");
		}
		

		return resultado1;
    }
	
=======
		horizontal(colunas);
		
		//Lateral
		vertical(linhas,colunas);
		
		//Fim
		horizontal(colunas);
	}
	
	private static void horizontal(int colunas) {
		for(int i = 0; i < colunas; i++) {
			System.out.print("0");
		}
		System.out.println("");
	}
	
	private static void vertical(int linhas,int colunas) {
		for(int i = 0; i < linhas; i++) {
			System.out.print("0");
			for(int x = 0; x < colunas - 2 ; x++) {
			System.out.print(" ");
			}
			System.out.println("0");
		}
    }
>>>>>>> origin/master
}