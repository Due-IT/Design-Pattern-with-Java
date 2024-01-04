import adapters.SquarePegAdapter;
import round.RoundHole;
import round.RoundPeg;
import square.SquarePeg;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);  // 원끼리는 잘 맞음
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r=5 fits round hole r=5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // if (!hole.fits(smallSqPeg)) 맞을 수가 없음

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);   // 원에 맞추기 위한 어댑터
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if(hole.fits(smallSqPegAdapter)){
            System.out.println("Square peg Adapter l=2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg Adapter l=20 does not fit into round hole r5.");
        }

    }
}