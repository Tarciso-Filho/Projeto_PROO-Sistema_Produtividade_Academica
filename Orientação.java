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
    
}
