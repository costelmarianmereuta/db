package mm.db.service;

import mm.db.model.Telephone;
import mm.db.model.User;
import mm.db.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserService userService;

    @Test
    public void userWhoHavePhoneMarque() {

        List<User> users = Collections.singletonList(User.builder().id(1).email("test@mail.com").nom("mereuta").prenom("marian").telephone(Telephone.builder().id(1).marque("nokia").model("3310").build()).build());
        when(userRepository.findByTelephone_Marque("nokia")).thenReturn(users);
        List<User> phonesExpected = userService.UserWhoHavePhoneMarque("nokia");
        assertThat(phonesExpected.size()).isEqualTo(1);
        assertThat(phonesExpected.get(0).getEmail()).isEqualTo("test@mail.com");

    }
}