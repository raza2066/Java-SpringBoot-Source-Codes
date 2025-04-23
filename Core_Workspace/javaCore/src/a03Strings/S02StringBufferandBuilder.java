package a03Strings;

public class S02StringBufferandBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Nadeem");
        System.out.println(sb.capacity());  // give 16+sb.length()
        System.out.println(sb.length());

        sb.append("  Raza");
        System.out.println(sb);
        sb.deleteCharAt(6);
        System.out.println(sb);


        //string buffer and builder are similar
        //string buffer is thread safe while string builder is not
    }
}
