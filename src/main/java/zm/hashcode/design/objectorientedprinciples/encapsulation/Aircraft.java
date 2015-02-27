package zm.hashcode.design.objectorientedprinciples.encapsulation;

/**
 * Created by student on 2015/02/27.
 */
public abstract class Aircraft {
    private int velocity;

    public Aircraft(int velocity) {
        this.velocity = velocity;
    }

    public int getVelocity()
    {
        return velocity;
    }

}
