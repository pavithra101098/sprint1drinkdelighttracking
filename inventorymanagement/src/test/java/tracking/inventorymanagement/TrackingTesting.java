package tracking.inventorymanagement;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.sprint1.dao.DisplayDetailsDaoImpl;
import com.sprint1.model.ProductDetails;
import com.sprint1.model.RawMaterialDetails;
import com.sprint1.util.RawMaterialOrderNotFoundException;
import junit.framework.TestCase;
public class TrackingTesting extends TestCase {
	ProductDetails pd =new ProductDetails();
	
	DisplayDetailsDaoImpl td = new DisplayDetailsDaoImpl();
	Map<String,ProductDetails> product =new HashMap<String, ProductDetails>();

public void test1() {
	pd=new ProductDetails ("1","ThumsUp",102.4,123.89,121.0,146.0,"5896",new Date(),new Date(2020, 10, 20),new Date(2020, 9, 20),new Date(2020, 8, 20),"23");//8
	System.out.println(pd.getOrderId());
	assertEquals(pd.getOrderId(),"1");
}
public void test2() {
	pd=new ProductDetails ("1","ThumsUp",102.4,123.89,121.0,146.0,"4501",new Date(),new Date(2020, 10, 20),new Date(2020, 9, 20),new Date(2020, 8, 20),"1490");//8
	System.out.println(pd.getOrderId());
	assertEquals(pd.getOrderId(),"1");
}
public void test3() {
	pd=new ProductDetails ("2","Sprite",102.4,123.89,121.0,146.0,"2485",new Date(),new Date(2020, 10, 20),new Date(2020, 9, 20),new Date(2020, 8, 20),"8990");//8
	System.out.println(pd.getOrderId());
	assertEquals(pd.getOrderId(),"2");
}
public void test4() {
	pd=new ProductDetails ("3","coke",654.4,3893.89,121.0,146.0,"7895",new Date(),new Date(2020, 10, 20),new Date(2020, 9, 20),new Date(2020, 8, 20),"6790");//8
	System.out.println(pd.getOrderId());
	assertEquals(pd.getOrderId(),"3");
}
}