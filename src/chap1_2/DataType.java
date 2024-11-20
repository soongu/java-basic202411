package chap1_2;

public class DataType {

//    메인 메서드: 프로그램의 실행 기점
    public static void main(String[] args) {

        int age = 20;
        double pi = 3.14;
        char c = '가';
        String greeting = "안뇽??";
        boolean flag = true;

        // 정수 타입 (byte: 1byte, short: 2byte, int: 4byte, long: 8byte)
        // 1byte == 8bit => 0 1111111
        byte x1 = 127;
        // 16bit => 0 1111111 11111111
        short x2 = 32767;
        int x3 = 2147483647;

        //10; // 리터럴: 변수에 저장되기 전 데이터
        // 정수 리터럴의 기본타입 int
        long x4 = 214748364812313123L;
        System.out.println(x4);

        //==== 실수 타입 ====//
        float f1 = 3.142131231231312F;   // 4byte
        double f2 = 3.1433241234213421423;  // 8byte
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        //==== 논리 타입 ====//
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = 10 < 5;
        boolean b4 = (10 + 3 == 13) && (9 * 1 == 8);

        //==== 문자와 문자열 타입 ====//
        char c1 = 'A'; // 2byte
        char c2 = 67;
        System.out.println("c2 = " + c2);

        // hello ['h', 'e', 'l', 'l', 'o']
        char[] cArr = {'h', 'e', 'l', 'l', 'o'};
        String str = new String(cArr);
        System.out.println("str = " + str);

        String str2 = "안녕하세요";
        System.out.println("str2 = " + str2);

        // 자바 17부터 지원
        String str3 = """
                        안녕
                        ㅇㄹㄴㅇㄹㄴ
                        ㅇㄹㅁㄴㅇㄹ
                        ㄴㅇㄹㅇㄴㅁㄹ
                      """;


        // 동적 타이핑 (java 9)
        var z = 100; // 타입 추론
        var h = "dsfdf";
    }
}
