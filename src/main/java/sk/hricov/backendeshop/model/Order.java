package sk.hricov.backendeshop.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Entity
public class Order{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime dateCreated;

    private Float totalOrderPrice;


    //private List<OrderProduct> orderProducts = new ArrayList<>();

    /*public Float getTotalOrderPrice(){
        float total = 0f;
        List<OrderProduct> orderProduct = get
    }
    */
}
