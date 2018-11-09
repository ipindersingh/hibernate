package hybernateproj.projhyb;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration config= new Configuration();
        config.configure("config/hibernate.cfg.xml");
        
        SessionFactory sf= config.buildSessionFactory();
        Session s=sf.openSession();
        
//        studetails emp= new studetails();
//        emp.setStuId(102);
//        emp.setStuName("Rajan");
//        emp.setCity("Asr");
//        emp.setFee(10000);
        
        Transaction tr = s.beginTransaction();
       // s.save(emp);
        
        //Deleting a row.
//        studetails emp= (studetails)s.get(studetails.class,101);
//        s.delete(emp);
        
        studetails emp = (studetails)s.get(studetails.class, 102);
        emp.setCity("Amritsar");
        
        tr.commit();
        
        s.close();
        sf.close();
        
        System.out.println("Data Saved.");
    }
}
