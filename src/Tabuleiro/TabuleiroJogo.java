package Tabuleiro;

public class TabuleiroJogo {

	private int linha;
	private int coluna;
	private Peca [][] pecas;
	
	
	public TabuleiroJogo(int linha, int coluna) {
	
		this.linha = linha;
		this.coluna = coluna;
		pecas = new Peca[linha][coluna];
	}


	public int getLinhas() {
		return linha;
	}


	public void setLinhas(int linhas) {
		this.linha = linhas;
	}


	public int getColuna() {
		return coluna;
	}


	public void setColuna(int coluna) {
		this.coluna = coluna;
	}


	
	
	
	
}
