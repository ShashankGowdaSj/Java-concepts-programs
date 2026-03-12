package Day10;

import java.util.*;

public class arraysubsets {

    static void findSubsets(int[] arr, int index, List<Integer> current) {


        if (index == arr.length) {
            System.out.println(current);
            return;
        }


        current.add(arr[index]);
        findSubsets(arr, index + 1, current);


        current.remove(current.size() - 1);


        findSubsets(arr, index + 1, current);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        List<Integer> current = new ArrayList<>();

        findSubsets(arr, 0, current);
    }
}
