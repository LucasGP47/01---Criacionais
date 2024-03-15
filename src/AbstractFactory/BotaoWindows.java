package AbstractFactory;

public class BotaoWindows implements Botao{
    @Override
    public void click() {
        System.out.println("Windows Button clicked");
    }
}
