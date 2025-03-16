import java.util.ArrayList; 

public class Library {
    private ArrayList<Book> books; 


    public Library() { 
        books = new ArrayList<>(); 
    }

    public void addBook(Book book) { 
        books.add(book); 
        System.out.println("Book added: " + book.getTitle()); 
    }

    public void displayBooks() { 
        if (books.isEmpty()) { 
            System.out.println("Library is empty"); 
        }
        else { 
            System.out.println("Books in the library: "); 
            for (Book book : books) { 
                System.out.println(book); 
            }
        }
    }

    public void borrowBook(String title) { 
        for (Book book : books) { 
            if (book.getTitle().equalsIgnoreCase(title)) { 
                book.borrowBook(); 
                return; 
            }

        }
        System.out.println("Book not found: " + title); 
    }

    public void returnBook(String title) { 
        for (Book book : books) { 
            if (book.getTitle().equalsIgnoreCase(title)) { 
                book.returnBook(); 
                return; 
            }
        }
        System.out.println("Book not found: " + title); 
    }

    public static Book searchBook(ArrayList<Book> books, String title) { 
        for (Book book : books) { 
            if (book.getTitle().equalsIgnoreCase(title)) { 
                return book; 
            }
        }
        return null; 
    }

    public ArrayList<Book> getBooks() { 
        return books; 
    }
}