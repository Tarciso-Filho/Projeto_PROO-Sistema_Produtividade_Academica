package gestãodeproduçãoacademica;
import java.util.Scanner;
import java.util.ArrayList;

public class PrincipalGPA 
{
    public static void main(String[] args)
    {
        ArrayList<Colaborador> listaColaboradores = new ArrayList(100);
        ArrayList<Projeto> listaProjetos = new ArrayList(100);
        ArrayList<ProduçãoAcademica> listaProduções = new ArrayList(100);
        
        Scanner ler = new Scanner(System.in);
        int opção;
        
        do
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
            opção=ler.nextInt();
            ler.nextLine();
            
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
                    
                    break;
                case 10:
                    
                    break;
                case 11:
                    
                    break;
                default:
                    
            }
            
        }while(opção != 0);
        
        //System.out.println("THIS IS WHAT YOU CAME FOR!!!");
    }
    
}
