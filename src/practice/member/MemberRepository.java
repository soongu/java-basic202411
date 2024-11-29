package practice.member;

// 회원 객체를 여러개 모아서 관리할 설계도
public class MemberRepository {

    Member[] memberList; // 가입된 회원 배열

    MemberRepository() {
        // [ {회원1}, {회원2}, {회원3} ]
        this.memberList = new Member[] {
                new Member("abc123@def.com", "1234", "콩벌레", Gender.MALE, 15),
                new Member("fff@ggg.com", "5678", "팥죽이", Gender.FEMALE, 25),
                new Member("xxx@ccc.com", "9876", "카레빵", Gender.FEMALE, 35)
        };
    }

    // 모든 회원 정보를 가져오는 메서드
    Member[] getMembers() {
        return this.memberList;
    }

    // 회원 목록에 새로운 회원 1명을 추가하는 메서드
    void addMember(Member newMember) {
        // push
        Member[] temp = new Member[memberList.length + 1];
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }
        temp[temp.length - 1] = newMember;
        memberList = temp;

        // 숫자 배열 : [ 10, 20, 30, 40 ]
        // 객체 배열 : [ 주소1, 주소2, 주소3 ]
    }

    /**
     * 이메일 중복 여부를 확인하는 메서드
     * @param targetEmail - 이메일 검사 대상 문자열
     * @return - 이메일이 중복이면 true, 중복이 아니면 false
     */
    boolean isDuplicateEmail(String targetEmail) {
        for (Member m : memberList) {
            if (targetEmail.equals(m.email)) {
                return true;
            }
        } // end for
        return false;
    }

    /**
     * 이메일을 통해 회원 목록 배열에서 해당 이메일을 가진
     * 객체를 찾아 리턴하는 메서드
     *
     * @param targetEmail - 탐색 대상의 이메일
     * @return - 이메일이 일치하는 회원을 반환, 일치하는 회원이 없다면
     *           null을 반환한다.
     * @author - 미스터홍
     * @since - 2024.11.27
     */
    Member findMemberByEmail(String targetEmail) {
        // 회원 목록에서 회원 한명씩 반복해서 추출
        for (Member m : memberList) {
            // 주어진 이메일과 그 회원 한명의 이메일이 일치하는 순간
            if (targetEmail.equals(m.email)) {
                // 그 회원을 갖다준다.
                return m;
            }
        }
        // 못 찾으면 그 증거로 null을 가져다줌.
        return null;
    }


    void updatePassword(String inputEmail, String newPassword) {
        // 탐색
        Member foundMember = findMemberByEmail(inputEmail);
        // 변경
        foundMember.password = newPassword;
    }

    boolean isPasswordMatch(String storedPassword, String inputPassword) {
        return storedPassword.equals(inputPassword);
    }

    // 회원 탈퇴 처리
    void removeMember(String email) {

        // 삭제 대상의 인덱스를 알아내야 함.
        int index = findIndexByEmail(email);


        // 삭제 대상부터 앞으로 한칸씩 땡기기
        for (int i = index; i < memberList.length - 1; i++) {
            memberList[i] =  memberList[i + 1];
        }
        Member[] temp = new Member[memberList.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = memberList[i];
        }
        memberList = temp;
    }

    int findIndexByEmail(String inputEmail) {
        for (int i = 0; i < memberList.length; i++) {
            String storedEmail = memberList[i].email;
            if (inputEmail.equals(storedEmail)) {
                return i;
            }
        }
        return -1;
    }

}
