package VisitorPatterns.Sample12;

/**
 * Created by Indi on 6/24/2016.
 */
public class DisplayPokemon implements PokemonVisitor {
    @Override
    public void visit(Mew mew) {
        System.out.println("This is a Mew");
    }

    @Override
    public void visit(Pokemon pokemon) {
        System.out.println("Unknown pokemon");
    }
}
