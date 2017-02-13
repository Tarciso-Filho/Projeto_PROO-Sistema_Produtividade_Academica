
package gestãodeproduçãoacademica;

public enum Função
{
    ALUNOGRADUAÇÃO (0), ALUNOPOSGRADUAÇÃO (1), ALUNOMESTRADO(2), PROFESSOR(4), PESQUISADOR(3);
    public int valorFuncao;
    Função(int valor)
    {
        valorFuncao = valor;
    }
    
    
    
}
