package java8example.taptolexample;

public class Author {
    private String name;
    private int countOfBooks;

    public Author(String name, int countOfBooks) {
        this.name = name;
        this.countOfBooks = countOfBooks;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", countOfBooks=" + countOfBooks +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfBooks() {
        return countOfBooks;
    }

    public void setCountOfBooks(int countOfBooks) {
        this.countOfBooks = countOfBooks;
    }
}
