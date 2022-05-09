import java.util.ArrayList;
import java.util.Collections;

public class Sortt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("Geeks for Geeks");
al.add("friends");
al.add("dear");
al.add("is" );
al.add("superb");
Collections.sort(al);
System.out.println("listafter the use of" + " Collection.sort() : \n" + al);
	}

}
