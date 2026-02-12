public class Character {
    private String name;
    private AttackStrategy attackStrategy;
    private DefenseStrategy[] defenseStrategies;

    public Character(String name, AttackStrategy attackStrategy, DefenseStrategy[] defenseStrategies) {
        this.name = name;
        this.attackStrategy = attackStrategy;
        this.defenseStrategies = defenseStrategies;
    }

    /**
     * Delegates attack behavior to the current attack strategy
     */
    public void attack() {
        attackStrategy.attack();
    }

    /**
     * Executes all available defense strategies
     */
    public void defend() {
        for (DefenseStrategy defense : defenseStrategies) {
            System.out.print(name + " uses: ");
            defense.defend();
        }
    }

    /**
     * Setter for attack strategy (allows runtime changes)
     */
    public void setAttackStrategy(AttackStrategy strategy) {
        this.attackStrategy = strategy;
    }

    /**
     * Setter for defense strategies (allows runtime changes)
     */
    public void setDefenseStrategies(DefenseStrategy[] strategies) {
        this.defenseStrategies = strategies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
