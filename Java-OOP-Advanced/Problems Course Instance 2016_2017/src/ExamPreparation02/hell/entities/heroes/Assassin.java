package ExamPreparation02.hell.entities.heroes;

import ExamPreparation02.hell.interfaces.Inventory;

public class Assassin extends AbstractHero {

    private static final int STRENGTH = 25;
    private static final int AGILITY = 100;
    private static final int INTELLIGENCE = 15;
    private static final int HITPOINTS = 150;
    private static final int DAMAGE = 300;

    public Assassin(String name, Inventory inventory) {
        super(name, STRENGTH, AGILITY, INTELLIGENCE, HITPOINTS, DAMAGE, inventory);
    }
}
