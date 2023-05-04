/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statik_class;

/**
 *
 * @author melek
 */
public class ProductManager { //ürünü veritabanına ekleyen class
    
    public void add(Product product){
        
        ProductValidator validator=new ProductValidator();
        if(validator.isValid(product)){
            
            System.out.println("eklendi");
        
        }else{
            
            System.out.println("ürün bilgileri geçersiz");
        
        }
        
        
        
        
    }
    
}
