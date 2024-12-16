import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{
    private static final String type = "water";
    List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "fire":
                gymPokemon.setHp(getHp() - 25);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
            case "electric":
                gymPokemon.setHp(getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
            case "grass":
                gymPokemon.setHp(getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
            default:
                gymPokemon.setHp(getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println("The enemy now has an hp of: " + gymPokemon.getHp());
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "fire":
                gymPokemon.setHp(getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
            case "electric":
                gymPokemon.setHp(getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
            case "grass":
                gymPokemon.setHp(getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
            default:
                gymPokemon.setHp(getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println("The enemy now has an hp of: " + gymPokemon.getHp());
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "fire":
                gymPokemon.setHp(getHp() - 25);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
            case "electric":
                gymPokemon.setHp(getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
            case "grass":
                gymPokemon.setHp(getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
            default:
                gymPokemon.setHp(getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println("The enemy now has an hp of: " + gymPokemon.getHp());
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "fire":
                gymPokemon.setHp(getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
            case "electric":
                System.out.println("Has no effect on " + gymPokemon.getName());
            case "grass":
                gymPokemon.setHp(getHp() - 20);
                System.out.println(gymPokemon.getName() + " gets an extra hp boost with raindance!");
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
