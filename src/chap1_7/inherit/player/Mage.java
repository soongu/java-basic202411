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

        if (target == this) {
            System.out.println("자신을 타겟팅할 수 없습니다.");
            return;
        }

        System.out.printf("%s님이 %s님에게 파이어볼을 쏩니다.\n"
                , this.nickname, target.nickname);
        // 상대방 체력을 19~34사이로 피해를 입힘
        int damage = (int) (Math.random() * 16) + 19;
        System.out.printf("%d의 피해를 입혔습니다.\n", damage);
        // 상대방 체력 차감
        target.hp -= damage;
        System.out.printf("%s님 남은 체력: %d\n", target.nickname, target.hp);
    }

    public void thunderbolt(Player... targets) {

        System.out.printf("# %s님 썬더볼트 시전!!!!\n", this.nickname);
        System.out.println("======================================");

        for (Player p : targets) {
            //맞은 사람이 혹시 나??
            if (p == this) continue;

            //10 ~ 15의 랜덤 피해
            int damage = (int) (Math.random() * 6 + 10);
            //실제 체력에서 차감
            p.hp -= damage;
//            p.setHp(p.getHp() - damage);

            System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n"
                    , p.nickname, damage, p.hp);
        }
    }
}
