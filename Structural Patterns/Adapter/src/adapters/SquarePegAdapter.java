package adapters;

import round.RoundPeg;
import square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg){
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        double r = (squarePeg.getWidth()) / 2 * (Math.pow(2, 1.0/2.0));
        return r;
    }
}
