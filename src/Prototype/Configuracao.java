package Prototype;

class Configuracao implements Cloneable {
 private String opcao1;
 private String opcao2;

 public Configuracao(String opcao1, String opcao2) {
     this.opcao1 = opcao1;
     this.opcao2 = opcao2;
 }

 public void mostrarOpcoes() {
     System.out.println("Opção 1: " + opcao1);
     System.out.println("Opção 2: " + opcao2);
 }

 @Override
 public Configuracao clone() {
     try {
         return (Configuracao) super.clone();
     } catch (CloneNotSupportedException e) {
         return null;
     }
 }
}

