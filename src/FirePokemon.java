import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private static final String type = "fire";
    List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses inferno on " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() - 30);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
                break;
            case "water":
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
                break;
            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
                break;
            default:
                gymPokemon.setHp(gymPokemon.getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println(gymPokemon.getName() + " now has an hp of: " + gymPokemon.getHp());
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses pyroball on " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
                break;
            case "water":
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
                break;
            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
                break;
            default:
                gymPokemon.setHp(gymPokemon.getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println(gymPokemon.getName() + " now has an hp of: " + gymPokemon.getHp());
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses firelash on " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
                break;
            case "water":
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
                break;
            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
                break;
            default:
                gymPokemon.setHp(gymPokemon.getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println(gymPokemon.getName() + " now has an hp of: " + gymPokemon.getHp());
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses flamethrower on " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
                break;
            case "water":
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
                break;
            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
                break;
            default:
                gymPokemon.setHp(gymPokemon.getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println(gymPokemon.getName() + " now has an hp of: " + gymPokemon.getHp());
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
