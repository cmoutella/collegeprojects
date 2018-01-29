/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Carolina
 */
public class Teste {
    
    public static void main(String[] args) {
        
        int numconta;
        String titular;
        int cpf;
        String profissao;
        double saldo;
        int dia;
        int mes;
        int ano;
        
        Conta c1 = new Conta("Dulce", 1234567890, "Professora", 3000, 1, 2, 2018);
        Conta c2 = new Conta("Alberto Cegonha", 1342567890, "Designer", 5000, 7, 3, 2018);
        
        c1.confrendim();
        
        c1.sacar(50000);
        
        c1.sacar(3500);
        System.out.println(c1.getSaldo());
        c1.confrendim();
        
        c1.sacar(100);
        System.out.println(c1.getSaldo());
        
        c1.depositar(379);
        System.out.println(c1.getSaldo());
        
        Conta.getTotalContas();
        
        c1.impressaodedados();
        c2.impressaodedados();
    }
}
