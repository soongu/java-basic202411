package chap1_10.inter.phone;

public interface SmartPhone {

    // 필드를 가질 수 없음, 상수는 가능
    int A = 10;

    // 카메라기능
    void camera();

    // 충전기능
    void charge();

    // 인터넷기능
    void internet();
}
