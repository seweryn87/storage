package pl.storage.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Product")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

    @javax.persistence.Id
    @Id
    @GeneratedValue
    @Column
    @Getter @Setter
    private Long id;

    @Column
    private String productName;

    @Column
    private String productCode;

    @Column
    private UnitOfMeasure unitOfMeausure;

    @Column
    private Long quantity;

    @Column
    private Long purchasePrice;

    @Column
    private ProductGroup groupProduct;

    @Column
    private Long availability;

    @Column
    private Date lastModified;


}
