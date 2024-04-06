package com.example.TP33;

import com.example.TP33.Entities.Patient;
import com.example.TP33.Repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class TP33Application {

    public static void main(String[] args) {
        SpringApplication.run(TP33Application.class, args);
    }

    @Bean
    CommandLineRunner start(PatientRepository patientRepository){
        return args -> {
            // Création de quelques patients et sauvegarde dans la base de données
            patientRepository.save(new Patient(null, "Hassan", new Date(), false, 120));
            patientRepository.save(new Patient(null, "Wahid", new Date(), false, 122));
            patientRepository.save(new Patient(null, "Karim", new Date(), false, 123));
        };
    }
}
