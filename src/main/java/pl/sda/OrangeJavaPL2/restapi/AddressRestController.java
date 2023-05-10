package pl.sda.OrangeJavaPL2.restapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.sda.OrangeJavaPL2.entity.Address;
import pl.sda.OrangeJavaPL2.repository.AddressRepository;
import pl.sda.OrangeJavaPL2.service.AddressService;

import java.util.Set;

@RestController
@RequestMapping(path = "/api")
@RequiredArgsConstructor
public class AddressRestController {

    private final AddressService addressService;

    @GetMapping(path = "/addresses")
    public Set<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }

    @GetMapping(path = "/addresses/{id}")
    public Address getAllAddresses(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    @PostMapping (path = "/addresses")
    public void addAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }
/*
api/addresses -> Post - add resources, Get - get all resources
 */
}