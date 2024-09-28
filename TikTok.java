package JavaDva;

import java.util.ArrayList;

public class TikTok extends DrustvenaMreza implements Promocija{
    public TikTok(ArrayList<Korisnik> korisnici) {
        super(korisnici);
    }

    @Override
    public int zarada() {
        //donosi zaradu od 10 po svakoj slici, i 15 po svakom snimku od korisnika na mrezi.
       int sum = 0;
        for (Korisnik x : getKorisnici()) {
            sum+= (x.getBrSlika()*10 + x.getBrVidea()*15);
        }
        return sum;
    }
}
