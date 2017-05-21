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
public abstract class Conta {
    private double numconta;
    private double saldo;
    private double valor;
    private double taxa;
    
    public double getNumconta(){
        return numconta;
    }
    
    public void setNumconta(double numconta){
        this.numconta=numconta;
    }
    
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setValor(double valor){
        this.valor=valor;
    }
    
    public double getValor(){
        return valor;
    }
    
    public double depositar(){
        this.saldo=this.saldo+this.valor;
        return this.saldo;
    }
    
    public double sacar(){
        this.saldo=this.saldo-this.valor;
        return this.saldo;
    }
    
    public void setTaxa(double taxa){
        this.taxa=taxa;
    }
    
    public double getTaxa(){
        return taxa;
    }
    
    String atualiza(){
        this.saldo=this.saldo + this.saldo*taxa;
        return "Conta: "+String.format("%.0f", this.getNumconta())+"     Saldo: R$"+String.format("%.2f", this.saldo);
    }
 
}
