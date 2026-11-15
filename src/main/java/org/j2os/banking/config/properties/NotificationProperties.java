package org.j2os.banking.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "notification")
public class NotificationProperties {

    private final String message;
    private final boolean enabled;
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
