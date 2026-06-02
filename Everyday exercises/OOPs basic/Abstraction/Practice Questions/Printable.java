/*
* // Build this yourself:

// Interface: Printable
// - void print()
// - String getDocumentType()

// Abstract Class: Document implements Printable
// - String title
// - String author
// - abstract String getContent()
// - void displayInfo() (shows title + author)

// Concrete Classes:
// - PDFDocument extends Document
//   - String filePath
//   - getContent() returns "PDF content from: " + filePath
//   - print() prints "Printing PDF: " + title
//
// - WordDocument extends Document
//   - int pageCount
//   - getContent() returns "Word doc with " + pageCount + " pages"
//   - print() prints "Printing Word: " + title

// In main:
// - Create array: Printable[] docs
// - Add both types
// - Loop and call print() on each
// - Show polymorphism in action*/
public interface Printable {
    void print();
    String getDocumentType();
}
abstract class Document implements Printable{
    String title;
    String author;

    public Document(String author, String title) {
        this.author = author;
        this.title = title;
    }

    abstract String getContent();
    public void displayInfo(){
        System.out.println("Title : "+title+"\t"
        +"Author : "+author);
    }
}
class PDFDocument extends Document{
    String filePath;

    public PDFDocument(String author, String title, String filePath) {
        super(author, title);
        this.filePath = filePath;
    }

    public String getContent(){
        return "PDF content from : "+filePath;
    }

    @Override
    public void print() {
        System.out.println("Printing Word : "+title);
    }

    @Override
    public String getDocumentType() {
        return "PDFDocument";
    }
}
class WordDocument extends Document{
    int pageCount;

    public WordDocument(String author, String title, int pageCount) {
        super(author, title);
        this.pageCount = pageCount;
    }

    @Override
    String getContent() {
        return "Word doc with " + pageCount + " pages";
    }

    @Override
    public void print() {
        System.out.println("Printing Word: " + title);
    }
    //abstract String getDocumentType();, why even declaring here abstract won't allow in this Concrete class ?
    // if i need to do such then i have to make WordDocument class abstract !
    @Override
    public String getDocumentType() {
        return "WordDocument";
    }
}
class DocumentDemo{
    public static void main(String[] args) {
        Printable[] arr = {
                new PDFDocument("Ram Bahadur","Hello World","C:/Desktop/PDFS"),
                new WordDocument("Shyam Bahadur","Hello world2",209)
        };

        for (Printable p : arr){
            p.print();
            System.out.println("Type: " + p.getDocumentType());  // shows polymorphism
            System.out.println();
        }
    }
}