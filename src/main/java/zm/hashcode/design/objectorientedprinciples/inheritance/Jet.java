package zm.hashcode.design.objectorientedprinciples.inheritance;


/**
 * Created by student on 2015/02/27.
 */
public class Jet extends Aircraft {

    @Override
    public int accelerate(int velocity)
    {
        return super.accelerate(velocity) + 30;
    }
}
