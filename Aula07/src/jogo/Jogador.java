package jogo;

public class Jogador {
	private String nome;
	private int pontos;

	public Jogador(String nome) {
		this.pontos = 0;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

}
