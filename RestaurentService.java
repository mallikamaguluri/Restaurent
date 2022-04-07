
package net.codejava;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class RestaurentService {
    @Autowired
    private Repository repo;
    public List<ReataurentDetais> listAll() {
        return repo.findAll();
    }

    public void save(Name name) {
        repo.save(Restaurent);
    }

    public Restaurent get(long id) {
        return repo.findById(id).get();
    }


}