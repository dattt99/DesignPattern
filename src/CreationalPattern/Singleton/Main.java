package CreationalPattern.Singleton;

public class Main {
    public static void main(String[] args) {
        //Singleton đảm bảo chỉ duy nhất một (instance) được tạo ra suốt quá trình chương trình chạy
        TheadSafe eager1 = TheadSafe.getInstance();
        eager1.setName("OK1");

        TheadSafe eager2 = TheadSafe.getInstance();
        eager2.setName("2");
        System.out.println(eager1.getName());
        System.out.println(eager2.getName());
    }
}
