package agixis.client.app.webfluxreactive.dao;

import agixis.client.app.webfluxreactive.entities.Societe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SocieteRepo  extends ReactiveMongoRepository<Societe, String> {
}
