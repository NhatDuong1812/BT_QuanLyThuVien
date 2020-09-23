public class Book {
    public int idBook;
    public String nameBook;
    public String field;
    //field : lĩnh vực
    public String ngayXuanBan;
    public int rank;

    public Book(){

    }

    public Book(int idBook, String nameBook, String field, String ngayXuanBan, int rank) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.field = field;
        this.ngayXuanBan = ngayXuanBan;
        this.rank = rank;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getNgayXuanBan() {
        return ngayXuanBan;
    }

    public void  setNgayXuanBan(String ngayXuanBan) {
        this.ngayXuanBan = ngayXuanBan;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Book {" +
                "idBook=" + idBook +
                ", nameBook='" + nameBook + '\'' +
                ", field='" + field + '\'' +
                ", ngayXuanBan='" + ngayXuanBan + '\'' +
                ", rank=" + rank +
                '}';
    }
}
