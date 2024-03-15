package FactoryMethod;

public class CriarCarro extends CriarVeiculo {
    @Override
    public Veiculo criarVeiculo() {
        return new Carrro();
    }
}
