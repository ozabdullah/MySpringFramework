import com.abdullah.services.FullTimeMentor;
import com.abdullah.services.MentorAccount;
import com.abdullah.services.PartTimeMentor;

public class MyApp {

    public static void main(String[] args) {


        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        PartTimeMentor partTimeMentor = new PartTimeMentor();


        MentorAccount mentor = new MentorAccount(fullTimeMentor);

        mentor.manageAccount();;








    }


}
