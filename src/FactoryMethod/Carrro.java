package FactoryMethod;

public class Carrro implements Veiculo {
    @Override
    public void start() {
        System.out.println("Ligar Carro.");
    }

    @Override
    public void accelerate() {
        System.out.println("Acelerar Carro.");
    }

    @Override
    public void stop() {
        System.out.println("Parar Carro.");
    }
}
