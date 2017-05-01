
import org.json.simple.JSONObject;

public class App {
    public static void main(String[] args)
    
    {
        JSONObject ob=new JSONObject();
        ob.put("1", "HELLO");
        ob.put("2", "JAVA");
        ob.put("3", 324);
        ob.put("4", "WORLD");
        ob.put("5", "HEHE");
        
        JSONObject ob1=new JSONObject();
        ob1.put("EDUCATION","MCA");
        ob.put("56",ob1);
        System.out.println(ob);
    }
    
}
