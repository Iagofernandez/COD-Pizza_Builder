/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod.builder;

/**
 *
 * @author User
 */
public class Pizza {
     //variables del objeto tipo Pizza
    
    private float grHarina;
    private float mlAgua;
    private float grSal;
    private float mlAceite;
    private String tipoAceite;
    private float grTomate;
    private float grQueso;
    private String tipoQueso;
    private float grPinha;

    //metodo con las variables 
   
    public Pizza(float grHarina, float mlAgua, float grSal, float mlAceite, String tipoAceite, float grTomate, float grQueso, String tipoQueso, float grPinha) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
        this.grSal = grSal;
        this.mlAceite = mlAceite;
        this.tipoAceite = tipoAceite;
        this.grTomate = grTomate;
        this.grQueso = grQueso;
        this.tipoQueso = tipoQueso;
        this.grPinha = grPinha;
    }

}




