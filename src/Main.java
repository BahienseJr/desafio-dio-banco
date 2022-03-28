
public class Main {

	public static void main(String[] args) {
		Cliente Wilson = new Cliente();
		Wilson.setNome("Wilson");
		
		Conta cc = new ContaCorrente(Wilson);
		ContaPoupanca poupanca = new ContaPoupanca(Wilson);
		
		cc.depositar(1000);
		cc.transferir(236, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
