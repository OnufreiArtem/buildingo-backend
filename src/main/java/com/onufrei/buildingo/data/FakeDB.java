package com.onufrei.buildingo.data;

import com.onufrei.buildingo.model.Employee;
import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
 * The representation of the object of FakeDB
 *
 * @author Artem Onufrei
 * @version 1
 * @since 03.03.2021
 */

@Component
public class FakeDB {
    public List<Employee> employees = new ArrayList<>(
            Arrays.asList(
                    Employee.builder()
                            .id("0")
                            .name("John")
                            .surname("McClean")
                            .phoneNumber(generatePhoneNumber())
                            .email("mcclean@mail.com")
                            .homeAddress("USA")
                            .resumeUrl("URL")
                            .dateOfBirth(randomDate(30, 40))
                            .hireDate(randomDate(5, 10))
                            .firedDate(randomDate(2, 5))
                            .specification(null)
                            .created_at(LocalDateTime.now())
                            .modified_at(LocalDateTime.now())
                            .build(),

                    Employee.builder()
                            .id("1")
                            .name("Bill")
                            .surname("Gates")
                            .phoneNumber(generatePhoneNumber())
                            .email("gates@mail.com")
                            .homeAddress("USA")
                            .resumeUrl("URL")
                            .dateOfBirth(randomDate(30, 40))
                            .hireDate(randomDate(5, 10))
                            .firedDate(randomDate(2, 5))
                            .specification(null)
                            .created_at(LocalDateTime.now())
                            .modified_at(LocalDateTime.now())
                            .build(),

                    Employee.builder()
                            .id("2")
                            .name("Mark")
                            .surname("Zuckerberg")
                            .phoneNumber(generatePhoneNumber())
                            .email("zuckerberg@mail.com")
                            .homeAddress("USA")
                            .resumeUrl("URL")
                            .dateOfBirth(randomDate(30, 40))
                            .hireDate(randomDate(5, 10))
                            .firedDate(randomDate(2, 5))
                            .specification(null)
                            .created_at(LocalDateTime.now())
                            .modified_at(LocalDateTime.now())
                            .build(),

                    Employee.builder()
                            .id("3")
                            .name("Phil")
                            .surname("Spencer")
                            .phoneNumber(generatePhoneNumber())
                            .email("spencer@mail.com")
                            .homeAddress("USA")
                            .resumeUrl("URL")
                            .dateOfBirth(randomDate(30, 40))
                            .hireDate(randomDate(5, 10))
                            .firedDate(randomDate(2, 5))
                            .specification(null)
                            .created_at(LocalDateTime.now())
                            .modified_at(LocalDateTime.now())
                            .build(),

                    Employee.builder()
                            .id("4")
                            .name("Elon")
                            .surname("Musk")
                            .phoneNumber(generatePhoneNumber())
                            .email("musk@mail.com")
                            .homeAddress("USA")
                            .resumeUrl("URL")
                            .dateOfBirth(randomDate(30, 40))
                            .hireDate(randomDate(5, 10))
                            .firedDate(randomDate(2, 5))
                            .specification(null)
                            .created_at(LocalDateTime.now())
                            .modified_at(LocalDateTime.now())
                            .build()
            )
    );



    private String generatePhoneNumber() {
        Random random = new Random();

        String ending = String.valueOf(Integer.valueOf(random.nextInt(9000000) + 1000000));

        return "+38095" + ending;
    }

    private LocalDate randomDate(int fromYears, int toYears) {
        LocalDate localDate = LocalDate.now();
        Random random = new Random();

        localDate = localDate.minusDays((long) (random.nextInt(365 * (toYears-fromYears)) + 365 * fromYears));

        return localDate;
    }


}
