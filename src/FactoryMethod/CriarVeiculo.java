package FactoryMethod;

abstract class CriarVeiculo {
	
    public abstract Veiculo criarVeiculo();

    public void combinar() {
        System.out.println("Combinando as peças do veiculo.");
    }
}
