package FluenteInterface;

public class Geometria {
	    private int comprimento;
	    private int largura;
	    private int altura;

	    public Geometria definirComprimento(int comprimento) {
	        this.comprimento = comprimento;
	        return this;
	    }

	    public Geometria definirLargura(int largura) {
	        this.largura = largura;
	        return this;
	    }

	    public Geometria definirAltura(int altura) {
	        this.altura = altura;
	        return this;
	    }

	    public int calcularVolume() {
	        return comprimento * largura * altura;
	    }

	    public static void main(String[] args) {
	        int volume = new Geometria().definirComprimento(5).definirLargura(3).definirAltura(2).calcularVolume();
	        System.out.println("Volume: " + volume);
	    }
	}

