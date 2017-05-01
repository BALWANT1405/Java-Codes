
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

public class json_array
{
    public static void main(String[] args)
    {
        try
        {
        JSONParser parser = new JSONParser();
        
        JSONObject ob=new JSONObject();
        JSONObject ob1=new JSONObject();
        JSONArray ob2=new JSONArray();
        ob.put("NAME","BALWANT");
        ob.put("AGE",23);
        ob.put("LOCATION","NEWYORK");
        
        ob1.put("10","2001");
        ob1.put("BCA","2010");
        ob1.put("MCA","2011");
        ob1.put("PHD","2014");
        
        ob2.add(ob1);
        ob.put("EDUCATION",ob2);
       
        String s1=""+ob;
        JSONValue jv=new JSONValue();
        JSONObject o=(JSONObject) jv.parse(s1);
        System.out.println(o.get("NAME"));
        System.out.println(o.get("AGE"));
        System.out.println(o.get("LOCATION"));
        System.out.println(o.get("EDUCATION"));
                                                           
        
        System.out.println(ob);
        
    }
    catch(Exception e)
    {
        System.out.println(e);
        
    }
    
}

}