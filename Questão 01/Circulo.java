public class Circulo {
    private double raio = 1.0;
    private String cor = "vermelho";
    
    public Circulo() { }
    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio, String cor) {
    	this.raio = raio;
    	this.cor = cor;
    }
    
    public double getRaio() {
        return raio;
    }

    /* (c)
    Um aluno escreveu o seguinte c√≥digo para a classe `Circulo`:
    */
    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", cor=" + cor + "]";
    }
    // O que a palavra `@Override` indica? Por que ela foi colocada neste m√©todo da classe?
    // Resposta: a annotation `Override` È usada para sobrescrever o mÈtodo da superclasse. 
}