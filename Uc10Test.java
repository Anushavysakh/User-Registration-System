package com.day19assignment.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Uc10Test {

	Uc10 obj = new Uc10();

    //Starts First Name Test Cases
    @Test
    public void givenFirstName_whenValid_ReturnHappy() throws Exception {
        String validationResult = obj.validateFirstName("Anusha");
        Assertions.assertEquals("HAPPY", validationResult);

    }

    @Test
    public void givenFirstName_whenLessThanThreeLetters_ReturnSad() throws Exception{
        try {
            String validationResult = obj.validateFirstName("Aj");
        }catch (Exception e) {
            Assertions.assertEquals("Invalid Input", e.getMessage());
        }
    }

    @Test
    public void givenFirstName_whenFirstLetterNotCaps_ReturnSad() throws Exception{
        try {
            String validationResult = obj.validateFirstName("anusha");
        }catch (Exception e) {
            Assertions.assertEquals("Invalid Input", e.getMessage());
        }
    }

    //Starts Last Name Use Cases
    @Test
    public void givenLastName_whenValid_ReturnHappy() throws Exception {
        String validationResult = obj.validateLastName("Ajith");
        Assertions.assertEquals("HAPPY", validationResult);
    }

    @Test
    public void givenLastName_whenLessThanThreeLetters_ReturnSad() throws Exception {
        try {
            String validationResult = obj.validateLastName("Aj");
        }catch (Exception e){
            Assertions.assertEquals("Invalid Input", e.getMessage());
        }
    }

    @Test
    public void givenLastName_whenFirstLetterNotCaps_ReturnSad() throws Exception {
        try {
            String validationResult = obj.validateLastName("ajith");
        }catch (Exception e) {
            Assertions.assertEquals("Invalid Input", e.getMessage());
        }
    }

    //Starts Email Test Cases
    @Test
    public void givenEmail_whenValid_ReturnHappy() throws Exception {
        String validationResult = obj.validateEmail("ajithanu606@gmail.com");
        Assertions.assertEquals("HAPPY", validationResult);
    }

    @Test
    public void givenEmail_whenStartsWithSpecialChar_ReturnSad() throws Exception{
        try {
            String validationResult = obj.validateEmail("-ajith@gmail.com");
        }catch (Exception e){
            Assertions.assertEquals("Invalid Input", e.getMessage());
        }
    }

    @Test
    public void givenEmail_whenAtTheRateIsNotGiven_ReturnSad() throws Exception{
        try {
            String validationResult = obj.validateEmail("ajithanu60614gmail.com");
        }catch (Exception e){
            Assertions.assertEquals("Invalid Input", e.getMessage());
        }
    }

    @Test
    public void givenEmail_whenTLDIsNotGiven_ReturnSad() throws Exception{
        try {
            String validationResult = obj.validateEmail("aa@7214@gmail");
        }catch (Exception e){
            Assertions.assertEquals("Invalid Input", e.getMessage());
        }
    }

    @Test
    public void givenEmail_whenTwoSpecialCharsAreUsedConsecutively_ReturnSad() throws Exception{
        try{
            String validationResult = obj.validateEmail("vysakh-.ajith@gmail.com");
        }catch (Exception e){
            Assertions.assertEquals("Invalid Input", e.getMessage());
        }
    }

    //Starts Phone Number Test Cases
    @Test
    public void givenPhoneNumber_whenValid_ReturnHappy() throws Exception{
        String validationResult = obj.validateMobNum("91 7760434862");
        Assertions.assertEquals("HAPPY", validationResult);
    }

    @Test
    public void givenPhoneNumber_whenSpaceAfterCountryNotGiven_ReturnSad() throws Exception{
        try{
            String validationResult = obj.validateMobNum("917760434862");
        }catch (Exception e){
            Assertions.assertEquals("Invalid Input", e.getMessage());
        }
    }

    @Test
    public void givenPhoneNumber_whenPhoneNumberLengthIsMoreThanTen_ReturnSad() throws Exception{
        try {
            String validationResult = obj.validateMobNum("91 77604348622");
        }catch (Exception e){
            Assertions.assertEquals("Invalid Input", e.getMessage());
        }
    }

    @Test
    public void givenPhoneNumber_whenCountryCodeIsNotGiven_ReturnSad() throws Exception{
        try {
            String validationResult = obj.validateMobNum(" 7760434862");
        }catch (Exception e) {
            Assertions.assertEquals("Invalid Input", e.getMessage());
        }
    }

    //Starts Password Test Cases
    @Test
    public void givenPassword_whenValid_ReturnHappy() throws Exception{
        String validationResult = obj.validatePassword("vA@shS@anuvy46");
        Assertions.assertEquals("HAPPY", validationResult);
    }

    @Test
    public void givenPassword_whenNoNumberIsGiven_ReturnSad() throws Exception{
        try {
            String validationResult = obj.validatePassword("vA@shS@anuvy");
        }catch (Exception e) {
            Assertions.assertEquals("Invalid Input", e.getMessage());
        }
    }

    @Test
    public void givenPassword_whenNoSpecialCharIsGiven_ReturnSad() throws Exception{
        try{
            String validationResult = obj.validatePassword("vAshSanuvy46");
        }catch (Exception e) {
            Assertions.assertEquals("Invalid Input", e.getMessage());
        }
    }

    @Test
    public void givenPassword_whenNoCapitalCharIsGiven_ReturnSad() throws Exception{
        try {
            String validationResult = obj.validatePassword("v@shS@anuvy466");
        }catch (Exception e) {
            Assertions.assertEquals("Invalid Input", e.getMessage());
        }
    }

    @Test
    public void givenPassword_whenLengthIsLessThanEight_ReturnSad() throws Exception{
        try {
            String validationResult = obj.validatePassword("anvy$1A");
        }catch (Exception e) {
            Assertions.assertEquals("Invalid Input", e.getMessage());
        }
    }

}