package pl.sda.OrangeJavaPL2.dataInitializer;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.OrangeJavaPL2.entity.Address;
import pl.sda.OrangeJavaPL2.repository.AddressRepository;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class AddressInitializer {

    private final AddressRepository addressRepository;

    @PostConstruct
    public void initAddresses(){
        Address address = new Address("Pilsudzkiego", "10", "10-100", "Polska");
        Address address1 = new Address("Mickiewicza", "12", "10-110", "Polska");

        addressRepository.addAddress(address);
        addressRepository.addAddress(address1);
    }
}