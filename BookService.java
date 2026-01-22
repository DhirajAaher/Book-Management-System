package BookManagementSystem;

public interface BookService  {
	
	void addBook(Book book);
	void viewAllBooks();
	void searchBook(int id);
	void deleteBook(int id);
	void updateBook(int id);
	int countBook();
	}

