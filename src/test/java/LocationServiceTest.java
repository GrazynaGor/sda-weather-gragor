import com.sda.weather.Location;
import org.junit.jupiter.api.Test;

public class LocationServiceTest {

    @Test
    void createNewLocationShouldSavedIt() {
        //given
        Location loc = new Location(null, "krakow", 20, 20, "śląsk", "Poland");
        //when
        //then
    }
}
