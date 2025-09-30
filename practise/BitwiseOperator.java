class BitwiseOperator{

	public static void main(String[] args){
		
		int a = 2; // 0010
		int b= 5; //  0101 

		System.out.println();
		System.out.println("A : " + a + " B :" + b);
		System.out.println("A & B :" + (a&b));
		System.out.println("A || B :" + (a|b));
		System.out.println("A << 2 :" + (a<<2));
		System.out.println("A >> 2:" + (a>>2));
		System.out.println("~ A:" + (~a));
		System.out.println();

		}
	
}