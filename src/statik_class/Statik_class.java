/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statik_class;

/**
 *
 * @author melek
 */
public class Statik_class {

    //statik classlar utility denilen araçları yazarken kullanılır
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProductManager manager=new ProductManager();
        Product product=new Product();
        product.prices=10;
        product.name="mouse";
        manager.add(product);
        
    }
    
}
