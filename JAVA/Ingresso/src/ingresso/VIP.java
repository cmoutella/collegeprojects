package ingresso;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author email
 */
abstract class VIP extends ingresso.Ingresso{
    protected double adicional;

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    public double ImprimeValorVip(){
        return this.preco + this.adicional;
    }
}
