
package sf.dao;

import sf.dto.SignUp;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class MainLogicDao 
{
    
//    public boolean checkLogin(SignIn obj)
//    {
//                SessionFactory sf=new Configuration().configure().buildSessionFactory();
//        Session session=sf.openSession();
//        Transaction tx=session.beginTransaction();
//        Criteria crit=session.createCriteria(SignIn.class);
//        crit.add(Restrictions.and(Restrictions.eq("userId", obj.getUserId()),Restrictions.eq("pass", obj.getPass())));
//        List<SignIn> list=crit.list();
//        if(list.isEmpty())
//            return  false;
//        else
//            return true;
//    }
    public void insertRecord(SignUp obj) throws HibernateException
    {
        
    SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(obj);
        tx.commit();
        session.close();
              
    }

}
