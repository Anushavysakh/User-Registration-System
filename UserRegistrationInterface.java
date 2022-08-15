package com.day19assignment.bridgelabz;

@FunctionalInterface
public interface UserRegistrationInterface {

	  public abstract boolean userEntries(String value) throws InvalidUserInputException;
}
