package VisitorPatterns.Sample14;

/**
 * Created by Indi on 6/24/2016.
 */
public class DisplayPokemon implements PokemonVisitor {
    @Override
    public void visit(Bulbasaur bulbasaur) {
        System.out.println("Bulbasaur");
    }

    @Override
    public void visit(Pokemon pokemon) {
        System.out.println("Unknown pokemon");
    }
}
