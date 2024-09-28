package JavaDva;

import java.time.Year;
import java.util.ArrayList;

public class Instagram extends DrustvenaMreza{
    public Instagram(ArrayList<Korisnik> korisnici) {
        super(korisnici);
    }

    @Override
    public void izbaciPremlade () {
        getKorisnici().removeIf(x -> ((Year.now().getValue() - x.getGodRodjenja()) < 16));
        //mislim da ce stvarno da ih ukloni jer ce uvek da vrati istu listu
    }
}
