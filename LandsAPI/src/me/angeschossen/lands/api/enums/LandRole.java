package me.angeschossen.lands.api.enums;

import org.bukkit.ChatColor;

public enum LandRole {
    OWNER("owner", 4), ADMIN("admin", 3), MEMBER("member", 2), VISITOR("visitor", 1), ALL("all", 0);

    private int weight;
    private String iD;
    private String alias;

    LandRole(String iD, int weight) {
        this.weight = weight;
        this.iD = iD;
    }

    public int getWeight() {
        return weight;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public static LandRole getByAlias(String alias) {
        alias = ChatColor.stripColor(alias);
        for (LandRole landRole : LandRole.values()) {
            if (ChatColor.stripColor(landRole.getAlias()).equalsIgnoreCase(alias))
                return landRole;
        }

        throw new IllegalArgumentException("No enum with alias '" + alias + "' found.");
    }

    public String getID() {
        return iD;
    }

    public boolean equals(LandRole landRole) {
        return landRole == this || landRole == LandRole.ALL;
    }
}
