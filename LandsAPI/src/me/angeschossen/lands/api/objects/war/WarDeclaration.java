package me.angeschossen.lands.api.objects.war;

import me.angeschossen.lands.api.objects.Land;
import org.bukkit.entity.Player;

public interface WarDeclaration {

    WarDeclaration addAttacker(Land land, boolean force);

    WarDeclaration addDefender(Land land, boolean force);

    boolean removeLand(Land land);

    void setTribute(double tribute);

    double getTribute();

    double getMaxTribute();

    Land getInitialAttacker();

    Land getInitialDefender();

    boolean isValid();

    boolean startsSoon();

    boolean send(Player sender);

    War accept();
}
