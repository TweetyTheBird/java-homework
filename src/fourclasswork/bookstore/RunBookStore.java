package fourclasswork.bookstore;

public class RunBookStore {
    public static void main(String[] args) {
        Author tPratchett = new Author();
        Author yHarari = new Author();
        Author aRubin = new Author("Adam Rubin", "USA");
        Book smallGods = new Book("Small Gods", 1992, tPratchett, "Terry Pratchett", "UK");
        Book sapiens = new Book("Sapiens: A Brief History of Humankind", 2014,yHarari, "Yuval Noah Harari", "Israel");
        Book dragonsLoveTacos = new Book();
        dragonsLoveTacos.setAuthor(aRubin);
        dragonsLoveTacos.setTitle("DRAGONS LOVE TACOS");
        dragonsLoveTacos.setYear(2017);

        Book[] booksCollection = {smallGods, sapiens, dragonsLoveTacos};

        for (Book book : booksCollection) {
            book.displayBookInfo();
            System.out.println("");
        }
    }
}
