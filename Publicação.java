
package gestãodeproduçãoacademica;

public class Publicação extends ProduçãoAcademica
{
    private String conferencia;
    private int ano;
    
    public Publicação(String novoTitulo, Projeto novoAssociado, 
            String novaConferencia, int novoAno)
    {
        super(novoTitulo, novoAssociado);
        super.inicializarAutores();
        this.conferencia = novaConferencia;
        this.ano = novoAno;
    }

    public String getConferencia()
    {
        return conferencia;
    }

    public void setConferencia(String conferencia)
    {
        this.conferencia = conferencia;
    }

    public int getAno()
    {
        return ano;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }
    
    public String toString( int id )
    {
        int i;
        String info = "Produção Academica #" + Integer.toString(id + 1) 
                + "\nTitulo: " + this.titulo + "\nConferência da publicação: " 
                + this.conferencia + "\n Ano da publicação: " + this.ano
                + this.associado.toStringResumido(0);
        for( i = 0; i < this.autores.size(); i++ )
        {
            info += this.autores.get(i).toStringResumido(i + 1);
        }
        return info;
    }
    
    public String toStringResumido( int id )
    {
        String info = "Publicação #" + Integer.toString(id + 1) 
                + "\nTitulo: " + this.titulo + "\nConferência da publicação: " 
                + this.conferencia + "\n Ano da publicação: " + this.ano
                + this.associado.toStringResumido(0);
        return info;
    }
    
}
