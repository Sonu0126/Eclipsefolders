package one;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		WebElement roundTripButton = driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		roundTripButton.click();
		WebElement fromCity = driver.findElement(By.xpath("//input[@id='fromCity']"));
		fromCity.click();
		WebElement fromLocation = driver.findElement(By.xpath("//input[@placeholder='From']"));
		fromLocation.sendKeys("San Fransisco");
		WebElement visitingFrom = driver
				.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-1\"]/div"));
		visitingFrom.click();

		// Enter the destination city
		WebElement toCity = driver.findElement(By.xpath("//input[@id='toCity']"));
		toCity.click();
		WebElement toLocation = driver.findElement(By.xpath("//input[@placeholder='To']"));
		toLocation.sendKeys("Pune");
		WebElement visitingTo = driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]"));
		visitingTo.click();

		// Selecting the departure date
		WebElement depaturedate = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/label/span"));
		depaturedate.click();
		WebElement selectDepartureDate = driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[7]/div/p[1]"));
		selectDepartureDate.click();

		Thread.sleep(2000);
		// ArrivalDate
		WebElement arrivalDateInput = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[4]/label/span"));
		arrivalDateInput.click();
		Thread.sleep(2000);
		WebElement selectArrivalDate = driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/div[6]/div"));
		selectArrivalDate.click();
	
        //Select
		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/p/a"));
        searchButton.click();

	}

}
