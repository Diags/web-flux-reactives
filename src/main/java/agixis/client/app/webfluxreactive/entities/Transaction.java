package agixis.client.app.webfluxreactive.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
@Document
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Transaction {
    @Id
    private String id;
    private Instant instant;
    private double price;
    // instancier  une reference qui sera stocker dans une autre collection qui
    //est different d'un document embarquer ou imbriquer
    @DBRef
    private Societe societe;

}
