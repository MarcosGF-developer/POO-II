package package_exe1;

/**
 *
 * @author Computador
 */
public class Livraria {
    String nomeLivraria;
    String endereco;
    Livro[]  livros;//Agregação
  public Livraria(){
  
  }

    public String getNomeLivraria() {
        return nomeLivraria;
    }

    public void setNomeLivraria(String nomeLivraria) {
        this.nomeLivraria = nomeLivraria;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
  
}
