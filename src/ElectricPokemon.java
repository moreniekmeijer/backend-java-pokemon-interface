import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private static final String type = "electric";
    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses thunderpunch on " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "water":
                gymPokemon.setHp(gymPokemon.getHp() - 30);
                System.out.println(gymPokemon.getName() + " loses 30 hp");
                break;
            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
                break;
            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
                break;
            default:
                gymPokemon.setHp(gymPokemon.getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println(gymPokemon.getName() + " now has an hp of: " + gymPokemon.getHp());
    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses electroball on " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "water":
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
                break;
            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
                break;
            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
                break;
            default:
                gymPokemon.setHp(gymPokemon.getHp() - 5);
                System.out.println(gymPokemon.getName() + " loses 5 hp");
        }
        System.out.println(gymPokemon.getName() + " now has an hp of: " + gymPokemon.getHp());
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses thunder on " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "water":
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
                break;
            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
                break;
            case "fire":
                gymPokemon.setHp(gymPokemon.getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
                break;
            default:
                gymPokemon.setHp(gymPokemon.getHp() - 10);
                System.out.println(gymPokemon.getName() + " loses 10 hp");
        }
        System.out.println(gymPokemon.getName() + " now has an hp of: " + gymPokemon.getHp());
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " uses volttackle on " + gymPokemon.getName());
        switch (gymPokemon.getType()) {
            case "water":
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " loses 20 hp");
                break;
            case "grass":
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " loses 15 hp");
                break;
            case "fire":
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
