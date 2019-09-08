package mm.db.service;


import mm.db.model.Telephone;
import mm.db.repository.TelephoneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelephoneService {

   private TelephoneRepository telephoneRepository;

    public TelephoneService(TelephoneRepository telephoneRepository) {
        this.telephoneRepository = telephoneRepository;
    }

   public List<Telephone> getTelephones(){
        return telephoneRepository.findAll();
   }
}
