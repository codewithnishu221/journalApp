package com.nc.journalApp.service;

import com.nc.journalApp.entity.User;
import com.nc.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private  UserRepository userRepository;

    @Autowired
    private UserService userService;



    @Disabled
    @ParameterizedTest // add parameters into test methods
     @ArgumentsSource(UserArgumentsProvider.class) // used the test paramaters values
    public void testSaveNewUser(User user){
     assertTrue(userService.saveNewUser(user));
    }









    @Disabled // used for diabled the test method
    @ParameterizedTest // add parameters into test methods
    @CsvSource({
            "NSk",
            "Nkv",
            "test2"
    }) // used the test paramaters values
    public void testFindByUserName(String name){
        assertNotNull(userRepository.findByUserName(name));
    }
}
