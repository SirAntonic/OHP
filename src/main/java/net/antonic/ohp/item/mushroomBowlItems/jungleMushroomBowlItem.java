package net.antonic.ohp.item.mushroomBowlItems;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MushroomStewItem;
import net.minecraft.world.World;

import static net.antonic.ohp.common.Items.JUNGLE_BOWL;

public class jungleMushroomBowlItem extends MushroomStewItem {
    public jungleMushroomBowlItem(Settings settings) {
        super(settings);
    }


    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        return user instanceof PlayerEntity && ((PlayerEntity)user).abilities.creativeMode ? itemStack : new ItemStack(JUNGLE_BOWL);
    }
}
