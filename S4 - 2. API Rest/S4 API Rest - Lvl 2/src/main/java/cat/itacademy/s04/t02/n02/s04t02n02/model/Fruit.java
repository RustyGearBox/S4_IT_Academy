package cat.itacademy.s04.t02.n02.s04t02n02.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Fruit {

    @Id
    private int id;
    private String name;
    private int quantityKg;

    public Fruit(int id, String name, int quantityKg) {
        this.id = id;
        this.name = name;
        this.quantityKg = quantityKg;
    }

    public Fruit() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantityKg() {
        return quantityKg;
    }
    public void setQuantityKg(int quantityKg) {
        this.quantityKg = quantityKg;
    }

    @Override
    public String toString() {
        return "fruit [id=" + id + ", name=" + name + ", quantityKg=" + quantityKg + "]";
    }

}