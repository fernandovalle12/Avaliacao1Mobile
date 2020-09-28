import java.util.ArrayList;

public class Jogador {
	private ArrayList<Carta> mao;
	private int indiceMao;
	
	public Jogador() {
		this.mao = new ArrayList<Carta>(3);
		this.indiceMao = 0;
	}
	
	public void recebeCarta(Carta c) {
		this.mao.add(this.indiceMao, c);
		this.indiceMao = this.indiceMao + 1;
	}
}
