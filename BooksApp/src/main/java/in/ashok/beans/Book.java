package in.ashok.beans;

public class Book {
    private Integer bookId;
    private String bookName;
    private Integer bookPrice;

    public Integer getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public Integer getBookPrice() {
        return bookPrice;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setBookPrice(Integer bookPrice) {
        this.bookPrice = bookPrice;
    }
}
