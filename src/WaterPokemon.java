import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private static final String type = "water";
    List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses surf on " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() - 25);
                System.out.println(gymPokemon.getName() + " loses 25 hp");
                break;
            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
                break;
            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
                break;
            default:
                gymPokemon.setHp(gymPokemon.getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println(gymPokemon.getName() + " now has an hp of: " + gymPokemon.getHp());
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses hydropump on " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
                break;
            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
                break;
            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
                break;
            default:
                gymPokemon.setHp(gymPokemon.getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println(gymPokemon.getName() + " now has an hp of: " + gymPokemon.getHp());
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses hydrocanon on " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() - 25);
                System.out.println(gymPokemon.getName() + " loses 25 hp");
                break;
            case "electric":
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
                break;
            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
                break;
            default:
                gymPokemon.setHp(gymPokemon.getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println(gymPokemon.getName() + " now has an hp of: " + gymPokemon.getHp());
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses raindance on " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
                break;
            case "electric":
                System.out.println("Has no effect on " + gymPokemon.getName());
                break;
            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " gets extra damage with raindance and loses 20 hp!");
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
