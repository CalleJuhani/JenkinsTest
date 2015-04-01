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
    
  Henkilo henkilot[];   // henkilöt-taulukko (sisältää siis henkilöitä)
  int henkiloita;       // kuinka monta henkilöä on henkilöt taulukossa
  int maxkoko;          // henkilöt-taulukon maksimikoko (siis kuinka monta henkilöä voi maksimissaan olla taulukossa)

  // konstruktori: kutsu pääohjelmasta esim. seuraavasti: 
  // Rekisteri kaverit = new Rekisteri(100); // rekisterissä tilaa 10 kaverille
  public Rekisteri(int maxkoko) {
    henkilot = new Henkilo[maxkoko];    // henkilot-taulukkoon tulee Henkilo-luokan olioita
    henkiloita=0;                       // aluksi henkilöitä on 0
    this.maxkoko = maxkoko;             // määritellään luokan ominaisuus maxkoko samaksi mitä välitetään pääohjelmasta
  }

  // metodi palauttaa henkiloiden maaran taulukossa
  public int palautaHenkiloMaara() {
    return henkiloita;
  }

  // metodi palauttaa indeksiä vastaavan henkilon henkilot-taulukosta
  public Henkilo palautaHenkilo(int index) {
    if (index >= henkiloita) return null;
    return henkilot[index]; 
  }
  
  // metodi lisää henkilön henkilot-taulukkoon
  public boolean lisaaHenkilo(Henkilo h) {
    if (henkiloita >= maxkoko) return false;    // henkilot-taulukossa ei ole tilaa uudelle henkilölle
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
      if (sotu.equals(hSotu)) return h; // sotua vastaava henkilö löytyi
    }
    return null;    // sotua vastaavaa henkilöä ei löydy henkilot-taulukosta
  }

    
}