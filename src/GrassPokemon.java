import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    private static final String type = "grass";
    List<String> attacks = Arrays.asList("leafStorm", "leaveBlade", "solarBeam", "leechSeed");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "electric":
                gymPokemon.setHp(getHp() - 25);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
            case "fire":
                gymPokemon.setHp(getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
            case "water":
                gymPokemon.setHp(getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
            default:
                gymPokemon.setHp(getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println("The enemy now has an hp of: " + gymPokemon.getHp());
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "electric":
                gymPokemon.setHp(getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
            case "fire":
                gymPokemon.setHp(getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
            case "water":
                gymPokemon.setHp(getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
            default:
                gymPokemon.setHp(getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println("The enemy now has an hp of: " + gymPokemon.getHp());
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "electric":
                gymPokemon.setHp(getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
            case "fire":
                gymPokemon.setHp(getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
            case "water":
                gymPokemon.setHp(getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
            default:
                gymPokemon.setHp(getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println("The enemy now has an hp of: " + gymPokemon.getHp());
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "electric":
                gymPokemon.setHp(getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
                pokemon.setHp(getHp() + 20);
            case "fire":
                gymPokemon.setHp(getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
                pokemon.setHp(getHp() + 15);
            case "water":
                gymPokemon.setHp(getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
                pokemon.setHp(getHp() + 10);
            default:
                gymPokemon.setHp(getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
                pokemon.setHp(getHp() + 5);
        }
        System.out.println("The enemy now has an hp of: " + gymPokemon.getHp());
        System.out.println("and your pokemon gains that amount in hp!");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
