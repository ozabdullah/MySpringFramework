import implementation.Mentor;
import services.FullTimeMentor;
import services.MentorAccount;
import services.PartTimeMentor;

public class MyApp {

    public static void main(String[] args) {


        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        PartTimeMentor partTimeMentor = new PartTimeMentor();


        MentorAccount mentor = new MentorAccount(fullTimeMentor);

        mentor.manageAccount();;








    }


}
