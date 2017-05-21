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
public class Relatorio {
    public static void main(String[] args) {

    GeradorDeRelatorio Gr=new GeradorDeRelatorio();
        ContaCorrente cc=new ContaCorrente();
        cc.setTaxa(0.005);
        cc.setNumconta(2311);
        cc.setSaldo(2001);
        cc.setValor(934);
        cc.depositar();
        System.out.println(Gr.adiciona(cc));
        
        ContaCorrente contcor=new ContaCorrente();
        contcor.setTaxa(0.005);
        contcor.setNumconta(713);
        contcor.setSaldo(482);
        contcor.setValor(472);
        contcor.sacar();
        System.out.println(Gr.adiciona(contcor));
        
        ContaPoupanca contpou=new ContaPoupanca();
        contpou.setTaxa(0.005);
        contpou.setNumconta(5972);
        contpou.setSaldo(31);
        contpou.setValor(07);
        contpou.sacar();
        System.out.println(Gr.adiciona(contpou));
        
        ContaPoupanca cp=new ContaPoupanca();
        cp.setTaxa(0.005);
        cp.setNumconta(7990);
        cp.setSaldo(160);
        cp.setValor(170);
        cp.depositar();
        System.out.println(Gr.adiciona(cp));
    }
    
}
