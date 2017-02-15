package gestãodeproduçãoacademica;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.lang.IndexOutOfBoundsException;

public class PrincipalGPA 
{
    public static int lerNovoInteiro( int opcao ) throws InputMismatchException
    {
        Scanner ler = new Scanner(System.in);
        int resultado;
        
        switch (opcao)
        {
            case 1:
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
                break;
            case 2:
                System.out.println("Digite o ANO em que foi publicada:");
                break;
            case 3:
                System.out.println("Digite:");
                System.out.println("01-Aluno Graduação;");
                System.out.println("02-Aluno Pós Graduação;");
                System.out.println("03-Aluno Mestrado;");
                System.out.println("04-Pesquisador;");
                break;
            case 4:
                System.out.println("Digite o ID do colaborador:");
                break;
            case 5:
                System.out.println("Digite o ID do projeto:");
                break;
            case 6:
                System.out.println("Informe o ID do primeiro participante "
                                + "(um Professor): ");
                break;
            default:
                break;
        }
        
        
        resultado=ler.nextInt();
        ler.nextLine();
        
        return resultado;
    }
    
    public static double lerNovoDecimal() throws InputMismatchException
    {
        Scanner ler = new Scanner(System.in);
        double resultado;
        /*else if ( opcao == 2 )
        {
            System.out.println("Digite o ANO em que foi publicada:");
        }*/
        System.out.println("Digite o valor financiado no projeto:");
        
        resultado=ler.nextDouble();
        ler.nextLine();
        
        return resultado;
    }
    
    public static Calendar lerNovaData( int opcao ) throws ParseException //throws InputMismatchException
    {
        Scanner ler = new Scanner(System.in);
        DateFormat converter = DateFormat.getDateInstance();
        Calendar resultado = Calendar.getInstance();
        String lido;
        
        
        if ( opcao == 1 )
        {
            System.out.println("Digite a data de inicio:");
        } else if ( opcao == 2 )
        {
            System.out.println("Digite a data do encerramento:");
        }
        
        lido=ler.nextLine();
        
        resultado.setTime(converter.parse(lido));
        
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
        double novoValor = 0.0;
        Calendar novoComeço = Calendar.getInstance(), novoFim = Calendar.getInstance();
        int opção = 0, novoAno = 0, funcao = 0, id = -1, tamanho = -1;
        boolean pronto, cancelar;
        
        do
        {
            cancelar = false;
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
                    pronto = false;
                    while(!pronto)
                    {
                        try
                        {
                            id = lerNovoInteiro(5);
                            tamanho = listaProjetos.get(id).getParticipantes().size();
                            pronto = true;
                        }catch(InputMismatchException erro1)
                        {
                            System.out.println("Por favor, digite apenas números!!!\n");
                        }catch(IndexOutOfBoundsException erro2)
                        {
                            System.out.println("Esse valor é maior que o "
                                    + "número de projetos\n");
                            pronto = true;
                            break;
                        }
                    }
                    
                    if( tamanho > 0 )
                    {
                        pronto = false;
                        while(!pronto)
                        {
                            try
                            {
                                funcao = lerNovoInteiro(4);
                                pronto = true;
                            }catch(InputMismatchException erro1)
                            {
                                System.out.println("Por favor, digite apenas números!!!\n");
                            }catch(IndexOutOfBoundsException erro2)
                            {
                                System.out.println("Esse valor é maior que o "
                                        + "número de projetos\n");
                                pronto = true;
                                break;
                            }
                        }
                        if(funcao == -1)
                        {
                            listaProjetos.get(id).addParticipantes(
                                listaColaboradores.get(funcao));
                        }else
                        {
                            System.out.println("Esse Colaborador não existe!!!\n");
                        }
                    }else
                    {
                        pronto = false;
                        while(!pronto)
                        {
                            try
                            {
                                funcao = lerNovoInteiro(6);
                                pronto = true;
                            }catch(InputMismatchException erro)
                            {
                                System.out.println("Por favor, digite apenas números!!!\n");
                            }catch(IndexOutOfBoundsException erro2)
                            {
                                System.out.println("Esse valor é maior que o "
                                        + "número de projetos\n");
                                pronto = true;
                                break;
                            }
                        }
                        if(funcao == -1 || listaColaboradores.get(funcao) instanceof Professor)
                        {
                            listaProjetos.get(id).addParticipantes(
                                listaColaboradores.get(funcao));
                        }else
                        {
                            System.out.println("Esse Professor não existe!!!\n");
                        }
                    }
                    System.out.println("Colaborador Cadastrado no projeto Com"
                            + " suCesso\n");
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
                    pronto = false;
                    while(!pronto)
                    {
                        try
                        {
                            id = lerNovoInteiro(4);
                            id--;
                            System.out.println(listaColaboradores.get(id).toString(id));
                            pronto = true;
                        }catch(InputMismatchException erro)
                        {
                            System.out.println("Por favor, digite apenas números!!!\n");
                        }catch(IndexOutOfBoundsException erro2)
                        {
                            System.out.println("Esse valor esta fora da "
                                    + "lista de Colaboradores\n");
                            pronto = true;
                            break;
                        }
                    }
                    System.out.println("Fim de Colaborador\n");
                    break;
                case 7:
                    pronto = false;
                    while(!pronto)
                    {
                        try
                        {
                            id = lerNovoInteiro(5);
                            id--;
                            System.out.println(listaProjetos.get(id).toString(id));
                            pronto = true;
                        }catch(InputMismatchException erro)
                        {
                            System.out.println("Por favor, digite apenas números!!!\n");
                        }catch(IndexOutOfBoundsException erro2)
                        {
                            System.out.println("Esse valor esta fora da "
                                    + "lista de Projetos\n");
                            pronto = true;
                            break;
                        }
                    }
                    System.out.println("Fim de Projeto\n");
                    break;
                case 8:
                    
                    break;
                case 9:
                    System.out.println("Digite o nome do Professor:");
                    novoNome = ler.nextLine();
                    System.out.println("Digite o e-mail do Professor:");
                    novoEmail = ler.nextLine();
                    listaColaboradores.add(new Professor (novoNome, novoEmail));
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
                    System.out.println("Digite o título do Projeto:");
                    novoTitulo = ler.nextLine();
                    pronto = false;
                    while(!pronto)
                    {
                        try
                        {
                            novoComeço = lerNovaData(1);
                            pronto = true;
                        } catch (InputMismatchException | ParseException erro )
                        {
                            System.out.println("Por favor, digite uma data no"
                                    + "seguinte formato!!! (21/10/1995) \n");
                        }
                    }
                    System.out.println("Digite o nome da Agência Financiadora "
                            + "do Colaborador:");
                    novaAgencia = ler.nextLine();
                    pronto = false;
                    while(!pronto)
                    {
                        try
                        {
                            novoValor = lerNovoDecimal();
                            pronto = true;
                        }catch(InputMismatchException erro)
                        {
                            System.out.println("Por favor, digite apenas "
                                    + "números e virgulas!!!\n");
                        }
                    }
                    System.out.println("Digite o objetivo do Projeto:");
                    novoObjetivo = ler.nextLine();
                    System.out.println("Digite a descrição do Projeto:");
                    novaDescrição = ler.nextLine();
                    listaProjetos.add(new Projeto(novoTitulo, novaAgencia, 
                            novoObjetivo, novaDescrição, novoValor,novoComeço));
                    
                    System.out.println("Projeto Publicado Para semPre!");
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
