public class greatestNumber {

	public static void main(String[] args) {
		int a,b,c;
		Scanner a=new Scanner(System.in);
		Scanner b=new Scanner(System.in);
		Scanner c=new Scanner(System.in);
		if((a>b) && (a>c))
		{
			System.out.println("a is greatest");
		}
		else if((b>a) && (b>c))
		{
			System.out.println("b is greatest");
		}
		else
		{
			System.out.println("c is greatest");
		}
	}

}
