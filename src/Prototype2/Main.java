package Prototype2;

public class Main {
 public static void main(String[] args) {
     Produto produtoOriginal = new Produto("Notebook", 2500.00);
     produtoOriginal.mostrarDetalhes();

     Produto produtoSimilar = produtoOriginal.clone();
     produtoSimilar.mostrarDetalhes();

     //produtoSimilar.mostrarDetalhes();
     //produtoSimilar.mostrarDetalhes();
 }
}
