package gestãodeproduçãoacademica;
import java.util.ArrayList;

public class Professor extends Colaborador
{
    
    protected ArrayList<ProduçãoAcademica> artigos;

    public Professor( String novoNome, String novoEmail, Função novoTipoColaborador )
    {
        super(novoNome,novoEmail,novoTipoColaborador);
        super.inicializarArtigos();
    }
    
}
