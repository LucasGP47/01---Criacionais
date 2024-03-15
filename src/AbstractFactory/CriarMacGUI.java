package AbstractFactory;

public class CriarMacGUI implements CriarGUI{
	
    @Override
    public Botao criarBotao() {
        return new BotaoMac();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaMac();
    }

}
