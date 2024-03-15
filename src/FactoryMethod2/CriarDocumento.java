package FactoryMethod2;

abstract class CriarDocumento {

	public abstract Documento criarDocumento();

    public void prepararDocumento() {
        System.out.println("Preparando documento.");
    }
}
