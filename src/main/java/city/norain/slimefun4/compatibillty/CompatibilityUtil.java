package city.norain.slimefun4.compatibillty;

import city.norain.slimefun4.SlimefunExtended;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.OfflinePlayer;
import org.bukkit.Registry;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.data.Ageable;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.type.WallSign;

@UtilityClass
public class CompatibilityUtil {
    /**
     * Get the item material used by the player to place this block.
     * For most blocks, this is the same as getMaterial(), but some blocks have different materials used to place them.
     * Note: Not all possible different block data types are covered here.
     *
     * @param blockData
     * @return The material used to place this block
     */
    public Material getPlacementMaterial(BlockData blockData) {
        if (SlimefunExtended.getMinecraftVersion().isAtLeast(1, 19, 4)) {
            return blockData.getPlacementMaterial();
        } else {
            switch (blockData.getMaterial()) {
                case PLAYER_WALL_HEAD -> {
                    return Material.PLAYER_HEAD;
                }
                case REDSTONE_WIRE -> {
                    return Material.REDSTONE;
                }
                default -> {
                    var mat = blockData.getMaterial();
                    var enumName = blockData.getMaterial().name();

                    if (Ageable.class.equals(mat.data) && enumName.endsWith("S")) {
                        var itemMat = Material.getMaterial(enumName.substring(0, enumName.length() - 1));
                        return itemMat != null && itemMat.isItem() ? itemMat : mat;
                    }

                    if (WallSign.class.equals(mat.data) && enumName.contains("_WALL_")) {
                        Material itemMat = Material.getMaterial(enumName.replace("_WALL_", "_"));

                        if (itemMat != null && itemMat.isItem()) {
                            return mat;
                        }
                    }

                    // Fallback to original material
                    return blockData.getMaterial();
                }
            }
        }
    }

    /**
     * Check if the player is in a connected state.
     * In 1.20-, it cannot be guaranteed whether the player is connected, only returns online status.
     *
     * @param player Offline player
     * @return Player connected or online
     */
    public boolean isConnected(OfflinePlayer player) {
        if (SlimefunExtended.getMinecraftVersion().isAtLeast(1, 20)
                && Slimefun.instance().getServer().getOnlineMode()) {
            return player.isConnected();
        } else {
            return player.isOnline();
        }
    }

    /**
     * Get the maximum health attribute.
     * Before 1.21.3, use GENERIC_MAX_HEALTH.
     *
     * @return Maximum health attribute
     */
    public static Attribute getMaxHealth() {
        if (SlimefunExtended.getMinecraftVersion().isAtLeast(1, 21, 3)) {
            return Registry.ATTRIBUTE.get(NamespacedKey.fromString("max_health"));
        } else {
            return Attribute.valueOf("GENERIC_MAX_HEALTH");
        }
    }
}
