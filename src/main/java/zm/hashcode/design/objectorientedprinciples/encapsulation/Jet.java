package zm.hashcode.design.objectorientedprinciples.encapsulation;

/**
 * Created by student on 2015/02/27.
 */
public class Jet extends Aircraft {

    public Jet(int velocity) {
        super(velocity);
    }

    @Override
    public int getVelocity()
    {
        return super.getVelocity() + 30;
    }
}
