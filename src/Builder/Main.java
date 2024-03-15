package Builder;

public class Main {
	 public static void main(String[] args) {
	     Eletronico eletronico = new Eletronico.Builder("Samsung", "Smart TV").setAno(2022).setPreco(2500.00).build();

	     eletronico.mostrarDetalhes();
	 }
	}
