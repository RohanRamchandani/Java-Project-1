public class Book implements Comparable<Book> {

    // These are the class attributes 
    private String title; 
    private String author; 
    private boolean isBorrowed; 

    // Constructor
    public Book(String title, String author) { 
        this.title = title; 
        this.author = author; 
        this.isBorrowed = false; 
    }

    // Getter method only to get the title 
    public String getTitle() { 
        return title; 
    }

    // Getter method only to get the status of the book if it's borrowed or not in boolean
    public boolean isBorrowed() { 
        return isBorrowed; 
    }

    // Method to borrow the book from the library
    public void borrowBook() { 
        if (!isBorrowed) { 
            isBorrowed = true; 
            System.out.println("You borrowed: " + title); 
        } 
        else { 
            System.out.println("Book is already borrowed. "); 
        }
    }

    // Method to return the book back to the library
    public void returnBook() { 
        if (isBorrowed) { 
            isBorrowed = false; 
            System.out.println("You returned: " + title); 
        }
        else { 
            System.out.println("This book was not returned"); 
        }
    }

    @Override 
    public String toString() { 
        return "\"" + title + "\" by " + author + (isBorrowed ? " [Borrowed]" : " [Available]"); 
    }

    @Override 
    public boolean equals(Object obj) { 
        if (obj instanceof Book) { 
            Book other = (Book) obj; 
            return this.title.equalsIgnoreCase(other.title) && this.author.equalsIgnoreCase(other.author); 
        }
        return false; 
    }

    @Override
    public int compareTo(Book other) { 
        return this.title.compareToIgnoreCase(other.title); 
    }
}

