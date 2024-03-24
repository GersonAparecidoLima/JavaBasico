package banco.modelo;

public class Cliente {
	
	       public String nome;
	 	   public String cidade;
	 	   public String estado;
	 	 
	 	   public String listarDados() {
	 	      return 	"NOME: " + nome + "\n" +
	 	    		  	"CIDADE: " + cidade + "\n" +
	 	    		  	"ESTADO: " + estado;
	 	   }
}
