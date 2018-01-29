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
public class Conta {

    private static int totalcontas;
    private int numconta;
    private double saldo;
    private String dataabert;
    private final double limite=1000;
    Cliente titular = new Cliente();
    Data d = new Data();
    
    Conta(String titular, int cpf, String profissao, double saldo, int dia, int mes, int ano){
        Conta.totalcontas = Conta.totalcontas +1;
        this.numconta = Conta.totalcontas;
        this.saldo = saldo;
        this.titular.setNome(titular);
        this.titular.setCpf(cpf);
        this.titular.setProfissao(profissao);
        this.d.setMes(mes);
        this.d.setDia(dia);
        this.d.setAno(ano);
    }
    
    public static void getTotalContas(){
        System.out.println("Total de Contas: " + Conta.totalcontas);
    }
       
    public void sacar(double quantia){
        if (quantia > this.saldo+this.limite){
            System.out.println("Saldo indisponível para saque");
        }
        else{
            double novosaldo = this.saldo - quantia;
            this.saldo= novosaldo;
            if (this.saldo <0){
                System.out.println("Você está usando seu limite");
            }
        }
    }   
        
    public void depositar (double quantia){
        double novosaldo = this.saldo + quantia;
        this.saldo= novosaldo;
    }
        
    public void confrendim(){
        if(this.saldo <0){
            System.out.println("Não há rendimento");
        }
        else{
            double rendimento = this.saldo * 0.1;
            double novosaldo = this.saldo + rendimento;
            this.saldo = novosaldo;
            System.out.println("Rendimento de R$"+ rendimento);
        }
    }
    
    public void impressaodedados(){
        System.out.println("Conta:" + this.numconta);
        System.out.println(this.titular.getNome());
        System.out.println("Profissao: " + this.titular.getProfissao());
        System.out.println("CPF: " + this.titular.getCpf());
        System.out.println("Abertura da conta: " + this.d.getData());
        System.out.println("Saldo: " + this.saldo);
    }

    public String getDataabert() {
        return dataabert;
    }

    public void setDataabert(String dataabert) {
        this.dataabert = dataabert;
    }

    public double getSaldo() {
        return saldo;
    }
}
