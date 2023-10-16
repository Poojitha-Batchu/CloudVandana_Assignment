import java.util.*;

public class Task1{
    public static void main(String[] args){
        Integer arr[] = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));

        Collections.shuffle(al);
        System.out.println("shuffled array: " +al);
    }
}