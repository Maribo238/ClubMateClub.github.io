package clubMateClub.backend.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
@Document(collection = "mateClub")
public class Seller {
    @Id
    @Generated
    private Long id;
    private String name;
    private String email;

}
