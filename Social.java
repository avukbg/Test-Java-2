package JavaDva;

import java.util.ArrayList;

public class Social {
    private ArrayList<DrustvenaMreza> mreze;

    public Social(ArrayList<DrustvenaMreza> mreze) {
        this.mreze = mreze;
    }

    public ArrayList<DrustvenaMreza> getMreze() {
        return mreze;
    }

    public void setMreze(ArrayList<DrustvenaMreza> mreze) {
        this.mreze = mreze;
    }

    @Override
    public String toString() {
        return "Social{" +
                "mreze=" + mreze +
                '}';
    }
    /*downloadMreza(DrustvenaMreza d) -> ubacuje novu drustvenu mrezu u listu ukoliko se tu vec ne nalazi
- deleteFacebook() -> izbacuje Facebook mrezu iz liste*/

    public void downloadMreza(DrustvenaMreza d) {
        boolean b = true;
        for (DrustvenaMreza x : getMreze()) {
            if (x.getClass() == d.getClass())
                b = false;
                break;
        }
        if (b) {
            mreze.add(d);
        }
    }


    public void deleteFacebook() {
        mreze.removeIf(x -> x instanceof Facebook);
    }
}



