package com.xzavier0722.mc.plugin.slimefun4.storage.controller.attributes;

import city.norain.slimefun4.api.menu.UniversalMenu;
import com.xzavier0722.mc.plugin.slimefun4.storage.controller.SlimefunUniversalBlockData;
import com.xzavier0722.mc.plugin.slimefun4.storage.controller.SlimefunUniversalData;
import lombok.Getter;

/**
 * This enum class is used to declare the traits of {@link SlimefunUniversalData}.
 * A universal data can have single or multiple traits.
 * <p>
 * For a universal data, it defaults to having the trait as a k-v container.
 *
 * @see SlimefunUniversalData
 * @see SlimefunUniversalBlockData
 */
@Getter
public enum UniversalDataTrait {
    /**
     * BLOCK trait indicates that this universal data belongs to {@link SlimefunUniversalBlockData}
     */
    BLOCK("location"),

    /**
     * INVENTORY trait indicates that this universal data has a {@link UniversalMenu}
     */
    INVENTORY("");

    private final String reservedKey;

    UniversalDataTrait(String reservedKey) {
        this.reservedKey = reservedKey;
    }

    public static boolean isReservedKey(String key) {
        for (UniversalDataTrait trait : UniversalDataTrait.values()) {
            if (trait.getReservedKey().equals(key)) {
                return true;
            }
        }

        return false;
    }
}
