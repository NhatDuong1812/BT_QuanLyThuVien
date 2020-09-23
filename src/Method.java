import java.util.List;
import java.util.Scanner;

public class Method {
    public Book add(List<Book> bookList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("- ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("- Name: ");
        String name = sc.nextLine();
        System.out.println("- Field: ");
        String field = sc.nextLine();
        System.out.println("- Day publis ");
        //ngay xuat ban
        String ngayXuatBan = sc.nextLine();
        System.out.println("- Rank: ");
        int rank = Integer.parseInt(sc.nextLine());
        Book book = new Book(id, name, field, ngayXuatBan, rank);
        return book;
    }

    public void search(List<Book> bookList) {
        do {
            System.out.println("--Bạn muốn tìm sách theo cách nào ??");
            System.out.println("--- 1. Tìm theo ID sách. ");
            System.out.println("--- 2. Tìm theo xếp hạng sách. ");
            System.out.println("--- 3. Tìm theo tên sách. ");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                System.out.println("Nhap id muon tim: ");
                int idFind = Integer.parseInt(sc.nextLine());
                for (Book b : bookList) {
                    if (idFind == b.idBook) {
                        System.out.println(b.toString());
                    }
                }
            } else if (choice == 2) {
                System.out.println("Nhap rank muon tim: ");
                int rankFind = Integer.parseInt(sc.nextLine());
                for (Book b : bookList) {
                    if (rankFind == b.rank) {
                        System.out.println(b.toString());
                    }
                }
            } else if (choice == 3) {
                System.out.println("Nhap ten muon tim: ");
                String nameFind = sc.nextLine();
                for (Book b : bookList) {
                    if (nameFind.equals(b.nameBook)) {
                        System.out.println(b.toString());
                    }
                }
            } else {
                System.out.println("Loi ko co phuog thuc.");
            }
            break;
        } while (true);

    }

    public void show(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    public Book update(List<Book> bookList, int idUpdate) {
        for (Book b : bookList) {
            if (idUpdate == b.idBook){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter new id: ");
                int newID = Integer.parseInt(sc.nextLine());
                b.setIdBook(newID);
                System.out.println("Enter new name: ");
                String newName = sc.nextLine();
                b.setNameBook(newName);
                System.out.println("Enter new field: ");
                String newField = sc.nextLine();
                b.setField(newField);
                System.out.println("Enter new Ngay Xuat Ban: ");
                String newNXB = sc.nextLine();
                b.setNgayXuanBan(newNXB);
                System.out.println("Enter new rank: ");
                int newRank = Integer.parseInt(sc.nextLine());
                b.setRank(newRank);
                Book book = new Book(newID,newName,newField,newNXB,newRank);
                return book;
            }
        }
        System.out.println("Ko tim thay id tuong ung.");
        return null;
    }

    public void delete(List<Book> bookList, int idDelete){
        for (Book book: bookList) {
            if (idDelete == book.idBook){
                bookList.remove(book);
            }

        }
    }
}