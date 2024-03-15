package Builder;

class Eletronico {
 private String marca;
 private String modelo;
 private int ano;
 private double preco;

 private Eletronico(String marca, String modelo, int ano, double preco) {
     this.marca = marca;
     this.modelo = modelo;
     this.ano = ano;
     this.preco = preco;
 }

 public void mostrarDetalhes() {
     System.out.println("Produto Eletrônico: " + marca + " " + modelo + " " + ano + " - R$ " + preco);
 }

 static class Builder {
     private String marca;
     private String modelo;
     private int ano;
     private double preco;

     public Builder(String marca, String modelo) {
         this.marca = marca;
         this.modelo = modelo;
     }

     public Builder setAno(int ano) {
         this.ano = ano;
         return this;
     }

     public Builder setPreco(double preco) {
         this.preco = preco;
         return this;
     }

     public Eletronico build() {
         return new Eletronico(marca, modelo, ano, preco);
     }
 }
}

