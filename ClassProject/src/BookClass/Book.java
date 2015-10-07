package BookClass;

public class Book {
	private String bookID;
	private String author;
	private String title;
	private String description;
	private double price;
	private boolean taxable;
	
	public Book()
	{
		bookID = "";
		author = "";
		title = "";
		description = "";
	}
	public Book(String bookID,String author,String title,String description)
	{
		this.bookID = bookID;
		this.author = author;
		this.title = title;
		this.description = description;
	}
	
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isTaxable() {
		return taxable;
	}
	public void setTaxable(boolean taxable) {
		this.taxable = taxable;
	}
	public String getDisplayText()
	{
		return author + "\n" +title + "\n" + description;
	}

	

}
