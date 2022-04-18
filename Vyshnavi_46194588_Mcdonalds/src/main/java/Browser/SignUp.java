package Browser;



import org.openqa.selenium.By;



public class SignUp extends Browser{
static By SignUp=By.xpath("//*[@id=\"headerComp\"]/div/div[2]/div[2]/div[2]");
static By log=By.xpath("//*[@id=\"headerComp\"]/div/div[2]/div[2]/div[2]");
static By num=By.xpath("//*[@id=\"mobile-emailid\"]");
static By otp=By.xpath("/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div[1]/label");
static By cont=By.xpath("/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div[3]/button");
//static By otpfield=By.xpath("/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div[2]/input");//
static By name=By.xpath("/html/body/ngb-modal-window/div/div/app-register-view-modal/div/div/form/div[4]/input");
static By pwd=By.xpath("/html/body/ngb-modal-window/div/div/app-register-view-modal/div/div/form/div[5]/input");
static By signup=By.xpath("/html/body/ngb-modal-window/div/div/app-register-view-modal/div/div/form/div[7]/button");

public static void login() throws Exception {



driver.findElement(log).click();
Thread.sleep(2000);
}
public static void Number() throws Exception {
driver.findElement(num).sendKeys("9440374987");
Thread.sleep(2000);
}
public static void Otpmethod() throws Exception {
driver.findElement(otp).click();
Thread.sleep(20000);
}
/*public static void clickOtp() throws Exception {
driver.findElement(otpfield).sendKeys("6204");
Thread.sleep(2000);
}*/
public static void continuemethod() throws Exception {
driver.findElement(cont).click();
Thread.sleep(2000);
}
public static void Name() throws Exception {
driver.findElement(name).sendKeys("Ishu");
Thread.sleep(2000);



}
public static void setpassword() throws Exception {
driver.findElement(pwd).sendKeys("Vyshu@78");
Thread.sleep(2000);
}

public static void SignUpmethod() {
driver.findElement(signup).click();
}



}

