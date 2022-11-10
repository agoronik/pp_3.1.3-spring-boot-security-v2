package manager.mywebappspringboot.configs;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateHibernateSessionFactory {

    @SuppressWarnings("unused")
    private static SessionFactory sessionFactory;

    public static void main(String[] args) throws Exception {

        sessionFactory = new Configuration().configure().buildSessionFactory();

    }

}