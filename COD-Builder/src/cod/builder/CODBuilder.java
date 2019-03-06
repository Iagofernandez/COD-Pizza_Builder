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
           Pizza hawaiana = new PizzaBuilderAuto(100, 150).setGrSal(5).setMlAceite(90)
                .setTipoAceite("Virger").setgrPinha(10).createPizza();

        Pizza pizzaMiBuilder = new PizzaBuilder(500, 450)
                .setTipoAceite("Extra")
                .setGrSal(100)
                .crearPizzaManual(); 
        
         
    }
    
}
