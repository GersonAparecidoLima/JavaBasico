package curso_progamacoes;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		  double valor1 = 0;
	      double valor2 = 0;
	      double soma, sub, mult, div, mod;
	 
	      String valorStr;

	      //JOptionPane.showInputDialog() método da classe JOptionPane 
	      //exibe uma caixa diálogo entrada para o usuário.
	      //é usada para usuário insira algum valor.
	      try {
	         valorStr = JOptionPane.showInputDialog(null, "Informe o primeiro número:");
	         //parseDouble utilizado para converter em ponto flutuante (double) 
	         valor1 = Double.parseDouble(valorStr);
	      } catch (NumberFormatException ex) {
	         JOptionPane.showMessageDialog(null, "Número inválido. Considerando 0 para número 1.");
	      }
	 
	      try{
	         valorStr = JOptionPane.showInputDialog(null, "Informe o segundo número:");
	         valor2 = Double.parseDouble(valorStr);
	      } catch (NumberFormatException ex) {
	         JOptionPane.showMessageDialog(null, "Número inválido. Considerando 0 para número 2.");
	      }
	 
	      soma = valor1 + valor2;
	      sub = valor1 - valor2;
	      mult = valor1 * valor2;
	      div = valor1 / valor2;
	      mod = valor1 % valor2;
	      // StringBuilder, basta instanciá-la em um objeto
	      // o método append para que um novo conteúdo seja concatenado à string,
	      
	      StringBuilder resposta = new StringBuilder();
	      resposta.append(valor1 + " + " + valor2 + " = " + soma + "\n");
	      resposta.append(valor1 + " - " + valor2 + " = " + sub + "\n");
	      resposta.append(valor1 + " * " + valor2 + " = " + mult + "\n");
	      resposta.append(valor1 + " / " + valor2 + " = " + div + "\n");
	      resposta.append(valor1 + " Mod " + valor2 + " = " + mod + "\n");
	 
	      JOptionPane.showMessageDialog(null, resposta);
	       
	 	
	}

}
