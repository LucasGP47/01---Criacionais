package AbstractFactory;

public class Main {
    public static void main(String[] args) {
    	
        CriarGUI guiFactory;

        // Exemplo para Windows
        guiFactory = new CriarWindowsGUI();
        Botao windowsButton = guiFactory.criarBotao();
        Janela windowsWindow = guiFactory.criarJanela();

        windowsButton.click();
        windowsWindow.render();

        // Exemplo para Mac
        guiFactory = new CriarMacGUI();
        Botao macButton = guiFactory.criarBotao();
        Janela macWindow = guiFactory.criarJanela();

        macButton.click();
        macWindow.render();
    }
}
