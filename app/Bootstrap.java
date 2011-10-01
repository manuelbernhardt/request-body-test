import play.*;
import play.jobs.*;
import play.test.*;
 
import models.*;
 
@OnApplicationStart
public class Bootstrap extends Job {
 
    public void doJob() {
        System.out.println("Test this by running:");
        System.out.println("curl -F \"file=@conf/dependencies.yml;type=text/plain\" http://localhost:9000/upload");
    }
 
}
