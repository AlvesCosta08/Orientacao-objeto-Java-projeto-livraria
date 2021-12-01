
public class Livro {

	// Atributos ---------	
	String nome;
    String descricao;
    double valor;
    String isbn;
    Autor  autor;
   // -------------------- 
   public Livro(){
	   System.out.println("Novo livro criado !!");
	   System.out.println("--------------------");
   }
    void mostrarDetalhes(){
    	
    	String mensagem ="Mostrando Detalhes do Livro";
    	System.out.println(mensagem);
    	System.out.println("Nome       : "           + nome);
    	System.out.println("Descrição  : "           + descricao);
    	System.out.println("Valor      : "           + valor);
    	System.out.println("ISBN       : "           + isbn);    	
    	if (this.temAutor()) {
			autor.mostrarDetalhes();
		}
    }
   public void aplicarDescontoDe(double porcentagem){
		this.valor -= this.valor * porcentagem;
}
   boolean temAutor(){
	   return this.autor != null;
   }
}
