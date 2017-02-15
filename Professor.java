package gestãodeproduçãoacademica;
import java.util.ArrayList;

public class Professor extends Colaborador
{
    
    protected ArrayList<ProduçãoAcademica> artigos;

    public Professor( String novoNome, String novoEmail )
    {
        super(novoNome,novoEmail,Função.PROFESSOR);
        //super.inicializarArtigos();Não preciso desse artigos???
    }
    
}
