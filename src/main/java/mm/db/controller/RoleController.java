package mm.db.controller;

import mm.db.model.Role;
import mm.db.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    private RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @RequestMapping("/roles")
    public List<Role> getRoles(){
        return roleService.getRoles();
    }
}
