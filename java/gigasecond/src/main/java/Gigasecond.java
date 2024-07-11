import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private final long GIGASEC_VAL = 1000000000;
    private final LocalDateTime moment;

    public Gigasecond(LocalDate moment) {
        this.moment = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.moment = moment;
    }

    public LocalDateTime getDateTime() {
        return moment.plusSeconds(GIGASEC_VAL);
    }
}
