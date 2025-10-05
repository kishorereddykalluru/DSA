import com.dsa.Example;
@FunctionalInterface
interface Addition {
    int add(int a, int b);
}
public class Main {
    public static void main(String[] args) {

        Addition add = (a,b) -> a + b;

        System.out.println(add.add(20,30));

    }
}