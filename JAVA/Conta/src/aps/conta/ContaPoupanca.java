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
public class ContaPoupanca extends Conta {
    //public ContaPoupanca(double numconta, double saldo, double valor){
      //  this.setNumconta(numconta);
        //this.setSaldo(saldo);
        //this.setValor(valor);
    ///}
    String atualiza(){
        double taxacp = super.getTaxa() * 3;
        double atusaldo = this.getSaldo()+this.getSaldo()*taxacp;
        return "Conta: "+String.format("%.0f", this.getNumconta())+"     Saldo: R$"+String.format("%.2f", atusaldo);
    }
    
}
