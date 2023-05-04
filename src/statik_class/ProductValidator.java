/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statik_class;

/**
 *
 * @author melek
 */


//utility classların tanımlanmasında kullanılır
//statik operasyonlar class adıyla çağarılabilir.fonksiyonlarına classın bir örneğini oluşturmadan ulaşılabilir
//diğer operasyonlar newlenmeli
//ana class statik olamaz


//validator classı bir ürünü kaydederken yada güncellerken ürünün kurallara uygun olup olmadığını kontrol eder
public class ProductValidator {
    
    static{ //static fonksiyon çalıştırıldığında çalışmasını istediğimiz şeyler static içine yazarız.
        //constructoru newlemek gerektiği için ona yazmayız
        System.out.println("static yapıcı blok çalıştı");
    
    }
    
    public static boolean isValid(Product product){ //bellekte static olarak tanımlanan kullan-bırak araçlar uygulama sonlanmadan bellekten atılmaz
        //ürünün veritabanına kaydedilmesi için fiyatının sıfırdan büyük ve veritabanında isminin olmaması gerek
        if(product.prices>0  &&  !product.name.isEmpty()){
            return true;
        }else{
            
            return false;
            
        }
        
        
    
    }
    
    
}
