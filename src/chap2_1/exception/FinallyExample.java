package chap2_1.exception;

public class FinallyExample {

    public static void main(String[] args) {

        String[] pets = {"멍멍이", "야옹이", "비둘긔"};

        for (int i = 0; i < 4; i++) {
            try {
                System.out.println(pets[i] + " 키울래요~");
            } catch (Exception e) {
                System.out.println("그런 애완동물은 없어요~");
            } finally {
                // 예외가 안나도 실행 나도 실행하는 코드
                // 일반적으로 메모리 정리 차원에서 사용하는 경우가 많음
                System.out.println("애완동물 화이팅!");
            }
        }

        System.out.println("111");
    }
}
