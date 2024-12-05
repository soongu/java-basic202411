package chap2_1.exception;

// 로그인 검증을 수행하는 클래스
public class LoginUser {

    private String account; // 가입시 등록한 계정명
    private String password; // 가입시 등록한 비밀번호

    public LoginUser(String account, String password) {
        this.account = account;
        this.password = password;
    }

    // 로그인 검증 기능
    //                        로그인 시도하는 계정, 로그인 시도하는 비번
    public void loginValidate(String inputAccount, String inputPassword)
        throws LoginInvalidException // throws: 이 메서드는 위험하다
    {
        // 계정 검증
        if (!inputAccount.equals(this.account)) {
            /*
                프로그램에서 예외로 인식하지 않지만
                실제로 비지니스 상황에서는 예외로 인식시켜야 할 경우
                강제로 에러를 발생시켜야 한다.
             */

            // throw: 발생시키다 (raise)
            throw new LoginInvalidException("아이디가 일치하지 않습니다.");
        }

        // 패스워드 검증
        if (!inputPassword.equals(this.password)) {
            throw new LoginInvalidException("비밀번호가 일치하지 않습니다.");
        }

        System.out.println("로그인에 성공했습니다.");
    }
}
