package Week1.day2;

public class browser {
	// Method launch browser
	public String launchBrowser(String browserName) {
		return browserName;
	}

	// Method loadUrl
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

	// Main Method to call the Methods
	public static void main(String[] args) {
		// Creating Object
		browser BR = new browser();
		// Calling Methods
		System.out.println(BR.launchBrowser("Browser launched successfully"));
		BR.loadUrl();
	}
}
