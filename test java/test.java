class CountNumber{

	int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

	int evenCount , oddCount , zeroCount = 0;

	void count(){
		for(int i=0;i< arr.length;i++){

			switch(getIdentity(arr[i])){

			case "zero" :
				zeroCount++;
				break;

			case "even" :
				evenCount++;
				break;
			

			case "odd" :
				oddCount++;
				break;

			}
		}

		System.out.println("Zero Count : " + zeroCount);
		System.out.println("Even Count : " + evenCount);
		System.out.println("Odd Count : " + oddCount);
	}

	String getIdentity(int num){

		if(num == 0){
			return "zero";
		}else if(num%2 == 0){
			return "even";
		}else{
			return "odd";
		}
	}

}


class test{

	public static void main(String[] yash){

		CountNumber c1 = new CountNumber();
		c1.count();

	}
}