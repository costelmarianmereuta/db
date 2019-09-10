package mm.db.service;

import mm.db.model.Telephone;
import mm.db.repository.TelephoneRepository;
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
public class TelephoneServiceTest {

    @Mock
    private TelephoneRepository telephoneRepository;
    @InjectMocks
    private TelephoneService telephoneService;

    @Test
    public void getTelephones() {
        List<Telephone> telephones = Arrays.asList(Telephone.builder().id(1).marque("samsung").model("s10").build(), Telephone.builder().id(1).marque("iphone").model("10").build());
        when(telephoneRepository.findAll()).thenReturn(telephones);
        List<Telephone> telephonesExpected = telephoneService.getTelephones();

        assertThat(telephonesExpected.size()).isEqualTo(2);
        assertThat(telephonesExpected.get(0).getId()).isEqualTo(1);
        assertThat(telephonesExpected.get(0).getMarque()).isEqualTo("samsung");
        assertThat(telephonesExpected.get(0).getModel()).isEqualTo("s10");
    }
}