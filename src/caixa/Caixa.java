package caixa;

public class Caixa {
	

	private final int linhas;
	private final int colunas;
	private  String simbol;

//	int linhas = 5;
//	int colunas = 5;

	public Caixa(int linhas,int colunas,String simbol) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.simbol = simbol;
	}
	
	public void setCaracter(String simbol) {
		this.simbol = simbol;	
	}
	
	public void imprimir() {
		//TOPO
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
	
}