package lt.viko.eif.stamulyte.model;

public class PrieglaudosAtstovas {
    private int id;
    private String pr_vardas, pr_slaptazodis, vardas, pavarde, el_pastas, tel_nr;

    public PrieglaudosAtstovas(int id, String pr_vardas, String pr_slaptazodis, String vardas, String pavarde, String el_pastas, String tel_nr) {
        this.id = id;
        this.pr_vardas = pr_vardas;
        this.pr_slaptazodis = pr_slaptazodis;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.el_pastas = el_pastas;
        this.tel_nr = tel_nr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPr_vardas() {
        return pr_vardas;
    }

    public void setPr_vardas(String pr_vardas) {
        this.pr_vardas = pr_vardas;
    }

    public String getPr_slaptazodis() {
        return pr_slaptazodis;
    }

    public void setPr_slaptazodis(String pr_slaptazodis) {
        this.pr_slaptazodis = pr_slaptazodis;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getEl_pastas() {
        return el_pastas;
    }

    public void setEl_pastas(String el_pastas) {
        this.el_pastas = el_pastas;
    }

    public String getTel_nr() {
        return tel_nr;
    }

    public void setTel_nr(String tel_nr) {
        this.tel_nr = tel_nr;
    }
}
