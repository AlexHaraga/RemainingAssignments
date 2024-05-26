package Week9;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentRepository repository = new StudentRepositoryImplementation();
        testAddStudent_Success();

    }
}
