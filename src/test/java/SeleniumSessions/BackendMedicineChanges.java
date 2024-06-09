package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackendMedicineChanges {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://backend.uat.meddo.in/medicines/medicine/add-medicine-at-uncover");
		
	}

}
