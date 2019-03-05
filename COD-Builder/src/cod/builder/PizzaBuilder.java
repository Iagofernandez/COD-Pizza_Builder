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
public class PizzaBuilder {

   
   
     private float grHarina,mlAgua,grSal,mlAceite,grTomate,grQueso,grPinha;
    private String tipoAceite,tipoQueso;

    PizzaBuilder(int i, int i0) {
      
    }
//metodos que devuelven una PizzaBuilder
    //los return this son para introducir los setters
    public PizzaBuilder setGrHarina(float grHarina) {
        this.grHarina = grHarina;
       return this;
    }

    public PizzaBuilder setMlAgua(float mlAgua) {
        this.mlAgua = mlAgua;
        return this;
    }

    public PizzaBuilder setGrSal(float grSal) {
        this.grSal = grSal;
        return this;
    }

    public PizzaBuilder setMlAceite(float mlAceite) {
        this.mlAceite = mlAceite;
        return this;
    }

    public PizzaBuilder setGrTomate(float grTomate) {
        this.grTomate = grTomate;
        return this;
    }

    public PizzaBuilder setGrQueso(float grQueso) {
        this.grQueso = grQueso;
        return this;
    }

    public PizzaBuilder setgrPinha(float grPinha) {
        this.grPinha = grPinha;
        return this;
    }

    public PizzaBuilder setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
        return this;
    }

    public PizzaBuilder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }
    //con este createPizza se crea los objetos de tipo Pizza
    //retorna la Pizza 
    public Pizza crearPizza(){
    return new Pizza(this.grHarina,this.mlAgua,this.grSal,this.mlAceite,this.grTomate,this.grQueso,this.grPinha,this.tipoAceite,this.tipoQueso);
    }

    
    }
    

