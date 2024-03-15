package FactoryMethod2;

public class DocumentoWord implements Documento{
    @Override
    public void open() {
        System.out.println("Abrindo documento Word.");
    }

    @Override
    public void save() {
        System.out.println("Salvando Documento Word.");
    }
}
