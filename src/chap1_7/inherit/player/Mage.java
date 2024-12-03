package chap1_7.inherit.player;

public class Mage extends Player {

    int mana; // 마력 게이지

    public Mage(String nickname) {
        super(nickname);
        this.mana = 60;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# 마력: " + mana);
    }

    // 마법사 스킬
    public void fireBall(Player target) {
        System.out.printf("%s님이 %s님에게 파이어볼을 쏩니다.\n"
                , this.nickname, target.nickname);
        // 상대방 체력을 19~34사이로 피해를 입힘
        int damage = (int) (Math.random() * 16) + 19;
        System.out.printf("%d의 피해를 입혔습니다.\n", damage);
        // 상대방 체력 차감
        target.hp -= damage;
        System.out.printf("%s님 남은 체력: %d\n", target.nickname, target.hp);
    }
}
