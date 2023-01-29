package Test;

import Base.Base;
import Pages.CreateAccPage;
import Pages.HomePage;
import org.junit.Before;

import java.util.Random;

public class Test extends Base {
    private HomePage homePage;
    private CreateAccPage createAccPage;

    private Random ran = new Random();
    private String password = "asdf"+ ran.nextInt(55)+ "?";
    private  String email = "sofi"+ ran.nextInt(100)+ "@gmail.com";



    @Before
    public void setUpTest(){
        homePage = new HomePage();
        createAccPage = new CreateAccPage();
    }
    @org.junit.Test
    public void TestCREATEACCOUNT(){
        homePage.setAccCOOKIES();
        homePage.setStartTRACK();
        createAccPage.INPUTemail(email);
        createAccPage.SETpassword(password);
        createAccPage.setSingUP();
        System.out.println(email);
        System.out.println(password);

    }

}
