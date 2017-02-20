package gestãodeproduçãoacademica;
import java.util.ArrayList;

public class Colaborador
{
    protected String nome, email;
    private Função tipoColaborador;
    protected ArrayList<Projeto> historico;
    protected ArrayList<ProduçãoAcademica> artigos;
    
    
    public Colaborador( String novoNome, String novoEmail, Função novoTipoColaborador )
    {
        this.nome = novoNome;
        this.email = novoEmail;
        this.tipoColaborador = novoTipoColaborador;
        this.inicializarArtigos();
        this.inicializarHistorico();
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
     * 
     * 
     */
    public ArrayList<ProduçãoAcademica> getArtigos()
    {
        return artigos;
    }

    
    public void addArtigos(ProduçãoAcademica novoArtigo)
    {
        this.artigos.add(novoArtigo);
    }
    
    
    public String toString(int id)
    {
        int i;
        String info = "Colaborador #";
        info += Integer.toString(id + 1) + "\n" + this.tipoColaborador.name();
        info += "\nNome: " + this.nome + "\nE-Mail: "+ this.email +"\n";
        for( i = 0; i < this.historico.size(); i++ )
        {
            info += this.historico.get(i).toStringResumido(i + 1);
        }
        for( i = 0; i < this.artigos.size(); i++ )
        {
            info += this.artigos.get(i).toStringResumido(i + 1);
        }
        return info;
    }
    
    public String toStringResumido( int id )
    {
        String info = "Colaborador #";
        info += Integer.toString(id + 1) + "\n" + this.tipoColaborador.name();
        info += "\nNome: " + this.nome + "\nE-Mail: "+ this.email +"\n";
        return info;
    }

    public Função getTipoColaborador()
    {
        return tipoColaborador;
    }

    public void setTipoColaborador(Função tipoColaborador)
    {
        this.tipoColaborador = tipoColaborador;
    }
}