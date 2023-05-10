package pl.sda.OrangeJavaPL2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pl.sda.OrangeJavaPL2.repository.AddressRepository;

@Service // = @Component = @Repository = @Bean
//@Scope(value = "prototype") // changing default scope of bean
public class DependencyInjectionExample {
//    IoC Container -> beany
//  Dependency injection explanation


//    3 types of DI
//    @Autowired // DI by field
//    AddressRepository addressRepository;
//
//    @Autowired // DI by constructor
//    public DependencyInjectionExample(AddressRepository addressRepository) {
//        this.addressRepository = addressRepository;
//    }
//
//    @Autowired // DI by setter
//    public void setAddressRepository(AddressRepository addressRepository) {
//        this.addressRepository = addressRepository;
//    }
}