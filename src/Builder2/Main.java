package Builder2;

public class Main {
	public static void main(String[] args) {
   Refeicao refeicao = new Refeicao.Builder("Bife", "Batatas")
           .setBebida("Refrigerante")
           .setSobremesa("Pudim")
           .build();

   refeicao.mostrarDetalhes();
}
}
