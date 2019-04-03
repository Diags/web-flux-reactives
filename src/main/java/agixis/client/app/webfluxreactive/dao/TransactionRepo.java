package agixis.client.app.webfluxreactive.dao;

import agixis.client.app.webfluxreactive.entities.Societe;
import agixis.client.app.webfluxreactive.entities.Transaction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransactionRepo extends ReactiveMongoRepository<Transaction,String> {
    Flux<Transaction> findBySociete(Societe soc);
}
