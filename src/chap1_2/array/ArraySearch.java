package chap1_2.array;

public class ArraySearch {
    public static void main(String[] args) {

        // 배열의 인덱스 탐색과 요소의 유무 확인
        String[] foods = {"족발", "파스타", "치킨", "삼겹살"};

        String target = "오겹살";

        // 선형 탐색 : 순차 탐색 - 배열을 0번부터 순차적으로 체크
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])) {
                index = i;
                break;
            }
        } // end for
        boolean isPresent = index != -1;

        System.out.println("target의 인덱스: " + index);
        System.out.println("target의 유무: " + isPresent);
    }
}
