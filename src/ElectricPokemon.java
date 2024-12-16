import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{
    private static final String type = "electric";
    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "water":
                gymPokemon.setHp(getHp() - 30);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
            case "grass":
                gymPokemon.setHp(getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
            case "fire":
                gymPokemon.setHp(getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
            default:
                gymPokemon.setHp(getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println("The enemy now has an hp of: " + gymPokemon.getHp());
    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "water":
                gymPokemon.setHp(getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
            case "grass":
                gymPokemon.setHp(getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
            case "fire":
                gymPokemon.setHp(getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
            default:
                gymPokemon.setHp(getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println("The enemy now has an hp of: " + gymPokemon.getHp());
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "water":
                gymPokemon.setHp(getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
            case "grass":
                gymPokemon.setHp(getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
            case "fire":
                gymPokemon.setHp(getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
            default:
                gymPokemon.setHp(getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println("The enemy now has an hp of: " + gymPokemon.getHp());
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "water":
                gymPokemon.setHp(getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
            case "grass":
                gymPokemon.setHp(getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
            case "fire":
                gymPokemon.setHp(getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
            default:
                gymPokemon.setHp(getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println("The enemy now has an hp of: " + gymPokemon.getHp());
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
