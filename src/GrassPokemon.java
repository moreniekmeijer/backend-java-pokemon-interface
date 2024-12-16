import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private static final String type = "grass";
    List<String> attacks = Arrays.asList("leafStorm", "leaveBlade", "solarBeam", "leechSeed");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses leafstorm on " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() - 25);
                System.out.println(gymPokemon.getName() + " loses 25 hp");
                break;
            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
                break;
            case "water":
                gymPokemon.setHp(gymPokemon.getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
                break;
            default:
                gymPokemon.setHp(gymPokemon.getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println(gymPokemon.getName() + " now has an hp of: " + gymPokemon.getHp());
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses leaveblade on " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
                break;
            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
                break;
            case "water":
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
                break;
            default:
                gymPokemon.setHp(gymPokemon.getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println(gymPokemon.getName() + " now has an hp of: " + gymPokemon.getHp());
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses solarbeam on " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
                break;
            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
                break;
            case "water":
                gymPokemon.setHp(gymPokemon.getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
                break;
            default:
                gymPokemon.setHp(gymPokemon.getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println(gymPokemon.getName() + " now has an hp of: " + gymPokemon.getHp());
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses leechseed on " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
                pokemon.setHp(getHp() + 20);
                break;
            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
                pokemon.setHp(getHp() + 15);
                break;
            case "water":
                gymPokemon.setHp(gymPokemon.getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
                pokemon.setHp(getHp() + 10);
                break;
            default:
                gymPokemon.setHp(gymPokemon.getHp() - 5);
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
