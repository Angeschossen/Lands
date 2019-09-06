package me.angeschossen.lands.api.objects;

import com.sun.istack.internal.NotNull;
import org.bukkit.Location;

import javax.annotation.Nullable;
import java.util.Set;

public interface Selection {

    /**
     * Is selection complete (pos 1 and pos 2)?
     *
     * @return Will return false if one position is missing.
     */
    @NotNull
    boolean isComplete();

    /**
     * Get pos 1
     *
     * @return Location of pos 1
     */
    @Nullable
    Location getPos1();

    /**
     * Get pos 2
     *
     * @return Location of pos 2
     */
    @Nullable
    Location getPos2();

    /**
     * Set pos 1
     *
     * @param location Location
     */
    void setPos1(@Nullable Location location);

    /**
     * Set pos 2
     *
     * @param location Location
     */
    void setPos2(@Nullable Location location);

    /**
     * Is valid?
     *
     * @return Will return false if selection is not complete, positions are not in the same world
     * or the selection is too big (lands.selection.NUMBER).
     */
    @NotNull
    boolean isValid();

    /**
     * Get chunks in this selection.
     *
     * @return Chunks in this selection
     */
    @NotNull
    Set<ChunkCoordinate> getChunkCoordinates();

    /**
     * Get size.
     *
     * @return Size
     */
    @NotNull
    int getSize();
}
