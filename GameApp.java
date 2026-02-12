public class GameApp {
    public static void main(String[] args) {

        // Create Knight with sword attack and shield defense
        Character knight = new Character(
            "Knight",
            new SwingSword(),
            new DefenseStrategy[]{new Shield()}
        );

        // Create Wizard with spell attack and magic barrier defense
        Character wizard = new Character(
            "Wizard",
            new CastSpell(),
            new DefenseStrategy[]{new CreateMagic()}
        );

        // Create Archer with arrow attack and dodge defense
        Character archer = new Character(
            "Archer",
            new ShootArrow(),
            new DefenseStrategy[]{new Dodge()}
        );

        // Demonstrate Knight
        System.out.println("--- Knight (Attack: SwingSword, Defense: Shield) ---");
        knight.attack();
        knight.defend();
        System.out.println();

        // Demonstrate Wizard
        System.out.println("--- Wizard (Attack: CastSpell, Defense: CreateMagic) ---");
        wizard.attack();
        wizard.defend();
        System.out.println();

        // Demonstrate Archer
        System.out.println("--- Archer (Attack: ShootArrow, Defense: Dodge) ---");
        archer.attack();
        archer.defend();
        System.out.println();

        // Demonstrate runtime strategy change
        System.out.println("--- Knight changes to CastSpell attack strategy ---");
        knight.setAttackStrategy(new CastSpell());
        System.out.println("Knight (Attack: CastSpell, Defense: Shield)");
        knight.attack();
        System.out.println();

        // Demonstrate strategy change for defense
        System.out.println("--- Archer can only use Dodge defense ---");
        archer.defend();
    }
}
