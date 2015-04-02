package fi.jamk.testi;

import java.io.Serializable;

/**
 * Sisältää opiskelijan, tietoja joita sille voi tallettaa ja
 * metodeja joilla muuttaa tietoja
 * @author Janne Heikkinen G8075
 * @version Jan 16, 2013
 */
public class Henkilo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String nimi;
    private String sotu;
    private double opintolaina;
    private boolean kiinnostaa;
    
    
    /** Muodostaa opiskelijan
     * @param nimi Opiskelijan nimi
     * @param sotu Sosiaaliturvatunnus
     * @param opintolaina Nostetun opintolainan määrä
     * @param kiinnostaa Nappaako?
     */
    public Henkilo(String nimi, String sotu, double opintolaina, boolean kiinnostaa) {
        this.nimi = nimi;
        this.sotu = sotu;
        this.opintolaina = opintolaina;
        this.kiinnostaa = kiinnostaa;
    }
    
    /**
     * Nosta opintolainaa
     * @param summa Paljonko nostetaan
     */
    public void nostaLainaa(double summa) {
        this.opintolaina += summa;
    }
    
    /**
     * Maksa opintolainaa takaisin pankille
     * @param summa Paljonko lainaa lyhennetään
     */
    public void maksaLainaa(double summa) {
        this.opintolaina -= summa;
    }
    
    /** @return Kertoo nappaako opiskelijaa just nyt  */
    public boolean kiinnostaako() {
        return kiinnostaa;
    }
    
	public double kuiskaaLaina() {
		return this.opintolaina;
	}
	
    /**
     * Palauttaa opiskelijan merkkijonona
     */
    @Override
    public String toString() {
        
        String kinostus = "ja just nyt ei nappaa!";
        if (kiinnostaako()) kinostus =  "ja opiskelijaa kiinnostaa!";         
        return "Nimi: " + nimi + ", Hetu: " + sotu + ", Opintolainaa nostettu: " + opintolaina + " " + kinostus;
    }

    /** @return palauttaa sosiaaliturvatunnuksen */
    public String palautaSotu() {
        return sotu;
    }

}
