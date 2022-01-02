package twelfth_task;
import java.util.*;

/*
    ʹ�������ӳ���Ŷ��ͼ����Ϣ�������������
  ������Ʒ���ԣ���ţ����ƣ����ۣ������磻ʹ����Ʒ�����Ϊӳ���е�key��
  */
public class BookManger {
    public static void main(String[] args) {
        storeBookInfo("Java", 800.0, "Java������");
        storeBookInfo("Python",740.0, "Python������");
        storeBookInfo("C", 165.0, "C������");

        System.out.println("���\t\t����\t\t����\t\t������");
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
