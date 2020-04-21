
public class swapFirstLastChar {
	
	static String count(String str)
	{
		char []arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			int k=i;
			while(i<arr.length && arr[i]!=' ')
				i++;
			
			char temp=arr[k];
			arr[k]=arr[i-1];
			arr[i-1]=temp;
		}
		return new String(arr);
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
	}
	
	public static void main(String args[])
	{
		String str="geeks for geeks";
		//count(str);
		System.out.println(count(str));
	}

}
