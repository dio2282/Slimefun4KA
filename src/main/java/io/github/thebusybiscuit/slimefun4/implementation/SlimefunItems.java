package io.github.thebusybiscuit.slimefun4.implementation;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerBackpack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.staves.StormStaff;
import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.compatibility.VersionedEnchantment;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ColoredFireworkStar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

/**
 * This class holds a static references to every {@link SlimefunItemStack}
 * found in Slimefun.
 */
@SuppressWarnings("java:S1192") // Suppress "duplicate string literal" warnings
public final class SlimefunItems {

    private SlimefunItems() {}

    /*		 Items 		*/
    public static final SlimefunItemStack PORTABLE_CRAFTER = new SlimefunItemStack(
            "PORTABLE_CRAFTER",
            HeadTexture.PORTABLE_CRAFTER,
            "&6Portable Crafting Table",
            "&a&oA portable crafting table",
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack PORTABLE_DUSTBIN = new SlimefunItemStack(
            "PORTABLE_DUSTBIN",
            HeadTexture.TRASH_CAN,
            "&6Portable Dustbin",
            "&rEasily dispose of excess items",
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack ENDER_BACKPACK = new SlimefunItemStack(
            "ENDER_BACKPACK",
            HeadTexture.ENDER_BACKPACK,
            "&6Ender Backpack",
            "&a&oPortable ender chest",
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack MAGIC_EYE_OF_ENDER = new SlimefunItemStack(
            "MAGIC_EYE_OF_ENDER",
            Material.ENDER_EYE,
            "&6&lMagic Eye of Ender",
            "&4&lRequires full Ender Armor set",
            "",
            "&7&eRight-Click&7 to shoot an ender pearl");
    public static final SlimefunItemStack BROKEN_SPAWNER = new SlimefunItemStack(
            "BROKEN_SPAWNER",
            Material.SPAWNER,
            "&cBroken Spawner",
            "&7Type: &b<Type>",
            "",
            "&cBroken, needs to be repaired in the Ancient Altar");
    public static final SlimefunItemStack REPAIRED_SPAWNER =
            new SlimefunItemStack("REINFORCED_SPAWNER", Material.SPAWNER, "&bRepaired Spawner", "&7Type: &b<Type>");
    public static final SlimefunItemStack INFERNAL_BONEMEAL = new SlimefunItemStack(
            "INFERNAL_BONEMEAL",
            Material.BONE_MEAL,
            "&4Infernal Bonemeal",
            "",
            "&cAccelerates the growth speed of nether wart");
    public static final SlimefunItemStack TAPE_MEASURE = new SlimefunItemStack(
            "TAPE_MEASURE",
            "180d5c43a6cf5bb7769fd0c8240e1e70d2ae38ef9d78a1db401aca6a2cb36f65",
            "&6Tape Measure",
            "",
            "&eShift + Right-Click &7to set measurement anchor",
            "&eRight-Click &7to measure distance");

    /*		 Gadgets 		*/
    public static final SlimefunItemStack GOLD_PAN = new SlimefunItemStack(
            "GOLD_PAN",
            Material.BOWL,
            "&6Gold Pan",
            "&a&oCan obtain various ores",
            "",
            "&7&eRight-Click&7 to pan for gold from gravel");
    public static final SlimefunItemStack NETHER_GOLD_PAN = new SlimefunItemStack(
            "NETHER_GOLD_PAN",
            Material.BOWL,
            "&4Nether Gold Pan",
            "",
            "&7&eRight-Click&7 to pan for gold from soul sand");
    public static final SlimefunItemStack PARACHUTE = new SlimefunItemStack(
            "PARACHUTE", Material.LEATHER_CHESTPLATE, Color.WHITE, "&r&lParachute", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack GRAPPLING_HOOK = new SlimefunItemStack(
            "GRAPPLING_HOOK", Material.LEAD, "&6Grappling Hook", "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack SOLAR_HELMET = new SlimefunItemStack(
            "SOLAR_HELMET",
            Material.IRON_HELMET,
            "&bSolar Helmet",
            "",
            "&a&oCharges items and equipment you're holding");
    public static final SlimefunItemStack CLOTH = new SlimefunItemStack("CLOTH", Material.PAPER, "&bCloth");
    public static final SlimefunItemStack REINFORCED_CLOTH = new SlimefunItemStack(
            "REINFORCED_CLOTH",
            Material.PAPER,
            "&bReinforced Cloth",
            "",
            "&fThis cloth has been reinforced with lead",
            "&fand can prevent negative effects from radiation");
    public static final SlimefunItemStack TIN_CAN = new SlimefunItemStack("CAN", HeadTexture.TIN_CAN, "&rTin Can");
    public static final SlimefunItemStack NIGHT_VISION_GOGGLES = new SlimefunItemStack(
            "NIGHT_VISION_GOGGLES",
            Material.LEATHER_HELMET,
            Color.BLACK,
            "&aNight Vision Goggles",
            "",
            "&9+ Night Vision effect");
    public static final SlimefunItemStack ELYTRA_CAP = new SlimefunItemStack(
            "ELYTRA_CAP",
            Material.LEATHER_HELMET,
            Color.PURPLE,
            "&5Elytra Cap",
            "",
            "&7Allows you to fly with elytra",
            "&7without falling and becoming a pancake");
    public static final SlimefunItemStack FARMER_SHOES = new SlimefunItemStack(
            "FARMER_SHOES",
            Material.LEATHER_BOOTS,
            Color.YELLOW,
            "&eFarmer's Boots",
            "",
            "&6&oPrevents you from trampling crops");
    public static final SlimefunItemStack INFUSED_MAGNET = new SlimefunItemStack(
            "INFUSED_MAGNET",
            HeadTexture.MAGNET,
            "&aInfused Magnet",
            "",
            "&rA magnet infused with magic",
            "&rthat can pull nearby items",
            "&rinto your inventory",
            "",
            "&7Hold &eShift&7 to attract surrounding items");
    public static final SlimefunItemStack RAG = new SlimefunItemStack(
            "RAG",
            Material.PAPER,
            "&cRag",
            "",
            "&aLevel 1 Medical Supply",
            "",
            "&rRestores 2 health",
            "&rCan extinguish fire on yourself",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack BANDAGE = new SlimefunItemStack(
            "BANDAGE",
            Material.PAPER,
            "&cBandage",
            "",
            "&aLevel 2 Medical Supply",
            "",
            "&rRestores 4 health",
            "&rCan extinguish fire on yourself",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack SPLINT = new SlimefunItemStack(
            "SPLINT",
            Material.STICK,
            "&cSplint",
            "",
            "&aLevel 1 Medical Supply",
            "",
            "&rRestores 2 health",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack VITAMINS = new SlimefunItemStack(
            "VITAMINS",
            Material.NETHER_WART,
            "&cVitamins",
            "",
            "&aLevel 3 Medical Supply",
            "",
            "&rRestores 4 health",
            "&rCan extinguish fire on yourself",
            "&rCures poison/wither/radiation negative effects",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack MEDICINE = new SlimefunItemStack(
            "MEDICINE",
            Material.POTION,
            Color.RED,
            "&cMedicine",
            "",
            "&aLevel 3 Medical Supply",
            "",
            "&rRestores 4 health",
            "&rCan extinguish fire on yourself",
            "&rCures poison/wither/radiation negative effects",
            "",
            "&7&eRight-Click&7 to drink");
    public static final SlimefunItemStack MAGICAL_ZOMBIE_PILLS = new SlimefunItemStack(
            "MAGICAL_ZOMBIE_PILLS",
            Material.NETHER_WART,
            "&6Magical Zombie Pills",
            "",
            "&eRight-Click to instantly cure &7zombie villagers/piglins");

    public static final SlimefunItemStack FLASK_OF_KNOWLEDGE = new SlimefunItemStack(
            "FLASK_OF_KNOWLEDGE",
            Material.GLASS_BOTTLE,
            "&cFlask of Knowledge",
            "",
            "&rAllows you to store experience in a bottle",
            "&7Requires &a1 level");
    public static final SlimefunItemStack FILLED_FLASK_OF_KNOWLEDGE =
            new SlimefunItemStack("FILLED_FLASK_OF_KNOWLEDGE", Material.EXPERIENCE_BOTTLE, "&aFlask of Knowledge");

    /*		Backpacks		*/
    public static final SlimefunItemStack BACKPACK_SMALL = new SlimefunItemStack(
            "SMALL_BACKPACK",
            HeadTexture.BACKPACK,
            "&eSmall Backpack",
            "",
            "&7Size: &e9",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BACKPACK_MEDIUM = new SlimefunItemStack(
            "MEDIUM_BACKPACK",
            HeadTexture.BACKPACK,
            "&eMedium Backpack",
            "",
            "&7Size: &e18",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BACKPACK_LARGE = new SlimefunItemStack(
            "LARGE_BACKPACK",
            HeadTexture.BACKPACK,
            "&eLarge Backpack",
            "",
            "&7Size: &e27",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack WOVEN_BACKPACK = new SlimefunItemStack(
            "WOVEN_BACKPACK",
            HeadTexture.BACKPACK,
            "&eWoven Backpack",
            "",
            "&7Size: &e36",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack GILDED_BACKPACK = new SlimefunItemStack(
            "GILDED_BACKPACK",
            HeadTexture.BACKPACK,
            "&eGilded Backpack",
            "",
            "&7Size: &e45",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack RADIANT_BACKPACK = new SlimefunItemStack(
            "RADIANT_BACKPACK",
            HeadTexture.BACKPACK,
            "&eRadiant Backpack",
            "",
            "&7Size: &e54 (Large Chest)",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BOUND_BACKPACK = new SlimefunItemStack(
            "BOUND_BACKPACK",
            HeadTexture.ENDER_BACKPACK,
            "&cSoulbound Backpack",
            "",
            "&7Size: &e36",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack COOLER = new SlimefunItemStack(
            "COOLER",
            HeadTexture.COOLER,
            "&bCooler",
            "&rCan store juices and smoothies",
            "&rWhen the cooler is in your inventory",
            "&rit will automatically consume food inside when you're hungry",
            "",
            "&7Size: &e27",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack RESTORED_BACKPACK = new SlimefunItemStack(
            "RESTORED_BACKPACK",
            HeadTexture.RESTORED_BACKPACK,
            "&eRestored Backpack",
            "",
            "&7Retrieve items from your lost backpacks",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);

    /*		 Jetpacks		*/
    public static final SlimefunItemStack DURALUMIN_JETPACK = new SlimefunItemStack(
            "DURALUMIN_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Electric Jetpack &7- &eI",
            "",
            LoreBuilder.material("Duralumin"),
            LoreBuilder.powerCharged(0, 20),
            "&8\u21E8 &7Thrust: &c0.35",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack SOLDER_JETPACK = new SlimefunItemStack(
            "SOLDER_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Electric Jetpack &7- &eII",
            "",
            LoreBuilder.material("Solder"),
            LoreBuilder.powerCharged(0, 30),
            "&8\u21E8 &7Thrust: &c0.4",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack BILLON_JETPACK = new SlimefunItemStack(
            "BILLON_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Electric Jetpack &7- &eIII",
            "",
            LoreBuilder.material("Billon"),
            LoreBuilder.powerCharged(0, 45),
            "&8\u21E8 &7Thrust: &c0.45",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack STEEL_JETPACK = new SlimefunItemStack(
            "STEEL_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Electric Jetpack &7- &eIV",
            "",
            LoreBuilder.material("Steel"),
            LoreBuilder.powerCharged(0, 60),
            "&8\u21E8 &7Thrust: &c0.5",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack DAMASCUS_STEEL_JETPACK = new SlimefunItemStack(
            "DAMASCUS_STEEL_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Electric Jetpack &7- &eV",
            "",
            LoreBuilder.material("Damascus Steel"),
            LoreBuilder.powerCharged(0, 75),
            "&8\u21E8 &7Thrust: &c0.55",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack REINFORCED_ALLOY_JETPACK = new SlimefunItemStack(
            "REINFORCED_ALLOY_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Electric Jetpack &7- &eVI",
            "",
            LoreBuilder.material("Reinforced Alloy"),
            LoreBuilder.powerCharged(0, 100),
            "&8\u21E8 &7Thrust: &c0.6",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack CARBONADO_JETPACK = new SlimefunItemStack(
            "CARBONADO_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.BLACK,
            "&9Electric Jetpack &7- &eVII",
            "",
            LoreBuilder.material("Carbonado"),
            LoreBuilder.powerCharged(0, 150),
            "&8\u21E8 &7Thrust: &c0.7",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack ARMORED_JETPACK = new SlimefunItemStack(
            "ARMORED_JETPACK",
            Material.IRON_CHESTPLATE,
            "&9Armored Jetpack",
            LoreBuilder.material("Steel"),
            "",
            LoreBuilder.powerCharged(0, 50),
            "&8\u21E8 &7Thrust: &c0.5",
            "",
            LoreBuilder.CROUCH_TO_USE);

    /*		 Jetboots		*/
    public static final SlimefunItemStack DURALUMIN_JETBOOTS = new SlimefunItemStack(
            "DURALUMIN_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Jet Boots &7- &eI",
            "",
            LoreBuilder.material("Duralumin"),
            LoreBuilder.powerCharged(0, 20),
            "&8\u21E8 &7Speed: &a0.35",
            "&8\u21E8 &7Accuracy: &c50%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack SOLDER_JETBOOTS = new SlimefunItemStack(
            "SOLDER_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Jet Boots &7- &eII",
            "",
            LoreBuilder.material("Solder"),
            LoreBuilder.powerCharged(0, 30),
            "&8\u21E8 &7Speed: &a0.4",
            "&8\u21E8 &7Accuracy: &660%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack BILLON_JETBOOTS = new SlimefunItemStack(
            "BILLON_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Jet Boots &7- &eIII",
            "",
            LoreBuilder.material("Billon"),
            LoreBuilder.powerCharged(0, 40),
            "&8\u21E8 &7Speed: &a0.45",
            "&8\u21E8 &7Accuracy: &665%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack STEEL_JETBOOTS = new SlimefunItemStack(
            "STEEL_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Jet Boots &7- &eIV",
            "",
            LoreBuilder.material("Steel"),
            LoreBuilder.powerCharged(0, 50),
            "&8\u21E8 &7Speed: &a0.5",
            "&8\u21E8 &7Accuracy: &e70%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack DAMASCUS_STEEL_JETBOOTS = new SlimefunItemStack(
            "DAMASCUS_STEEL_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Jet Boots &7- &eV",
            "",
            LoreBuilder.material("Damascus Steel"),
            LoreBuilder.powerCharged(0, 75),
            "&8\u21E8 &7Speed: &a0.55",
            "&8\u21E8 &7Accuracy: &a75%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack REINFORCED_ALLOY_JETBOOTS = new SlimefunItemStack(
            "REINFORCED_ALLOY_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Jet Boots &7- &eVI",
            "",
            LoreBuilder.material("Reinforced Alloy"),
            LoreBuilder.powerCharged(0, 100),
            "&8\u21E8 &7Speed: &a0.6",
            "&8\u21E8 &7Accuracy: &c80%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack CARBONADO_JETBOOTS = new SlimefunItemStack(
            "CARBONADO_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.BLACK,
            "&9Jet Boots &7- &eVII",
            "",
            LoreBuilder.material("Carbonado"),
            LoreBuilder.powerCharged(0, 125),
            "&8\u21E8 &7Speed: &a0.7",
            "&8\u21E8 &7Accuracy: &c99.9%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack ARMORED_JETBOOTS = new SlimefunItemStack(
            "ARMORED_JETBOOTS",
            Material.IRON_BOOTS,
            "&9Armored Jet Boots",
            "",
            LoreBuilder.material("Steel"),
            LoreBuilder.powerCharged(0, 50),
            "&8\u21E8 &7Speed: &a0.45",
            "&8\u21E8 &7Accuracy: &e70%",
            "",
            LoreBuilder.CROUCH_TO_USE);

    /*		 Multi Tools		*/
    public static final SlimefunItemStack DURALUMIN_MULTI_TOOL = new SlimefunItemStack(
            "DURALUMIN_MULTI_TOOL",
            Material.SHEARS,
            "&9Multi Tool &7- &eI",
            "",
            LoreBuilder.material("Duralumin"),
            LoreBuilder.powerCharged(0, 20),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Hold &eShift + Right-Click&7 to change mode");
    public static final SlimefunItemStack SOLDER_MULTI_TOOL = new SlimefunItemStack(
            "SOLDER_MULTI_TOOL",
            Material.SHEARS,
            "&9Multi Tool &7- &eII",
            "",
            LoreBuilder.material("Solder"),
            LoreBuilder.powerCharged(0, 30),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Hold &eShift + Right-Click&7 to change mode");
    public static final SlimefunItemStack BILLON_MULTI_TOOL = new SlimefunItemStack(
            "BILLON_MULTI_TOOL",
            Material.SHEARS,
            "&9Multi Tool &7- &eIII",
            "",
            LoreBuilder.material("Billon"),
            LoreBuilder.powerCharged(0, 40),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Hold &eShift + Right-Click&7 to change mode");
    public static final SlimefunItemStack STEEL_MULTI_TOOL = new SlimefunItemStack(
            "STEEL_MULTI_TOOL",
            Material.SHEARS,
            "&9Multi Tool &7- &eIV",
            "",
            LoreBuilder.material("Steel"),
            LoreBuilder.powerCharged(0, 50),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Hold &eShift + Right-Click&7 to change mode");
    public static final SlimefunItemStack DAMASCUS_STEEL_MULTI_TOOL = new SlimefunItemStack(
            "DAMASCUS_STEEL_MULTI_TOOL",
            Material.SHEARS,
            "&9Multi Tool &7- &eV",
            "",
            LoreBuilder.material("Damascus Steel"),
            LoreBuilder.powerCharged(0, 60),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Hold &eShift + Right-Click&7 to change mode");
    public static final SlimefunItemStack REINFORCED_ALLOY_MULTI_TOOL = new SlimefunItemStack(
            "REINFORCED_ALLOY_MULTI_TOOL",
            Material.SHEARS,
            "&9Multi Tool &7- &eVI",
            "",
            LoreBuilder.material("Reinforced Alloy"),
            LoreBuilder.powerCharged(0, 75),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Hold &eShift + Right-Click&7 to change mode");
    public static final SlimefunItemStack CARBONADO_MULTI_TOOL = new SlimefunItemStack(
            "CARBONADO_MULTI_TOOL",
            Material.SHEARS,
            "&9Multi Tool &7- &eVII",
            "",
            LoreBuilder.material("Carbonado"),
            LoreBuilder.powerCharged(0, 100),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Hold &eShift + Right-Click&7 to change mode");

    static {
        ItemMeta duralumin = DURALUMIN_MULTI_TOOL.getItemMeta();
        duralumin.setUnbreakable(true);
        DURALUMIN_MULTI_TOOL.setItemMeta(duralumin);

        ItemMeta solder = SOLDER_MULTI_TOOL.getItemMeta();
        solder.setUnbreakable(true);
        SOLDER_MULTI_TOOL.setItemMeta(solder);

        ItemMeta billon = BILLON_MULTI_TOOL.getItemMeta();
        billon.setUnbreakable(true);
        BILLON_MULTI_TOOL.setItemMeta(billon);

        ItemMeta steel = STEEL_MULTI_TOOL.getItemMeta();
        steel.setUnbreakable(true);
        STEEL_MULTI_TOOL.setItemMeta(steel);

        ItemMeta damascus = DAMASCUS_STEEL_MULTI_TOOL.getItemMeta();
        damascus.setUnbreakable(true);
        DAMASCUS_STEEL_MULTI_TOOL.setItemMeta(damascus);

        ItemMeta reinforced = REINFORCED_ALLOY_MULTI_TOOL.getItemMeta();
        reinforced.setUnbreakable(true);
        REINFORCED_ALLOY_MULTI_TOOL.setItemMeta(reinforced);

        ItemMeta carbonado = CARBONADO_MULTI_TOOL.getItemMeta();
        carbonado.setUnbreakable(true);
        CARBONADO_MULTI_TOOL.setItemMeta(carbonado);
    }

    /*		 Food 		*/
    public static final SlimefunItemStack FORTUNE_COOKIE = new SlimefunItemStack(
            "FORTUNE_COOKIE",
            Material.COOKIE,
            "&6Fortune Cookie",
            "",
            "&a&oTells you what will happen in the future :o");
    public static final SlimefunItemStack DIET_COOKIE =
            new SlimefunItemStack("DIET_COOKIE", Material.COOKIE, "&6Diet Cookie", "", "&aA very &olight&r&a cookie");
    public static final SlimefunItemStack MAGIC_SUGAR =
            new SlimefunItemStack("MAGIC_SUGAR", Material.SUGAR, "&6Magic Sugar", "", "&a&oFeel the power of Hermes!");
    public static final SlimefunItemStack MONSTER_JERKY = new SlimefunItemStack(
            "MONSTER_JERKY", Material.ROTTEN_FLESH, "&6Monster Jerky", "", "&a&oRefreshing and hunger-resistant");
    public static final SlimefunItemStack APPLE_JUICE = new SlimefunItemStack(
            "APPLE_JUICE",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&cApple Juice",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack MELON_JUICE = new SlimefunItemStack(
            "MELON_JUICE",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&cMelon Juice",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack CARROT_JUICE = new SlimefunItemStack(
            "CARROT_JUICE",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&6Carrot Juice",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack PUMPKIN_JUICE = new SlimefunItemStack(
            "PUMPKIN_JUICE",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&6Pumpkin Juice",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack SWEET_BERRY_JUICE = new SlimefunItemStack(
            "SWEET_BERRY_JUICE",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&cBerry Juice",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack GLOW_BERRY_JUICE = new SlimefunItemStack(
            "GLOW_BERRY_JUICE",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&6Glow Berry Juice",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack GOLDEN_APPLE_JUICE = new SlimefunItemStack(
            "GOLDEN_APPLE_JUICE",
            Color.YELLOW,
            new PotionEffect(PotionEffectType.ABSORPTION, 20 * 20, 0),
            "&bGolden Apple Juice");

    public static final SlimefunItemStack BEEF_JERKY =
            new SlimefunItemStack("BEEF_JERKY", Material.COOKED_BEEF, "&6Beef Jerky", "", "&rSweeps away hunger!");
    public static final SlimefunItemStack PORK_JERKY =
            new SlimefunItemStack("PORK_JERKY", Material.COOKED_PORKCHOP, "&6Pork Jerky", "", "&rSweeps away hunger!");
    public static final SlimefunItemStack CHICKEN_JERKY = new SlimefunItemStack(
            "CHICKEN_JERKY", Material.COOKED_CHICKEN, "&6Chicken Jerky", "", "&rSweeps away hunger!");
    public static final SlimefunItemStack MUTTON_JERKY = new SlimefunItemStack(
            "MUTTON_JERKY", Material.COOKED_MUTTON, "&6Mutton Jerky", "", "&rSweeps away hunger!");
    public static final SlimefunItemStack RABBIT_JERKY = new SlimefunItemStack(
            "RABBIT_JERKY", Material.COOKED_RABBIT, "&6Rabbit Jerky", "", "&rSweeps away hunger!");
    public static final SlimefunItemStack FISH_JERKY =
            new SlimefunItemStack("FISH_JERKY", Material.COOKED_COD, "&6Fish Jerky", "", "&rSweeps away hunger!");
    public static final SlimefunItemStack KELP_COOKIE =
            new SlimefunItemStack("KELP_COOKIE", Material.COOKIE, "&2Kelp Cookie");

    /*		Christmas		*/
    public static final SlimefunItemStack CHRISTMAS_MILK = new SlimefunItemStack(
            "CHRISTMAS_MILK",
            Color.WHITE,
            new PotionEffect(PotionEffectType.SATURATION, 4, 0),
            "&6Glass of Milk",
            "",
            LoreBuilder.hunger(2.5));
    public static final SlimefunItemStack CHRISTMAS_CHOCOLATE_MILK = new SlimefunItemStack(
            "CHRISTMAS_CHOCOLATE_MILK",
            Color.MAROON,
            new PotionEffect(PotionEffectType.SATURATION, 11, 0),
            "&6Chocolate Milk",
            "",
            LoreBuilder.hunger(3.5));
    public static final SlimefunItemStack CHRISTMAS_EGG_NOG = new SlimefunItemStack(
            "CHRISTMAS_EGG_NOG",
            Color.GRAY,
            new PotionEffect(PotionEffectType.SATURATION, 6, 0),
            "&aEgg Nog",
            "",
            LoreBuilder.hunger(7));
    public static final SlimefunItemStack CHRISTMAS_APPLE_CIDER = new SlimefunItemStack(
            "CHRISTMAS_APPLE_CIDER",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 13, 0),
            "&cApple Cider",
            "",
            LoreBuilder.hunger(7));
    public static final SlimefunItemStack CHRISTMAS_COOKIE =
            new SlimefunItemStack("CHRISTMAS_COOKIE", Material.COOKIE, ChatUtils.christmas("Christmas Cookie"));
    public static final SlimefunItemStack CHRISTMAS_FRUIT_CAKE =
            new SlimefunItemStack("CHRISTMAS_FRUIT_CAKE", Material.PUMPKIN_PIE, ChatUtils.christmas("Fruit Cake"));
    public static final SlimefunItemStack CHRISTMAS_APPLE_PIE =
            new SlimefunItemStack("CHRISTMAS_APPLE_PIE", Material.PUMPKIN_PIE, "&rApple Pie");
    public static final SlimefunItemStack CHRISTMAS_HOT_CHOCOLATE = new SlimefunItemStack(
            "CHRISTMAS_HOT_CHOCOLATE",
            Color.MAROON,
            new PotionEffect(PotionEffectType.SATURATION, 13, 0),
            "&6Hot Chocolate",
            "",
            LoreBuilder.hunger(7));
    public static final SlimefunItemStack CHRISTMAS_CAKE =
            new SlimefunItemStack("CHRISTMAS_CAKE", Material.PUMPKIN_PIE, ChatUtils.christmas("Christmas Cake"));
    public static final SlimefunItemStack CHRISTMAS_CARAMEL =
            new SlimefunItemStack("CHRISTMAS_CARAMEL", Material.BRICK, "&6Caramel");
    public static final SlimefunItemStack CHRISTMAS_CARAMEL_APPLE =
            new SlimefunItemStack("CHRISTMAS_CARAMEL_APPLE", Material.APPLE, "&6Caramel Apple");
    public static final SlimefunItemStack CHRISTMAS_CHOCOLATE_APPLE =
            new SlimefunItemStack("CHRISTMAS_CHOCOLATE_APPLE", Material.APPLE, "&6Chocolate Apple");
    public static final SlimefunItemStack CHRISTMAS_PRESENT = new SlimefunItemStack(
            "CHRISTMAS_PRESENT",
            HeadTexture.CHRISTMAS_PRESENT,
            ChatUtils.christmas("Christmas Present"),
            "&7A gift from &eTheBusyBiscuit",
            "&7Recipient: &eYou",
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);

    /*		Easter			*/
    public static final SlimefunItemStack EASTER_EGG = new SlimefunItemStack(
            "EASTER_EGG",
            HeadTexture.EASTER_EGG,
            "&rEaster Egg",
            "&dHappy Easter! Open the gift to see.",
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack EASTER_CARROT_PIE =
            new SlimefunItemStack("CARROT_PIE", Material.PUMPKIN_PIE, "&6Carrot Pie");
    public static final SlimefunItemStack EASTER_APPLE_PIE =
            new SlimefunItemStack("EASTER_APPLE_PIE", Material.PUMPKIN_PIE, "&rApple Pie");

    /*		 Weapons 		*/
    public static final SlimefunItemStack GRANDMAS_WALKING_STICK =
            new SlimefunItemStack("GRANDMAS_WALKING_STICK", Material.STICK, "&7Grandma's Walking Stick");
    public static final SlimefunItemStack GRANDPAS_WALKING_STICK =
            new SlimefunItemStack("GRANDPAS_WALKING_STICK", Material.STICK, "&7Grandpa's Walking Stick");
    public static final SlimefunItemStack SWORD_OF_BEHEADING = new SlimefunItemStack(
            "SWORD_OF_BEHEADING",
            Material.IRON_SWORD,
            "&6Sword of Beheading",
            "&7Beheading II",
            "",
            "&rHas a chance to behead creatures",
            "&r(Increases chance of dropping Wither Skeleton Skulls)");
    public static final SlimefunItemStack BLADE_OF_VAMPIRES = new SlimefunItemStack(
            "BLADE_OF_VAMPIRES",
            Material.GOLDEN_SWORD,
            "&cBlade of Vampires",
            "&7Life Steal I",
            "",
            "&rHas a 45% chance when attacking",
            "to restore 2 health to yourself");
    public static final SlimefunItemStack SEISMIC_AXE = new SlimefunItemStack(
            "SEISMIC_AXE",
            Material.IRON_AXE,
            "&aSeismic Axe",
            "",
            "&7&oCreates an earthquake...",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);

    static {
        GRANDMAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
        GRANDPAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);

        BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
        BLADE_OF_VAMPIRES.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 4);
        BLADE_OF_VAMPIRES.addUnsafeEnchantment(VersionedEnchantment.SHARPNESS, 2);
    }

    /*		Bows		*/
    public static final SlimefunItemStack EXPLOSIVE_BOW = new SlimefunItemStack(
            "EXPLOSIVE_BOW",
            Material.BOW,
            "&cExplosive Bow",
            "&rArrows shot from this bow will launch targets into the air");
    public static final SlimefunItemStack ICY_BOW = new SlimefunItemStack(
            "ICY_BOW",
            Material.BOW,
            "&bIcy Bow",
            "&rArrows shot from this bow",
            "&rwill freeze targets, preventing movement (for 2 seconds)");

    /*		 Tools		*/
    public static final SlimefunItemStack SMELTERS_PICKAXE = new SlimefunItemStack(
            "SMELTERS_PICKAXE",
            Material.DIAMOND_PICKAXE,
            "&6Smelter's Pickaxe",
            "&c&lAuto-Smelting",
            "",
            "&9Has Fortune effect when mining");
    public static final SlimefunItemStack LUMBER_AXE =
            new SlimefunItemStack("LUMBER_AXE", Material.DIAMOND_AXE, "&6Lumber Axe", "&a&oChops down entire trees...");
    public static final SlimefunItemStack PICKAXE_OF_CONTAINMENT = new SlimefunItemStack(
            "PICKAXE_OF_CONTAINMENT", Material.IRON_PICKAXE, "&cPickaxe of Containment", "", "&9Can obtain spawners");
    public static final SlimefunItemStack EXPLOSIVE_PICKAXE = new SlimefunItemStack(
            "EXPLOSIVE_PICKAXE",
            Material.DIAMOND_PICKAXE,
            "&eExplosive Pickaxe",
            "",
            "&rMines ores quickly with explosions",
            "",
            "&9Supports Fortune enchantment");
    public static final SlimefunItemStack EXPLOSIVE_SHOVEL = new SlimefunItemStack(
            "EXPLOSIVE_SHOVEL",
            Material.DIAMOND_SHOVEL,
            "&eExplosive Shovel",
            "",
            "&rAllows you to dig many blocks at once");
    public static final SlimefunItemStack PICKAXE_OF_THE_SEEKER = new SlimefunItemStack(
            "PICKAXE_OF_THE_SEEKER",
            Material.DIAMOND_PICKAXE,
            "&aPickaxe of the Seeker",
            "&rWill point out nearby ores when used",
            "&rbut it may take damage",
            "",
            "&7&eRight-Click&7 to search for nearby ores");
    public static final SlimefunItemStack COBALT_PICKAXE =
            new SlimefunItemStack("COBALT_PICKAXE", Material.IRON_PICKAXE, "&9Cobalt Pickaxe");
    public static final SlimefunItemStack PICKAXE_OF_VEIN_MINING = new SlimefunItemStack(
            "PICKAXE_OF_VEIN_MINING",
            Material.DIAMOND_PICKAXE,
            "&ePickaxe of Vein Mining",
            "",
            "&rThis pickaxe will mine",
            "&rentire ore veins...");
    public static final SlimefunItemStack CLIMBING_PICK = new SlimefunItemStack(
            "CLIMBING_PICK",
            Material.IRON_PICKAXE,
            "&bClimbing Pick",
            "",
            "&fAllows you to right-click",
            "&fto climb on specified surfaces.",
            "&fEnchanting with Efficiency will increase climbing speed");

    static {
        COBALT_PICKAXE.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        COBALT_PICKAXE.addUnsafeEnchantment(VersionedEnchantment.EFFICIENCY, 6);
    }

    /*		 Armor 		*/
    public static final SlimefunItemStack GLOWSTONE_HELMET = new SlimefunItemStack(
            "GLOWSTONE_HELMET",
            Material.LEATHER_HELMET,
            Color.YELLOW,
            "&e&lGlowstone Helmet",
            "",
            "&a&oShines like the sun!",
            "",
            "&9+ Night Vision effect");
    public static final SlimefunItemStack GLOWSTONE_CHESTPLATE = new SlimefunItemStack(
            "GLOWSTONE_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.YELLOW,
            "&e&lGlowstone Chestplate",
            "",
            "&a&oShines like the sun!",
            "",
            "&9+ Night Vision effect");
    public static final SlimefunItemStack GLOWSTONE_LEGGINGS = new SlimefunItemStack(
            "GLOWSTONE_LEGGINGS",
            Material.LEATHER_LEGGINGS,
            Color.YELLOW,
            "&e&lGlowstone Leggings",
            "",
            "&a&oShines like the sun!",
            "",
            "&9+ Night Vision effect");
    public static final SlimefunItemStack GLOWSTONE_BOOTS = new SlimefunItemStack(
            "GLOWSTONE_BOOTS",
            Material.LEATHER_BOOTS,
            Color.YELLOW,
            "&e&lGlowstone Boots",
            "",
            "&a&oShines like the sun!",
            "",
            "&9+ Night Vision effect");
    public static final SlimefunItemStack RAINBOW_LEATHER = new SlimefunItemStack(
            "RAINBOW_LEATHER",
            Material.RABBIT_HIDE,
            Color.FUCHSIA,
            "&dRainbow Leather",
            "",
            "&fUsed to craft rainbow equipment");
    public static final SlimefunItemStack RAINBOW_HELMET = new SlimefunItemStack(
            "RAINBOW_HELMET", Material.LEATHER_HELMET, Color.FUCHSIA, "&d&lRainbow Helmet", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_CHESTPLATE = new SlimefunItemStack(
            "RAINBOW_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.FUCHSIA,
            "&d&lRainbow Chestplate",
            "",
            LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_LEGGINGS = new SlimefunItemStack(
            "RAINBOW_LEGGINGS",
            Material.LEATHER_LEGGINGS,
            Color.FUCHSIA,
            "&d&lRainbow Leggings",
            "",
            LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_BOOTS = new SlimefunItemStack(
            "RAINBOW_BOOTS", Material.LEATHER_BOOTS, Color.FUCHSIA, "&d&lRainbow Boots", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack ENDER_HELMET = new SlimefunItemStack(
            "ENDER_HELMET",
            Material.LEATHER_HELMET,
            Color.fromRGB(28, 25, 112),
            "&5&lEnder Helmet",
            "",
            "&a&oFree Movement");
    public static final SlimefunItemStack ENDER_CHESTPLATE = new SlimefunItemStack(
            "ENDER_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.fromRGB(28, 25, 112),
            "&5&lEnder Chestplate",
            "",
            "&a&oFree Movement");
    public static final SlimefunItemStack ENDER_LEGGINGS = new SlimefunItemStack(
            "ENDER_LEGGINGS",
            Material.LEATHER_LEGGINGS,
            Color.fromRGB(28, 25, 112),
            "&5&lEnder Leggings",
            "",
            "&a&oFree Movement");
    public static final SlimefunItemStack ENDER_BOOTS = new SlimefunItemStack(
            "ENDER_BOOTS",
            Material.LEATHER_BOOTS,
            Color.fromRGB(28, 25, 112),
            "&5&lEnder Boots",
            "",
            "&a&oFree Movement",
            "",
            "&9+ No damage when using ender pearls");

    public static final SlimefunItemStack SLIME_HELMET = new SlimefunItemStack(
            "SLIME_HELMET", Material.LEATHER_HELMET, Color.LIME, "&a&lSlime Helmet", "", "&a&oFeels bouncy");
    public static final SlimefunItemStack SLIME_CHESTPLATE = new SlimefunItemStack(
            "SLIME_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.LIME,
            "&a&lSlime Chestplate",
            "",
            "&a&oFeels bouncy");
    public static final SlimefunItemStack SLIME_LEGGINGS = new SlimefunItemStack(
            "SLIME_LEGGINGS",
            Material.LEATHER_LEGGINGS,
            Color.LIME,
            "&a&lSlime Leggings",
            "",
            "&a&oFeels bouncy",
            "",
            "&9+ Speed");
    public static final SlimefunItemStack SLIME_BOOTS = new SlimefunItemStack(
            "SLIME_BOOTS",
            Material.LEATHER_BOOTS,
            Color.LIME,
            "&a&lSlime Boots",
            "",
            "&a&oFeels bouncy",
            "",
            "&9+ Jump Boost",
            "&9+ Fall Damage Reduction");

    public static final SlimefunItemStack CACTUS_HELMET =
            new SlimefunItemStack("CACTUS_HELMET", Material.LEATHER_HELMET, Color.GREEN, "&2Cactus Helmet");
    public static final SlimefunItemStack CACTUS_CHESTPLATE =
            new SlimefunItemStack("CACTUS_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.GREEN, "&2Cactus Chestplate");
    public static final SlimefunItemStack CACTUS_LEGGINGS =
            new SlimefunItemStack("CACTUS_LEGGINGS", Material.LEATHER_LEGGINGS, Color.GREEN, "&2Cactus Leggings");
    public static final SlimefunItemStack CACTUS_BOOTS =
            new SlimefunItemStack("CACTUS_BOOTS", Material.LEATHER_BOOTS, Color.GREEN, "&2Cactus Boots");

    public static final SlimefunItemStack DAMASCUS_STEEL_HELMET =
            new SlimefunItemStack("DAMASCUS_STEEL_HELMET", Material.IRON_HELMET, "&7Damascus Steel Helmet");
    public static final SlimefunItemStack DAMASCUS_STEEL_CHESTPLATE =
            new SlimefunItemStack("DAMASCUS_STEEL_CHESTPLATE", Material.IRON_CHESTPLATE, "&7Damascus Steel Chestplate");
    public static final SlimefunItemStack DAMASCUS_STEEL_LEGGINGS =
            new SlimefunItemStack("DAMASCUS_STEEL_LEGGINGS", Material.IRON_LEGGINGS, "&7Damascus Steel Leggings");
    public static final SlimefunItemStack DAMASCUS_STEEL_BOOTS =
            new SlimefunItemStack("DAMASCUS_STEEL_BOOTS", Material.IRON_BOOTS, "&7Damascus Steel Boots");

    public static final SlimefunItemStack REINFORCED_ALLOY_HELMET =
            new SlimefunItemStack("REINFORCED_ALLOY_HELMET", Material.IRON_HELMET, "&bReinforced Alloy Helmet");
    public static final SlimefunItemStack REINFORCED_ALLOY_CHESTPLATE = new SlimefunItemStack(
            "REINFORCED_ALLOY_CHESTPLATE", Material.IRON_CHESTPLATE, "&bReinforced Alloy Chestplate");
    public static final SlimefunItemStack REINFORCED_ALLOY_LEGGINGS =
            new SlimefunItemStack("REINFORCED_ALLOY_LEGGINGS", Material.IRON_LEGGINGS, "&bReinforced Alloy Leggings");
    public static final SlimefunItemStack REINFORCED_ALLOY_BOOTS =
            new SlimefunItemStack("REINFORCED_ALLOY_BOOTS", Material.IRON_BOOTS, "&bReinforced Alloy Boots");

    private static final List<String> hazmatLore = new ArrayList<>();

    static {
        hazmatLore.add("");
        hazmatLore.add(ChatColor.GOLD + "Full Set Effect:");
        hazmatLore.add(ChatColor.YELLOW + "- Immune to radiation damage");
        hazmatLore.add(ChatColor.YELLOW + "- Immune to bee sting damage");
    }

    public static final SlimefunItemStack SCUBA_HELMET = new SlimefunItemStack(
            "SCUBA_HELMET",
            Material.LEATHER_HELMET,
            Color.ORANGE,
            "&cScuba Helmet",
            "",
            "&7Allows you to breathe underwater");
    public static final SlimefunItemStack HAZMAT_CHESTPLATE = new SlimefunItemStack(
            "HAZMAT_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.ORANGE,
            "&cHazmat Suit",
            "",
            "&7Allows you to walk in fire and lava");
    public static final SlimefunItemStack HAZMAT_LEGGINGS = new SlimefunItemStack(
            "HAZMAT_LEGGINGS",
            Material.LEATHER_LEGGINGS,
            Color.ORANGE,
            "&cHazmat Leggings",
            hazmatLore.toArray(new String[0]));
    public static final SlimefunItemStack HAZMAT_BOOTS = new SlimefunItemStack(
            "RUBBER_BOOTS", Material.LEATHER_BOOTS, Color.BLACK, "&cHazmat Boots", hazmatLore.toArray(new String[0]));

    static {
        ItemMeta helmetMeta = SCUBA_HELMET.getItemMeta();
        List<String> helmetLore = helmetMeta.getLore();
        helmetLore.addAll(hazmatLore);
        helmetMeta.setLore(helmetLore);
        SCUBA_HELMET.setItemMeta(helmetMeta);

        ItemMeta chestplateMeta = HAZMAT_CHESTPLATE.getItemMeta();
        List<String> chestplateLore = chestplateMeta.getLore();
        chestplateLore.addAll(hazmatLore);
        chestplateMeta.setLore(chestplateLore);
        HAZMAT_CHESTPLATE.setItemMeta(chestplateMeta);
    }

    public static final SlimefunItemStack GILDED_IRON_HELMET =
            new SlimefunItemStack("GILDED_IRON_HELMET", Material.GOLDEN_HELMET, "&6Gilded Iron Helmet");
    public static final SlimefunItemStack GILDED_IRON_CHESTPLATE =
            new SlimefunItemStack("GILDED_IRON_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "&6Gilded Iron Chestplate");
    public static final SlimefunItemStack GILDED_IRON_LEGGINGS =
            new SlimefunItemStack("GILDED_IRON_LEGGINGS", Material.GOLDEN_LEGGINGS, "&6Gilded Iron Leggings");
    public static final SlimefunItemStack GILDED_IRON_BOOTS =
            new SlimefunItemStack("GILDED_IRON_BOOTS", Material.GOLDEN_BOOTS, "&6Gilded Iron Boots");

    public static final SlimefunItemStack GOLDEN_HELMET_12K =
            new SlimefunItemStack("GOLD_12K_HELMET", Material.GOLDEN_HELMET, "&6Gold Helmet", "&912 Carat");
    public static final SlimefunItemStack GOLDEN_CHESTPLATE_12K =
            new SlimefunItemStack("GOLD_12K_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "&6Gold Chestplate", "&912 Carat");
    public static final SlimefunItemStack GOLDEN_LEGGINGS_12K =
            new SlimefunItemStack("GOLD_12K_LEGGINGS", Material.GOLDEN_LEGGINGS, "&6Gold Leggings", "&912 Carat");
    public static final SlimefunItemStack GOLDEN_BOOTS_12K =
            new SlimefunItemStack("GOLD_12K_BOOTS", Material.GOLDEN_BOOTS, "&6Gold Boots", "&912 Carat");

    public static final SlimefunItemStack SLIME_HELMET_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_HELMET", Material.IRON_HELMET, "&a&lSlime Helmet", "&7&oReinforced", "", "&a&oFeels bouncy");
    public static final SlimefunItemStack SLIME_CHESTPLATE_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_CHESTPLATE",
            Material.IRON_CHESTPLATE,
            "&a&lSlime Chestplate",
            "&7&oReinforced",
            "",
            "&a&oFeels bouncy");
    public static final SlimefunItemStack SLIME_LEGGINGS_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_LEGGINGS",
            Material.IRON_LEGGINGS,
            "&a&lSlime Leggings",
            "&7&oReinforced",
            "",
            "&a&oFeels bouncy",
            "",
            "&9+ Speed");
    public static final SlimefunItemStack SLIME_BOOTS_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_BOOTS",
            Material.IRON_BOOTS,
            "&a&lSlime Boots",
            "&7&oReinforced",
            "",
            "&a&oFeels bouncy",
            "",
            "&9+ Jump Boost",
            "&9+ Fall Damage Reduction");

    public static final SlimefunItemStack BOOTS_OF_THE_STOMPER = new SlimefunItemStack(
            "BOOTS_OF_THE_STOMPER",
            Material.LEATHER_BOOTS,
            Color.AQUA,
            "&bBoots of the Stomper",
            "",
            "&9All fall damage you take",
            "&9will be transferred to nearby mobs/players",
            "",
            "&9+ Fall Damage Reduction");

    public static final SlimefunItemStack BEE_HELMET =
            new SlimefunItemStack("BEE_HELMET", Material.GOLDEN_HELMET, "&e&lBee Helmet", " ", "&fBuzz buzz");
    public static final SlimefunItemStack BEE_WINGS = new SlimefunItemStack(
            "BEE_WINGS",
            Material.ELYTRA,
            "&e&lBee Wings",
            " ",
            "&fBuzz buzz",
            " ",
            "&9When near the ground",
            "&9slow fall mode will activate",
            " ");
    public static final SlimefunItemStack BEE_LEGGINGS =
            new SlimefunItemStack("BEE_LEGGINGS", Material.GOLDEN_LEGGINGS, "&e&lBee Leggings", " ", "&fBuzz buzz");
    public static final SlimefunItemStack BEE_BOOTS = new SlimefunItemStack(
            "BEE_BOOTS",
            Material.GOLDEN_BOOTS,
            "&e&lBee Boots",
            "&fBuzz buzz",
            "",
            "&e&oAbsolutely fine for takeoff again",
            "",
            "&9+ Jump Boost",
            "&9+ Fall Damage Reduction");

    static {
        Map<Enchantment, Integer> cactusEnchs = new HashMap<>();
        cactusEnchs.put(Enchantment.THORNS, 3);
        cactusEnchs.put(VersionedEnchantment.UNBREAKING, 6);

        CACTUS_HELMET.addUnsafeEnchantments(cactusEnchs);
        CACTUS_CHESTPLATE.addUnsafeEnchantments(cactusEnchs);
        CACTUS_LEGGINGS.addUnsafeEnchantments(cactusEnchs);
        CACTUS_BOOTS.addUnsafeEnchantments(cactusEnchs);

        Map<Enchantment, Integer> damascusEnchs = new HashMap<>();
        damascusEnchs.put(VersionedEnchantment.UNBREAKING, 5);
        damascusEnchs.put(VersionedEnchantment.PROTECTION, 5);

        DAMASCUS_STEEL_HELMET.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_CHESTPLATE.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_LEGGINGS.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_BOOTS.addUnsafeEnchantments(damascusEnchs);

        Map<Enchantment, Integer> reinforcedEnchs = new HashMap<>();
        reinforcedEnchs.put(VersionedEnchantment.UNBREAKING, 9);
        reinforcedEnchs.put(VersionedEnchantment.PROTECTION, 9);

        REINFORCED_ALLOY_HELMET.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_CHESTPLATE.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_LEGGINGS.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_BOOTS.addUnsafeEnchantments(reinforcedEnchs);

        Map<Enchantment, Integer> gildedEnchs = new HashMap<>();
        gildedEnchs.put(VersionedEnchantment.UNBREAKING, 6);
        gildedEnchs.put(VersionedEnchantment.PROTECTION, 8);

        GILDED_IRON_HELMET.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_CHESTPLATE.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_LEGGINGS.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_BOOTS.addUnsafeEnchantments(gildedEnchs);

        GOLDEN_HELMET_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_CHESTPLATE_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_LEGGINGS_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_BOOTS_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);

        Map<Enchantment, Integer> slimeEnchs = new HashMap<>();
        slimeEnchs.put(VersionedEnchantment.UNBREAKING, 4);
        slimeEnchs.put(VersionedEnchantment.PROTECTION, 2);

        SLIME_HELMET_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_CHESTPLATE_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_LEGGINGS_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_BOOTS_STEEL.addUnsafeEnchantments(slimeEnchs);

        Map<Enchantment, Integer> beeEnchs = new HashMap<>();
        beeEnchs.put(VersionedEnchantment.UNBREAKING, 4);
        beeEnchs.put(VersionedEnchantment.PROTECTION, 2);

        BEE_HELMET.addUnsafeEnchantments(beeEnchs);
        BEE_WINGS.addUnsafeEnchantments(beeEnchs);
        BEE_LEGGINGS.addUnsafeEnchantments(beeEnchs);
        BEE_BOOTS.addUnsafeEnchantments(beeEnchs);
    }

    /*		 Misc 		*/
    public static final SlimefunItemStack MAGIC_LUMP_1 =
            new SlimefunItemStack("MAGIC_LUMP_1", Material.GOLD_NUGGET, "&6Magic Lump &7- &eI", "", "&c&oLevel: I");
    public static final SlimefunItemStack MAGIC_LUMP_2 =
            new SlimefunItemStack("MAGIC_LUMP_2", Material.GOLD_NUGGET, "&6Magic Lump &7- &eII", "", "&c&oLevel: II");
    public static final SlimefunItemStack MAGIC_LUMP_3 =
            new SlimefunItemStack("MAGIC_LUMP_3", Material.GOLD_NUGGET, "&6Magic Lump &7- &eIII", "", "&c&oLevel: III");
    public static final SlimefunItemStack ENDER_LUMP_1 =
            new SlimefunItemStack("ENDER_LUMP_1", Material.GOLD_NUGGET, "&5Ender Lump &7- &eI", "", "&c&oLevel: I");
    public static final SlimefunItemStack ENDER_LUMP_2 =
            new SlimefunItemStack("ENDER_LUMP_2", Material.GOLD_NUGGET, "&5Ender Lump &7- &eII", "", "&c&oLevel: II");
    public static final SlimefunItemStack ENDER_LUMP_3 =
            new SlimefunItemStack("ENDER_LUMP_3", Material.GOLD_NUGGET, "&5Ender Lump &7- &eIII", "", "&c&oLevel: III");
    public static final SlimefunItemStack MAGICAL_BOOK_COVER = new SlimefunItemStack(
            "MAGICAL_BOOK_COVER", Material.PAPER, "&6Magical Book Cover", "", "&a&oUsed for various magic books");
    public static final SlimefunItemStack MAGICAL_GLASS = new SlimefunItemStack(
            "MAGICAL_GLASS", Material.GLASS_PANE, "&6Magical Glass", "", "&a&oUsed by various magical items");
    public static final SlimefunItemStack SYNTHETIC_SHULKER_SHELL = new SlimefunItemStack(
            "SYNTHETIC_SHULKER_SHELL",
            Material.SHULKER_SHELL,
            "&dSynthetic Shulker Shell",
            "",
            "&fCan be used in crafting table",
            "&fjust like regular shulker shells");
    public static final SlimefunItemStack BASIC_CIRCUIT_BOARD =
            new SlimefunItemStack("BASIC_CIRCUIT_BOARD", Material.ACTIVATOR_RAIL, "&bBasic Circuit Board");
    public static final SlimefunItemStack ADVANCED_CIRCUIT_BOARD =
            new SlimefunItemStack("ADVANCED_CIRCUIT_BOARD", Material.POWERED_RAIL, "&bAdvanced Circuit Board");
    public static final SlimefunItemStack WHEAT_FLOUR =
            new SlimefunItemStack("WHEAT_FLOUR", Material.SUGAR, "&rWheat Flour");
    public static final SlimefunItemStack STEEL_PLATE =
            new SlimefunItemStack("STEEL_PLATE", Material.PAPER, "&7&lSteel Plate");
    public static final SlimefunItemStack BATTERY = new SlimefunItemStack("BATTERY", HeadTexture.BATTERY, "&6Battery");
    public static final SlimefunItemStack CARBON = new SlimefunItemStack("CARBON", HeadTexture.CARBON, "&eCarbon");
    public static final SlimefunItemStack COMPRESSED_CARBON =
            new SlimefunItemStack("COMPRESSED_CARBON", HeadTexture.COMPRESSED_CARBON, "&cCompressed Carbon");
    public static final SlimefunItemStack CARBON_CHUNK =
            new SlimefunItemStack("CARBON_CHUNK", HeadTexture.CARBON, "&4Carbon Chunk");
    public static final SlimefunItemStack STEEL_THRUSTER =
            new SlimefunItemStack("STEEL_THRUSTER", Material.BUCKET, "&7&lSteel Thruster");
    public static final SlimefunItemStack POWER_CRYSTAL =
            new SlimefunItemStack("POWER_CRYSTAL", HeadTexture.POWER_CRYSTAL, "&c&lPower Crystal");
    public static final SlimefunItemStack CHAIN = new SlimefunItemStack("CHAIN", Material.STRING, "&bChain");
    public static final SlimefunItemStack HOOK = new SlimefunItemStack("HOOK", Material.FLINT, "&bHook");
    public static final SlimefunItemStack SIFTED_ORE =
            new SlimefunItemStack("SIFTED_ORE", Material.GUNPOWDER, "&6Sifted Ore");
    public static final SlimefunItemStack STONE_CHUNK =
            new SlimefunItemStack("STONE_CHUNK", HeadTexture.STONE_CHUNK, "&6Stone Chunk");
    public static final SlimefunItemStack LAVA_CRYSTAL =
            new SlimefunItemStack("LAVA_CRYSTAL", HeadTexture.LAVA_CRYSTAL, "&4Lava Crystal");
    public static final SlimefunItemStack SALT = new SlimefunItemStack("SALT", Material.SUGAR, "&rSalt");
    public static final SlimefunItemStack CHEESE = new SlimefunItemStack("CHEESE", HeadTexture.CHEESE, "&rCheese");
    public static final SlimefunItemStack BUTTER = new SlimefunItemStack("BUTTER", HeadTexture.BUTTER, "&rButter");
    public static final SlimefunItemStack DUCT_TAPE = new SlimefunItemStack(
            "DUCT_TAPE",
            HeadTexture.DUCT_TAPE,
            "&8Duct Tape",
            "",
            "&rCan be used in the Auto-Anvil",
            "&rto repair items");
    public static final SlimefunItemStack HEAVY_CREAM =
            new SlimefunItemStack("HEAVY_CREAM", Material.SNOWBALL, "&rHeavy Cream");
    public static final SlimefunItemStack CRUSHED_ORE =
            new SlimefunItemStack("CRUSHED_ORE", Material.GUNPOWDER, "&6Crushed Ore");
    public static final SlimefunItemStack PULVERIZED_ORE =
            new SlimefunItemStack("PULVERIZED_ORE", Material.GUNPOWDER, "&6Pulverized Ore");
    public static final SlimefunItemStack PURE_ORE_CLUSTER =
            new SlimefunItemStack("PURE_ORE_CLUSTER", Material.GUNPOWDER, "&6Pure Ore Cluster");
    public static final SlimefunItemStack SMALL_URANIUM = new SlimefunItemStack(
            "SMALL_URANIUM",
            HeadTexture.URANIUM,
            "&cSmall Uranium",
            "",
            LoreBuilder.radioactive(Radioactivity.MODERATE),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack TINY_URANIUM = new SlimefunItemStack(
            "TINY_URANIUM", HeadTexture.URANIUM, "&cTiny Uranium", "", LoreBuilder.radioactive(Radioactivity.LOW));

    public static final SlimefunItemStack MAGNET = new SlimefunItemStack("MAGNET", HeadTexture.MAGNET, "&cMagnet");
    public static final SlimefunItemStack NECROTIC_SKULL =
            new SlimefunItemStack("NECROTIC_SKULL", HeadTexture.NECROTIC_SKULL, "&cNecrotic Skull");
    public static final SlimefunItemStack ESSENCE_OF_AFTERLIFE =
            new SlimefunItemStack("ESSENCE_OF_AFTERLIFE", Material.GUNPOWDER, "&4Essence of Afterlife");
    public static final SlimefunItemStack STRANGE_NETHER_GOO = new SlimefunItemStack(
            "STRANGE_NETHER_GOO",
            Material.PURPLE_DYE,
            "&5Strange Nether Goo",
            "",
            "&fA strange substance",
            "&fCan be obtained by trading with Piglins");
    public static final SlimefunItemStack ELECTRO_MAGNET =
            new SlimefunItemStack("ELECTRO_MAGNET", HeadTexture.MAGNET, "&cElectromagnet");
    public static final SlimefunItemStack HEATING_COIL =
            new SlimefunItemStack("HEATING_COIL", HeadTexture.HEATING_COIL, "&cHeating Coil");
    public static final SlimefunItemStack COOLING_UNIT =
            new SlimefunItemStack("COOLING_UNIT", HeadTexture.COOLING_UNIT, "&bCooling Unit");
    public static final SlimefunItemStack ELECTRIC_MOTOR =
            new SlimefunItemStack("ELECTRIC_MOTOR", HeadTexture.MOTOR, "&cElectric Motor");
    public static final SlimefunItemStack CARGO_MOTOR = new SlimefunItemStack(
            "CARGO_MOTOR",
            HeadTexture.CARGO_MOTOR,
            "&3Cargo Motor",
            "",
            "&7Important component for cargo network related machines");
    public static final SlimefunItemStack SCROLL_OF_DIMENSIONAL_TELEPOSITION = new SlimefunItemStack(
            "SCROLL_OF_DIMENSIONAL_TELEPOSITION",
            Material.PAPER,
            "&6Scroll of Dimensional Teleposition",
            "",
            "&cThis scroll can portably create",
            "&ca temporary black hole",
            "&cthat teleports nearby entities",
            "&cto another dimension",
            "&ceverything is reversed",
            "",
            "&rMeaning: rotate entities 180°");
    public static final SlimefunItemStack TOME_OF_KNOWLEDGE_SHARING = new SlimefunItemStack(
            "TOME_OF_KNOWLEDGE_SHARING",
            Material.ENCHANTED_BOOK,
            "&6Tome of Knowledge Sharing",
            "&7Owner: &bNone",
            "",
            "&eRight-Click&7 to bind all your researches",
            "",
            "",
            "&eRight-Click&7 to obtain all researches from the previous owner");
    public static final SlimefunItemStack HARDENED_GLASS = new SlimefunItemStack(
            "HARDENED_GLASS", Material.LIGHT_GRAY_STAINED_GLASS, "&7Hardened Glass", "", "&rCan resist explosions");
    public static final SlimefunItemStack WITHER_PROOF_OBSIDIAN = new SlimefunItemStack(
            "WITHER_PROOF_OBSIDIAN",
            Material.OBSIDIAN,
            "&5Wither-Proof Obsidian",
            "",
            "&rCan resist explosions and",
            "&rWither attacks");
    public static final SlimefunItemStack WITHER_PROOF_GLASS = new SlimefunItemStack(
            "WITHER_PROOF_GLASS",
            Material.PURPLE_STAINED_GLASS,
            "&5Wither-Proof Glass",
            "",
            "&rCan resist explosions and",
            "&rWither attacks");
    public static final SlimefunItemStack REINFORCED_PLATE =
            new SlimefunItemStack("REINFORCED_PLATE", Material.PAPER, "&7Reinforced Plate");
    public static final SlimefunItemStack ANCIENT_PEDESTAL = new SlimefunItemStack(
            "ANCIENT_PEDESTAL", Material.DISPENSER, "&dAncient Pedestal", "", "&5Part of the Ancient Altar");
    public static final SlimefunItemStack ANCIENT_ALTAR = new SlimefunItemStack(
            "ANCIENT_ALTAR",
            Material.ENCHANTING_TABLE,
            "&dAncient Altar",
            "",
            "&5Build an altar in the world",
            "&5and craft items using ancient rituals");
    public static final SlimefunItemStack COPPER_WIRE = new SlimefunItemStack(
            "COPPER_WIRE", Material.STRING, "&6Copper Wire", "", "&6Important component in electronic parts");
    public static final SlimefunItemStack CRAFTING_MOTOR = new SlimefunItemStack(
            "CRAFTING_MOTOR",
            HeadTexture.CRAFTING_MOTOR,
            "&6Crafting Motor",
            "",
            "&7Important component for auto-crafters");

    public static final SlimefunItemStack RAINBOW_WOOL =
            new SlimefunItemStack("RAINBOW_WOOL", Material.WHITE_WOOL, "&5Rainbow Wool", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLASS = new SlimefunItemStack(
            "RAINBOW_GLASS", Material.WHITE_STAINED_GLASS, "&5Rainbow Glass", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_CLAY =
            new SlimefunItemStack("RAINBOW_CLAY", Material.WHITE_TERRACOTTA, "&5Rainbow Clay", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE", Material.WHITE_STAINED_GLASS_PANE, "&5Rainbow Glass Pane", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_CONCRETE = new SlimefunItemStack(
            "RAINBOW_CONCRETE", Material.WHITE_CONCRETE, "&5Rainbow Concrete", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA",
            Material.WHITE_GLAZED_TERRACOTTA,
            "&5Rainbow Glazed Terracotta",
            "",
            LoreBuilder.RAINBOW);

    private static final String CHRISTMAS = ChatUtils.christmas("< Christmas Edition >");

    public static final SlimefunItemStack RAINBOW_WOOL_XMAS = new SlimefunItemStack(
            "RAINBOW_WOOL_XMAS", Material.WHITE_WOOL, "&5Rainbow Wool &7(Christmas Edition)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLASS_XMAS = new SlimefunItemStack(
            "RAINBOW_GLASS_XMAS", Material.WHITE_STAINED_GLASS, "&5Rainbow Glass &7(Christmas Edition)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_CLAY_XMAS = new SlimefunItemStack(
            "RAINBOW_CLAY_XMAS", Material.WHITE_TERRACOTTA, "&5Rainbow Clay &7(Christmas Edition)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_XMAS = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE_XMAS",
            Material.WHITE_STAINED_GLASS_PANE,
            "&5Rainbow Glass Pane &7(Christmas Edition)",
            "",
            CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_CONCRETE_XMAS = new SlimefunItemStack(
            "RAINBOW_CONCRETE_XMAS",
            Material.WHITE_CONCRETE,
            "&5Rainbow Concrete &7(Christmas Edition)",
            "",
            CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_XMAS = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA_XMAS",
            Material.WHITE_GLAZED_TERRACOTTA,
            "&5Rainbow Glazed Terracotta &7(Christmas Edition)",
            "",
            CHRISTMAS);

    private static final String VALENTINES_DAY = "&d< Valentine's Day Edition >";

    public static final SlimefunItemStack RAINBOW_WOOL_VALENTINE = new SlimefunItemStack(
            "RAINBOW_WOOL_VALENTINE",
            Material.PINK_WOOL,
            "&5Rainbow Wool &7(Valentine's Day Edition)",
            "",
            VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLASS_VALENTINE = new SlimefunItemStack(
            "RAINBOW_GLASS_VALENTINE",
            Material.PINK_STAINED_GLASS,
            "&5Rainbow Glass &7(Valentine's Day Edition)",
            "",
            VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_CLAY_VALENTINE = new SlimefunItemStack(
            "RAINBOW_CLAY_VALENTINE",
            Material.PINK_TERRACOTTA,
            "&5Rainbow Clay &7(Valentine's Day Edition)",
            "",
            VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_VALENTINE = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE_VALENTINE",
            Material.PINK_STAINED_GLASS_PANE,
            "&5Rainbow Glass Pane &7(Valentine's Day Edition)",
            "",
            VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_CONCRETE_VALENTINE = new SlimefunItemStack(
            "RAINBOW_CONCRETE_VALENTINE",
            Material.PINK_CONCRETE,
            "&5Rainbow Concrete &7(Valentine's Day Edition)",
            "",
            VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_VALENTINE = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA_VALENTINE",
            Material.PINK_GLAZED_TERRACOTTA,
            "&5Rainbow Glazed Terracotta &7(Valentine's Day Edition)",
            "",
            VALENTINES_DAY);

    private static final String HALLOWEEN = "&6< Halloween Edition >";

    public static final SlimefunItemStack RAINBOW_WOOL_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_WOOL_HALLOWEEN", Material.ORANGE_WOOL, "&5Rainbow Wool &7(Halloween Edition)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLASS_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_GLASS_HALLOWEEN",
            Material.ORANGE_STAINED_GLASS,
            "&5Rainbow Glass &7(Halloween Edition)",
            "",
            HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_CLAY_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_CLAY_HALLOWEEN",
            Material.ORANGE_TERRACOTTA,
            "&5Rainbow Clay &7(Halloween Edition)",
            "",
            HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE_HALLOWEEN",
            Material.ORANGE_STAINED_GLASS_PANE,
            "&5Rainbow Glass Pane &7(Halloween Edition)",
            "",
            HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_CONCRETE_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_CONCRETE_HALLOWEEN",
            Material.ORANGE_CONCRETE,
            "&5Rainbow Concrete &7(Halloween Edition)",
            "",
            HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA_HALLOWEEN",
            Material.ORANGE_GLAZED_TERRACOTTA,
            "&5Rainbow Glazed Terracotta &7(Halloween Edition)",
            "",
            HALLOWEEN);

    /*		Ingots		*/
    public static final SlimefunItemStack COPPER_INGOT =
            new SlimefunItemStack("COPPER_INGOT", Material.BRICK, "&bCopper Ingot");
    public static final SlimefunItemStack TIN_INGOT =
            new SlimefunItemStack("TIN_INGOT", Material.IRON_INGOT, "&bTin Ingot");
    public static final SlimefunItemStack SILVER_INGOT =
            new SlimefunItemStack("SILVER_INGOT", Material.IRON_INGOT, "&bSilver Ingot");
    public static final SlimefunItemStack ALUMINUM_INGOT =
            new SlimefunItemStack("ALUMINUM_INGOT", Material.IRON_INGOT, "&bAluminum Ingot");
    public static final SlimefunItemStack LEAD_INGOT =
            new SlimefunItemStack("LEAD_INGOT", Material.IRON_INGOT, "&bLead Ingot");
    public static final SlimefunItemStack ZINC_INGOT =
            new SlimefunItemStack("ZINC_INGOT", Material.IRON_INGOT, "&bZinc Ingot");
    public static final SlimefunItemStack MAGNESIUM_INGOT =
            new SlimefunItemStack("MAGNESIUM_INGOT", Material.IRON_INGOT, "&bMagnesium Ingot");

    /*		Alloy (Carbon + Iron)	*/
    public static final SlimefunItemStack STEEL_INGOT =
            new SlimefunItemStack("STEEL_INGOT", Material.IRON_INGOT, "&bSteel Ingot");
    /*		Alloy (Copper + Tin)	*/
    public static final SlimefunItemStack BRONZE_INGOT =
            new SlimefunItemStack("BRONZE_INGOT", Material.BRICK, "&bBronze Ingot");
    /*		Alloy (Copper + Aluminum)	*/
    public static final SlimefunItemStack DURALUMIN_INGOT =
            new SlimefunItemStack("DURALUMIN_INGOT", Material.IRON_INGOT, "&bDuralumin Ingot");
    /*		Alloy (Copper + Silver)	*/
    public static final SlimefunItemStack BILLON_INGOT =
            new SlimefunItemStack("BILLON_INGOT", Material.IRON_INGOT, "&bBillon Ingot");
    /*		Alloy (Copper + Zinc)	*/
    public static final SlimefunItemStack BRASS_INGOT =
            new SlimefunItemStack("BRASS_INGOT", Material.GOLD_INGOT, "&bBrass Ingot");
    /*		Alloy (Aluminum + Brass)	*/
    public static final SlimefunItemStack ALUMINUM_BRASS_INGOT =
            new SlimefunItemStack("ALUMINUM_BRASS_INGOT", Material.GOLD_INGOT, "&bAluminum Brass Ingot");
    /*		Alloy (Aluminum + Bronze)	*/
    public static final SlimefunItemStack ALUMINUM_BRONZE_INGOT =
            new SlimefunItemStack("ALUMINUM_BRONZE_INGOT", Material.GOLD_INGOT, "&bAluminum Bronze Ingot");
    /*		Alloy (Gold + Silver + Copper)	*/
    public static final SlimefunItemStack CORINTHIAN_BRONZE_INGOT =
            new SlimefunItemStack("CORINTHIAN_BRONZE_INGOT", Material.GOLD_INGOT, "&bCorinthian Bronze Ingot");
    /*		Alloy (Lead + Tin)	*/
    public static final SlimefunItemStack SOLDER_INGOT =
            new SlimefunItemStack("SOLDER_INGOT", Material.IRON_INGOT, "&bSolder Ingot");
    /*		Alloy (Steel + Iron + Carbon)	*/
    public static final SlimefunItemStack DAMASCUS_STEEL_INGOT =
            new SlimefunItemStack("DAMASCUS_STEEL_INGOT", Material.IRON_INGOT, "&bDamascus Steel Ingot");
    /*		Alloy (Damascus Steel + Duralumin + Compressed Carbon + Aluminium Bronze)	*/
    public static final SlimefunItemStack HARDENED_METAL_INGOT =
            new SlimefunItemStack("HARDENED_METAL_INGOT", Material.IRON_INGOT, "&b&lHardened Metal");
    /*		Alloy (Hardened Metal + Corinthian Bronze + Solder + Billon + Damascus Steel)	*/
    public static final SlimefunItemStack REINFORCED_ALLOY_INGOT =
            new SlimefunItemStack("REINFORCED_ALLOY_INGOT", Material.IRON_INGOT, "&b&lReinforced Alloy Ingot");
    /*		Alloy (Iron + Silicon)		*/
    public static final SlimefunItemStack FERROSILICON =
            new SlimefunItemStack("FERROSILICON", Material.IRON_INGOT, "&bFerrosilicon");
    /*		Alloy (Iron + Gold)			*/
    public static final SlimefunItemStack GILDED_IRON =
            new SlimefunItemStack("GILDED_IRON", Material.GOLD_INGOT, "&6&lGilded Iron Ingot");
    /*		Alloy (Redstone + Ferrosilicon)	*/
    public static final SlimefunItemStack REDSTONE_ALLOY =
            new SlimefunItemStack("REDSTONE_ALLOY", Material.BRICK, "&cRedstone Alloy Ingot");
    /*		Alloy (Iron + Copper)		*/
    public static final SlimefunItemStack NICKEL_INGOT =
            new SlimefunItemStack("NICKEL_INGOT", Material.IRON_INGOT, "&bNickel Ingot");
    /*		Alloy (Nickel + Iron + Copper)		*/
    public static final SlimefunItemStack COBALT_INGOT =
            new SlimefunItemStack("COBALT_INGOT", Material.IRON_INGOT, "&9Cobalt Ingot");

    /*		Gold		*/
    public static final SlimefunItemStack GOLD_4K =
            new SlimefunItemStack("GOLD_4K", Material.GOLD_INGOT, "&rGold Ingot &7(4 Carat)");
    public static final SlimefunItemStack GOLD_6K =
            new SlimefunItemStack("GOLD_6K", Material.GOLD_INGOT, "&rGold Ingot &7(6 Carat)");
    public static final SlimefunItemStack GOLD_8K =
            new SlimefunItemStack("GOLD_8K", Material.GOLD_INGOT, "&rGold Ingot &7(8 Carat)");
    public static final SlimefunItemStack GOLD_10K =
            new SlimefunItemStack("GOLD_10K", Material.GOLD_INGOT, "&rGold Ingot &7(10 Carat)");
    public static final SlimefunItemStack GOLD_12K =
            new SlimefunItemStack("GOLD_12K", Material.GOLD_INGOT, "&rGold Ingot &7(12 Carat)");
    public static final SlimefunItemStack GOLD_14K =
            new SlimefunItemStack("GOLD_14K", Material.GOLD_INGOT, "&rGold Ingot &7(14 Carat)");
    public static final SlimefunItemStack GOLD_16K =
            new SlimefunItemStack("GOLD_16K", Material.GOLD_INGOT, "&rGold Ingot &7(16 Carat)");
    public static final SlimefunItemStack GOLD_18K =
            new SlimefunItemStack("GOLD_18K", Material.GOLD_INGOT, "&rGold Ingot &7(18 Carat)");
    public static final SlimefunItemStack GOLD_20K =
            new SlimefunItemStack("GOLD_20K", Material.GOLD_INGOT, "&rGold Ingot &7(20 Carat)");
    public static final SlimefunItemStack GOLD_22K =
            new SlimefunItemStack("GOLD_22K", Material.GOLD_INGOT, "&rGold Ingot &7(22 Carat)");
    public static final SlimefunItemStack GOLD_24K =
            new SlimefunItemStack("GOLD_24K", Material.GOLD_INGOT, "&rGold Ingot &7(24 Carat)");

    /*		Dusts		*/
    public static final SlimefunItemStack IRON_DUST =
            new SlimefunItemStack("IRON_DUST", Material.GUNPOWDER, "&6Iron Dust");
    public static final SlimefunItemStack GOLD_DUST =
            new SlimefunItemStack("GOLD_DUST", Material.GLOWSTONE_DUST, "&6Gold Dust");
    public static final SlimefunItemStack TIN_DUST = new SlimefunItemStack("TIN_DUST", Material.SUGAR, "&6Tin Dust");
    public static final SlimefunItemStack COPPER_DUST =
            new SlimefunItemStack("COPPER_DUST", Material.GLOWSTONE_DUST, "&6Copper Dust");
    public static final SlimefunItemStack SILVER_DUST =
            new SlimefunItemStack("SILVER_DUST", Material.SUGAR, "&6Silver Dust");
    public static final SlimefunItemStack ALUMINUM_DUST =
            new SlimefunItemStack("ALUMINUM_DUST", Material.SUGAR, "&6Aluminum Dust");
    public static final SlimefunItemStack LEAD_DUST =
            new SlimefunItemStack("LEAD_DUST", Material.GUNPOWDER, "&6Lead Dust");
    public static final SlimefunItemStack SULFATE =
            new SlimefunItemStack("SULFATE", Material.GLOWSTONE_DUST, "&6Sulfate");
    public static final SlimefunItemStack ZINC_DUST = new SlimefunItemStack("ZINC_DUST", Material.SUGAR, "&6Zinc Dust");
    public static final SlimefunItemStack MAGNESIUM_DUST =
            new SlimefunItemStack("MAGNESIUM_DUST", Material.SUGAR, "&6Magnesium Dust");
    public static final SlimefunItemStack SILICON =
            new SlimefunItemStack("SILICON", Material.FIREWORK_STAR, "&6Silicon");
    public static final SlimefunItemStack GOLD_24K_BLOCK =
            new SlimefunItemStack("GOLD_24K_BLOCK", Material.GOLD_BLOCK, "&r&rGold Block &7(24 Carat)");

    /*		Gems		*/
    public static final SlimefunItemStack SYNTHETIC_DIAMOND = new SlimefunItemStack(
            "SYNTHETIC_DIAMOND",
            Material.DIAMOND,
            "&bSynthetic Diamond",
            "",
            "&rCan be used as diamond in crafting table");
    public static final SlimefunItemStack SYNTHETIC_EMERALD = new SlimefunItemStack(
            "SYNTHETIC_EMERALD", Material.EMERALD, "&bSynthetic Emerald", "", "&rCan be used to trade with villagers");
    public static final SlimefunItemStack SYNTHETIC_SAPPHIRE = new SlimefunItemStack(
            "SYNTHETIC_SAPPHIRE",
            HeadTexture.SAPPHIRE,
            "&bSynthetic Sapphire",
            "",
            "&rCan be used as lapis lazuli in crafting table");
    public static final SlimefunItemStack CARBONADO =
            new SlimefunItemStack("CARBONADO", HeadTexture.CARBONADO, "&b&lCarbonado", "", "&7&o\"Black Diamond\"");
    public static final SlimefunItemStack RAW_CARBONADO =
            new SlimefunItemStack("RAW_CARBONADO", HeadTexture.RAW_CARBONADO, "&bRaw Carbonado");

    public static final SlimefunItemStack URANIUM = new SlimefunItemStack(
            "URANIUM",
            HeadTexture.URANIUM,
            "&4Uranium",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack NEPTUNIUM = new SlimefunItemStack(
            "NEPTUNIUM",
            HeadTexture.NEPTUNIUM,
            "&aNeptunium",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack PLUTONIUM = new SlimefunItemStack(
            "PLUTONIUM",
            HeadTexture.PLUTONIUM,
            "&7Plutonium",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BOOSTED_URANIUM = new SlimefunItemStack(
            "BOOSTED_URANIUM",
            HeadTexture.BOOSTED_URANIUM,
            "&2Mixed Oxide Nuclear Fuel",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);

    /*		Talisman		*/
    public static final SlimefunItemStack COMMON_TALISMAN =
            new SlimefunItemStack("COMMON_TALISMAN", Material.EMERALD, "&6Common Talisman");
    public static final SlimefunItemStack ENDER_TALISMAN =
            new SlimefunItemStack("ENDER_TALISMAN", Material.EMERALD, "&5Ender Talisman");

    public static final SlimefunItemStack TALISMAN_ANVIL = new SlimefunItemStack(
            "ANVIL_TALISMAN",
            Material.EMERALD,
            "&aAnvil Talisman",
            "",
            "&fEach talisman can prevent",
            "&fa tool from breaking due to low durability",
            "&fand will then be consumed",
            "",
            "&4&lWarning:",
            "&4Due to the complexity of overly powerful tools",
            "&4this talisman cannot repair overly powerful tools");
    public static final SlimefunItemStack TALISMAN_MINER = new SlimefunItemStack(
            "MINER_TALISMAN",
            Material.EMERALD,
            "&aMiner Talisman",
            "",
            "&fWhen this talisman is in your inventory",
            "&fyou have a 20% chance to double",
            "&fthe ores you mine");
    public static final SlimefunItemStack TALISMAN_FARMER = new SlimefunItemStack(
            "FARMER_TALISMAN",
            Material.EMERALD,
            "&aFarmer Talisman",
            "",
            "&fWhen this talisman is in your inventory",
            "&fyou have a 20% chance to double",
            "&fthe crops you harvest");
    public static final SlimefunItemStack TALISMAN_HUNTER = new SlimefunItemStack(
            "HUNTER_TALISMAN",
            Material.EMERALD,
            "&aHunter Talisman",
            "",
            "&fWhen this talisman is in your inventory",
            "&fyou have a 20% chance to double",
            "&fthe drops from mobs you kill");
    public static final SlimefunItemStack TALISMAN_LAVA = new SlimefunItemStack(
            "LAVA_TALISMAN",
            Material.EMERALD,
            "&aLava Walker Talisman",
            "",
            "&fWhen this talisman is in your inventory",
            "&fyou gain fire protection",
            "&fonly when walking on lava",
            "&fand will then be consumed");
    public static final SlimefunItemStack TALISMAN_WATER = new SlimefunItemStack(
            "WATER_TALISMAN",
            Material.EMERALD,
            "&aDiver Talisman",
            "",
            "&fWhen this talisman is in your inventory",
            "&fonce you are about to drown",
            "&fthe talisman will give you water breathing",
            "&fand will then be consumed");
    public static final SlimefunItemStack TALISMAN_ANGEL = new SlimefunItemStack(
            "ANGEL_TALISMAN",
            Material.EMERALD,
            "&aAngel Talisman",
            "",
            "&fWhen this talisman is in your inventory",
            "&fyou have a 75% chance to reduce fall damage");
    public static final SlimefunItemStack TALISMAN_FIRE = new SlimefunItemStack(
            "FIRE_TALISMAN",
            Material.EMERALD,
            "&aFirefighter Talisman",
            "",
            "&fWhen this talisman is in your inventory",
            "&fwhen you're on fire",
            "&fit gives you fire resistance",
            "&fand will then be consumed");
    public static final SlimefunItemStack TALISMAN_MAGICIAN = new SlimefunItemStack(
            "MAGICIAN_TALISMAN",
            Material.EMERALD,
            "&aMagician Talisman",
            "",
            "&fWhen this talisman is in your inventory",
            "&fwhen enchanting, you have an 80% chance",
            "&fto get an additional enchantment");
    public static final SlimefunItemStack TALISMAN_TRAVELLER = new SlimefunItemStack(
            "TRAVELLER_TALISMAN",
            Material.EMERALD,
            "&aTraveller Talisman",
            "",
            "&fWhen this talisman is in your inventory",
            "&fwhen you start sprinting, you have a 60% chance",
            "&fto gain speed effect");
    public static final SlimefunItemStack TALISMAN_WARRIOR = new SlimefunItemStack(
            "WARRIOR_TALISMAN",
            Material.EMERALD,
            "&aWarrior Talisman",
            "",
            "&fWhen this talisman is in your inventory",
            "&fafter being attacked, you will gain Strength 3",
            "&fand will then be consumed");
    public static final SlimefunItemStack TALISMAN_KNIGHT = new SlimefunItemStack(
            "KNIGHT_TALISMAN",
            Material.EMERALD,
            "&aKnight Talisman",
            "",
            "&fWhen this talisman is in your inventory",
            "&fafter being attacked",
            "&fyou have a 30% chance to gain 5 seconds of regeneration",
            "&fand will then be consumed");
    public static final SlimefunItemStack TALISMAN_WHIRLWIND = new SlimefunItemStack(
            "WHIRLWIND_TALISMAN",
            Material.EMERALD,
            "&aWhirlwind Talisman",
            "",
            "&fWhen this talisman is in your inventory",
            "&fyou have a 60% chance",
            "&fto deflect all projectiles coming at you");
    public static final SlimefunItemStack TALISMAN_WIZARD = new SlimefunItemStack(
            "WIZARD_TALISMAN",
            Material.EMERALD,
            "&aWizard Talisman",
            "",
            "&fWhen this talisman is in your inventory",
            "&fwhen enchanting, you can get Fortune 4/5",
            "&fbut it may also lower",
            "&fthe level of other enchantments on the item");
    public static final SlimefunItemStack TALISMAN_CAVEMAN = new SlimefunItemStack(
            "CAVEMAN_TALISMAN",
            Material.EMERALD,
            "&aCaveman Talisman",
            "",
            "&fWhen this talisman is in your inventory",
            "&fwhen mining, you have a 50% chance",
            "&fto gain a brief Haste effect");
    public static final SlimefunItemStack TALISMAN_WISE = new SlimefunItemStack(
            "WISE_TALISMAN",
            Material.EMERALD,
            "&aWise Talisman",
            "",
            "&fWhen this talisman is in your inventory",
            "&fexperience gained has a 20% chance to be doubled");

    /*		Staves		*/
    public static final SlimefunItemStack STAFF_ELEMENTAL =
            new SlimefunItemStack("STAFF_ELEMENTAL", Material.STICK, "&6Elemental Staff");
    public static final SlimefunItemStack STAFF_WIND = new SlimefunItemStack(
            "STAFF_ELEMENTAL_WIND",
            Material.STICK,
            "&6Elemental Staff &7- &b&oWind",
            "",
            "&7Element: &b&oWind",
            "",
            "&7&eRight-Click&7 to launch yourself");
    public static final SlimefunItemStack STAFF_FIRE = new SlimefunItemStack(
            "STAFF_ELEMENTAL_FIRE",
            Material.STICK,
            "&6Elemental Staff &7- &c&oFire",
            "",
            "&7Element: &c&oFire",
            "",
            "&cLet fire purify everything!");
    public static final SlimefunItemStack STAFF_WATER = new SlimefunItemStack(
            "STAFF_ELEMENTAL_WATER",
            Material.STICK,
            "&6Elemental Staff &7- &1&oWater",
            "",
            "&7Element: &1&oWater",
            "",
            "&7&eRight-Click&7 to extinguish fire on yourself");
    public static final SlimefunItemStack STAFF_STORM = new SlimefunItemStack(
            "STAFF_ELEMENTAL_STORM",
            Material.STICK,
            "&6Elemental Staff &7- &8&oStorm",
            "",
            "&7Element: &8&oStorm",
            "",
            "&eRight-Click&7 to summon lightning",
            LoreBuilder.usesLeft(StormStaff.MAX_USES));

    static {
        STAFF_WIND.addUnsafeEnchantment(VersionedEnchantment.LUCK_OF_THE_SEA, 1);
        STAFF_FIRE.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 5);
        STAFF_WATER.addUnsafeEnchantment(VersionedEnchantment.AQUA_AFFINITY, 1);
        STAFF_STORM.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 1);
    }

    /*		 Machines 		*/
    public static final SlimefunItemStack GRIND_STONE = new SlimefunItemStack(
            "GRIND_STONE", Material.DISPENSER, "&bGrind Stone", "", "&a&oMore efficient grinding");
    public static final SlimefunItemStack ARMOR_FORGE = new SlimefunItemStack(
            "ARMOR_FORGE", Material.ANVIL, "&6Armor Forge", "", "&a&oGives you the power to create powerful armor");
    public static final SlimefunItemStack MAKESHIFT_SMELTERY = new SlimefunItemStack(
            "MAKESHIFT_SMELTERY",
            Material.BLAST_FURNACE,
            "&eMakeshift Smeltery",
            "",
            "&rA simple version of the smeltery",
            "&rcan only smelt ore dust into ingots");
    public static final SlimefunItemStack SMELTERY = new SlimefunItemStack(
            "SMELTERY", Material.FURNACE, "&6Smeltery", "", "&aHigh-temperature furnace capable of smelting metals");
    public static final SlimefunItemStack IGNITION_CHAMBER = new SlimefunItemStack(
            "IGNITION_CHAMBER",
            Material.DROPPER,
            "&4Ignition Chamber",
            "&rTo prevent your smeltery from losing flame",
            "&rplace flint inside",
            "&rthen place next to the smeltery's dispenser");
    public static final SlimefunItemStack ORE_CRUSHER = new SlimefunItemStack(
            "ORE_CRUSHER", Material.DISPENSER, "&bOre Crusher", "", "&a&oCrushes ores and gives double ore dust");
    public static final SlimefunItemStack COMPRESSOR =
            new SlimefunItemStack("COMPRESSOR", Material.PISTON, "&bCompressor", "", "&aCompresses items");
    public static final SlimefunItemStack PRESSURE_CHAMBER = new SlimefunItemStack(
            "PRESSURE_CHAMBER", Material.GLASS, "&bPressure Chamber", "", "&aCompresses more items");
    public static final SlimefunItemStack MAGIC_WORKBENCH = new SlimefunItemStack(
            "MAGIC_WORKBENCH", Material.CRAFTING_TABLE, "&6Magic Workbench", "", "&dInfuses items with magical energy");
    public static final SlimefunItemStack ORE_WASHER = new SlimefunItemStack(
            "ORE_WASHER",
            Material.CAULDRON,
            "&6Ore Washer",
            "",
            "&a&oWashes sifted ore into filtered ore",
            "&a&oand gives you some small stone chunks");
    public static final SlimefunItemStack TABLE_SAW = new SlimefunItemStack(
            "TABLE_SAW",
            Material.STONECUTTER,
            "&6Table Saw",
            "",
            "&a&oGet 8 planks from 1 log",
            "&a&o(Supports all log types)");
    ;
    public static final SlimefunItemStack COMPOSTER = new SlimefunItemStack(
            "COMPOSTER", Material.CAULDRON, "&aComposter", "", "&a&oCan convert various materials over time...");
    public static final SlimefunItemStack ENHANCED_CRAFTING_TABLE = new SlimefunItemStack(
            "ENHANCED_CRAFTING_TABLE",
            Material.CRAFTING_TABLE,
            "&eEnhanced Crafting Table",
            "",
            "&a&oA primitive crafting table",
            "&a&ocannot withstand powerful forces...");
    public static final SlimefunItemStack CRUCIBLE = new SlimefunItemStack(
            "CRUCIBLE", Material.CAULDRON, "&cCrucible", "", "&a&oUsed to turn items into liquids");
    public static final SlimefunItemStack JUICER = new SlimefunItemStack(
            "JUICER", Material.GLASS_BOTTLE, "&aJuicer", "", "&aAllows you to create delicious juices");

    public static final SlimefunItemStack INDUSTRIAL_MINER = new SlimefunItemStack(
            "INDUSTRIAL_MINER",
            Material.GOLDEN_PICKAXE,
            "&bIndustrial Miner",
            "",
            "&rThe Industrial Miner can mine all ores",
            "&rin a 7x7 area below it.",
            "&rPlace coal or other fuel in",
            "&rthe machine's chest to fuel it.");
    public static final SlimefunItemStack ADVANCED_INDUSTRIAL_MINER = new SlimefunItemStack(
            "ADVANCED_INDUSTRIAL_MINER",
            Material.DIAMOND_PICKAXE,
            "&cAdvanced Industrial Miner",
            "",
            "&rThe Advanced Industrial Miner can mine all ores",
            "&rin an 11x11 area below it.",
            "&rPlace fuel oil or lava in the machine's chest",
            "&rto fuel it.",
            "",
            "&a+ Silk Touch");

    static {
        ItemMeta meta = INDUSTRIAL_MINER.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        INDUSTRIAL_MINER.setItemMeta(meta);

        ItemMeta meta2 = ADVANCED_INDUSTRIAL_MINER.getItemMeta();
        meta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ADVANCED_INDUSTRIAL_MINER.setItemMeta(meta2);
    }

    public static final SlimefunItemStack SOLAR_PANEL = new SlimefunItemStack(
            "SOLAR_PANEL",
            Material.DAYLIGHT_DETECTOR,
            "&bSolar Panel",
            "",
            "&7Important component for crafting &bSolar Generators");

    public static final SlimefunItemStack AUTOMATED_PANNING_MACHINE = new SlimefunItemStack(
            "AUTOMATED_PANNING_MACHINE", Material.BOWL, "&aAutomated Panning Machine", "", "&a&oUpgraded gold pan");
    public static final SlimefunItemStack OUTPUT_CHEST = new SlimefunItemStack(
            "OUTPUT_CHEST",
            Material.CHEST,
            "&4Output Chest",
            "",
            "&c&oPlace it next to a basic machine's dispenser",
            "&c&oand crafted items will be placed in the chest");
    public static final SlimefunItemStack HOLOGRAM_PROJECTOR = new SlimefunItemStack(
            "HOLOGRAM_PROJECTOR",
            Material.QUARTZ_SLAB,
            "&bHologram Projector",
            "",
            "&rProjects editable holographic text");

    /*		 Enhanced Furnaces 		*/
    public static final SlimefunItemStack ENHANCED_FURNACE = new SlimefunItemStack(
            "ENHANCED_FURNACE",
            Material.FURNACE,
            "&7Enhanced Furnace - &eI",
            "",
            "&7Smelting Speed: &e1x",
            "&7Fuel Efficiency: &e1x",
            "&7Output Multiplier: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_2 = new SlimefunItemStack(
            "ENHANCED_FURNACE_2",
            Material.FURNACE,
            "&7Enhanced Furnace - &eII",
            "",
            "&7Smelting Speed: &e2x",
            "&7Fuel Efficiency: &e1x",
            "&7Output Multiplier: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_3 = new SlimefunItemStack(
            "ENHANCED_FURNACE_3",
            Material.FURNACE,
            "&7Enhanced Furnace - &eIII",
            "",
            "&7Smelting Speed: &e2x",
            "&7Fuel Efficiency: &e2x",
            "&7Output Multiplier: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_4 = new SlimefunItemStack(
            "ENHANCED_FURNACE_4",
            Material.FURNACE,
            "&7Enhanced Furnace - &eIV",
            "",
            "&7Smelting Speed: &e3x",
            "&7Fuel Efficiency: &e2x",
            "&7Output Multiplier: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_5 = new SlimefunItemStack(
            "ENHANCED_FURNACE_5",
            Material.FURNACE,
            "&7Enhanced Furnace - &eV",
            "",
            "&7Smelting Speed: &e3x",
            "&7Fuel Efficiency: &e2x",
            "&7Output Multiplier: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_6 = new SlimefunItemStack(
            "ENHANCED_FURNACE_6",
            Material.FURNACE,
            "&7Enhanced Furnace - &eVI",
            "",
            "&7Smelting Speed: &e3x",
            "&7Fuel Efficiency: &e3x",
            "&7Output Multiplier: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_7 = new SlimefunItemStack(
            "ENHANCED_FURNACE_7",
            Material.FURNACE,
            "&7Enhanced Furnace - &eVII",
            "",
            "&7Smelting Speed: &e4x",
            "&7Fuel Efficiency: &e3x",
            "&7Output Multiplier: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_8 = new SlimefunItemStack(
            "ENHANCED_FURNACE_8",
            Material.FURNACE,
            "&7Enhanced Furnace - &eVIII",
            "",
            "&7Smelting Speed: &e4x",
            "&7Fuel Efficiency: &e4x",
            "&7Output Multiplier: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_9 = new SlimefunItemStack(
            "ENHANCED_FURNACE_9",
            Material.FURNACE,
            "&7Enhanced Furnace - &eIX",
            "",
            "&7Smelting Speed: &e5x",
            "&7Fuel Efficiency: &e4x",
            "&7Output Multiplier: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_10 = new SlimefunItemStack(
            "ENHANCED_FURNACE_10",
            Material.FURNACE,
            "&7Enhanced Furnace - &eX",
            "",
            "&7Smelting Speed: &e5x",
            "&7Fuel Efficiency: &e5x",
            "&7Output Multiplier: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_11 = new SlimefunItemStack(
            "ENHANCED_FURNACE_11",
            Material.FURNACE,
            "&7Enhanced Furnace - &eXI",
            "",
            "&7Smelting Speed: &e5x",
            "&7Fuel Efficiency: &e5x",
            "&7Output Multiplier: &e3x");
    public static final SlimefunItemStack REINFORCED_FURNACE = new SlimefunItemStack(
            "REINFORCED_FURNACE",
            Material.FURNACE,
            "&7Reinforced Alloy Furnace",
            "",
            "&7Smelting Speed: &e10x",
            "&7Fuel Efficiency: &e10x",
            "&7Output Multiplier: &e3x");
    public static final SlimefunItemStack CARBONADO_EDGED_FURNACE = new SlimefunItemStack(
            "CARBONADO_EDGED_FURNACE",
            Material.FURNACE,
            "&7Carbonado-Edged Furnace",
            "",
            "&7Smelting Speed: &e20x",
            "&7Fuel Efficiency: &e10x",
            "&7Output Multiplier: &e3x");

    public static final SlimefunItemStack BLOCK_PLACER = new SlimefunItemStack(
            "BLOCK_PLACER",
            Material.DISPENSER,
            "&aBlock Placer",
            "",
            "&rAll blocks in this dispenser",
            "&rwill be automatically placed");

    /*		Soulbound Items		*/
    public static final SlimefunItemStack SOULBOUND_SWORD =
            new SlimefunItemStack("SOULBOUND_SWORD", Material.DIAMOND_SWORD, "&cSoulbound Sword");
    public static final SlimefunItemStack SOULBOUND_BOW =
            new SlimefunItemStack("SOULBOUND_BOW", Material.BOW, "&cSoulbound Bow");
    public static final SlimefunItemStack SOULBOUND_PICKAXE =
            new SlimefunItemStack("SOULBOUND_PICKAXE", Material.DIAMOND_PICKAXE, "&cSoulbound Pickaxe");
    public static final SlimefunItemStack SOULBOUND_AXE =
            new SlimefunItemStack("SOULBOUND_AXE", Material.DIAMOND_AXE, "&cSoulbound Axe");
    public static final SlimefunItemStack SOULBOUND_SHOVEL =
            new SlimefunItemStack("SOULBOUND_SHOVEL", Material.DIAMOND_SHOVEL, "&cSoulbound Shovel");
    public static final SlimefunItemStack SOULBOUND_HOE =
            new SlimefunItemStack("SOULBOUND_HOE", Material.DIAMOND_HOE, "&cSoulbound Hoe");

    public static final SlimefunItemStack SOULBOUND_HELMET =
            new SlimefunItemStack("SOULBOUND_HELMET", Material.DIAMOND_HELMET, "&cSoulbound Helmet");
    public static final SlimefunItemStack SOULBOUND_CHESTPLATE =
            new SlimefunItemStack("SOULBOUND_CHESTPLATE", Material.DIAMOND_CHESTPLATE, "&cSoulbound Chestplate");
    public static final SlimefunItemStack SOULBOUND_LEGGINGS =
            new SlimefunItemStack("SOULBOUND_LEGGINGS", Material.DIAMOND_LEGGINGS, "&cSoulbound Leggings");
    public static final SlimefunItemStack SOULBOUND_BOOTS =
            new SlimefunItemStack("SOULBOUND_BOOTS", Material.DIAMOND_BOOTS, "&cSoulbound Boots");
    public static final SlimefunItemStack SOULBOUND_TRIDENT =
            new SlimefunItemStack("SOULBOUND_TRIDENT", Material.TRIDENT, "&cSoulbound Trident");

    /* Runes */
    public static final SlimefunItemStack BLANK_RUNE =
            new SlimefunItemStack("BLANK_RUNE", new ColoredFireworkStar(Color.BLACK, "&8Blank Rune"));

    public static final SlimefunItemStack AIR_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_AIR", new ColoredFireworkStar(Color.AQUA, "&7Ancient Rune &8&l[&b&lAir&8&l]"));
    public static final SlimefunItemStack WATER_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_WATER", new ColoredFireworkStar(Color.BLUE, "&7Ancient Rune &8&l[&1&lWater&8&l]"));
    public static final SlimefunItemStack FIRE_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_FIRE", new ColoredFireworkStar(Color.RED, "&7Ancient Rune &8&l[&4&lFire&8&l]"));
    public static final SlimefunItemStack EARTH_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_EARTH",
            new ColoredFireworkStar(Color.fromRGB(112, 47, 7), "&7Ancient Rune &8&l[&c&lEarth&8&l]"));
    public static final SlimefunItemStack ENDER_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_ENDER", new ColoredFireworkStar(Color.PURPLE, "&7Ancient Rune &8&l[&5&lEnder&8&l]"));

    public static final SlimefunItemStack RAINBOW_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_RAINBOW", new ColoredFireworkStar(Color.FUCHSIA, "&7Ancient Rune &8&l[&d&lRainbow&8&l]"));
    public static final SlimefunItemStack LIGHTNING_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_LIGHTNING",
            new ColoredFireworkStar(Color.fromRGB(255, 255, 95), "&7Ancient Rune &8&l[&e&lLightning&8&l]"));
    public static final SlimefunItemStack SOULBOUND_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_SOULBOUND",
            new ColoredFireworkStar(
                    Color.fromRGB(47, 0, 117),
                    "&7Ancient Rune &8&l[&5&lSoulbound&8&l]",
                    "&eFirst drop the item you want to bind on the ground",
                    "&ethen throw this rune at that item",
                    "&5to soulbind &ethat item.",
                    " ",
                    "&eIt is recommended to use on &6important &eitems.",
                    " ",
                    "&eBound items will not drop on death."));
    public static final SlimefunItemStack ENCHANTMENT_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_ENCHANTMENT",
            new ColoredFireworkStar(
                    Color.fromRGB(255, 217, 25),
                    "&7Ancient Rune &8&l[&6&lEnchantment&8&l]",
                    "&eThrow the rune at an item you have already dropped",
                    "&ethat needs to be &6enchanted",
                    "&ethe item will gain a random enchantment."));
    public static final SlimefunItemStack VILLAGER_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_VILLAGERS",
            new ColoredFireworkStar(
                    Color.fromRGB(160, 20, 5),
                    "&7Ancient Rune &8&l[&4&lVillager&8&l]",
                    "&eRight-click a villager to clear",
                    "&eits profession and trade list.",
                    "&eThe villager will find a new job",
                    "&eafter some time."));

    /*		Electricity			*/
    public static final SlimefunItemStack SOLAR_GENERATOR = new SlimefunItemStack(
            "SOLAR_GENERATOR",
            Material.DAYLIGHT_DETECTOR,
            "&bSolar Generator",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack SOLAR_GENERATOR_2 = new SlimefunItemStack(
            "SOLAR_GENERATOR_2",
            Material.DAYLIGHT_DETECTOR,
            "&cAdvanced Solar Generator",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack SOLAR_GENERATOR_3 = new SlimefunItemStack(
            "SOLAR_GENERATOR_3",
            Material.DAYLIGHT_DETECTOR,
            "&4Carbonado Solar Generator",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(64));
    public static final SlimefunItemStack SOLAR_GENERATOR_4 = new SlimefunItemStack(
            "SOLAR_GENERATOR_4",
            Material.DAYLIGHT_DETECTOR,
            "&eCharged Solar Generator",
            "",
            "&9Can work at night",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(256),
            " (Daytime)",
            LoreBuilder.powerPerSecond(128),
            " (Nighttime)");

    public static final SlimefunItemStack COAL_GENERATOR = new SlimefunItemStack(
            "COAL_GENERATOR",
            HeadTexture.GENERATOR,
            "&cCoal Generator",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(64),
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack COAL_GENERATOR_2 = new SlimefunItemStack(
            "COAL_GENERATOR_2",
            HeadTexture.GENERATOR,
            "&cCoal Generator &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(30));

    public static final SlimefunItemStack LAVA_GENERATOR = new SlimefunItemStack(
            "LAVA_GENERATOR",
            HeadTexture.GENERATOR,
            "&4Lava Generator",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack LAVA_GENERATOR_2 = new SlimefunItemStack(
            "LAVA_GENERATOR_2",
            HeadTexture.GENERATOR,
            "&4Lava Generator &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIC_FURNACE = new SlimefunItemStack(
            "ELECTRIC_FURNACE",
            Material.FURNACE,
            "&cElectric Furnace",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack ELECTRIC_FURNACE_2 = new SlimefunItemStack(
            "ELECTRIC_FURNACE_2",
            Material.FURNACE,
            "&cElectric Furnace &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 2x",
            LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack ELECTRIC_FURNACE_3 = new SlimefunItemStack(
            "ELECTRIC_FURNACE_3",
            Material.FURNACE,
            "&cElectric Furnace &7- &eIII",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 4x",
            LoreBuilder.powerPerSecond(10));

    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER = new SlimefunItemStack(
            "ELECTRIC_ORE_GRINDER",
            Material.FURNACE,
            "&cElectric Ore Grinder",
            "",
            "&rPerfect combination of ore crusher and grind stone",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(12));
    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER_2 = new SlimefunItemStack(
            "ELECTRIC_ORE_GRINDER_2",
            Material.FURNACE,
            "&cElectric Ore Grinder &7(&eII&7)",
            "",
            "&rPerfect combination of ore crusher and grind stone",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 4x",
            LoreBuilder.powerPerSecond(30));
    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER_3 = new SlimefunItemStack(
            "ELECTRIC_ORE_GRINDER_3",
            Material.FURNACE,
            "&cElectric Ore Grinder &7(&eIII&7)",
            "",
            "&fPerfect combination of ore crusher and grind stone",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(10),
            LoreBuilder.powerPerSecond(90));
    public static final SlimefunItemStack ELECTRIC_INGOT_PULVERIZER = new SlimefunItemStack(
            "ELECTRIC_INGOT_PULVERIZER",
            Material.FURNACE,
            "&cElectric Ingot Pulverizer",
            "",
            "&rTurns ingots into dust",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack AUTO_DRIER = new SlimefunItemStack(
            "AUTO_DRIER",
            Material.SMOKER,
            "&eAuto Drier",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack AUTO_ENCHANTER = new SlimefunItemStack(
            "AUTO_ENCHANTER",
            Material.ENCHANTING_TABLE,
            "&5Auto Enchanter",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack AUTO_ENCHANTER_2 = new SlimefunItemStack(
            "AUTO_ENCHANTER_2",
            Material.ENCHANTING_TABLE,
            "&5Auto Enchanter &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack AUTO_DISENCHANTER = new SlimefunItemStack(
            "AUTO_DISENCHANTER",
            Material.ENCHANTING_TABLE,
            "&5Auto Disenchanter",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack AUTO_DISENCHANTER_2 = new SlimefunItemStack(
            "AUTO_DISENCHANTER_2",
            Material.ENCHANTING_TABLE,
            "&5Auto Disenchanter &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack AUTO_ANVIL = new SlimefunItemStack(
            "AUTO_ANVIL",
            Material.IRON_BLOCK,
            "&7Auto Anvil",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Repairable Percentage: 10%",
            LoreBuilder.powerPerSecond(24));
    public static final SlimefunItemStack AUTO_ANVIL_2 = new SlimefunItemStack(
            "AUTO_ANVIL_2",
            Material.IRON_BLOCK,
            "&7Auto Anvil Mk.II",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Repairable Percentage: 25%",
            LoreBuilder.powerPerSecond(32));
    public static final SlimefunItemStack AUTO_BREWER = new SlimefunItemStack(
            "AUTO_BREWER",
            Material.SMOKER,
            "&eAuto Brewer",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(12));

    public static final SlimefunItemStack BOOK_BINDER = new SlimefunItemStack(
            "BOOK_BINDER",
            Material.BOOKSHELF,
            "&6Book Binder",
            "",
            "&fBinds multiple enchantment books into one.",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(16));

    public static final SlimefunItemStack BIO_REACTOR = new SlimefunItemStack(
            "BIO_REACTOR",
            Material.LIME_TERRACOTTA,
            "&2Bio Reactor",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            "&8\u21E8 &e\u26A1 &7128 J Capacity",
            LoreBuilder.powerPerSecond(8));
    public static final SlimefunItemStack MULTIMETER =
            new SlimefunItemStack("MULTIMETER", Material.CLOCK, "&eMultimeter", "", "&rView energy stored in machines");

    public static final SlimefunItemStack SMALL_CAPACITOR = new SlimefunItemStack(
            "SMALL_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aSmall Energy Capacitor",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.CAPACITOR),
            "&8\u21E8 &e\u26A1 &7128 J Capacity");
    public static final SlimefunItemStack MEDIUM_CAPACITOR = new SlimefunItemStack(
            "MEDIUM_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aMedium Energy Capacitor",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(512));
    public static final SlimefunItemStack BIG_CAPACITOR = new SlimefunItemStack(
            "BIG_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aBig Energy Capacitor",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(1024));
    public static final SlimefunItemStack LARGE_CAPACITOR = new SlimefunItemStack(
            "LARGE_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aLarge Energy Capacitor",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.GOOD, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(8192));
    public static final SlimefunItemStack CARBONADO_EDGED_CAPACITOR = new SlimefunItemStack(
            "CARBONADO_EDGED_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aCarbonado-Edged Energy Capacitor",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(65536));
    public static final SlimefunItemStack ENERGIZED_CAPACITOR = new SlimefunItemStack(
            "ENERGIZED_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aEnergized Energy Capacitor",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(524288));

    /*		Robots				*/
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "&cProgrammable Android &7(Normal)",
            "",
            "&8\u21E8 &7Function: None",
            "&8\u21E8 &7Fuel Efficiency: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_FARMER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_FARMER",
            HeadTexture.PROGRAMMABLE_ANDROID_FARMER,
            "&cProgrammable Android &7(Farmer)",
            "",
            "&8\u21E8 &7Function: Farming",
            "&8\u21E8 &7Fuel Efficiency: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_MINER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_MINER",
            HeadTexture.PROGRAMMABLE_ANDROID_MINER,
            "&cProgrammable Android &7(Miner)",
            "",
            "&8\u21E8 &7Function: Mining",
            "&8\u21E8 &7Fuel Efficiency: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_WOODCUTTER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_WOODCUTTER",
            HeadTexture.PROGRAMMABLE_ANDROID_WOODCUTTER,
            "&cProgrammable Android &7(Woodcutter)",
            "",
            "&8\u21E8 &7Function: Woodcutting",
            "&8\u21E8 &7Fuel Efficiency: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_BUTCHER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_BUTCHER",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "&cProgrammable Android &7(Butcher)",
            "",
            "&8\u21E8 &7Function: Butchering",
            "&8\u21E8 &7Damage: 4",
            "&8\u21E8 &7Fuel Efficiency: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_FISHERMAN = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_FISHERMAN",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "&cProgrammable Android &7(Fisherman)",
            "",
            "&8\u21E8 &7Function: Fishing",
            "&8\u21E8 &7Success Rate: 10%",
            "&8\u21E8 &7Fuel Efficiency: 1.0x");

    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2 = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "&cAdvanced Programmable Android &7(Normal)",
            "",
            "&8\u21E8 &7Function: None",
            "&8\u21E8 &7Fuel Efficiency: 1.5x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_FISHERMAN = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2_FISHERMAN",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "&cAdvanced Programmable Android &7(Fisherman)",
            "",
            "&8\u21E8 &7Function: Fishing",
            "&8\u21E8 &7Success Rate: 20%",
            "&8\u21E8 &7Fuel Efficiency: 1.5x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_FARMER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2_FARMER",
            HeadTexture.PROGRAMMABLE_ANDROID_FARMER,
            "&cAdvanced Programmable Android &7(Farmer)",
            "",
            "&8\u21E8 &7Function: Farming",
            "&8\u21E8 &7Fuel Efficiency: 1.5x",
            "&8\u21E8 &7Can harvest plants from Exotic Gardens");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_BUTCHER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2_BUTCHER",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "&cAdvanced Programmable Android &7(Butcher)",
            "",
            "&8\u21E8 &7Function: Butchering",
            "&8\u21E8 &7Damage: 8",
            "&8\u21E8 &7Fuel Efficiency: 1.5x");

    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3 = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_3",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "&eAuthorized Programmable Android &7(Normal)",
            "",
            "&8\u21E8 &7Function: None",
            "&8\u21E8 &7Fuel Efficiency: 3.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3_FISHERMAN = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_3_FISHERMAN",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "&eAuthorized Programmable Android &7(Fisherman)",
            "",
            "&8\u21E8 &7Function: Fishing",
            "&8\u21E8 &7Success Rate: 30%",
            "&8\u21E8 &7Fuel Efficiency: 8.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3_BUTCHER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_3_BUTCHER",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "&eAuthorized Programmable Android &7(Butcher)",
            "",
            "&8\u21E8 &7Function: Butchering",
            "&8\u21E8 &7Damage: 20",
            "&8\u21E8 &7Fuel Efficiency: 8.0x");

    /*		       GPS		       */
    public static final SlimefunItemStack GPS_TRANSMITTER = new SlimefunItemStack(
            "GPS_TRANSMITTER",
            HeadTexture.GPS_TRANSMITTER,
            "&bGPS Transmitter",
            "",
            LoreBuilder.powerBuffer(16),
            LoreBuilder.powerPerSecond(2));
    public static final SlimefunItemStack GPS_TRANSMITTER_2 = new SlimefunItemStack(
            "GPS_TRANSMITTER_2",
            HeadTexture.GPS_TRANSMITTER,
            "&cAdvanced GPS Transmitter",
            "",
            LoreBuilder.powerBuffer(64),
            LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack GPS_TRANSMITTER_3 = new SlimefunItemStack(
            "GPS_TRANSMITTER_3",
            HeadTexture.GPS_TRANSMITTER,
            "&4Carbonado GPS Transmitter",
            "",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(22));
    public static final SlimefunItemStack GPS_TRANSMITTER_4 = new SlimefunItemStack(
            "GPS_TRANSMITTER_4",
            HeadTexture.GPS_TRANSMITTER,
            "&eEnergized GPS Transmitter",
            "",
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(92));

    public static final SlimefunItemStack GPS_MARKER_TOOL = new SlimefunItemStack(
            "GPS_MARKER_TOOL",
            Material.REDSTONE_TORCH,
            "&bGPS Marker Tool",
            "",
            "&rAllows you to set a waypoint",
            "&rat the location where you place this marker tool");
    public static final SlimefunItemStack GPS_CONTROL_PANEL = new SlimefunItemStack(
            "GPS_CONTROL_PANEL",
            HeadTexture.GPS_CONTROL_PANEL,
            "&bGPS Control Panel",
            "",
            "&rAllows you to track your GPS satellites",
            "&rand manage existing waypoints");
    public static final SlimefunItemStack GPS_EMERGENCY_TRANSMITTER = new SlimefunItemStack(
            "GPS_EMERGENCY_TRANSMITTER",
            HeadTexture.GPS_TRANSMITTER,
            "&cGPS Emergency Transmitter",
            "",
            "&rWhen you die",
            "&rif the emergency transmitter is in your inventory",
            "&rit will automatically set your death location as a waypoint");

    public static final SlimefunItemStack ANDROID_INTERFACE_FUEL = new SlimefunItemStack(
            "ANDROID_INTERFACE_FUEL",
            Material.DISPENSER,
            "&7Android Interface &c(Fuel)",
            "",
            "&rWhen the script tells it to",
            "&ritems stored in this interface",
            "&rwill be placed in the Android's fuel slot");
    public static final SlimefunItemStack ANDROID_INTERFACE_ITEMS = new SlimefunItemStack(
            "ANDROID_INTERFACE_ITEMS",
            Material.DISPENSER,
            "&7Android Interface &9(Items)",
            "",
            "&rWhen the script tells it to",
            "&ritems stored in the Android's inventory",
            "&rwill be placed in this interface");

    public static final SlimefunItemStack GPS_GEO_SCANNER = new SlimefunItemStack(
            "GPS_GEO_SCANNER",
            HeadTexture.GEO_SCANNER,
            "&bGPS Geo Scanner",
            "",
            "&rScans a chunk to see how many natural resources",
            "&rit contains, such as &8Crude Oil");
    public static final SlimefunItemStack PORTABLE_GEO_SCANNER = new SlimefunItemStack(
            "PORTABLE_GEO_SCANNER",
            Material.CLOCK,
            "&bPortable Geo Scanner",
            "",
            "&rScans for natural resources in a chunk",
            "",
            "&eRight-Click&7 to scan");
    public static final SlimefunItemStack GEO_MINER = new SlimefunItemStack(
            "GEO_MINER",
            HeadTexture.GEO_MINER,
            "&6GEO Miner",
            "",
            "&eMines resources from chunks",
            "&eCan mine resources that cannot be",
            "&eobtained with a pickaxe",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(48),
            "",
            "&c&l! &cMake sure you have performed a GEO scan");
    public static final SlimefunItemStack OIL_PUMP = new SlimefunItemStack(
            "OIL_PUMP",
            HeadTexture.OIL_PUMP,
            "&rOil Pump",
            "",
            "&7Pumps crude oil and fills buckets",
            "",
            "&c&l! &cPlease perform a geo scan on the chunk first");
    public static final SlimefunItemStack OIL_BUCKET =
            new SlimefunItemStack("BUCKET_OF_OIL", HeadTexture.OIL_BUCKET, "&rBucket of Oil");
    public static final SlimefunItemStack FUEL_BUCKET =
            new SlimefunItemStack("BUCKET_OF_FUEL", HeadTexture.FUEL_BUCKET, "&rBucket of Fuel");

    public static final SlimefunItemStack REFINERY =
            new SlimefunItemStack("REFINERY", Material.PISTON, "&cRefinery", "", "&rRefines crude oil into fuel");
    public static final SlimefunItemStack COMBUSTION_REACTOR = new SlimefunItemStack(
            "COMBUSTION_REACTOR",
            HeadTexture.GENERATOR,
            "&cCombustion Reactor",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(24));
    public static final SlimefunItemStack ANDROID_MEMORY_CORE =
            new SlimefunItemStack("ANDROID_MEMORY_CORE", HeadTexture.ENERGY_REGULATOR, "&bAndroid Memory Core");

    public static final SlimefunItemStack GPS_TELEPORTER_PYLON = new SlimefunItemStack(
            "GPS_TELEPORTER_PYLON",
            Material.PURPLE_STAINED_GLASS,
            "&5GPS Teleporter Pylon",
            "",
            "&7Teleporter Component");
    public static final SlimefunItemStack GPS_TELEPORTATION_MATRIX = new SlimefunItemStack(
            "GPS_TELEPORTATION_MATRIX",
            Material.IRON_BLOCK,
            "&bGPS Teleportation Matrix",
            "",
            "&rThis is the main component for GPS teleportation",
            "&rThis matrix allows players to teleport to",
            "&rset waypoints");
    public static final SlimefunItemStack GPS_ACTIVATION_DEVICE_SHARED = new SlimefunItemStack(
            "GPS_ACTIVATION_DEVICE_SHARED",
            Material.STONE_PRESSURE_PLATE,
            "&rGPS Activation Device &3(Public)",
            "",
            "&rPlace it on the teleportation matrix",
            "&rand step on this pressure plate to select",
            "&rthe waypoint to teleport to");
    public static final SlimefunItemStack GPS_ACTIVATION_DEVICE_PERSONAL = new SlimefunItemStack(
            "GPS_ACTIVATION_DEVICE_PERSONAL",
            Material.STONE_PRESSURE_PLATE,
            "&rGPS Activation Device &a(Private)",
            "",
            "&rPlace it on the teleportation matrix",
            "&rand step on this pressure plate to select",
            "&rthe waypoint to teleport to",
            "",
            "&rThis activation device can only be used",
            "&rby the player who placed it");
    public static final SlimefunItemStack PORTABLE_TELEPORTER = new SlimefunItemStack(
            "PORTABLE_TELEPORTER",
            Material.COMPASS,
            "&bPortable Teleporter",
            "",
            "&fAllows you to teleport anywhere",
            "&fto any waypoint",
            "",
            LoreBuilder.powerCharged(0, 50),
            "",
            "&eRight-Click&7 to use");

    public static final SlimefunItemStack ELEVATOR_PLATE = new SlimefunItemStack(
            "ELEVATOR_PLATE",
            Material.STONE_PRESSURE_PLATE,
            "&bElevator Plate",
            "",
            "&rPlace elevator plates on each floor",
            "&rand you will be able to teleport between floors.",
            "",
            "&eRight-Click the elevator plate&7 to name this floor");

    public static final SlimefunItemStack INFUSED_HOPPER = new SlimefunItemStack(
            "INFUSED_HOPPER",
            Material.HOPPER,
            "&5Infused Hopper",
            "",
            "&rAutomatically sucks in all items",
            "&rin a 7x7x7 area around the hopper");

    public static final SlimefunItemStack PLASTIC_SHEET =
            new SlimefunItemStack("PLASTIC_SHEET", Material.PAPER, "&rPlastic Sheet");

    public static final SlimefunItemStack HEATED_PRESSURE_CHAMBER = new SlimefunItemStack(
            "HEATED_PRESSURE_CHAMBER",
            Material.LIGHT_GRAY_STAINED_GLASS,
            "&cHeated Pressure Chamber",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack HEATED_PRESSURE_CHAMBER_2 = new SlimefunItemStack(
            "HEATED_PRESSURE_CHAMBER_2",
            Material.LIGHT_GRAY_STAINED_GLASS,
            "&cHeated Pressure Chamber &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 5x",
            LoreBuilder.powerPerSecond(44));

    public static final SlimefunItemStack ELECTRIC_SMELTERY = new SlimefunItemStack(
            "ELECTRIC_SMELTERY",
            Material.FURNACE,
            "&cElectric Smeltery",
            "",
            "&4Only supports alloys, cannot smelt dust into ingots",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack ELECTRIC_SMELTERY_2 = new SlimefunItemStack(
            "ELECTRIC_SMELTERY_2",
            Material.FURNACE,
            "&cElectric Smeltery &7- &eII",
            "",
            "&4Only supports alloys, cannot smelt dust into ingots",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 3x",
            LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIC_PRESS = new SlimefunItemStack(
            "ELECTRIC_PRESS",
            HeadTexture.ELECTRIC_PRESS,
            "&eCompressor",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack ELECTRIC_PRESS_2 = new SlimefunItemStack(
            "ELECTRIC_PRESS_2",
            HeadTexture.ELECTRIC_PRESS,
            "&eCompressor &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 3x",
            LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE = new SlimefunItemStack(
            "ELECTRIFIED_CRUCIBLE",
            Material.RED_TERRACOTTA,
            "&cElectrified Crucible",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE_2 = new SlimefunItemStack(
            "ELECTRIFIED_CRUCIBLE_2",
            Material.RED_TERRACOTTA,
            "&cElectrified Crucible &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 2x",
            "&8\u21E8 &e\u26A1 &780 J/s");
    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE_3 = new SlimefunItemStack(
            "ELECTRIFIED_CRUCIBLE_3",
            Material.RED_TERRACOTTA,
            "&cElectrified Crucible &7- &eIII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 4x",
            "&8\u21E8 &e\u26A1 &7120 J/s");

    public static final SlimefunItemStack CARBON_PRESS = new SlimefunItemStack(
            "CARBON_PRESS",
            Material.BLACK_STAINED_GLASS,
            "&cCarbon Press",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack CARBON_PRESS_2 = new SlimefunItemStack(
            "CARBON_PRESS_2",
            Material.BLACK_STAINED_GLASS,
            "&cCarbon Press &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 3x",
            "&8\u21E8 &e\u26A1 &750 J/s");
    public static final SlimefunItemStack CARBON_PRESS_3 = new SlimefunItemStack(
            "CARBON_PRESS_3",
            Material.BLACK_STAINED_GLASS,
            "&cCarbon Press &7- &eIII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 15x",
            "&8\u21E8 &e\u26A1 &7180 J/s");

    public static final SlimefunItemStack BLISTERING_INGOT = new SlimefunItemStack(
            "BLISTERING_INGOT",
            Material.GOLD_INGOT,
            "&6Blistering Ingot &7(33%)",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BLISTERING_INGOT_2 = new SlimefunItemStack(
            "BLISTERING_INGOT_2",
            Material.GOLD_INGOT,
            "&6Blistering Ingot &7(66%)",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BLISTERING_INGOT_3 = new SlimefunItemStack(
            "BLISTERING_INGOT_3",
            Material.GOLD_INGOT,
            "&6Blistering Ingot",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);

    public static final SlimefunItemStack ENERGY_REGULATOR = new SlimefunItemStack(
            "ENERGY_REGULATOR",
            HeadTexture.ENERGY_REGULATOR,
            "&6Energy Regulator",
            "",
            "&rCore component of the energy network");
    public static final SlimefunItemStack ENERGY_CONNECTOR = new SlimefunItemStack(
            "ENERGY_CONNECTOR",
            HeadTexture.ENERGY_CONNECTOR,
            "&cEnergy Connector",
            LoreBuilder.range(6),
            "",
            "&fUsed to connect machines and generators",
            "&fCan connect to nearby energy networks");
    public static final SlimefunItemStack DEBUG_FISH = new SlimefunItemStack(
            "DEBUG_FISH",
            Material.SALMON,
            "&3How much is this fish?",
            "",
            "&eRight-Click &rany block to view its block data",
            "&eLeft-Click &rto break the block",
            "&eShift + Left-Click &rany block to clear its block data",
            "&eShift + Right-Click &rto place a placeholder block");

    public static final SlimefunItemStack NETHER_ICE = new SlimefunItemStack(
            "NETHER_ICE",
            HeadTexture.NETHER_ICE,
            "&eNether Ice",
            "",
            LoreBuilder.radioactive(Radioactivity.MODERATE),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack ENRICHED_NETHER_ICE = new SlimefunItemStack(
            "ENRICHED_NETHER_ICE",
            HeadTexture.ENRICHED_NETHER_ICE,
            "&eEnriched Nether Ice",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack NETHER_ICE_COOLANT_CELL = new SlimefunItemStack(
            "NETHER_ICE_COOLANT_CELL", HeadTexture.NETHER_ICE_COOLANT_CELL, "&6Nether Ice Coolant");

    // Cargo
    public static final SlimefunItemStack CARGO_MANAGER = new SlimefunItemStack(
            "CARGO_MANAGER",
            HeadTexture.CARGO_MANAGER,
            "&6Cargo Manager",
            "",
            "&rCore component of the item transport network");
    public static final SlimefunItemStack CARGO_CONNECTOR_NODE = new SlimefunItemStack(
            "CARGO_NODE",
            HeadTexture.CARGO_CONNECTOR_NODE,
            "&7Cargo Node &c(Connector)",
            "",
            "&rCargo connection pipe");
    public static final SlimefunItemStack CARGO_INPUT_NODE = new SlimefunItemStack(
            "CARGO_NODE_INPUT", HeadTexture.CARGO_INPUT_NODE, "&7Cargo Node &c(Input)", "", "&rCargo input pipe");
    public static final SlimefunItemStack CARGO_OUTPUT_NODE = new SlimefunItemStack(
            "CARGO_NODE_OUTPUT", HeadTexture.CARGO_OUTPUT_NODE, "&7Cargo Node &c(Output)", "", "&rCargo output pipe");
    public static final SlimefunItemStack CARGO_OUTPUT_NODE_2 = new SlimefunItemStack(
            "CARGO_NODE_OUTPUT_ADVANCED",
            HeadTexture.CARGO_OUTPUT_NODE,
            "&6Advanced Cargo Node &c(Output)",
            "",
            "&rCargo output pipe");

    // Animal farm
    public static final SlimefunItemStack AUTO_BREEDER = new SlimefunItemStack(
            "AUTO_BREEDER",
            Material.HAY_BLOCK,
            "&eAuto Breeder",
            "",
            "&rRequires &aOrganic Food",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            "&8\u21E8 &e\u26A1 &760 J/per animal");
    public static final SlimefunItemStack PRODUCE_COLLECTOR = new SlimefunItemStack(
            "PRODUCE_COLLECTOR",
            Material.HAY_BLOCK,
            "&bProduce Collector",
            "",
            "&fThis machine can automatically collect",
            "&fanimal products produced by nearby animals.",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(32));

    public static final SlimefunItemStack ORGANIC_FOOD =
            new SlimefunItemStack("ORGANIC_FOOD", HeadTexture.FILLED_CAN, "&aOrganic Food", "&7Contains &9???");
    public static final SlimefunItemStack WHEAT_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_WHEAT", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9Wheat");
    public static final SlimefunItemStack CARROT_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_CARROT", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9Carrot");
    public static final SlimefunItemStack POTATO_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_POTATO", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9Potato");
    public static final SlimefunItemStack SEEDS_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_SEEDS", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9Wheat Seeds");
    public static final SlimefunItemStack BEETROOT_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_BEETROOT", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9Beetroot");
    public static final SlimefunItemStack MELON_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_MELON", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9Melon");
    public static final SlimefunItemStack APPLE_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_APPLE", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9Apple");
    public static final SlimefunItemStack SWEET_BERRIES_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_SWEET_BERRIES",
            HeadTexture.FILLED_CAN,
            ORGANIC_FOOD.getDisplayName(),
            "&7Contains &9Sweet Berries");
    public static final SlimefunItemStack KELP_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_KELP", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9Dried Kelp");
    public static final SlimefunItemStack COCOA_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_COCOA", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9Cocoa Beans");
    public static final SlimefunItemStack SEAGRASS_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_SEAGRASS", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains: &9Seagrass");

    public static final SlimefunItemStack FERTILIZER =
            new SlimefunItemStack("FERTILIZER", HeadTexture.FILLED_CAN, "&aOrganic Fertilizer", "&7Contains &9???");
    public static final SlimefunItemStack WHEAT_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_WHEAT", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9Wheat");
    public static final SlimefunItemStack CARROT_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_CARROT", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9Carrot");
    public static final SlimefunItemStack POTATO_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_POTATO", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9Potato");
    public static final SlimefunItemStack SEEDS_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_SEEDS", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9Wheat Seeds");
    public static final SlimefunItemStack BEETROOT_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_BEETROOT", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9Beetroot");
    public static final SlimefunItemStack MELON_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_MELON", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9Melon");
    public static final SlimefunItemStack APPLE_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_APPLE", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9Apple");
    public static final SlimefunItemStack SWEET_BERRIES_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_SWEET_BERRIES",
            HeadTexture.FILLED_CAN,
            FERTILIZER.getDisplayName(),
            "&7Contains &9Sweet Berries");
    public static final SlimefunItemStack KELP_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_KELP", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9Dried Kelp");
    public static final SlimefunItemStack COCOA_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_COCOA", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9Cocoa Beans");
    public static final SlimefunItemStack SEAGRASS_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_SEAGRASS", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains: &9Seagrass");

    public static final SlimefunItemStack ANIMAL_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "ANIMAL_GROWTH_ACCELERATOR",
            Material.HAY_BLOCK,
            "&bAnimal Growth Accelerator",
            "",
            "&rRequires &aOrganic Food",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(28));
    public static final SlimefunItemStack CROP_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "CROP_GROWTH_ACCELERATOR",
            Material.LIME_TERRACOTTA,
            "&aCrop Growth Accelerator",
            "",
            "&rRequires &aOrganic Fertilizer",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Radius: 7x7",
            "&8\u21E8 &7Speed: &a3/cycle",
            LoreBuilder.powerBuffer(1024),
            "&8\u21E8 &e\u26A1 &750 J/s");
    public static final SlimefunItemStack CROP_GROWTH_ACCELERATOR_2 = new SlimefunItemStack(
            "CROP_GROWTH_ACCELERATOR_2",
            Material.LIME_TERRACOTTA,
            "&aCrop Growth Accelerator &7(&eII&7)",
            "",
            "&rRequires &aOrganic Fertilizer",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Radius: 9x9",
            "&8\u21E8 &7Speed: &a4/cycle",
            LoreBuilder.powerBuffer(1024),
            "&8\u21E8 &e\u26A1 &760 J/s");
    public static final SlimefunItemStack TREE_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "TREE_GROWTH_ACCELERATOR",
            Material.BROWN_TERRACOTTA,
            "&aTree Growth Accelerator",
            "",
            "&rRequires &aOrganic Fertilizer",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Radius: 9x9",
            "&8\u21E8 &7Speed: &a4/cycle",
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(48));

    public static final SlimefunItemStack FOOD_FABRICATOR = new SlimefunItemStack(
            "FOOD_FABRICATOR",
            Material.GREEN_STAINED_GLASS,
            "&cFood Fabricator",
            "",
            "&rCan produce &aOrganic Food",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack FOOD_FABRICATOR_2 = new SlimefunItemStack(
            "FOOD_FABRICATOR_2",
            Material.GREEN_STAINED_GLASS,
            "&cFood Fabricator &7(&eII&7)",
            "",
            "&rCan produce &aOrganic Food",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 6x",
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(48));

    public static final SlimefunItemStack FOOD_COMPOSTER = new SlimefunItemStack(
            "FOOD_COMPOSTER",
            Material.GREEN_TERRACOTTA,
            "&cFood Composter",
            "",
            "&rCan produce &aOrganic Fertilizer",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack FOOD_COMPOSTER_2 = new SlimefunItemStack(
            "FOOD_COMPOSTER_2",
            Material.GREEN_TERRACOTTA,
            "&cFood Composter &7(&eII&7)",
            "",
            "&rCan produce &aOrganic Fertilizer",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 10x",
            LoreBuilder.powerBuffer(512),
            "&8\u21E8 &e\u26A1 &752 J/s");

    public static final SlimefunItemStack EXP_COLLECTOR = new SlimefunItemStack(
            "XP_COLLECTOR",
            HeadTexture.EXP_COLLECTOR,
            "&aExperience Collector",
            "",
            "&rCollects nearby experience and stores it",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack REACTOR_COOLANT_CELL =
            new SlimefunItemStack("REACTOR_COLLANT_CELL", HeadTexture.COOLANT_CELL, "&bReactor Coolant");

    public static final SlimefunItemStack NUCLEAR_REACTOR = new SlimefunItemStack(
            "NUCLEAR_REACTOR",
            HeadTexture.NUCLEAR_REACTOR,
            "&2Nuclear Reactor",
            "",
            "&rRequires coolant!",
            "&8\u21E8 &bMust be surrounded by water",
            "&8\u21E8 &bMust use reactor coolant to work",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            "&8\u21E8 &e\u26A1 &716384 J can store",
            "&8\u21E8 &e\u26A1 &7500 J/s");
    public static final SlimefunItemStack NETHER_STAR_REACTOR = new SlimefunItemStack(
            "NETHERSTAR_REACTOR",
            HeadTexture.NETHER_STAR_REACTOR,
            "&rNether Star Reactor",
            "",
            "&rRequires Nether Star",
            "&8\u21E8 &bMust be surrounded by water",
            "&8\u21E8 &bMust use Nether Ice coolant to work",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            "&8\u21E8 &e\u26A1 &732768 J can store",
            "&8\u21E8 &e\u26A1 &71024 J/s",
            "&8\u21E8 &4Will cause nearby entities to gain wither effect");
    public static final SlimefunItemStack REACTOR_ACCESS_PORT = new SlimefunItemStack(
            "REACTOR_ACCESS_PORT",
            Material.CYAN_TERRACOTTA,
            "&2Reactor Access Port",
            "",
            "&rAllows you to access the reactor through cargo nodes",
            "&rCan also be used for storage",
            "",
            "&8\u21E8 &cMust &ebe placed 3 blocks above the reactor");

    public static final SlimefunItemStack FREEZER = new SlimefunItemStack(
            "FREEZER",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&bFreezer",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack FREEZER_2 = new SlimefunItemStack(
            "FREEZER_2",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&bFreezer &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 2x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(30));
    public static final SlimefunItemStack FREEZER_3 = new SlimefunItemStack(
            "FREEZER_3",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&bFreezer &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(42));

    public static final SlimefunItemStack ELECTRIC_GOLD_PAN = new SlimefunItemStack(
            "ELECTRIC_GOLD_PAN",
            Material.BROWN_TERRACOTTA,
            "&6Electric Gold Pan",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(2));
    public static final SlimefunItemStack ELECTRIC_GOLD_PAN_2 = new SlimefunItemStack(
            "ELECTRIC_GOLD_PAN_2",
            Material.BROWN_TERRACOTTA,
            "&6Electric Gold Pan &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 3x",
            LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack ELECTRIC_GOLD_PAN_3 = new SlimefunItemStack(
            "ELECTRIC_GOLD_PAN_3",
            Material.BROWN_TERRACOTTA,
            "&6Electric Gold Pan &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 10x",
            LoreBuilder.powerPerSecond(14));

    public static final SlimefunItemStack ELECTRIC_DUST_WASHER = new SlimefunItemStack(
            "ELECTRIC_DUST_WASHER",
            Material.BLUE_STAINED_GLASS,
            "&3Electric Ore Washer",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack ELECTRIC_DUST_WASHER_2 = new SlimefunItemStack(
            "ELECTRIC_DUST_WASHER_2",
            Material.BLUE_STAINED_GLASS,
            "&3Electric Ore Washer &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 2x",
            LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack ELECTRIC_DUST_WASHER_3 = new SlimefunItemStack(
            "ELECTRIC_DUST_WASHER_3",
            Material.BLUE_STAINED_GLASS,
            "&3Electric Ore Washer &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 10x",
            LoreBuilder.powerPerSecond(30));

    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY = new SlimefunItemStack(
            "ELECTRIC_INGOT_FACTORY",
            Material.RED_TERRACOTTA,
            "&cElectric Ingot Factory",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(8));
    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY_2 = new SlimefunItemStack(
            "ELECTRIC_INGOT_FACTORY_2",
            Material.RED_TERRACOTTA,
            "&cElectric Ingot Factory &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 2x",
            LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY_3 = new SlimefunItemStack(
            "ELECTRIC_INGOT_FACTORY_3",
            Material.RED_TERRACOTTA,
            "&cElectric Ingot Factory &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 8x",
            LoreBuilder.powerPerSecond(40));

    // @Deprecated
    // public static final SlimefunItemStack AUTOMATED_CRAFTING_CHAMBER = new
    // SlimefunItemStack("AUTOMATED_CRAFTING_CHAMBER", Material.CRAFTING_TABLE, "&6Automated Crafting Chamber", "",
    // LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &e\u26A1 &710
    // J/per item");

    public static final SlimefunItemStack FLUID_PUMP = new SlimefunItemStack(
            "FLUID_PUMP",
            Material.BLUE_TERRACOTTA,
            "&9Fluid Pump",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &732 J/per block");
    public static final SlimefunItemStack CHARGING_BENCH = new SlimefunItemStack(
            "CHARGING_BENCH",
            Material.CRAFTING_TABLE,
            "&6Charging Bench",
            "",
            "&rCan charge items, such as jetpacks",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &7128 J can store",
            "&8\u21E8 &e\u26A1 &7Energy loss rate: &c50%");

    public static final SlimefunItemStack VANILLA_AUTO_CRAFTER = new SlimefunItemStack(
            "VANILLA_AUTO_CRAFTER",
            HeadTexture.VANILLA_AUTO_CRAFTER,
            "&2Automated Crafting Chamber &8(Vanilla)",
            "",
            "&fPlace the machine on any block that can hold items",
            "&fand it will automatically craft anything!",
            "&fCan craft items that a &enormal crafting table &fcan craft",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &7Crafting items consumes 16 J");
    public static final SlimefunItemStack ENHANCED_AUTO_CRAFTER = new SlimefunItemStack(
            "ENHANCED_AUTO_CRAFTER",
            HeadTexture.ENHANCED_AUTO_CRAFTER,
            "&2Automated Crafting Chamber &8(Enhanced)",
            "",
            "&fPlace the machine on any block that can hold items",
            "&fand it will automatically craft anything!",
            "&fCan craft items that an &eEnhanced Crafting Table &fcan craft",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &7Crafting items consumes 16 J");
    public static final SlimefunItemStack ARMOR_AUTO_CRAFTER = new SlimefunItemStack(
            "ARMOR_AUTO_CRAFTER",
            HeadTexture.ARMOR_AUTO_CRAFTER,
            "&2Automated Crafting Chamber &8(Armor Forge)",
            "",
            "&fPlace the machine on any block that can hold items",
            "&fand it will automatically craft things that the Armor Forge can craft",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &7Crafting items consumes 32 J");

    public static final SlimefunItemStack IRON_GOLEM_ASSEMBLER = new SlimefunItemStack(
            "IRON_GOLEM_ASSEMBLER",
            Material.IRON_BLOCK,
            "&6Iron Golem Assembler",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Cooldown: &b30 seconds",
            LoreBuilder.powerBuffer(4096),
            "&8\u21E8 &e\u26A1 &72048 J/per Iron Golem");
    public static final SlimefunItemStack WITHER_ASSEMBLER = new SlimefunItemStack(
            "WITHER_ASSEMBLER",
            Material.OBSIDIAN,
            "&5Wither Assembler",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Cooldown: &b30 seconds",
            "&8\u21E8 &e\u26A1 &74096 J can store",
            "&8\u21E8 &e\u26A1 &74096 J/per Wither");

    public static final SlimefunItemStack TRASH_CAN = new SlimefunItemStack(
            "TRASH_CAN_BLOCK", HeadTexture.TRASH_CAN, "&3Trash Can", "", "&rYou can place unwanted items here");

    public static final SlimefunItemStack ELYTRA_SCALE =
            new SlimefunItemStack("ELYTRA_SCALE", Material.FEATHER, "&bElytra Scale");
    public static final SlimefunItemStack INFUSED_ELYTRA =
            new SlimefunItemStack("INFUSED_ELYTRA", Material.ELYTRA, "&5Elytra (Mending)");
    public static final SlimefunItemStack SOULBOUND_ELYTRA =
            new SlimefunItemStack("SOULBOUND_ELYTRA", Material.ELYTRA, "&cElytra (Soulbound)");

    public static final SlimefunItemStack MAGNESIUM_SALT = new SlimefunItemStack(
            "MAGNESIUM_SALT",
            Material.SUGAR,
            "&cMagnesium Salt",
            "",
            "&7is a special fuel that can be used in Magnesium Generators");
    public static final SlimefunItemStack MAGNESIUM_GENERATOR = new SlimefunItemStack(
            "MAGNESIUM_GENERATOR",
            HeadTexture.GENERATOR,
            "&cMagnesium Generator",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(128),
            LoreBuilder.powerPerSecond(36));

    // Don't delete
    public static final SlimefunItemStack CRAFTER_SMART_PORT = new SlimefunItemStack(
            "CRAFTER_SMART_PORT",
            Material.LIME_STAINED_GLASS,
            "&aCrafter Smart Port",
            "",
            "&5Can distribute input quantities based on recipe material amounts",
            "&5and has designated output slots");

    static {
        INFUSED_ELYTRA.addUnsafeEnchantment(Enchantment.MENDING, 1);
    }
}
