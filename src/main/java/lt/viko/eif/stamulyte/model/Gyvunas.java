package lt.viko.eif.stamulyte.model;

import javax.swing.*;

public class Gyvunas {
    private int id;
    private String mikrocipo_nr;
    private String name;
    private ImageIcon image;

    public Gyvunas(String name, ImageIcon image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
}
