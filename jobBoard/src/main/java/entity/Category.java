package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Category extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 46835149772133976L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Category_Name")
    private String categoryName;

    @Column(name="Sort_Order")
    private int sortOrder;

    @Column(name = "Status")
    private boolean status;

//    @JsonIgnore
//    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<BatchProperties.Job> jobs=new HashSet<BatchProperties.Job>();


}
