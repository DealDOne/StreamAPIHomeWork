package Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Collections.sort(intList);
        for (int el: intList){
            if ((el > 0) && (el % 2 == 0)){
                System.out.println(el);
            }
        }
        /*(List<Integer> intList2 = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        String filter;
        for (int i = 0; i < intList2.size() - 1; i++){
            for (int j = i + 1; j < intList2.size(); j++ ){
                System.out.println(i + " " + j);
                if (intList2.get(i) > intList2.get(j)){
                    Collections.swap(intList2, i, j);
                }
            }

        } System.out.println(intList2);*/

    }

}
