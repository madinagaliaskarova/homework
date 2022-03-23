package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        /*int boostPoints = 2;
        if (RPG_Game.random.nextBoolean()) {
            boostPoints = 4;
        }*/
        int boostPoints = RPG_Game.random.nextInt(20);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].setDamage(heroes[i].getDamage() + boostPoints);
            }
            boss.setHealth(boss.getHealth() - heroes[i].getDamage() + boostPoints);

        }
        System.out.println("Magic нанес урон" + " " +(this.getDamage() + boostPoints));
    }
}
