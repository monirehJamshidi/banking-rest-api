package org.j2os.banking.config.properties;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "notification")
@Validated
public class NotificationProperties {

    @NotBlank
    private final String message;
    private final boolean enabled;

    @Min(0)
    private final int retryCount;

    public NotificationProperties(String message, boolean enabled, int retryCount) {
        this.message = message;
        this.enabled = enabled;
        this.retryCount = retryCount;
    }

    public String getMessage() {
        return message;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public int getRetryCount() {
        return retryCount;
    }
}
