package Employee;

import java.util.ArrayList;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
  
    
public class StoreData {    
public static void main(String[] args) {    
        
      
    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("configuration.xml").build();  
          
   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
  
SessionFactory factory = meta.getSessionFactoryBuilder().build();  
Session session = factory.openSession();  
Transaction t = session.beginTransaction();   
            
    EmployeeModel e1=new EmployeeModel();    
    e1.setId(11);    
    e1.setName("Supriyo");
    e1.setEmail("supriyo@gmail.com");
    e1.setPassword(122);
    e1.setAddress("Delhi");

    session.save(e1); 
    
    EmployeeModel e2=new EmployeeModel(); 
    e2.setId(12);    
    e2.setName("Rishi");
    e2.setEmail("rishi@gmail.com");
    e2.setPassword(111);
    e2.setAddress("Kolkata");
    session.save(e2); 
    
    EmployeeModel e3=new EmployeeModel(); 
    e3.setId(13);    
    e3.setName("Paromita");
    e3.setEmail("paromita@gmail.com");
    e3.setPassword(115);
    e3.setAddress("Mumbai");

        
    session.save(e3);  
    t.commit();  
    System.out.println("successfully saved"); 
    
    ArrayList<EmployeeModel> list=new ArrayList<>();
    
    for(EmployeeModel str:list){
    	System.out.println(str.getId());
    	System.out.println(str.getName());
    }
    factory.close();  
    session.close();    
        
}    
}   