package src;

/*
 * Rekisteri.java
 *
 * Created on 13. tammikuuta 2005, 9:26
 */

/**
 *
 * @author  mapas
 */
public class Rekisteri {
    
  Henkilo henkilot[];   // henkil�t-taulukko (sis�lt�� siis henkil�it�)
  int henkiloita;       // kuinka monta henkil�� on henkil�t taulukossa
  int maxkoko;          // henkil�t-taulukon maksimikoko (siis kuinka monta henkil�� voi maksimissaan olla taulukossa)

  // konstruktori: kutsu p��ohjelmasta esim. seuraavasti: 
  // Rekisteri kaverit = new Rekisteri(100); // rekisteriss� tilaa 10 kaverille
  public Rekisteri(int maxkoko) {
    henkilot = new Henkilo[maxkoko];    // henkilot-taulukkoon tulee Henkilo-luokan olioita
    henkiloita=0;                       // aluksi henkil�it� on 0
    this.maxkoko = maxkoko;             // m��ritell��n luokan ominaisuus maxkoko samaksi mit� v�litet��n p��ohjelmasta
  }

  // metodi palauttaa henkiloiden maaran taulukossa
  public int palautaHenkiloMaara() {
    return henkiloita;
  }

  // metodi palauttaa indeksi� vastaavan henkilon henkilot-taulukosta
  public Henkilo palautaHenkilo(int index) {
    if (index >= henkiloita) return null;
    return henkilot[index]; 
  }
  
  // metodi lis�� henkil�n henkilot-taulukkoon
  public boolean lisaaHenkilo(Henkilo h) {
    if (henkiloita >= maxkoko) return false;    // henkilot-taulukossa ei ole tilaa uudelle henkil�lle
    henkilot[henkiloita]=h;
    henkiloita++;
    return true;
  }

  // metodi etsii sotua vastaavan henkilon henkilot-taulukosta
  public Henkilo etsiHenkilo(String sotu) {
    Henkilo h;
    String hSotu;
    for (int i=0;i<henkiloita;i++) {
        h = henkilot[i];
        hSotu = h.palautaSotu();
      if (sotu.equals(hSotu)) return h; // sotua vastaava henkil� l�ytyi
    }
    return null;    // sotua vastaavaa henkil�� ei l�ydy henkilot-taulukosta
  }

    
}