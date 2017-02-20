package gestãodeproduçãoacademica;
import java.util.ArrayList;

public class Professor extends Colaborador
{
    
    private ArrayList<ProduçãoAcademica> artigos;

    public Professor( String novoNome, String novoEmail )
    {
        super(novoNome,novoEmail,Função.PROFESSOR);
        super.inicializarHistorico();
        artigos = new ArrayList<>();
        //super.inicializarArtigos();Não preciso desse artigos???
        
    }
    
    public String toString(int id)
    {
        int i;
        String info = "Professor #";
        info += Integer.toString(id + 1) + "\n" + this.getTipoColaborador().name();
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
        String info = "Professor #";
        info += Integer.toString(id + 1) + "\n" + this.getTipoColaborador().name();
        info += "\nNome: " + this.nome + "\nE-Mail: "+ this.email +"\n";
        return info;
    }

    public ArrayList<ProduçãoAcademica> getArtigosP()
    {
        return artigos;
    }

    public void addArtigos( ProduçãoAcademica artigo)
    {
        this.artigos.add(artigo);
    }
    
}
