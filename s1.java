import java.util.Scanner;
public class stringarr {

	public static void main(String[] args) {
		System.out.println("enter the array size");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String ar1[];
		ar1=new String[n];
		String s1="";
		String s2="";
		String r="";
		int k=0;
		for(int i=0;i<size;i++)
		{
			ar1[i]=s.next();
		}
		s1=arr[0];
		int l;
		for(int i=1;i<ar1.length;i++)
		{
			s2=ar1[i];
			if(s1.length()<s2.length())
			{
				l=s1.length();
			}
			else
			{
				l=s2.length();
			}
			for(int j=1;j<l;j++)
			{
				k=j;
				if(!(s1.charAt(j)==s2.charAt(j)))
						{
					    break;
						}
			}
			result=ar1[i].substring(0,k);
			
		}
		System.out.println("Result : "+r);
	}

}


		

	

	
	 
	
	    