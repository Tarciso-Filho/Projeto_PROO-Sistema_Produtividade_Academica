package gestãodeproduçãoacademica;
import java.util.ArrayList;

public class Colaborador
{
    protected String nome, email;
    protected Função tipoColaborador;
    protected ArrayList<Projeto> historico;
    protected ArrayList<Publicação> artigos;
    
    
    public Colaborador( String novoNome, String novoEmail, Função novoTipoColaborador )
    {
        this.nome = novoNome;
        this.email = novoEmail;
        this.tipoColaborador = novoTipoColaborador;
    }
    
    public void inicializarHistorico()
    {
        this.historico = new ArrayList<Projeto>();
    }
    
    public void inicializarArtigos()
    {
        this.artigos = new ArrayList<>();
    }

    /**
     * @return the nome
     */
    public String getNome() 
    {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the historico
     */
    public ArrayList<Projeto> getHistorico() {
        return historico;
    }

    
    public void addHistorico(Projeto novo)
    {
        this.historico.add(novo);
    }

    /**
     * @return the artigos
     */
    public ArrayList<Publicação> getArtigos()
    {
        return artigos;
    }

    
    public void addArtigos(Publicação novoArtigo)
    {
        this.artigos.add(novoArtigo);
    }
    
    @Override
    public String toString()
    {
        String info = this.tipoColaborador.name();
        info += "\nNome: " + this.nome + "\nE-Mail: "+ this.email +"\n";
        return info;
    }
}