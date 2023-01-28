package first;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(1);
		System.out.println("Before ");
		System.out.println(l);
		
		Set<Integer>s=new HashSet<>();
		
		for(Integer i:l) {
			s.add(i);
		}
		
		List<Integer>l1=new ArrayList();
		for(Integer i:s) {
			l1.add(i);
		}
		
		l=l1;
		System.out.println("After ");
		System.out.println(l);

	}

}
