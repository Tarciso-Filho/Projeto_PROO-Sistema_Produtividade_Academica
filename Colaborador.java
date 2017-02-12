package gestãodeproduçãoacademica;
import java.util.ArrayList;

public class Colaborador
{
    protected String nome, email;
    protected Função tipoColaborador;
    protected ArrayList<Projeto> historico;
    protected ArrayList<ProduçãoAcademica> artigos;
    
    
    public Colaborador( String novoNome, String novoEmail, Função novoTipoColaborador )
    {
        this.nome = novoNome;
        this.email = novoEmail;
        this.tipoColaborador = novoTipoColaborador;
    }
    
    public void incializarHistorico()
    {
        this.historico = new ArrayList<Projeto>();
    }
    
    public void incializarArtigos()
    {
        this.artigos = new ArrayList<ProduçãoAcademica>();
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

    /**
     * @param historico the historico to set
     */
    public void addHistorico(Projeto novo)
    {
        this.historico.add(novo);
    }

    /**
     * @return the artigos
     */
    public ArrayList<ProduçãoAcademica> getArtigos() {
        return artigos;
    }

    /**
     * @param artigos the artigos to set
     */
    public void addArtigos(ProduçãoAcademica novoArtigo)
    {
        this.artigos.add(novoArtigo);
    }
}