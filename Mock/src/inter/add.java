package inter;

import java.util.*;

public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l=new ArrayList<>();
		
		System.out.println("Enter the number of elements");
		
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		int n=sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			int ele=sc.nextInt();
			sc.nextLine();
			l.add(ele);
			if(ele%2==0) {
				sum+=ele;
			}
		}
		
		
		System.out.println(sum);
	}

}
