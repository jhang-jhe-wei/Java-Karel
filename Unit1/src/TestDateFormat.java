import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  
  
public class TestDateFormat {  
  
    public static void main(String args[]) {         
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");  
        String aString="2019-5-9";
        Date formatDate;
		try {
			formatDate = dateFormatter.parse(aString);
			System.out.println(dateFormatter.format(formatDate));    
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
    }  
}  
