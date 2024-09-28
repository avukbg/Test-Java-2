package JavaDva;

import java.time.Year;

public class Korisnik {
    /*Napraviti klasu Korisnik koja ima od atributa ime, godinu rodjenja,broj video snimkova, broj slika i mesto
boravka(String), takodje treba napraviti metodu:
- prikladnoGodinama() -> metoda koje ispisuje poruku ako korisnik ima manje od 18 godina, da se ne
preporucuje da ima nalog na drustvenim mrezama
Napraviti klasu DrustvenaMreza koja ima listu Korisnik-a i metode:
- izIstogMesta(String mesto) -> ispisuje imena korisnika koji su svi na istoj lokaciji (mestu)
- findKorisnik(String ime) -> za prosledjeno ime vraca true ako se korisnik nalazi na drustvenoj mrezi
- izbaciPremlade() -> izbacuje sa drustvene mreze svakog korisnika koji nema bar 18 godina

Napraviti Interfejs Promocija koja ima sledece metode:
- zarada() -> donosi zaradu od 10 po svakoj slici, i 15 po svakom snimku od korisnika na mrezi.

Napraviti klasu Facebook koji nasledjuje klasu DrustvenaMreza.
Napraviti klasu Instagram koja nasledjuje klasu DrustvenaMreza i izbacuje sa drustvene mreze sve
korisnike koji imaju manje od 16 godina.
Napraviti klasu TikTok koja nasledjuje klasu DrustvenaMreza i implementira interfejs Promocija.

Napraviti klasu Social koja ima listu drustvenih mreza I metode:
- downloadMreza(DrustvenaMreza d) -> ubacuje novu drustvenu mrezu u listu ukoliko se tu vec ne nalazi
- deleteFacebook() -> izbacuje Facebook mrezu iz liste

Za date klase je potrebno implementirati sve get, set metode kao I konstruktor I toString. */

    private String ime;
    private int godRodjenja;
    private int brVidea;
    private int brSlika;
    private String mesto;

    public Korisnik(String ime, int godRodjenja, int brVidea, int brSlika, String mesto) {
        this.ime = ime;
        this.godRodjenja = godRodjenja;
        this.brVidea = brVidea;
        this.brSlika = brSlika;
        this.mesto = mesto;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public void setGodRodjenja(int godRodjenja) {
        this.godRodjenja = godRodjenja;
    }

    public int getBrVidea() {
        return brVidea;
    }

    public void setBrVidea(int brVidea) {
        this.brVidea = brVidea;
    }

    public int getBrSlika() {
        return brSlika;
    }

    public void setBrSlika(int brSlika) {
        this.brSlika = brSlika;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    @Override
    public String toString() {
        return "Korisnik{" +
                "ime='" + ime + '\'' +
                ", godRodjenja=" + godRodjenja +
                ", brVidea=" + brVidea +
                ", brSlika=" + brSlika +
                ", mesto='" + mesto + '\'' +
                '}';
    }

    public void prikladnoGodinama() {
        if ((Year.now().getValue() - getGodRodjenja()) < 18) {
            System.out.println("ne preporucuje se koriscenje drustvenih mreza");
        }
    }

}
