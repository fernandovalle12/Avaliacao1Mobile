public class Truco {
	private Jogador jogador1;
	private Jogador jogador2;
	private Baralho baralho;
	private Carta cartaVirada;
	
    public Truco() {
    	this.jogador1 = new Jogador();
    	this.jogador2 = new Jogador();
    	this.baralho = new Baralho();
    	this.cartaVirada = new Carta();
    }

    public void jogar() {
        embaralhaCartas();
        distribuiMaos();
        inicializaManilha();
        imprimeMesa();
    }
    
    private void embaralhaCartas() {
		this.baralho.embaralhar();
	}   
    
    private void distribuiMaos() {
		for(int i = 0; i < 3; i++) {
			this.jogador1.recebeCarta(new Carta());
			this.jogador2.recebeCarta(new Carta());
		}
		
	}

	private void inicializaManilha() {
		this.cartaVirada = new Carta();
	}

	private void imprimeMesa() {
        System.out.println("Apenas um placeholder para a impressão de mesa.");
        System.out.println("Você não precisa implementar esse método.");
    }
	 
}
