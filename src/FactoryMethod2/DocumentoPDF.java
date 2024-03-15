package FactoryMethod2;

public class DocumentoPDF implements Documento{
    @Override
    public void open() {
        System.out.println("Abrindo documento PDF.");
    }

    @Override
    public void save() {
        System.out.println("Salvando documento PDF");
    }
}
