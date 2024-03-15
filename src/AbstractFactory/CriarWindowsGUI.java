package AbstractFactory;

public class CriarWindowsGUI implements CriarGUI {
    @Override
    public Botao criarBotao() {
        return new BotaoWindows();
    }

	@Override
	public Janela criarJanela() {
		return new JanelaWindows();
	}
}
