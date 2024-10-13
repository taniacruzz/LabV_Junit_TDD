package com.exemplo.person;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class PersonDAOTest {

    @Test
    public void testNomeInvalido() {
        Person p = new Person(1, "Joao", 30, Arrays.asList(new Email(1, "email@dominio.com")));
        PersonDAO dao = new PersonDAO();
        List<String> errors = dao.isValidToInclude(p);
        assertTrue(errors.contains("O nome deve conter pelo menos duas partes."));
    }

    @Test
    public void testIdadeInvalida() {
        Person p = new Person(1, "Joao Silva", 0, Arrays.asList(new Email(1, "email@dominio.com")));
        PersonDAO dao = new PersonDAO();
        List<String> errors = dao.isValidToInclude(p);
        assertTrue(errors.contains("A idade deve estar entre 1 e 200."));
    }

    @Test
    public void testEmailInvalido() {
        Person p = new Person(1, "Joao Silva", 30, Arrays.asList(new Email(1, "emailinvalido")));
        PersonDAO dao = new PersonDAO();
        List<String> errors = dao.isValidToInclude(p);
        assertTrue(errors.contains("O email emailinvalido é inválido."));
    }

    @Test
    public void testSemEmail() {
        Person p = new Person(1, "Joao Silva", 30, null);
        PersonDAO dao = new PersonDAO();
        List<String> errors = dao.isValidToInclude(p);
        assertTrue(errors.contains("A pessoa deve ter pelo menos um email."));
    }

    @Test
    public void testValido() {
        Person p = new Person(1, "Joao Silva", 30, Arrays.asList(new Email(1, "email@dominio.com")));
        PersonDAO dao = new PersonDAO();
        List<String> errors = dao.isValidToInclude(p);
        assertTrue(errors.isEmpty());
    }
}
