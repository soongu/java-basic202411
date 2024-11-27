package practice.member;

import java.time.LocalDateTime;
import java.util.UUID;

// 역할: 한 명의 회원정보를 잘 들고 있으면 됨
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

    // 한 명의 회원 정보를 출력하는 메서드
    void inform() {
        System.out.printf("# %s | %s | %s | %d세\n"
                , email, memberName, gender, age);
    }
}
