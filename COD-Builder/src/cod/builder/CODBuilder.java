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
         Pizza miPizzaHawaiana= new PizzaBuilder(3,4).setgrPinha(4F).setTipoAceite("Oliva").setGrQueso(9).setTipoQueso("Gouda").crearPizza(); 
        System.out.println(miPizzaHawaiana); 
    }
    
}
