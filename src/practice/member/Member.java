package practice.member;

import java.time.LocalDateTime;
import java.util.UUID;

public class Member {

    /*
        {
            email: "",
            password: "",
        }
     */

    // 회원정보: 이메일, 비밀번호, 이름, 회원식별번호, 성별, 나이
    String email;
    String password;
    String memberName;
    String id; // 랜덤문자로 지정
    Gender gender; // 성별
    int age;
    LocalDateTime registerDate; // 회원가입 일시

    // 생성자 : 객체가 처음 생성될 때 값을 세팅
    public Member(String email, String password, String memberName, Gender gender, int age) {
        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.id = UUID.randomUUID().toString();
        this.gender = gender;
        this.age = age;
        this.registerDate = LocalDateTime.now();
    }
}
