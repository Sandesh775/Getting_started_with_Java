//Problem 6: Create a Library class with array of Book objects
//•	Add methods: addBook(), searchByAuthor(), getMostExpensive()
//•	Pattern to learn: Manager classes that handle collections

public class Problem6_Basics {
    public static void main(String[] args) {
//        book b1 = new book(1,"Hell and Heaven","Sandesh",450.0);
//        book b2 = new book(2,"Hell and Earth","Sandesh1",550.0);
//        book b3 = new book(3,"Earth and Heaven","Sandesh2",1000.0);
//        book b4 = new book(4,"Hell and Heaven","Sandesh3",990.0);
//        book b5 = new book(5,"Purple Haze 2","Sandesh4",250.0);
//        book [] books_arr = {b1,b2,b3,b4,b5};
        book [] books_arr = new book[10];// passing empty array
        Library libraryshelf = new Library(books_arr);
        book b1 = new book(1,"Hell and Heaven","Sandesh",450.0);
        book b2 = new book(2, "Hell and Earth", "Sandesh1", 550.0);
        book b3 = new book(3, "Earth and Heaven", "Sandesh2", 1000.0);
        book b4 = new book(4, "Mystic River", "Sandesh", 990.0);
        book b5 = new book(5, "Purple Haze", "Sandesh4", 250.0);
        System.out.println("=== ADDING BOOKS TO LIBRARY ===\n");
        libraryshelf.addBook(b1);
        libraryshelf.addBook(b2);
        libraryshelf.addBook(b3);
        libraryshelf.addBook(b4);
        libraryshelf.addBook(b5);
        book findbook = libraryshelf.searchByAuthor("Sandesh");
        System.out.println("Book founded by author name ! Sandesh");
        findbook.displayinfo();
        String mostexpensiveBook = libraryshelf.getMostExpensive();
        System.out.println("Most expensive book in a shelf : "+mostexpensiveBook);
    }
}
class Library{
    book [] books;
    int size;
    Library(book []books){
        this.books = books;
        size = 0;
    }
    public void addBook(book b){
        if(size == books.length){
            System.out.println("Shelf is full try again !");
            return;
        }
        books[size] = b;
        size++;
        System.out.println("Book added successfully !");
    }
    public String getMostExpensive(){// return name of a book
        if(size == 0) return "No books";
        book expensive = books[0];
        for(int i = 1;i<size; i++){
            if(books[i].price > expensive.price){
                expensive = books[i];
            }
        }
        return "Book name : "+expensive.book_name +" with price : "+ expensive.price;
    }
    public book searchByAuthor(String name){
        book b = null;
        for(book bk : books){
            if(bk.author.equals(name)){
                return bk;
            }
        }
        return b;
    }
}
class book{
    int book_id;
    String book_name;
    String author;
    double price;
    book(int book_id, String book_name, String author, double price){
        this.book_id = book_id;
        this.book_name = book_name;
        this.author = author;
        this.price = price;
    }
    public void displayinfo(){
        System.out.println("Book : "+book_name+"\nBook id : "+book_id+"\nAuthor :"+author+"\nPrice : "+price);
    }
}