import org.hibernate.SessionFactory;

public class Test {
    private static SessionFactory sf;
    static {
      try{
         sf = new Configuration().configure().buildSessionFactory();
      }
      catch (Throwable e) {
         e.printStackTrace();
         throw new ExceptionInInitializerError();
      }
    }

    public SessionFactory getSessionFactory() {
        return sf;
    }
}
