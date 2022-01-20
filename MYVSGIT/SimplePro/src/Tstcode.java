public class Tstcode {
    public int add() {
        return 0;
    }

    public int add(int a) {
        System.out.println("returing 12");
        return 12;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Tstcode t = new Tstcode();
        t.add(10);

    }
}
