package VisitorPatterns.Sample11;

/**
 * Created by Indi on 6/23/2016.
 */
public class Pokemon  implements PokemonType{
    PokemonType[] types;
    public Pokemon(){
        types = new PokemonType[]{new Ghastly()};
    }

    @Override
    public void accept(PokemonVisitor pokemonVisitor) {
        for(int i = 0; i < types.length;i++){
            types[i].accept(pokemonVisitor);
        }
        pokemonVisitor.visit(this);
    }
}
