package mm.db.service;

import mm.db.model.Role;
import mm.db.repository.RoleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class RoleServiceTest {


    @Mock
    private RoleRepository roleRepository;

    @InjectMocks
    private RoleService roleService;

    @Test
    public void getRoles_shouldReturnRoles(){

        List<Role> roles = Arrays.asList(Role.builder().id(1).role("Admin").build(), Role.builder().id(2).role("User").build());
        when(roleRepository.findAll()).thenReturn(roles);
        List<Role> rolesExpected = roleService.getRoles();
        assertThat(rolesExpected.size()).isEqualTo(2);
        assertThat(rolesExpected.get(0).getId()).isEqualTo(1);
        assertThat(rolesExpected.get(0).getRole()).isEqualTo("Admin");
    }
}