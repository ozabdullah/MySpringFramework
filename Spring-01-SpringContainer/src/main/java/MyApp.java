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

        /*
        We are getting bean but we need to down-cast the bean to to get Mentor type not object class type;
        there are many overloaded getBean methods that taking different parameters,
        if we pass just the 'bean id' then we have to down cast to Mentor class to make sure we are getting Mentor type
         */
        Mentor mentor = (Mentor)container.getBean("fullTimeMentor");
                       //downcast                     // bean id name

        // or We can do it like this if we don't wanna do down-casting : with two parameters
        // Mentor mentor = container.getBean("fullTimeMentor", Mentor.class);

           mentor.createAccount(); //fullTime mentor created



        Mentor mentor1 = (Mentor)container.getBean("partTimeMentor");

         mentor1.createAccount();//partTime Mentor



    }
}
