package com.lambda;

import java.util.regex.Pattern;

@FunctionalInterface
    interface UserRegistrationSystem {
        boolean validate(String s);
    }
    class UserValidator {
        private static String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
        final String EMAIL_PATTERN = "^[a-zA-Z0-9]+(([\\.+-][a-z0-9]{1,})?)+@(?:[a-zA-Z0-9])+\\.[a-zA-Z]{2,4}+((\\.[a-z]{2,4})?)$";
        final String MOBILE_PATTERN = "[91]+[s]+[0-9]{10}";
        final String PASSWORD1_PATTERN = "[a-z A-Z 0-9]{8,}";
        final String PASSWORD2_PATTERN = "(?=.*?[A-Z])[a-z A-Z 0-9]{8,}";
        final String PASSWORD3_PATTERN = "(?=.?[A-Z])(?=.?[0-9])[a-z A-Z 0-9]{8,}";
        final String PASSWORD4_PATTERN = "^(?=.[a-z])(?=.[A-Z])(?=.\\d)(?=.[@$!%?&])[A-Za-z\\d@$!%?&]{8,10}$";

        //used lambda fuction
        UserRegistrationSystem firstNameIsValid = (s) -> (Pattern.compile(NAME_PATTERN).matcher(s).matches());
        UserRegistrationSystem firstNameIsInValid = (s) -> (Pattern.compile(NAME_PATTERN).matcher(s).matches());
        UserRegistrationSystem lastNameIsValid = (s) -> (Pattern.compile(NAME_PATTERN).matcher(s).matches());
        UserRegistrationSystem lastNameIsInValid = (s) -> (Pattern.compile(NAME_PATTERN).matcher(s).matches());
        UserRegistrationSystem emailIsValid = (s) -> (Pattern.compile(EMAIL_PATTERN).matcher(s).matches());
        UserRegistrationSystem emailIsInValid = (s) -> (Pattern.compile(EMAIL_PATTERN).matcher(s).matches());
        UserRegistrationSystem mobileNumberIsValid = (s) -> (Pattern.compile(MOBILE_PATTERN).matcher(s).matches());
        UserRegistrationSystem mobileNumberIsInValid = (s) -> (Pattern.compile(MOBILE_PATTERN).matcher(s).matches());
        UserRegistrationSystem passwordIsValid = (s) -> (Pattern.compile(PASSWORD1_PATTERN).matcher(s).matches());
        UserRegistrationSystem passwordIsInValid = (s) -> (Pattern.compile(PASSWORD1_PATTERN).matcher(s).matches());
        UserRegistrationSystem passwordIsValidSecond = (s) -> (Pattern.compile(PASSWORD2_PATTERN).matcher(s).matches());
        UserRegistrationSystem passwordIsInValidSecond = (s) -> (Pattern.compile(PASSWORD2_PATTERN).matcher(s).matches());
        UserRegistrationSystem passwordIsValidThree = (s) -> (Pattern.compile(PASSWORD3_PATTERN).matcher(s).matches());
        UserRegistrationSystem passwordIsInValidThree = (s) -> (Pattern.compile(PASSWORD3_PATTERN).matcher(s).matches());
        UserRegistrationSystem passwordIsValidForth = (s) -> (Pattern.compile(PASSWORD4_PATTERN).matcher(s).matches());
        UserRegistrationSystem passwordIsInValidForth = (s) -> (Pattern.compile(PASSWORD4_PATTERN).matcher(s).matches());
    }