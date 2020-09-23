import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Method mt = new Method();
        do {
            System.out.println("1.-----Add.");
            System.out.println("2.-----Search.");
            System.out.println("3.-----Show.");
            System.out.println("4.-----Update.");
            System.out.println("5.-----Delete.");
            Scanner sc = new Scanner(System.in);
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    bookList.add(mt.add(bookList));
                    break;
                case 2:
                    mt.search(bookList);
                    break;
                case 3:
                    mt.show(bookList);
                    break;
                case 4:
                    System.out.println("Nhập id muốn sửa: ");
                    int idSearch = Integer.parseInt(sc.nextLine());
                    mt.update(bookList, idSearch);
                    System.out.println("!!Update Complete!!");
                    break;
                case 5:
                    System.out.println("Nhập id muốn xóa: ");
                    int idDelete = Integer.parseInt(sc.nextLine());
                    mt.delete(bookList,idDelete);
                    System.out.println("!!Delete complete!!");
                    break;
                default:
                    System.out.println("loi");
            }
        } while (true);
    }
}
