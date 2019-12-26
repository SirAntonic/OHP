package net.antonic.ohp.item.suspiciousBowlItems;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MushroomStewItem;
import net.minecraft.item.SuspiciousStewItem;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.world.World;

import static net.antonic.ohp.common.Items.DARK_OAK_BOWL;
import static net.antonic.ohp.common.Items.JUNGLE_BOWL;

public class darkOakSuspiciousBowlItem extends SuspiciousStewItem {
    public darkOakSuspiciousBowlItem(Settings settings) {
        super(settings);
    }


    public static void addEffectToStew(ItemStack dark_OakSuspiciousBowlItem, StatusEffect effect, int duration) {
        CompoundTag compoundTag = dark_OakSuspiciousBowlItem.getOrCreateTag();
        ListTag listTag = compoundTag.getList("Effects", 9);
        CompoundTag compoundTag2 = new CompoundTag();
        compoundTag2.putByte("EffectId", (byte)StatusEffect.getRawId(effect));
        compoundTag2.putInt("EffectDuration", duration);
        listTag.add(compoundTag2);
        compoundTag.put("Effects", listTag);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        CompoundTag compoundTag = stack.getTag();
        if (compoundTag != null && compoundTag.contains("Effects", 9)) {
            ListTag listTag = compoundTag.getList("Effects", 10);

            for(int i = 0; i < listTag.size(); ++i) {
                int j = 160;
                CompoundTag compoundTag2 = listTag.getCompound(i);
                if (compoundTag2.contains("EffectDuration", 3)) {
                    j = compoundTag2.getInt("EffectDuration");
                }

                StatusEffect statusEffect = StatusEffect.byRawId(compoundTag2.getByte("EffectId"));
                if (statusEffect != null) {
                    user.addStatusEffect(new StatusEffectInstance(statusEffect, j));
                }
            }
        }

        return user instanceof PlayerEntity && ((PlayerEntity)user).abilities.creativeMode ? itemStack : new ItemStack(DARK_OAK_BOWL);
    }
}
