public class Main {
    public static void main(String[] args) {
        method( "iPhone", "iPad", "AppleWatch");
    }
    static void method(String ... abc){
        for (String a : abc){
            System.out.println(a + " I love ya");
        }
    }
}
