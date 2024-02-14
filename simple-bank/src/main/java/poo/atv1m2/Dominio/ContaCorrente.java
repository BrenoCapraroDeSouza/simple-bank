/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.atv1m2.Dominio;

/**
 *
 * @author breno
 */
public class ContaCorrente {
    private int numero;
    private double limite;
    private double saldo;
    private boolean especial;
    private Movimentacoes MovimentacoesConta[];
    private int contadorMovimentacoesConta;

    public ContaCorrente(int numero, double limite, double saldo, boolean especial) 
    {
        this.numero = numero;
        this.limite = limite;
        this.saldo = saldo;
        this.especial = true;
        this.MovimentacoesConta = new Movimentacoes[40];
        this.contadorMovimentacoesConta = 0;
    }
    
    public ContaCorrente(int numero, double saldo)
    {
        this.numero = numero;
        this.limite = 0;
        this.saldo = saldo;
        this.especial = false;
        this.MovimentacoesConta = new Movimentacoes[40];
        this.contadorMovimentacoesConta = 0;
    }
    
    protected boolean sacarConta(double valorSaque)
    {
        if(0 < valorSaque && valorSaque <= (saldo+limite))
        {
            saldo -= valorSaque;
            return true;
        }
        else return false;
    }
    
    protected boolean depositarConta(double valorDeposito)
    {
        if(valorDeposito > 0)
        {
            saldo += valorDeposito;
            return true;
        }
        else return false;
    }
   
    public boolean transferirValorConta(double valorTransferencia, ContaCorrente contaDestino)
    {
        if(contaDestino == null) return false;
        if(0 > valorTransferencia && valorTransferencia <= (saldo+limite))
        {
            contaDestino.depositarConta(valorTransferencia);
            saldo -= valorTransferencia;
            if(isEspecial() && saldo < 0)
            {
                MovimentacoesConta[contadorMovimentacoesConta++] = new Movimentacoes("Transferir", 'C', valorTransferencia);
            }
            MovimentacoesConta[contadorMovimentacoesConta++] = new Movimentacoes("Transferir", 'D', valorTransferencia);
            return true;
        }
        else return false;
    }
    
    protected

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the especial
     */
    public boolean isEspecial() {
        return especial;
    }
}


