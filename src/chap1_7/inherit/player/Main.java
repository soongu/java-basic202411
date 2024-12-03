package chap1_7.inherit.player;

public class Main {

    /*
                      Object
                        |
                      Player
                /       |       \
             Warrior   Mage     Hunter
                |
           SuperWarrior
     */

    public static void main(String[] args) {

        Warrior warrior = new Warrior("주차왕파킹");
        Mage mage = new Mage("충격왕쇼킹");
        Hunter hunter = new Hunter("스티븐호킹");

        warrior.dash();
        warrior.showStatus();
        mage.showStatus();
        hunter.showStatus();

        System.out.println("================");

        mage.fireBall(warrior);
        mage.fireBall(hunter);
        mage.fireBall(new Mage("다른마봅사"));

        mage.fireBall(mage);

        System.out.println("============");

        mage.thunderbolt(warrior, hunter
                , new Mage("냠냠이")
                , new Hunter("원생이")
                , new Warrior("막띠려")
                , mage
        );
    }
}
