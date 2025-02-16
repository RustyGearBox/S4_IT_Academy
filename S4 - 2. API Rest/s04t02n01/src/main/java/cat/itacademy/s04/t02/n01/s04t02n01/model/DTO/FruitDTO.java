package cat.itacademy.s04.t02.n01.s04t02n01.model.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class FruitDTO {

    @Id
    private int id;

    @Column(nullable = false, length = 10)
    private String name;

    @Column(nullable = false)
    private int quantity;

}