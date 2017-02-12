
package gestãodeproduçãoacademica;

public class Publicação extends ProduçãoAcademica
{
    private String conferencia;
    private int ano;
    
    public Publicação(String novoTitulo, Projeto novoAssociado, 
            String novaConferencia, int novoAno)
    {
        super(novoTitulo, novoAssociado);
        this.inicializarAutores();
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
    
}
