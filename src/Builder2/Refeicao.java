package Builder2;

class Refeicao {
 private String pratoPrincipal;
 private String acompanhamento;
 private String bebida;
 private String sobremesa;

 private Refeicao(String pratoPrincipal, String acompanhamento, String bebida, String sobremesa) {
     this.pratoPrincipal = pratoPrincipal;
     this.acompanhamento = acompanhamento;
     this.bebida = bebida;
     this.sobremesa = sobremesa;
 }

 public void mostrarDetalhes() {
     System.out.println("Refeição: " + pratoPrincipal + ", " + acompanhamento + ", " + bebida + ", " + sobremesa);
 }

 static class Builder {
     private String pratoPrincipal;
     private String acompanhamento;
     private String bebida;
     private String sobremesa;

     public Builder(String pratoPrincipal, String acompanhamento) {
         this.pratoPrincipal = pratoPrincipal;
         this.acompanhamento = acompanhamento;
     }

     public Builder setBebida(String bebida) {
         this.bebida = bebida;
         return this;
     }

     public Builder setSobremesa(String sobremesa) {
         this.sobremesa = sobremesa;
         return this;
     }

     public Refeicao build() {
         return new Refeicao(pratoPrincipal, acompanhamento, bebida, sobremesa);
     }
 }
}

