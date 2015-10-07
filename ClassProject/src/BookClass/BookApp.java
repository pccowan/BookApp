package BookClass;


public class BookApp {
	public static void main(String[] args){
		
		String author = "Daniel James Brown";
		String bookID = "CH101";
		String title = "The Boys On The Boat";
		String description = "Nine Americans and Their Epic Quest for Gold";
				
		//Book myBook = new Book();
		//myBook.setAuthor("Daniel James Brown");
		//myBook.setBookID("Ch101");
		//myBook.setTitle("The Boys On The Boat");
		//myBook.setDescription("Nine Americans and Their Epic Quest for GOLD");
		//myBook.setPrice(19.99);
		//myBook.setTaxable(true);
		
		Book myBook = new Book(bookID,author,title,description);
		
		System.out.println(myBook.getDisplayText());
		
	}

}
