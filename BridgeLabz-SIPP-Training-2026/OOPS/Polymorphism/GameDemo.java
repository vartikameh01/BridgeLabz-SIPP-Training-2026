class GameCharacter {
    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    void performAttack() {
        System.out.println("Attack");
    }
}

class Warrior extends GameCharacter {
    Warrior(String n) {
        super(n);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Sword");
    }
}

class Mage extends GameCharacter {
    Mage(String n) {
        super(n);
    }

    void performAttack() {
        System.out.println(characterName + " casts Magic");
    }
}

class Archer extends GameCharacter {
    Archer(String n) {
        super(n);
    }

    void performAttack() {
        System.out.println(characterName + " shoots Arrow");
    }
}

public class GameDemo {

    static void startBattle(GameCharacter[] c) {

        int w = 0, m = 0, a = 0;

        for (GameCharacter x : c) {
            x.performAttack();

            if (x instanceof Warrior)
                w++;
            else if (x instanceof Mage)
                m++;
            else if (x instanceof Archer)
                a++;
        }

        System.out.println("\nWarriors = " + w);
        System.out.println("Mages = " + m);
        System.out.println("Archers = " + a);
    }

    public static void main(String[] args) {

        GameCharacter[] c = {
                new Warrior("Arjun"),
                new Mage("Harry"),
                new Archer("Robin"),
                new Warrior("Leo")
        };

        startBattle(c);
    }
}