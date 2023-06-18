package lt.viko.eif.stamulyte.model;

public class PrieglaudosAprasas {
    private int id;
    private String pavadinimas, tel_nr, el_pastas;
    private Adresas adresas;

    public PrieglaudosAprasas(int id, String pavadinimas, String tel_nr, String el_pastas, Adresas adresas) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.tel_nr = tel_nr;
        this.el_pastas = el_pastas;
        this.adresas = adresas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getTel_nr() {
        return tel_nr;
    }

    public void setTel_nr(String tel_nr) {
        this.tel_nr = tel_nr;
    }

    public String getEl_pastas() {
        return el_pastas;
    }

    public void setEl_pastas(String el_pastas) {
        this.el_pastas = el_pastas;
    }

    public Adresas getAdresas() {
        return adresas;
    }

    public void setAdresas(Adresas adresas) {
        this.adresas = adresas;
    }
}
