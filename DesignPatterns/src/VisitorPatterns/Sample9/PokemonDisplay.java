package VisitorPatterns.Sample9;

/**
 * Created by Indi on 6/23/2016.
 */
public class PokemonDisplay implements PokemonVisitor {
    @Override
    public void visit(Pickachu pickachu) {
        System.out.println("This is a pickachu");
    }

    @Override
    public void visit(Pokemon pokemon) {
        System.out.println("This is an unknown pokemon");
    }
}
