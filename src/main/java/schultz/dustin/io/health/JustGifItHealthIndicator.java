package schultz.dustin.io.health;

import com.justgifit.JustGifItProperties;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by jingshanyin on 8/26/17.
 */
@Component
public class JustGifItHealthIndicator implements HealthIndicator {

    @Inject
    private JustGifItProperties properties;

    @Override
    public Health health() {
        if (properties.getGifLocation() != null && !properties.getGifLocation().canWrite()) {
            return Health.down().build();
        }
        return Health.up().build();
    }
}
