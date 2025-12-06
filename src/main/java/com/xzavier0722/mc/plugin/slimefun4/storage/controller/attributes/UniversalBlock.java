package com.xzavier0722.mc.plugin.slimefun4.storage.controller.attributes;

import com.xzavier0722.mc.plugin.slimefun4.storage.controller.SlimefunUniversalBlockData;
import com.xzavier0722.mc.plugin.slimefun4.storage.controller.SlimefunUniversalData;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

/**
 * This attribute is used to declare that {@link SlimefunItem} uses {@link SlimefunUniversalData}
 * <p>
 * When this {@link SlimefunItem} is used as a machine, the corresponding material needs to support
 * PDC storage containers (used to identify UUID).
 * Otherwise, this item/machine cannot be bound to universal data.
 *
 * Check here for PDC-supported item materials:
 * <a href="https://jd.papermc.io/paper/1.21/org/bukkit/block/TileState.html">Paper Doc</a>
 *
 * @author NoRainCity
 *
 * @see SlimefunUniversalData
 * @see SlimefunUniversalBlockData
 */
public interface UniversalBlock {}
