package net.antonic.ohp.common;

import net.antonic.ohp.item.*;
import net.antonic.ohp.item.beetrootBowlItems.*;
import net.antonic.ohp.item.mushroomBowlItems.*;
import net.antonic.ohp.item.rabbitBowlItems.*;
import net.antonic.ohp.item.suspiciousBowlItems.*;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {

    //Bows
    public static final Item SPRUCE_BOW = register("spruce_bow", new woodBowItem(new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item BIRCH_BOW = register("birch_bow", new woodBowItem(new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item DARK_OAK_BOW = register("dark_oak_bow", new woodBowItem(new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item JUNGLE_BOW = register("jungle_bow", new woodBowItem(new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item ACACIA_BOW = register("acacia_bow", new woodBowItem(new Item.Settings().group(ItemGroup.COMBAT)));

    //Arrows
    public static final Item SPRUCE_ARROW = register("spruce_arrow", new ArrowItem(new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item BIRCH_ARROW = register("birch_arrow", new ArrowItem(new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item DARK_OAK_ARROW = register("dark_oak_arrow", new ArrowItem(new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item JUNGLE_ARROW = register("jungle_arrow", new ArrowItem(new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item ACACIA_ARROW = register("acacia_arrow", new ArrowItem(new Item.Settings().group(ItemGroup.COMBAT)));

    //Armor Stands
    public static final Item SPRUCE_ARMOR_STAND = register("spruce_armor_stand", new Item(new Item.Settings().group(ItemGroup.DECORATIONS)));
    public static final Item BIRCH_ARMOR_STAND = register("birch_armor_stand", new Item(new Item.Settings().group(ItemGroup.DECORATIONS)));
    public static final Item DARK_OAK_ARMOR_STAND = register("dark_oak_armor_stand", new Item(new Item.Settings().group(ItemGroup.DECORATIONS)));
    public static final Item JUNGLE_ARMOR_STAND = register("jungle_armor_stand", new Item(new Item.Settings().group(ItemGroup.DECORATIONS)));
    public static final Item ACACIA_ARMOR_STAND = register("acacia_armor_stand", new Item(new Item.Settings().group(ItemGroup.DECORATIONS)));

    //Stews & Soups
    public static final Item MUSHROOM_STEW_IN_AN_ACACIA_BOWL = register("mushroom_stew_in_an_acacia_bowl", new acaciaMushroomBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build()).food(FoodComponents.MUSHROOM_STEW)));
    public static final Item MUSHROOM_STEW_IN_A_BIRCH_BOWL = register("mushroom_stew_in_a_birch_bowl", new birchMushroomBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build()).food(FoodComponents.MUSHROOM_STEW)));
    public static final Item MUSHROOM_STEW_IN_A_DARK_OAK_BOWL = register("mushroom_stew_in_a_dark_oak_bowl", new darkOakMushroomBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build()).food(FoodComponents.MUSHROOM_STEW)));
    public static final Item MUSHROOM_STEW_IN_A_JUNGLE_BOWL = register("mushroom_stew_in_a_jungle_bowl", new jungleMushroomBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build()).food(FoodComponents.MUSHROOM_STEW)));
    public static final Item MUSHROOM_STEW_IN_A_SPRUCE_BOWL = register("mushroom_stew_in_a_spruce_bowl", new spruceMushroomBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build()).food(FoodComponents.MUSHROOM_STEW)));
    public static final Item RABBIT_STEW_IN_AN_ACACIA_BOWL = register("rabbit_stew_in_an_acacia_bowl", new acaciaRabbitBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(10).saturationModifier(1.2F).build()).food(FoodComponents.RABBIT_STEW)));
    public static final Item RABBIT_STEW_IN_A_BIRCH_BOWL = register("rabbit_stew_in_a_birch_bowl", new birchRabbitBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(10).saturationModifier(1.2F).build()).food(FoodComponents.RABBIT_STEW)));
    public static final Item RABBIT_STEW_IN_A_DARK_OAK_BOWL = register("rabbit_stew_in_a_dark_oak_bowl", new darkOakRabbitBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(10).saturationModifier(1.2F).build()).food(FoodComponents.RABBIT_STEW)));
    public static final Item RABBIT_STEW_IN_A_JUNGLE_BOWL = register("rabbit_stew_in_a_jungle_bowl", new jungleRabbitBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(10).saturationModifier(1.2F).build()).food(FoodComponents.RABBIT_STEW)));
    public static final Item RABBIT_STEW_IN_A_SPRUCE_BOWL = register("rabbit_stew_in_a_spruce_bowl", new spruceRabbitBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(10).saturationModifier(1.2F).build()).food(FoodComponents.RABBIT_STEW)));
    public static final Item BEETROOT_SOUP_IN_AN_ACACIA_BOWL = register("beetroot_soup_in_an_acacia_bowl", new acaciaBeetrootBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build()).food(FoodComponents.BEETROOT_SOUP)));
    public static final Item BEETROOT_SOUP_IN_A_BIRCH_BOWL = register("beetroot_soup_in_a_birch_bowl", new birchBeetrootBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build()).food(FoodComponents.BEETROOT_SOUP)));
    public static final Item BEETROOT_SOUP_IN_A_DARK_OAK_BOWL = register("beetroot_soup_in_a_dark_oak_bowl", new darkOakBeetrootBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build()).food(FoodComponents.BEETROOT_SOUP)));
    public static final Item BEETROOT_SOUP_IN_A_JUNGLE_BOWL = register("beetroot_soup_in_a_jungle_bowl", new jungleBeetrootBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build()).food(FoodComponents.BEETROOT_SOUP)));
    public static final Item BEETROOT_SOUP_IN_A_SPRUCE_BOWL = register("beetroot_soup_in_a_spruce_bowl", new spruceBeetrootBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build()).food(FoodComponents.BEETROOT_SOUP)));
    public static final Item SUSPICIOUS_SOUP_IN_AN_ACACIA_BOWL = register("suspicious_soup_in_an_acacia_bowl", new acaciaSuspiciousBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build()).food(FoodComponents.SUSPICIOUS_STEW)));
    public static final Item SUSPICIOUS_SOUP_IN_A_BIRCH_BOWL = register("suspicious_soup_in_a_birch_bowl", new birchSuspiciousBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build()).food(FoodComponents.SUSPICIOUS_STEW)));
    public static final Item SUSPICIOUS_SOUP_IN_A_DARK_OAK_BOWL = register("suspicious_soup_in_a_dark_oak_bowl", new darkOakSuspiciousBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build()).food(FoodComponents.SUSPICIOUS_STEW)));
    public static final Item SUSPICIOUS_SOUP_IN_A_JUNGLE_BOWL = register("suspicious_soup_in_a_jungle_bowl", new jungleSuspiciousBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build()).food(FoodComponents.SUSPICIOUS_STEW)));
    public static final Item SUSPICIOUS_SOUP_IN_A_SPRUCE_BOWL = register("suspicious_soup_in_a_spruce_bowl", new spruceSuspiciousBowlItem(new Item.Settings().maxCount(1).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build()).food(FoodComponents.SUSPICIOUS_STEW)));

    //Bowls
    public static final Item ACACIA_BOWL = register("acacia_bowl", new Item(new Item.Settings().group(ItemGroup.MISC)));
    public static final Item BIRCH_BOWL = register("birch_bowl", new Item(new Item.Settings().group(ItemGroup.MISC)));
    public static final Item DARK_OAK_BOWL = register("dark_oak_bowl", new Item(new Item.Settings().group(ItemGroup.MISC)));
    public static final Item JUNGLE_BOWL = register("jungle_bowl", new Item(new Item.Settings().group(ItemGroup.MISC)));
    public static final Item SPRUCE_BOWL = register("spruce_bowl", new Item(new Item.Settings().group(ItemGroup.MISC)));

    //Sticks
    public static final Item ACACIA_STICK = register("acacia_stick", new Item(new Item.Settings().group(ItemGroup.MISC)));
    public static final Item BIRCH_STICK = register("birch_stick", new Item(new Item.Settings().group(ItemGroup.MISC)));
    public static final Item DARK_OAK_STICK = register("dark_oak_stick", new Item(new Item.Settings().group(ItemGroup.MISC)));
    public static final Item JUNGLE_STICK = register("jungle_stick", new Item(new Item.Settings().group(ItemGroup.MISC)));
    public static final Item SPRUCE_STICK = register("spruce_stick", new Item(new Item.Settings().group(ItemGroup.MISC)));

    public static Item register(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier("ohp", name), item);
    }

    public static void init()
    {

    }
}
