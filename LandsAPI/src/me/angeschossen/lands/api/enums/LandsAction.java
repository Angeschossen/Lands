package me.angeschossen.lands.api.enums;

public enum LandsAction {
    BLOCK_BREAK("block_break"),
    BLOCK_PLACE("block_place"),
    ATTACK_PLAYER("attack_player"),
    ATTACK_ANIMAL("attack_animal"),
    BLOCK_IGNITE("block_ignite"),
    INTERACT_GENERAL("interact_general"),
    INTERACT_MECHANISM("interact_mechanism"),
    INTERACT_CONTAINER("interact_container"),
    INTERACT_DOOR("interact_door"),
    PLAYER_TRUST("player_trust"),
    PLAYER_UNTRUST("player_untrust"),
    PLAYER_SETROLE("player_setrole"),
    LAND_CLAIM_GLOBAL("land_claim"),
    LAND_SPAWN_SET("land_spawn_set"),
    LAND_SPAWN_TELEPORT("land_spawn_teleport"),
    LAND_RENAME("land_rename"),
    SETTING_EDIT("setting_edit"),
    FLY("fly");

    private String iD;

    LandsAction(String iD) {
        this.iD = iD;
    }


    public static LandsAction getByID(String iD) {
        for (LandsAction action : values()) {
            if (action.iD.equals(iD))
                return action;
        }

        throw new IllegalArgumentException("No enum with iD '" + iD + "' found.");
    }

    @Override
    public String toString() {
        return iD;
    }
}
