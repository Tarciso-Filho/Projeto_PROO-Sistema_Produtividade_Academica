
package gestãodeproduçãoacademica;

public enum Função
{
    ALUNOGRADUAÇÃO (0), ALUNOPOSGADUAÇÃO (1), ALUNOMESTRADO(2), PROFESSOR(3), PESQUISADOR(4);
    public int valorFuncao;
    Função(int valor)
    {
        valorFuncao = valor;
    }
    
}
