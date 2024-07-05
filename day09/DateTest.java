package obj;

import java.time.ZoneId;
import java.util.Date;

public class DateTest {
public static void main(String[] args) {
	Date obj1 = new Date();
	System.out.println(obj1);
	ZoneId zone = ZoneId.systemDefault();
}
}
