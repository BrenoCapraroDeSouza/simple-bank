/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.atv1m2.Dominio;

/**
 *
 * @author breno
 */
public class Movimentacoes {
    private String descricao;
    private char tipo;
    private double valor;

    public Movimentacoes(String descricao, char tipo, double valor) 
    {
        this.descricao = descricao;
        this.tipo = tipo;
        this.valor = valor;
    }

    
    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the tipo
     */
    public char getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getMovimentacoes(){
    return  "Movimentacao -> " + descricao + "[" + (tipo == 'C' || tipo == 'c' ? "Credito" : "Debito") + "]" + valor;
}
}
 