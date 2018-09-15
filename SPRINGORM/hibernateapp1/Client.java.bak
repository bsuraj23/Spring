import org.hibernate.*;
import org.hibernate.cfg.*;
public class Client
{
	public static void main(String[] args)
	{
Configuration conf=new Configuration();
conf.configure("hibernate.cfg.xml");
SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		Product p=new Product();
		p.setProductId(444);
		p.setProductName("BSNL");
		p.setPrice(2000);
		Transaction tx=session.beginTransaction();
		session.delete(p);
		tx.commit();
		session.close();
		System.out.println("object is saved success fully");
		factory.close();
	}
}