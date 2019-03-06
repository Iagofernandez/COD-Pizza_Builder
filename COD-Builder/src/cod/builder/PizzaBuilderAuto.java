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
public class PizzaBuilderAuto {

   
   
     private float grHarina,mlAgua,grSal,mlAceite,grTomate,grQueso,grPinha;
    private String tipoAceite,tipoQueso;

    PizzaBuilderAuto(int i, int i0) {
      
    }
//metodos que devuelven una PizzaBuilder
    //los return this son para introducir los setters
    public PizzaBuilderAuto setGrHarina(float grHarina) {
        this.grHarina = grHarina;
       return this;
    }

    public PizzaBuilderAuto setMlAgua(float mlAgua) {
        this.mlAgua = mlAgua;
        return this;
    }

    public PizzaBuilderAuto setGrSal(float grSal) {
        this.grSal = grSal;
        return this;
    }

    public PizzaBuilderAuto setMlAceite(float mlAceite) {
        this.mlAceite = mlAceite;
        return this;
    }

    public PizzaBuilderAuto setGrTomate(float grTomate) {
        this.grTomate = grTomate;
        return this;
    }

    public PizzaBuilderAuto setGrQueso(float grQueso) {
        this.grQueso = grQueso;
        return this;
    }

    public PizzaBuilderAuto setgrPinha(float grPinha) {
        this.grPinha = grPinha;
        return this;
    }

    public PizzaBuilderAuto setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
        return this;
    }

    public PizzaBuilderAuto setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }
    //con este createPizza se crea los objetos de tipo Pizza
    //retorna la Pizza 
    public Pizza createPizza() {
        return new Pizza(grHarina, mlAgua, grSal, mlAceite, tipoAceite, grTomate, grQueso, tipoQueso, grPinha);
    
    }

    
    }
    

