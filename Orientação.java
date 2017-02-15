package gestãodeproduçãoacademica;

import java.util.ArrayList;

public class Orientação extends ProduçãoAcademica
{
    private ArrayList<Professor> autores;
    
    public Orientação(String novoTitulo, Projeto novoAssociado)
    {
        super(novoTitulo, novoAssociado);
        this.autores = new ArrayList<Professor>();
    }
    
    public ArrayList<Professor> getAutoresO()
    {
        return autores;
    }

    public void addAutores(Professor autor)
    {
        this.autores.add(autor);
    }
    
    public String toString( int id )
    {
        int i;
        String info = "Orientação #" + Integer.toString(id + 1) 
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
        String info = "Orientação #" + Integer.toString(id + 1) 
                + "\nTitulo: " + this.titulo + "\n" + this.associado.toStringResumido(0);
        return info;
    }
    
}
