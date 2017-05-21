/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingresso;

/**
 *
 * @author email
 */
public class CamaroteSuperior extends VIP {
    private double adicionalcs;
    private int localizacao;

    public double getAdicionalcs() {
        return adicionalcs;
    }

    public void setAdicionalcs(double adicionalcs) {
        this.adicionalcs = adicionalcs;
    }

    public int getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }
    
    public double ImprimeValorCS(){
        return this.preco+this.adicional+this.adicionalcs;
    }
    
    public String Imprimetipo(){
        return ("Camarote Superior");
    }
    
}
