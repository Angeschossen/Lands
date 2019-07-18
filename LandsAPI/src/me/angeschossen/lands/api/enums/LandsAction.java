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
    LAND_CLAIM("land_claim"),
    LAND_CLAIM_BORDER("land_claim_border"),
    LAND_SPAWN_SET("land_spawn_set"),
    LAND_SPAWN_TELEPORT("land_spawn_teleport"),
    LAND_RENAME("land_rename"),
    SETTING_EDIT_LAND("setting_edit_land"),
    SETTING_EDIT_ROLE("setting_edit_role"),
    SETTING_EDIT_ADVANCED("setting_edit_advanced"),
    SETTING_EDIT_TAXES("setting_edit_taxes"),
    SETTING_EDIT_VARIOUS("setting_edit_various"),
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

        throw new IllegalArgumentException("No LandsAction with iD '" + iD + "' found.");
    }

    @Override
    public String toString() {
        return iD;
    }
}
