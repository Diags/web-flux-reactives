package agixis.client.app.webfluxreactive.ws;

import agixis.client.app.webfluxreactive.dao.SocieteRepo;
import agixis.client.app.webfluxreactive.entities.Societe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class SocieteReativRestControler {
    @Autowired
    private SocieteRepo societeRepo;
    @GetMapping(value = "/societes")
    public Flux<Societe> findAll(){
        return societeRepo.findAll();
    }
    @GetMapping(value = "/societes/{id}")
    public Mono<Societe> getOne(@PathVariable String id){
        return societeRepo.findById(id);
    }
    @PostMapping("/societes")
    public Mono<Societe> save(@RequestBody Societe societe){
        return societeRepo.save(societe);
    }
    @DeleteMapping(value = "/societes/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return societeRepo.deleteById(id);
    }
    @PutMapping("/societes/{id}")
    public Mono<Societe> update(@RequestBody Societe societe, @PathVariable String id){
        societe.setId(id);
        return societeRepo.save(societe);
    }

}