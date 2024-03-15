package FactoryMethod;

public class Bicicleta implements Veiculo{
    @Override
    public void start() {
        System.out.println("Começando a pedalar.");
    }

    @Override
    public void accelerate() {
        System.out.println("Acelerar bicicleta.");
    }

    @Override
    public void stop() {
        System.out.println("Parar bicicleta.");
    }
}
