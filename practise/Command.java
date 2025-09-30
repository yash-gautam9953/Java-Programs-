class Command{
	public static void main(String[] yash){
		if(yash.length == 0){
			System.out.println("No Arguments passed");
		}else{
			for(int i=0;i<yash.length;i++){
				System.out.println("The Argumrnt are : "+ yash[i]);
			}
		}
	}
}