package gestãodeproduçãoacademica;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Projeto
{
    private String titulo, agenciaFinanciadora, objetivo, descrição;
    private double valorFinanciado;
    private Calendar dataInicio, dataTermino;
    private ArrayList<Colaborador> participantes;
    private Status estado;
    
    public Projeto( String novoTitulo, String novaAgenciaFinanciadora, 
            String novoObjetivo, String novaDescrição, double novoValorFinanciado, 
            Calendar novoInicio/*, Calendar novoTermino*/ )
    {
        this.titulo = novoTitulo;
        this.agenciaFinanciadora = novaAgenciaFinanciadora;
        this.objetivo = novoObjetivo;
        this.descrição = novaDescrição;
        this.valorFinanciado = novoValorFinanciado;
        this.dataInicio = Calendar.getInstance();
        this.dataInicio = novoInicio;
        this.dataTermino = Calendar.getInstance();
        this.dataTermino.set(3000, 0, 0);
        //this.dataTermino = novoTermino;
        participantes = new ArrayList<Colaborador>();
        estado = Status.EM_ELABORAÇÃO;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getAgenciaFinanciadora()
    {
        return agenciaFinanciadora;
    }

    public void setAgenciaFinanciadora(String agenciaFinanciadora)
    {
        this.agenciaFinanciadora = agenciaFinanciadora;
    }

    public String getObjetivo()
    {
        return objetivo;
    }

    public void setObjetivo(String objetivo)
    {
        this.objetivo = objetivo;
    }

    public String getDescrição()
    {
        return descrição;
    }

    public void setDescrição(String descrição)
    {
        this.descrição = descrição;
    }

    public double getValorFinanciado()
    {
        return valorFinanciado;
    }

    public void setValorFinanciado(double valorFinanciado)
    {
        this.valorFinanciado = valorFinanciado;
    }

    public Calendar getDataInicio()
    {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio)
    {
        this.dataInicio = dataInicio;
    }

    public Calendar getDataTermino()
    {
        return dataTermino;
    }

    public void setDataTermino(Calendar dataTermino)
    {
        this.dataTermino = dataTermino;
    }

    public ArrayList<Colaborador> getParticipantes()
    {
        return participantes;
    }

    public void addParticipantes(Colaborador participante)
    {
        this.participantes.add(participante);
    }
    
    public String toString( int id )
    {
        int i;
        String info = "Projeto #";
        DateFormat converter = DateFormat.getDateInstance(DateFormat.FULL);
        info += Integer.toString(id) + "\nTitulo: " + this.titulo + 
                "\nData de Inicio: " + converter.format(this.dataInicio.getTime()) 
                + "\nEstado: ";
        if(this.estado == Status.CONCLUIDO)
        {
            info += this.estado.name() + "\nData de Termino: " 
                    + converter.format(this.dataTermino.getTime());
        }else
        {
            info += this.estado.name();
        }
        info += "\nAgência Financiadora: " + this.agenciaFinanciadora 
                + "\nValor Financiado: R$ " 
                + Double.toString(this.valorFinanciado) + "\nObjetivo: " 
                + this.objetivo + "\nDescrição: " + this.descrição;
        for( i = 0; i < this.participantes.size(); i++ )
        {
            info += this.participantes.get(i).toStringResumido(i + 1);
        }
        
        return info;
    }
    
    public String toStringResumido( int id )
    {
        String info = "Projeto #";
        DateFormat converter = DateFormat.getDateInstance(DateFormat.FULL);
        info += Integer.toString(id) + "\nTitulo: " + this.titulo + 
                "\nData de Inicio: " + converter.format(this.dataInicio.getTime()) 
                + "\nEstado: ";
        if(this.estado == Status.CONCLUIDO)
        {
            info += this.estado.name() + "\nData de Termino: " + converter.format(this.dataTermino.getTime());
        }else
        {
            info += this.estado.name();
        }
        info += "\nAgência Financiadora: " + this.agenciaFinanciadora 
                + "\nValor Financiado: R$ " 
                + Double.toString(this.valorFinanciado) + "\nObjetivo: " 
                + this.objetivo + "\nDescrição: " + this.descrição;
        
        return info;
    }
    
}
