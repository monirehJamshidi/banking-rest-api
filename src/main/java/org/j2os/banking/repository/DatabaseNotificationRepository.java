package org.j2os.banking.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
@Profile("production")
public class DatabaseNotificationRepository implements NotificationRepository {

    @Override
    public String getMessage() {
        return "Message loaded from database";
    }
}
