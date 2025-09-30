class Book{

	String title;
	String author;
	int nop;

	Book(){
		title = "";
		author = "";
		nop=0;
	}

	Book(String t,String a,int np){
		title = t;
		author= a;
		nop= np;
	}

	void DisplayBookInfo(){
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("No. of Pages : " + nop);
	}
	
	void updatePage(int pages){
		nop = nop + pages;
		System.out.println(pages + " of Pages updated ....");
		System.out.println();
		System.out.println();
		DisplayBookInfo();
	}


}
class TestBook{

	public static void main(String[] args){

		System.out.println();

		Book b1 = new Book("Think and grow rich","Napolion hill",567);
		b1.DisplayBookInfo();
		System.out.println();
		b1.updatePage(50);
		System.out.println();
		

		System.out.println();

	}
}