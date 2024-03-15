package FactoryMethod2;

public class Main {

	public static void main(String[] args) {

        CriarPDF pdfFactory = new CriarPDF();

        Documento pdfDocument = pdfFactory.criarDocumento();

        System.out.println("PDF Detalhes:");
        pdfDocument.open();
        pdfDocument.save();
        System.out.println();

        CriarWord wordFactory = new CriarWord();

        Documento wordDocument = wordFactory.criarDocumento();

        System.out.println("Word Detalhes");
        wordDocument.open();
        wordDocument.save();
    }

}
