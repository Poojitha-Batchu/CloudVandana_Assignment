import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman number: ");
        String str = sc.next();

        int res = 0;
        int prev = 0;
        for(int i=str.length()-1; i>=0; i--){
            int curr = hm.get(str.charAt(i));

            if(curr < prev){
                res -= curr;
            } else {
                res += curr;
            }
            prev = curr;
        }

        System.out.println("Integer value for given Roman number (" +str+ ") is: " +res);
    }
}
