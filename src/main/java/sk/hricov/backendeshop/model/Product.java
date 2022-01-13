package sk.hricov.backendeshop.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Short id;
    private String name;
    private String animalCategories;
    private Float price;
    private String description;
    private String gallery;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalCategories() {
        return animalCategories;
    }

    public void setAnimalCategories(String animalCategories) {
        this.animalCategories = animalCategories;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", animalCategories='" + animalCategories + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", gallery='" + gallery + '\'' +
                '}';

    }
}