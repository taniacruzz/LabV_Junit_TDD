package com.exemplo.person;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    public List<String> isValidToInclude(Person p) {
        List<String> errors = new ArrayList<>();

        // Validação do nome
        if (p.getName() == null || p.getName().split(" ").length < 2) {
            errors.add("O nome deve conter pelo menos duas partes.");
        } else if (!p.getName().matches("[a-zA-Z ]+")) {
            errors.add("O nome deve conter apenas letras.");
        }

        // Validação da idade
        if (p.getAge() < 1 || p.getAge() > 200) {
            errors.add("A idade deve estar entre 1 e 200.");
        }

        // Validação dos emails
        List<Email> emails = p.getEmails();
        if (emails == null || emails.isEmpty()) {
            errors.add("A pessoa deve ter pelo menos um email.");
        } else {
            for (Email email : emails) {
                if (!email.getName().matches(".+@.+\\..+")) {
                    errors.add("O email " + email.getName() + " é inválido.");
                }
            }
        }

        return errors;
    }
}
