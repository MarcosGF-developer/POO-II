package package_exe1;

/**
 *
 * @author Computador
 */
public class Livro {
   Autor[] autor;// Associação
   Capitulo[] cap;//Composição
   String nome;
   String editora;
   Double ano;

    public Capitulo[] getCap() {
        return cap;
    }

    public void setCap(Capitulo[] cap) {
        this.cap = cap;
    }
    
    public Autor[] getAutor() {
        return autor;
    }

    public void setAutor(Autor[] autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Double getAno() {
        return ano;
    }

    public void setAno(Double ano) {
        this.ano = ano;
    }
   
   public Livro(){
       
   }
   
   
}
