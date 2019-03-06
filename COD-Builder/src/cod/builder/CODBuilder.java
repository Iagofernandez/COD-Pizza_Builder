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
public class CODBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //crear un nuevo objeto de tipo Pizza Hawaiana
           
Pizza pizzaBuilder = new PizzaBuilder(100, 100)
                .setTipoAceite("Virgen")
                .setGrSal(50)
                .createPizza(); 
        
         
    }
    
}
