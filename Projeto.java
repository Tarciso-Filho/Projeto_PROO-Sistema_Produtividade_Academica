package gestãodeproduçãoacademica;

import java.util.ArrayList;
import java.util.Calendar;

public class Projeto
{
    private String titulo, agenciaFinanciadora, objetivo, descrição;
    private double valorFinanciado;
    private Calendar dataInicio, dataTermino;
    private ArrayList<Colaborador> participantes;
    
    public Projeto( String novoTitulo, String novaAgenciaFinanciadora, 
            String novoObjetivo, String novaDescrição, double novoValorFinanciado, 
            Calendar novoInicio, Calendar novoTermino )
    {
        this.titulo = novoTitulo;
        this.agenciaFinanciadora = novaAgenciaFinanciadora;
        this.objetivo = novoObjetivo;
        this.descrição = novaDescrição;
        this.valorFinanciado = novoValorFinanciado;
        this.dataInicio = novoInicio;
        this.dataTermino = novoTermino;
        participantes = new ArrayList<Colaborador>();
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
    
    
}
