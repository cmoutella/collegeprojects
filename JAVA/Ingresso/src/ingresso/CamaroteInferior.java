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
public class CamaroteInferior extends VIP{
    private int localizacao;

    public int getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }
    
    public String Imprimetipo(){
        return ("Camarote Inferior");
    }

}
