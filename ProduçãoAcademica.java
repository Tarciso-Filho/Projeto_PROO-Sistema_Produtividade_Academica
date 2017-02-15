package gestãodeproduçãoacademica;
import java.util.ArrayList;

public class ProduçãoAcademica
{
    protected String titulo;
    protected ArrayList<Colaborador> autores;
    protected Projeto associado;
    
    public ProduçãoAcademica(String novoTitulo, Projeto novoAssociado)
    {
        this.titulo = novoTitulo;
        this.associado = novoAssociado;
    }
    
    public void inicializarAutores()
    {
        this.autores = new ArrayList<Colaborador>();
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public ArrayList<Colaborador> getAutores()
    {
        return autores;
    }

    public void addAutores(Colaborador autor)
    {
        this.autores.add(autor);
    }

    public Projeto getAssociado() {
        return associado;
    }

    public void setAssociado(Projeto associado) {
        this.associado = associado;
    }
    
    public String toString( int id )
    {
        int i;
        String info = "Produção Academica #" + Integer.toString(id + 1) 
                + "\nTitulo: " + this.titulo + "\n" 
                + this.associado.toStringResumido(0);
        for( i = 0; i < this.autores.size(); i++ )
        {
            info += this.autores.get(i).toStringResumido(i + 1);
        }
        return info;
    }
    
    public String toStringResumido( int id )
    {
        String info = "Produção Academica #" + Integer.toString(id + 1) 
                + "\nTitulo: " + this.titulo + "\n" + this.associado.toStringResumido(0);
        return info;
    }
}