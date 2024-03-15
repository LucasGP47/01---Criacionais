package FactoryMethod;

public class FabricaPrincipal {

	public static void main(String[] args) {
        CriarCarro carFactory = new CriarCarro();

        Veiculo car = carFactory.criarVeiculo();

        System.out.println("Detalhes Carro:");
        car.start();
        car.accelerate();
        car.stop();
        System.out.println();

        CriarBicicleta bicycleFactory = new CriarBicicleta();

        Veiculo bicycle = bicycleFactory.criarVeiculo();

        System.out.println("Detalhes Bicicleta:");
        bicycle.start();
        bicycle.accelerate();
        bicycle.stop();

	}

}
