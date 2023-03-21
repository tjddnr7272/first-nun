package ezen.yorizori.domain.cookbook.dto;

public class Cookbook {
    private String bookname;
    private String explanation;
    private String authorId; // 새로 추가된 필드

    public Cookbook() {}

    public Cookbook(String bookname, String explanation, String authorId) { // 생성자 변경
        super();
        this.bookname = bookname;
        this.explanation = explanation;
        this.authorId = authorId; // 새로 추가된 줄
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    // authorId에 대한 getter와 setter 추가
    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "Cookbook [bookname=" + bookname + ", explanation=" + explanation + ", authorId=" + authorId + "]";
    }
}
