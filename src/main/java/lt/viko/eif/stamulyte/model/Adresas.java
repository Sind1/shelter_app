package lt.viko.eif.stamulyte.model;

public class Adresas {
    private int id;
    private String gatve, numeris, miestas, pasto_kodas;

    public Adresas(int id, String gatve, String numeris, String miestas, String pasto_kodas) {
        this.id = id;
        this.gatve = gatve;
        this.numeris = numeris;
        this.miestas = miestas;
        this.pasto_kodas = pasto_kodas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGatve() {
        return gatve;
    }

    public void setGatve(String gatve) {
        this.gatve = gatve;
    }

    public String getNumeris() {
        return numeris;
    }

    public void setNumeris(String numeris) {
        this.numeris = numeris;
    }

    public String getMiestas() {
        return miestas;
    }

    public void setMiestas(String miestas) {
        this.miestas = miestas;
    }

    public String getPasto_kodas() {
        return pasto_kodas;
    }

    public void setPasto_kodas(String pasto_kodas) {
        this.pasto_kodas = pasto_kodas;
    }
}
