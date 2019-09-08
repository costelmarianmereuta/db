package mm.db.controller;

import mm.db.model.Telephone;
import mm.db.model.User;
import mm.db.service.TelephoneService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TelephoneController {

private TelephoneService telephoneService;

    public TelephoneController(TelephoneService telephoneService) {
        this.telephoneService = telephoneService;
    }

    @GetMapping("/telephones")
    public List<Telephone>getTelephones(){
        List<Telephone> telephones = telephoneService.getTelephones();
        telephones.get(0);

        return telephones;
    }


}
