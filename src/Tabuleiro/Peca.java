package Tabuleiro;

public class Peca {
	protected Posicao posicao;
	private TabuleiroJogo tabuleirojogo;
	
	
	public Peca(TabuleiroJogo tabuleirojogo) {
		this.tabuleirojogo = tabuleirojogo;
		posicao = null;
	}


	protected TabuleiroJogo getTabuleirojogo() {
		return tabuleirojogo;
	}


	
	
}
