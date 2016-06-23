package VisitorPatterns.Sample8;

/**
 * Created by Indi on 6/23/2016.
 */
public class DisplayPokemons implements PokemonVisitor {
    @Override
    public void visit(Bulbasaur bulbasaur) {
        System.out.println("this is a bulbasaur!");
    }

    @Override
    public void visit(Pokemon pokemon) {
        System.out.println("Unknown pokemon");
    }
}
