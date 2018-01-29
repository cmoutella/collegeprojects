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
public class Data {
    
    private int dia;
    private int mes;
    private int ano;
       
    public void setMes(int num){
        if (num > 12 || num < 1){
            System.out.println("Mês inválido");
        }
        this.mes = num;
    }
    
    public void setAno(int num){
        if (num < 1018){
            System.out.println("Ano inválido");
        }
        this.ano = num;
    }
    
    public void setDia(int num){
        if(mes == 2){
            if(num > 28){
                System.out.println("Dia inválido");
            }
        }
        else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if(num > 31){
                System.out.println("Dia inválido");
            }
        }
        else{
            if(num > 30){
                System.out.println("Dia inválido");
            }
        }
        this.dia = num;
    }
    
    public String getData(){
        return (this.dia+"/"+this.mes+"/"+this.ano);
    }
}
