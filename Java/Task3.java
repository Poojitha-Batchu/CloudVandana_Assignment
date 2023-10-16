import java.util.Scanner;

public class Task3 {

    public static boolean pangram(String str){
        str = str.toLowerCase();
        Boolean[] arr = new Boolean[26];
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i) - 'a'] = true;
        }

        for(int i=0; i<26; i++){
            if(arr[i] == null){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input string: ");
        String str = sc.next();

        boolean res = pangram(str);
        System.out.println("Given input is pangram? :" + res);
    }


}
