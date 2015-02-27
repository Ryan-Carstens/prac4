package zm.hashcode.design.objectorientedprinciples.polymophism;

/**
 * Created by student on 2015/02/27.
 */
public abstract class Pawn implements ChessPiece
{
    public Pawn(){

    }

    @Override
    public String move(String newMove) {return newMove;}


    public String position(String pos) { return pos;}

}
