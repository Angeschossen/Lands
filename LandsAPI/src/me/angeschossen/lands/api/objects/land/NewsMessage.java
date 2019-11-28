package me.angeschossen.lands.api.objects.land;

import java.sql.Timestamp;

public interface NewsMessage {
    Timestamp getTime();

    String getMessage();
}
