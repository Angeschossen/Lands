package me.angeschossen.lands.api.objects;

import java.sql.Timestamp;

public interface NewsMessage {
    Timestamp getTime();

    String getMessage();
}
