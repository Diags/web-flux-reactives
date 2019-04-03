package agixis.client.app.webfluxreactive.ws;

import agixis.client.app.webfluxreactive.dao.SocieteRepo;
import agixis.client.app.webfluxreactive.dao.TransactionRepo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebMVCController {
    private SocieteRepo societeRepository;
    private TransactionRepo transactionRepository;

    public WebMVCController(SocieteRepo societeRepository, TransactionRepo transactionRepository) {
        this.societeRepository = societeRepository;
        this.transactionRepository = transactionRepository;
    }
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("societes",societeRepository.findAll());
        return "index";
    }
}
