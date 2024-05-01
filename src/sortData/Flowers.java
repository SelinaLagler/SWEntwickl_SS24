package sortData;

import java.util.Objects;

public class Flowers implements Comparable<Flowers>{
    private int leafes;
    private String sizeInLetters;
    private String color;

    public Flowers(int leafes, String sizeInLetters, String color) {
        this.leafes = leafes;
        this.sizeInLetters = sizeInLetters;
        this.color = color;
    }

    public int getLeafes() {
        return leafes;
    }

    public void setLeafes(int leafes) {
        this.leafes = leafes;
    }

    public String getSizeInLetters() {
        return sizeInLetters;
    }

    public void setSizeInLetters(String sizeInLetters) {
        this.sizeInLetters = sizeInLetters;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "leafes=" + leafes +
                ", sizeInLetters='" + sizeInLetters + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flowers flowers)) return false;
        return getLeafes() == flowers.getLeafes() && Objects.equals(getSizeInLetters(), flowers.getSizeInLetters()) && Objects.equals(getColor(), flowers.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLeafes(), getSizeInLetters(), getColor());
    }


    @Override
    public int compareTo(Flowers o) {
        if (this.leafes<o.leafes){
            return -1;
        }
        else if (this.leafes>o.leafes){
            return 1;
        }
        else return 0;
    }
}
