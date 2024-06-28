package br.com.owlcat.springboot_kafka_tutorial.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    @Override
    public String toString() {
        return "User {id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ";, email=" + email + "}";
    }

}
