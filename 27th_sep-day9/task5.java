

class task5{
	public static void main (String[] args){
		String ptr = null;
		int a= 34 ;
		try
		{
			if (ptr.equals(a))
				System.out.print("Same");
			else
				System.out.print("Not Same");
		}
		catch(NullPointerException e)
		{
			System.out.print("Null Pointer Exception");
		}
	}
}

