package com.lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserValidationTest {

        @Test
        public void firstNameIsValid() {
            UserValidator userValidator = new UserValidator();
            boolean result = true;
            result = userValidator.firstNameIsValid.validate("Sharad");
            Assertions.assertTrue(result);
        }
        @Test
        public void firstNameIsInValid() {
            UserValidator userValidator = new UserValidator();
            boolean result = false;
            result = userValidator.firstNameIsInValid.validate("sharad");
            Assertions.assertFalse(result);
        }
        @Test
        public void lastNameIsValid() {
            UserValidator userValidator = new UserValidator();
            boolean result = true;
            result = userValidator.lastNameIsValid.validate("Patil");
            Assertions.assertTrue(result);
        }
        @Test
        public void lastNameIsInValid() {
            UserValidator userValidator = new UserValidator();
            boolean result = false;
            result = userValidator.lastNameIsInValid.validate("P@til");
            Assertions.assertFalse(result);
        }
        @Test
        public void emailIsValid() {
            UserValidator userValidator = new UserValidator();
            boolean result = true;
            result = userValidator.emailIsValid.validate("Patil@98gmail.com");
            Assertions.assertTrue(result);
        }
        @Test
        public void emailIsInValid() {
            UserValidator userValidator = new UserValidator();
            boolean result = false;
            result = userValidator.emailIsInValid.validate("Sa@.add.");
            Assertions.assertFalse(result);
        }
        @Test
        public void mobileNumberIsValid() {
            UserValidator userValidator = new UserValidator();
            boolean result = true;
            result = userValidator.mobileNumberIsValid.validate("91 9096549959");
            Assertions.assertTrue(result);
        }
        @Test
        public void mobileNumberIsInValid() {
            UserValidator userValidator = new UserValidator();
            boolean result = false;
            result = userValidator.mobileNumberIsInValid.validate("56987786886867");
            Assertions.assertFalse(result);
        }
        @Test
        public void passwordIsValid() {
            UserValidator userValidator = new UserValidator();
            boolean result = true;
            result = userValidator.passwordIsValid.validate("sharadpatil");
            Assertions.assertTrue(result);
        }
        @Test
        public void passwordIsInValid() {
            UserValidator userValidator = new UserValidator();
            boolean result = false;
            result = userValidator.passwordIsInValid.validate("sharad");
            Assertions.assertFalse(result);
        }
        @Test
        public void passwordIsValidSecond() {
            UserValidator userValidator = new UserValidator();
            boolean result = true;
            result = userValidator.passwordIsValidSecond.validate("Sharad@1998");
            Assertions.assertTrue(result);
        }
        @Test
        public void passwordIsInValidSecond() {
            UserValidator userValidator = new UserValidator();
            boolean result = false;
            result = userValidator.passwordIsInValidSecond.validate("Sharad45697");
            Assertions.assertFalse(result);
        }
        @Test
        public void passwordIsValidThree() {
            UserValidator userValidator = new UserValidator();
            boolean result = true;
            result = userValidator.passwordIsValidThree.validate("Sharad@1998");
            Assertions.assertTrue(result);
        }
        @Test
        public void passwordIsInValidThree() {
            UserValidator userValidator = new UserValidator();
            boolean result = false;
            result = userValidator.passwordIsInValidThree.validate("P@til");
            Assertions.assertFalse(result);
        }
        @Test
        public void passwordIsValidForth() {
            UserValidator userValidator = new UserValidator();
            boolean result = true;
            result = userValidator.passwordIsValidForth.validate("Sharad@1998");
            Assertions.assertTrue(result);
        }
        @Test
        public void passwordIsInValidForth() {
            UserValidator userValidator = new UserValidator();
            boolean result = false;
            result = userValidator.passwordIsInValidForth.validate("P@til");
            Assertions.assertFalse(result);
        }

    }