/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.atv1m2.Dominio;

/**
 *
 * @author breno
 */
public class Banco {
    private int numeroID;
    private  String nome;
    private ContaCorrente contasBanco[];
    private int contadorContasBanco;

    public Banco(int numeroID, String nome) {
        this.numeroID = numeroID;
        this.nome = nome;
        this.contasBanco = new ContaCorrente[40];
        this.contadorContasBanco = 0;
    }
    
    public ContaCorrente getContaCorrente(int numeroConta)
    {
        for(int i=0; i < contadorContasBanco; i++){
            if(numeroConta == contasBanco[i].getNumero())
                   return contasBanco[i];
        }
        return null;
    }
    
    public void criarConta(int numeroConta, double saldo)
    {
        contasBanco[contadorContasBanco++] = new ContaCorrente((contadorContasBanco+1),saldo);
        System.out.print("*Conta criada*\nNumeroConta-> "+contadorContasBanco+1+"\nSaldoInicial-> "+saldo);
    }
    
    
}


