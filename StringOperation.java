public class StringOperation {
    public static void main(String[] arg) {
        System.out.println("Hello World".length());
        System.out.println("Hello, [[name]]....bye".replace("[[name]]", "egoing"));
        double a = 1;
        System.out.println(a);
        String c = "Hello";
        System.out.println(c);
        // int b = (int) 1.1; // 1.1을 정수형으로 바꾸는 방법.
        String j = Integer.toString(14);// 정수를 문자열로 바꾸는 방법.
        System.out.println(j + "1654");
        System.out.println(j.getClass());
    }
}
