package net.antonic.ohp.item.mushroomBowlItems;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MushroomStewItem;
import net.minecraft.world.World;

import static net.antonic.ohp.common.Items.ACACIA_BOWL;

public class acaciaMushroomBowlItem extends MushroomStewItem {
    public acaciaMushroomBowlItem(Settings settings) {
        super(settings);
    }


    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        return user instanceof PlayerEntity && ((PlayerEntity)user).abilities.creativeMode ? itemStack : new ItemStack(ACACIA_BOWL);
    }
}
