package FluenteInterface;

public class Mensagem {
    private String remetente;
    private String destinatario;
    private String assunto;
    private String corpo;

    public Mensagem remetente(String remetente) {
        this.remetente = remetente;
        return this;
    }

    public Mensagem destinatario(String destinatario) {
        this.destinatario = destinatario;
        return this;
    }

    public Mensagem assunto(String assunto) {
        this.assunto = assunto;
        return this;
    }

    public Mensagem corpo(String corpo) {
        this.corpo = corpo;
        return this;
    }

    public void enviar() {
        System.out.println("Enviando Email:");
        System.out.println("De: " + remetente);
        System.out.println("Para: " + destinatario);
        System.out.println("Assunto: " + assunto);
        System.out.println("Corpo: " + corpo);
    }

    public static void main(String[] args) {
    	Mensagem construtor = new Mensagem();
        construtor.remetente("remetente@exemplo.com").destinatario("destinatario@exemplo.com").assunto("Olá, Usuario!").corpo("Esta é uma mensagem de email.").enviar();
    }
}
