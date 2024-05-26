package clubMateClub.backend.controller;

import clubMateClub.backend.model.Seller;
import clubMateClub.backend.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("seller")
@CrossOrigin
public class SellerController {

    @Autowired
    SellerRepository sellerRepository;

    @PostMapping("")
    public Seller createSeller(@RequestBody Seller seller) {
        return sellerRepository.save(seller);
    }

    @GetMapping("")
    public Iterable<Seller> getAllSellers() {
        return sellerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Seller> getSellerById(@PathVariable Long id) {
        return sellerRepository.findById(id);
    }

    @PutMapping("/{id}")
    public Seller updateSeller(@PathVariable Long id, @RequestBody Seller seller) {
        seller.setId(id);
        return sellerRepository.save(seller);
    }

    @DeleteMapping("/{id}")
    public void deleteSeller(@PathVariable Long id) {
        sellerRepository.deleteById(id);
    }

}
