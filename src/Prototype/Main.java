package Prototype;

public class Main {
public static void main(String[] args) {
   Configuracao configuracaoPadrao = new Configuracao("Batata", "Carne");
   //configuracaoPadrao.mostrarOpcoes();

   Configuracao configuracaoPersonalizada = configuracaoPadrao.clone();
   //configuracaoPersonalizada.mostrarOpcoes();
   configuracaoPersonalizada.mostrarOpcoes();
   //configuracaoPersonalizada.mostrarOpcoes();
}
}
