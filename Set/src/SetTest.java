
import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;
public class SetTest {
	public static void main(String[] args)
	{
//		VecExample();
		IterExample();
	}
	
	public static void VecExample() {
		String[] num = {"one","two","three","four","five","six","seven","eigth","nine","ten"};
		//将数组转成list
		Vector<String> aVector = new Vector<String>(java.util.Arrays.asList(num));
		System.out.println("before:" + aVector);
		Iterator<String>  nums = aVector.iterator(); //转换成vector类型吗
		while(nums.hasNext()) {
			String aString = nums.next();
			System.out.println(aString);
			if(aString.length()>4) nums.remove();
		}
		System.out.println("after Vector:"+ aVector);
	}
	
	public static void IterExample() {
//		Enumeration<String> days;
		Vector<String> daynames = new Vector<String>();
		daynames.add("one");
		daynames.add("two");
//		days = daynames.elements();
		for(String day :daynames)
		{
			System.out.println(day);
		}
//		System.out.println(days);
		System.out.println(daynames);
	}
				
}









