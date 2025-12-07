package com.xzavier0722.mc.plugin.slimefun4.storage.common;

/**
 * {@link DataType} is the type of Slimefun database controller,
 * used to distinguish between different data storage types.
 */
public enum DataType {
    /**
     * Player profile, usually contains research progress, backpacks and other player-related data.
     */
    PLAYER_PROFILE,

    /**
     * Slimefun block data
     */
    BLOCK_STORAGE
}
