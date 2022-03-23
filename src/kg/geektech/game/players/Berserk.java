package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {
    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
       int bossDamage = boss.getDamage() / 2;
        for (int i = 0; i < heroes.length ; i++) {
            if (heroes.length > 0) {
                boss.setHealth(boss.getHealth() - bossDamage);
                this.setHealth(this.getHealth() + bossDamage);
            }
        }
        System.out.println("Berserk использовал суперсилу");
    }
}
