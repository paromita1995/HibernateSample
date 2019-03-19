package product;

import java.util.ArrayList;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
  
    
public class DataStore {    
public static void main(String[] args) {    
        
      
    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("config.xml").build();  
          
   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
  
SessionFactory factory = meta.getSessionFactoryBuilder().build();  
Session session = factory.openSession();  
Transaction t = session.beginTransaction();   
            
    ProductModel e1=new ProductModel();    
    e1.setId(101);    
    e1.setProductName("Phone"); 
     e1.setDecp("All Phones are android");
     e1.setQuant(20);
     e1.setPrice(2000);
    session.save(e1);
    ProductModel e2=new ProductModel();
    e2.setId(102);    
    e2.setProductName("LED"); 
    e2.setDecp("All LED are 3D");
    e2.setQuant(10);
    e2.setPrice(32000);
     
    
    
   
   

    session.save(e2);      
    t.commit();  
    System.out.println("successfully saved"); 
    
    ArrayList<ProductModel> list=new ArrayList<>();
    
    for(ProductModel str:list){
    	System.out.println(str.getId());
    	System.out.println(str.getProductName());
    	System.out.println(str.getPrice());
    }
    factory.close();  
    session.close();    
        
}    
}   