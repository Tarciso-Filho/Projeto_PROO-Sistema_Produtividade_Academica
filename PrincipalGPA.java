package gestãodeproduçãoacademica;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;

public class PrincipalGPA 
{
    public static int lerNovoInteiro( int opcao ) throws InputMismatchException
    {
        Scanner ler = new Scanner(System.in);
        int resultado;
        
        if ( opcao == 1 )
        {
            System.out.println("Digite:");
            System.out.println("01-Para alocar participantes num projeto;");
            System.out.println("02-Para alterar status de um projeto para em andamento;");
            System.out.println("03-Para alterar status de um projeto para concluido;");
            System.out.println("04-Para inserir uma nova publicação;");
            System.out.println("05-Para inserir uma nova orientação;");
            System.out.println("06-Para consultar um colaborador;");
            System.out.println("07-Para consultar um projeto;");
            System.out.println("08-Para imprimir o relatório da produção academica do laboratório;");
            System.out.println("09-Para inserir um novo professor;");
            System.out.println("10-Para inserir um novo aluno ou pesquisador;");
            System.out.println("11-Para inserir um novo projeto;");
            System.out.println("00-Para Sair\n");
        } else if ( opcao == 2 )
        {
            System.out.println("Digite o ANO em que foi publicada:");
        }else if ( opcao == 3 )
        {
            System.out.println("Digite:");
            System.out.println("01-Aluno Graduação;");
            System.out.println("02-Aluno Pós Graduação;");
            System.out.println("03-Aluno Mestrado;");
            System.out.println("04-Pesquisador;");
        }
        
        
        resultado=ler.nextInt();
        ler.nextLine();
        
        return resultado;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Colaborador> listaColaboradores = new ArrayList(100);
        ArrayList<Projeto> listaProjetos = new ArrayList(100);
        ArrayList<ProduçãoAcademica> listaProduções = new ArrayList(100);
        
        Scanner ler = new Scanner(System.in);
        String novoNome, novoEmail, novoTitulo, novaAgencia, novoObjetivo, 
                novaDescrição, lendoString;
        double novoValor;
        Calendar novoComeço, novoFim;
        int opção = 0, novoAno, funcao = 0;
        boolean pronto;
        
        do
        {
            pronto = false;
            while(!pronto)
            {
                try
                {
                    opção = lerNovoInteiro(1);
                    pronto = true;
                }catch(InputMismatchException erro)
                {
                    System.out.println("Por favor, digite apenas números!!!\n");
                }
                
            }
            
            
            switch(opção)
            {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    System.out.println("Digite o nome do Professor:");
                    novoNome = ler.nextLine();
                    System.out.println("Digite o e-mail do Professor:");
                    novoEmail = ler.nextLine();
                    listaColaboradores.add(new Professor (novoNome, novoEmail, Função.PROFESSOR));
                    System.out.println("Colaborador Cadastrado Com suCesso!");
                    break;
                case 10:
                    pronto = false;
                    while(!pronto)
                    {
                        try
                        {
                            funcao = lerNovoInteiro(3);
                            pronto = true;
                        }catch(InputMismatchException erro)
                        {
                            System.out.println("Por favor, digite apenas números!!!\n");
                        }
                    }
                    System.out.println("Digite o nome do Colaborador:");
                    novoNome = ler.nextLine();
                    System.out.println("Digite o e-mail do Colaborador:");
                    novoEmail = ler.nextLine();
                    switch(funcao)
                    {
                        case 1:
                            listaColaboradores.add(new Colaborador (novoNome, 
                                    novoEmail, Função.ALUNOGRADUAÇÃO));
                        break;
                        case 2:
                            listaColaboradores.add(new Colaborador (novoNome, 
                                    novoEmail, Função.ALUNOPOSGRADUAÇÃO));
                        break;
                        case 3:
                            listaColaboradores.add(new Colaborador (novoNome, 
                                    novoEmail, Função.ALUNOMESTRADO));
                        break;
                        case 4:
                            listaColaboradores.add(new Colaborador (novoNome, 
                                    novoEmail, Função.PESQUISADOR));
                        break;
                        
                    }
                    System.out.println("Colaborador Cadastrado Com suCesso!");
                    break;
                case 11:
                    
                    break;
                case 0:
                    System.out.println("O programa foi encerrado com sucesso!"
                            + "\nMuito obrigado pelo uso!!!");
                    break;
                default:
                    System.out.println("Você digitou uma opção incorreta,"
                            + " por favor, digite outra opção!\n");
            }
            
        }while(opção != 0);
        
        //System.out.println("THIS IS WHAT YOU CAME FOR!!!");
    }
    
}
