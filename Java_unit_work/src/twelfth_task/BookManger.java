package twelfth_task;
import java.util.*;

/*
    使用链表和映射存放多个图书信息，遍历并输出。
  其中商品属性：编号，名称，单价，出版社；使用商品编号作为映射中的key。
  */
public class BookManger {
    public static void main(String[] args) {
        storeBookInfo("Java", 800.0, "Java出版社");
        storeBookInfo("Python",740.0, "Python出版社");
        storeBookInfo("C", 165.0, "C出版社");

        System.out.println("编号\t\t名称\t\t单价\t\t出版社");
        for (String id : bookInfos.keySet()) {
            printBookInfoById(id);
        }
    }

    private static final Map<String, List<String>> bookInfos = new TreeMap<>();
    private static final int nameIndex = 0, unitPriceIndex = 1, pressIndex = 2;

    private static void storeBookInfo(String name, double unitPrice, String press) {
        storeBookInfo(String.valueOf(bookInfos.size() + 1001), name, unitPrice, press);
    }
    private static void storeBookInfo(String id, String name, double unitPrice, String press) {
        List<String> bookInfo = new ArrayList<>();
        bookInfo.add(name);
        bookInfo.add(String.valueOf(unitPrice));
        bookInfo.add(press);
        bookInfos.put(id, bookInfo);
    }
    private static void printBookInfoById(String id) {
        List<String> bookInfo = bookInfos.get(id);
        System.out.printf("%-8s%-8s%-8s%s\n", id, bookInfo.get(nameIndex), bookInfo.get(unitPriceIndex), bookInfo.get(pressIndex));
    }
}
