package FactoryMethod;

public class CriarBicicleta extends CriarVeiculo {
    @Override
    public Veiculo criarVeiculo() {
        return new Bicicleta();
    }
}
