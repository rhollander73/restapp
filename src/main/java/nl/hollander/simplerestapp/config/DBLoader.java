package nl.hollander.simplerestapp.config;

import lombok.RequiredArgsConstructor;
import nl.hollander.simplerestapp.models.ContactPerson;
import nl.hollander.simplerestapp.models.ProductInstallation;
import nl.hollander.simplerestapp.repositories.ContactPersonRepository;
import nl.hollander.simplerestapp.repositories.ProductInstallationRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class DBLoader implements ApplicationRunner {

    private final ContactPersonRepository contactPersonRepository;
    private final ProductInstallationRepository productInstallationRepository;

    @Override
    public void run(ApplicationArguments args) {
        ContactPerson contactPerson = new ContactPerson();
        contactPerson.setName("Jansen");
        contactPerson.setNumber("38");
        contactPerson.setZipCode("3811 EX");
        contactPerson.setCity("Arnhem");

        contactPersonRepository.save(contactPerson);

        ProductInstallation productInstallation1 = new ProductInstallation();
        productInstallation1.setContactPerson(contactPerson);
        productInstallation1.setName("Power 1");
        productInstallation1.setOutPower(new BigDecimal("1111.1111"));

        productInstallationRepository.save(productInstallation1);

        ProductInstallation productInstallation2 = new ProductInstallation();
        productInstallation2.setContactPerson(contactPerson);
        productInstallation2.setName("Power 2");
        productInstallation2.setOutPower(new BigDecimal("2222.2222"));

        productInstallationRepository.save(productInstallation2);
    }
}
