package FactoryMethod2;

public class CriarWord extends CriarDocumento {
    @Override
    public Documento criarDocumento() {
        return new DocumentoWord();
    }
}
