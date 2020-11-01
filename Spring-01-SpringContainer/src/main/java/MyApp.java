import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;

public class MyApp {
    public static void main(String[] args) {


        // creating our container using xml to save my beans

        // 1-with Bean Factory interface    //the class implements the BeanFactory interface
       // BeanFactory container = new ClassPathXmlApplicationContext("config.xml");

        //2-with ApplicationContext interface
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Mentor mentor = (Mentor)container.getBean("fullTimeMentor");
                       //downcast                     // bean id name

        // or We can do it like this if we don't wanna do down-casting
        // Mentor mentor = container.getBean("fullTimeMentor", Mentor.class);

           mentor.createAccount(); //fullTime mentor created



        Mentor mentor1 = (Mentor)container.getBean("partTimeMentor");

         mentor1.createAccount();//partTime Mentor



    }
}
