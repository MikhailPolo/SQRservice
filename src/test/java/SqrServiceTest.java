import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SqrService;


public class SqrServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resourses/sqr.csv")
    public void testPositive(int expected, int beginning, int end) {
        SqrService service = new SqrService();
        int actual = service.calcSqr(beginning, end);
        Assertions.assertEquals(expected, actual);
    }
}
