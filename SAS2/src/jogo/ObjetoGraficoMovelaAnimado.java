package jogo;

import java.awt.Graphics2D;
import java.awt.Image;

public abstract class ObjetoGraficoMovelaAnimado extends ObjetoGraficoMovel{

	private int frameX;
	private int frameY;
	private int colunas;
	private int linhas;

	public ObjetoGraficoMovelaAnimado(int posX, int posY, int width, int height, Image sprite, int velX, int velY,
			int frameX, int frameY, int colunas, int linhas) {
		super(posX, posY, width, height, sprite, velX, velY);
		this.frameX = frameX;
		this.frameY = frameY;
		this.colunas = colunas;
		this.linhas = linhas;
	}
	
	@Override
	public void draw(Graphics2D g) {
		g.drawImage(getSprite(), getPosX(), getPosY(), getPosX()+getWidth(), getPosY()+getHeight(),
				getFrameX()*getWidth(), getFrameY()*getHeight(), getFrameX()*getWidth()+getWidth(), getFrameY()*getHeight()+getHeight(), null);
	}

	public int getFrameX() {
		return frameX;
	}

	public void setFrameX(int frameX) {
		this.frameX = frameX;
	}

	public int getFrameY() {
		return frameY;
	}

	public void setFrameY(int frameY) {
		this.frameY = frameY;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}
	
}
