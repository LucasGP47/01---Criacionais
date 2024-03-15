package FactoryMethod2;

public class CriarPDF extends CriarDocumento {
    @Override
    public Documento criarDocumento() {
        return new DocumentoPDF();
    }
}
