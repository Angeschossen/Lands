package me.angeschossen.lands.api.enums;

public enum LandsSetting {
    ENTITY_GRIEFING("entity_griefing"),
    PISTON_GRIEFING("piston_griefing"),
    MONSTER_SPAWN("monster_spawn"),
    TAX_TOTAL("tax_total");

    private String iD;

    LandsSetting(String iD) {
        this.iD = iD;
    }

    public String getiD() {
        return iD;
    }

    public static LandsSetting getByID(String iD) {
        for (LandsSetting setting : values()) {
            if (setting.iD.equals(iD))
                return setting;
        }

        throw new IllegalArgumentException("No enum with iD '" + iD + "' found.");
    }

    @Override
    public String toString() {
        return iD;
    }
}
