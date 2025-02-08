package Book;

class Book{
    // Properties of a book
    String title;
    String author;
    int pages;
    boolean availability;

    //Initializing the properties of a book
    
    public Book(String title, String author, int pages,boolean availability){
        this.title=title;
        this.author=author;
        this.pages=pages;
        this.availability=availability;
    }

    // Displaying a details of a book
    
    public static void main(String[] args) {
        Book b=new Book("Java","James Gosling",500,true);
        System.out.println("Title: "+b.title);
        System.out.println("Author: "+b.author);
        System.out.println("Pages: "+b.pages);
        System.out.println("Availability: "+b.availability);
    }
}