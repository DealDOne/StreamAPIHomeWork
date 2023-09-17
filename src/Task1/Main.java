package Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();
        Collections.sort(intList);
        for (int el: intList){
            if ((el > 0) && (el % 2 == 0)){
                System.out.println(el);
            }
        }

        List<Integer> intList2 = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        Iterator<Integer> iterator = intList2.iterator();
        while (true) {
            if (iterator.hasNext()){
                int c = iterator.next();
                if((c > 0) && (c % 2 == 0)) {
                    result.add(c);
                }
            }
            else {
                for (int i = 0; i < result.size() - 1; i++){
                    for (int j = i + 1; j < result.size(); j++ ){
                        if (result.get(i) > result.get(j)){
                            Collections.swap(result, i, j);
                        }
                    }
                } break;
            }
        }
        System.out.println(result.toString());
    }

}
