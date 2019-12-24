package com.syntax.class3;

public class IsButtonDisplayed {

	public static void main(String[] args) {
		/*
		 * Verify if button is displayed on the page if button is displayed then we need
		 * to verify text on if text equal to sign in --> Test case pass otherwise -->
		 * Wrong text is displayed
		 */
		boolean isDisplayed = true;
		String buttonText = "Sign In";

		if (isDisplayed) {
			System.out.println("Button is displayed");
			if (buttonText.equals("Sign In")) {
				System.out.println("Test case pass");
			} else {
				System.out.println("Wrong text is displayed");
			}
		} else {
			System.out.println("Button is not displayed");
		}

	}
}
