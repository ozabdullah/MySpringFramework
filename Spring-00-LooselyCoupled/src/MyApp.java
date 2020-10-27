import implementation.Mentor;
import services.FullTimeMentor;
import services.MentorAccount;

public class MyApp {

    public static void main(String[] args) {


        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        MentorAccount mentorAccount = new MentorAccount(fullTimeMentor);

        mentorAccount.manageAccount();;








    }


}
