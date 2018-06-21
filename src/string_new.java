import java.util.*;
public class string_new {
    public static void main(String[] args) {
        String g = new String();
        char c;
        System.out.println("String");
        Scanner st= new Scanner(System.in);
        g=st.nextLine();
        c=st.next().charAt(0);

        String[] s= g.split(String.valueOf(c));
        System.out.println(s.length-1);
        System.out.println("hi");



    }
}
