package gestãodeproduçãoacademica;
import java.util.ArrayList;

public class ProduçãoAcademica
{
    private String titulo;
    private ArrayList<Colaborador> autores;
    private Projeto associado;
    
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
    
    
}