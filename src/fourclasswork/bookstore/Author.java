package fourclasswork.bookstore;

public class Author {
    private String name;
    private String country;

    public String getName() {
        return this.name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Author() {

    }
    public Author(String name, String country) {
        this.name = name;
        this.country = country;
    }
}
