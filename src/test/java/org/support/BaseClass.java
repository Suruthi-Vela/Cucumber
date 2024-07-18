package org.support;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class BaseClass{
	public static WebDriver driver;
	public static Actions a;
	public static Select s;
	public static Robot r;
	public static Alert al;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;
	public static Date d;
	//1-Chrome
	public static void ChromeLaunch() {
		driver= new ChromeDriver();
	}
	//2-FireFox
	public static void FirefoxLaunch() {
		driver= new FirefoxDriver();
	}
	//3-Edge
	public static void EdgeLaunch()
	{
		driver=new EdgeDriver();
	}
	//4-maximize
	public static void maxwindow()
	{
		driver.manage().window().maximize();
	}
	//5-size
	public static void dimension()
	{
		driver.manage().window().setSize(new Dimension(400, 650));
	}
	//6-Position
	public static void position()
	{
		driver.manage().window().setPosition(new Point(100, 250));
	}
	//7-get
	public static void launchUrl(String url)
	{
		driver.get(url);
	}
	//8-getTitle
	public static void printTitle()
	{
		String title = driver.getTitle();
		System.out.println("The title\t:"+title);
	}
	//9-getCurrentUrl
	public static void printurl()
	{
		String url= driver.getCurrentUrl();
		System.out.println("The URL\t\t:"+url);
	}
	//10-getPageSource
	public static void pagesrc()
	{
		String pagesrc =driver.getPageSource();
		System.out.println("The PageSource\t:"+pagesrc);
	}
	//11-getWindowHandle
	public static void winHandle() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}
	//12-getWindowHandles
	public static void winHandles()
	{
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
	}
	//13-close
	public static void closeBrowser()
	{
		driver.close();
	}
	//14-quit
	public static void quitBrowser()
	{
		driver.quit();
	}
	//15-sendKeys
	public static void filltextBox(WebElement element, String text)
	{
		element.sendKeys(text);
	}
	//16-thread
	public static void waitTime(int time) throws InterruptedException
	{
		Thread.sleep(time);
	}
	//17-click
	public static void buttonClk(WebElement btnclk)
	{
		btnclk.click();
	}
	//18-getAttribute
	public static String printInputValue(WebElement attrib)
	{	
		String attribute = attrib.getAttribute("value");
		return attribute;
	}
	//19-getText
	public static void buttonName(WebElement txt)
	{
		String text = txt.getText();
		System.out.println("Button Name :"+text);
	}
	//20-getTagName
	public static void tagName(WebElement name)
	{
		String tagName = name.getTagName();
		System.out.println("Tagname\t:"+tagName);
	}
	//21-isDisplayed
	public static void textCheck(WebElement txt)
	{
		boolean logo=txt.isDisplayed();
		String text = txt.getText();
		if(logo==true)
		{
			System.out.println(text+" is displayed");
		}
		else
		{
			System.out.println(text+" not displayed");
		}
	}//22-isEnabled
	public static void textboxCheck(WebElement txtbox)
	{
		boolean check=txtbox.isEnabled();
		if(check==true)
		{
			System.out.println("The textbox is enabled to print");
		}
		else
		{
			System.out.println("The textbox is disabled to print");
		}
	}
	//23-isSelected
	public static void BtnClkStatus(WebElement radio)
	{
		if(radio.isSelected())
		{
			System.out.println("The option is selected");
		}
		else
		{
			System.out.println("Option Not selected");
		}
	}
	//24-isMultiple
	public static void multipleSelect(WebElement multi)
	{
		s= new Select(multi);
		if (s.isMultiple()) {
			System.out.println("It has multiple Selections");
		} else {
			System.out.println("Only one selection allowed");
		}
	}
	//25-getOptions
	public static void allOptions(WebElement opt)
	{
		s= new Select(opt);
		List<WebElement> o=s.getOptions();
		for (WebElement x : o) {
			String options = x.getAttribute("value");
			System.out.println(options);
		}
	}
	//26-getAllSelectedOptions
	public static void printSelection(WebElement print)
	{
		s= new Select(print);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement x : allSelectedOptions) {
			String selected = x.getText();
			System.out.println(selected);
		}
	}
	//27-moveToElement
	public static void movetotheElement(WebElement ele)
	{
		a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	//28-dragAndDrop
	public static void dragDrop(WebElement src, WebElement des)
	{
		a.dragAndDrop(src, des).perform();
	}
	//29-RobotCopy
	public static void copy() throws AWTException
	{
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}
	//30-RobotPaste
	public static void paste() throws AWTException
	{	r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
	//31-tab
	public static void tabBtn() throws AWTException
	{
		r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	//32-contextClick
	public static void rightclk() throws AWTException 
	{
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTEXT_MENU);
		r.keyRelease(KeyEvent.VK_CONTEXT_MENU);
	}
	//33-downKey
	public static void doubleClk() throws AWTException
	{
		r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	//34-alert Accept
	public static void alertAccept()
	{
		al.accept();
	}
	//35-alert dismiss
	public static void alertCancel()
	{
		al.dismiss();
	}
	//36-alertGetText
	public static void alertText()
	{
		
		String text = al.getText();
		System.out.println(text);
	}
	//37-defaultContent
	public static void defaultWindow()
	{
		driver.switchTo().defaultContent();
	}
	//38-frameSwitchElement
	public static void frameSwitch(WebElement ele)
	{
		driver.switchTo().frame(ele);
		}
	//39-frameSwitchId
	public static void frameSwitch(String id)
	{
		driver.switchTo().frame(id);
	}
	//40-frameSwitchIndex
	public static void frameSwitch(int i)
	{
		driver.switchTo().frame(i);
	}
	//41-jsSetAttribue
	public static void jsSendText(String txt, WebElement ele)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','txt')", ele);
	}
	//42-jsGetAttribute
	public static void jsPrintText(WebElement ele)
	{	
		js=(JavascriptExecutor)driver;
		Object script = js.executeScript("return arguments[0].getAttribute('value')", ele);
		String txt= (String)script;
		System.out.println(txt);
	}
	//43-jsClick
	public static void jsClick(WebElement ele)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click",ele);
	}

	//44-jsScrollIntoView-Up
	public static void jsScrollUp(WebElement ele) throws InterruptedException
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		waitTime(2000);
	}
	//45-jsScrollIntoView-Down
	public static void jsScrollDown(WebElement ele) throws InterruptedException
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", ele);
		waitTime(2000);
	}
	//46-takeScreenShotAs
	public static void screenShot(String path,String name) throws IOException
	{
		ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File s= new File(path+name);
		FileUtils.copyFile(screenshotAs, s);
		System.out.println("Screenshot done");
	}
	//47-implicitWait
	public static void waitImplicit(int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	//48-clickAndHold to move
	public static void clickAndMove(WebElement src,WebElement des)
	{
		a=new Actions(driver);
		a.clickAndHold(src).release(des).perform();
	}
	//49-frameSize
	public static void frameSize(List<WebElement> frame)
	{
		 int size = frame.size();
		 System.out.println("The frame size\t:"+size);
	}
	//50-parentFrame
	public static void toParentFrame()
	{
		driver.switchTo().parentFrame();
	}

	//51-refresh
	public static void reFresh()
	{
		driver.navigate().refresh();
	}
	//52-Date
	public static void dtPrint() {
		d= new Date();
		System.out.println(d);
	}
	//53-SwitchToAlert
	public static void switchAlert()
	{
		al=driver.switchTo().alert();
	}
	//54-Message
		public static void buttonMsg(WebElement button)
		{
			System.out.println(button.getText()+"  Button clicked");
		}
		
	//55-Robot Enter
		public static void enter() throws AWTException
		{
			r= new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
	//56-Robot Space
		public static void space() throws AWTException
		{
			r= new Robot();
			r.keyPress(KeyEvent.VK_SPACE);
			r.keyRelease(KeyEvent.VK_SPACE);
		}
	
}
