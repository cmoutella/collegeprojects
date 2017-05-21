/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.conta;

/**
 *
 * @author email
 */
public class ContaCorrente extends Conta{
    //public ContaCorrente(double numconta, double saldo, double valor){
    //    this.setNumconta(numconta);
      //  this.setSaldo(saldo);
        //this.setValor(valor);
    //}
    
    public double depositar(){
        double novosaldo = this.getSaldo()+this.getValor()-0.10;
        this.setSaldo(novosaldo);
        return novosaldo;
    }
    
    String atualiza(){
        double taxacc = super.getTaxa() * 2;
        double atusaldo = this.getSaldo()+this.getSaldo()*taxacc;
        return "Conta: "+String.format("%.0f", this.getNumconta())+"     Saldo: R$"+String.format("%.2f", atusaldo);
    }
}
