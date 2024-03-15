package Prototype2;

class Produto implements Cloneable {
 private String nome;
 private double preco;

 public Produto(String nome, double preco) {
     this.nome = nome;
     this.preco = preco;
 }
 
 public void mostrarDetalhes() {
     System.out.println("Produto: " + nome);
     System.out.println("Preço: R$ " + preco);
 }

 @Override
 public Produto clone() {
     try {
         return (Produto) super.clone();
     } catch (CloneNotSupportedException e) {
         return null;
     }
 }
}