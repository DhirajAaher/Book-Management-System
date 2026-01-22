package BookManagementSystem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class BookServiceImpl implements BookService{
	ArrayList<Book> list =new ArrayList();
	int count=0;
	Scanner sc=new Scanner(System.in);
	@Override
	public void addBook(Book book) {
        list.add(book);
        System.out.println("Book added successfully!");
        count++;
        System.out.println(list);
	}

	@Override
	public void viewAllBooks() {
		if(list.isEmpty())
		{
			System.out.println("No Books Available");
		}
		else
		{
			for(Book b:list)
			{
				b.displayBooks();
			}
		}
		
	}

	@Override
	public void searchBook(int id) {
		for (Book b : list) {
	        if (b.getBookId() == id) {
	        	System.out.println("Book is find.");
	            System.out.println(b);
	            return;
	        }
	    }
	    System.out.println("Book not found");
	
	}

	@Override
	public void deleteBook(int deleteId) {
	    Iterator<Book> it = list.iterator();
	    boolean found = false;

	    while (it.hasNext()) {
	        Book b = it.next();
	        if (b.getBookId() == deleteId) {
	            it.remove();
	            found = true;
	            break;
	        }
	    }
	    if (found) {
	        System.out.println("Book deleted successfully.");
	    } else {
	        System.out.println("Book not found.");
	    }
	}
	@Override
	public int countBook() {
		System.out.println("count is: "+count);
		return count;
	}

	@Override
	public void updateBook(int updateId) {
		for (Book b : list) {
	        if (b.getBookId() == updateId) {
	        	System.out.println("Book is find.");
	        	System.out.println("Enter bookName,author,price to update.");
	        	String bname=sc.next();
	        	String bauthor=sc.next();
	        	int bprice=sc.nextInt();
	        	b.setBookId(updateId);
	        	b.setBookName(bname);
	        	b.setAuthor(bauthor);
	        	b.setPrice(bprice);
	            System.out.println(b);
	            return;
	        }
	    }
	    System.out.println("Book not found");
				
	}
	

}
