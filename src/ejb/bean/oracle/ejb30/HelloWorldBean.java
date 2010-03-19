package oracle.ejb30;

import javax.ejb.Stateless;

@Stateless
public class HelloWorldBean implements HelloWorld {
       public void sayHello(String name) {
        System.out.println("Hello " + name
                + " from your first EJB 3.0 component ...");
    }
}