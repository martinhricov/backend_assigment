package sk.hricov.backendeshop.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @NonNull
    private  String name;
    @NonNull
    private EAnimalCategory animalCategory;
    @NonNull
    private  Float price;
    private String description;
    private String pictureUrl;
    //private List<String> photos = new ArrayList<>();

    public Product(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public EAnimalCategory getAnimalCategory() {
        return animalCategory;
    }

    public void setAnimalCategory(EAnimalCategory animalCategory) {
        this.animalCategory = animalCategory;
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

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", animalCategory=" + animalCategory +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                '}';
    }
}