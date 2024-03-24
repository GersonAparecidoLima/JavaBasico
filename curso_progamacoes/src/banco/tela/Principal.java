package banco.tela;

import javax.swing.JOptionPane;

import banco.modelo.Cliente;

public class Principal {

	public static void main(String[] args) {
		 Cliente cliente = new Cliente();
		 
	      cliente.nome = "Gerson";
	      cliente.cidade = "Paranoá";
	      cliente.estado = "Distrito Federal";
	 
	      JOptionPane.showMessageDialog(null, cliente.listarDados());

	}

}
