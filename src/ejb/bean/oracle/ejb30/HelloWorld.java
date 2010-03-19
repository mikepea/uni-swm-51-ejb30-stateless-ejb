package oracle.ejb30;

import javax.ejb.Remote;
@Remote
public interface HelloWorld {
    public void sayHello(String name);
}