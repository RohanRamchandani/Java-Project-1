public class Reference extends Book {
    
    public Reference(String title, String author) { 
        super(title, author); 
    }

    @Override
    public String toString() { 
        return super.toString() + " [Reference Book]"; 
    }

    @Override 
    public void borrowBook() { 
        System.out.println("Cannot borrow a reference book: " + getTitle()); 
    }

    @Override
    public void returnBook() { 
        System.out.println("Reference book cannot be borrowed or returned: " + getTitle()); 
    }
}
