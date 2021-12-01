
public class CadastroDeLivros {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.nome  = "Paulo Silveira";
		autor.email = "paulo.silveira@caelum.com.br";
		autor.cpf   = "123.456.789-10";
				
		Livro livro           =  new Livro();
		livro.nome            =  "Java 8 Prático";
		livro.descricao       =  "Novos recursos da liguagem ";
		livro.valor           =  59.90;
		livro.isbn            =  "978-85-66250-46-6";
		System.out.println("*****************************************");
		livro.autor = autor;
		
		livro.aplicarDescontoDe(0.1);
		livro.mostrarDetalhes();
		livro.autor.mostrarDetalhes();
		System.out.println("*****************************************");

		
		Autor outroAutor = new Autor();
		outroAutor.nome  = "Paulo Silveira";
		outroAutor.email  = "paulo.silveira@caelum.com.br";
		outroAutor.cpf  = "123.456.789-10";
		
		Livro outroLivro      =  new Livro();
		outroLivro.nome       =  "Lógica de Programação ";
		outroLivro.descricao  =  "Crie seus primeiros programas";
		outroLivro.valor      =  49.90;
		outroLivro.isbn       =  "Lógica de Programação ";
		
		livro.autor = outroAutor;
		outroLivro.mostrarDetalhes();
		livro.autor.mostrarDetalhes();
		System.out.println("*****************************************");
		
		Autor terceiroAutor = new Autor();
		livro.autor = terceiroAutor; 
		Livro terceiroLivro       = new Livro();
		terceiroLivro.nome        = "Orientação Objeto";
		terceiroLivro.descricao   = "Novo paradigma";
		terceiroLivro.valor       =  58.33;
		
		livro.autor = terceiroAutor;
		terceiroLivro.mostrarDetalhes();
		livro.autor.mostrarDetalhes();

	}

}
