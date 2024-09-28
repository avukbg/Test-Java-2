package JavaDva;

import java.time.Year;
import java.util.ArrayList;

public class DrustvenaMreza {
    /*Napraviti klasu DrustvenaMreza koja ima listu Korisnik-a i metode:
- izIstogMesta(String mesto) -> ispisuje imena korisnika koji su svi na istoj lokaciji (mestu)
- findKorisnik(String ime) -> za prosledjeno ime vraca true ako se korisnik nalazi na drustvenoj mrezi
- izbaciPremlade() -> izbacuje sa drustvene mreze svakog korisnika koji nema bar 18 godina*/

    private ArrayList<Korisnik> korisnici;

    public DrustvenaMreza(ArrayList<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public ArrayList<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(ArrayList<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    @Override
    public String toString() {
        return "DrustvenaMreza{" +
                "korisnici=" + korisnici +
                '}';
    }

    private void izIstogMesta(String mesto) {
        for (Korisnik x : getKorisnici()) {
            if (x.getMesto().equals(mesto)) {
                System.out.println(x.getIme());
            }
        }
    }

    public boolean findKorisnik(String ime) {
        //return  getKorisnici().stream().anyMatch(x -> x.getIme().equals(ime));
        boolean c = false;
        for (Korisnik x : getKorisnici()) {
            if (x.getIme().equals(ime)) {
                     c=true;
                     break;
            }
        } return c;
    }

    public void izbaciPremlade () {
        korisnici.removeIf(x -> ((Year.now().getValue() - x.getGodRodjenja()) < 18));
    }
}
