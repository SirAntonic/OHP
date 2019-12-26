package net.antonic.ohp.item;

import net.minecraft.item.BowItem;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class woodBowItem extends BowItem {

    public woodBowItem(Settings settings) {
        super(settings);
        this.addPropertyGetter(new Identifier("pull"), (stack, world, entity) -> {
            if (entity == null) {
                return 0.0F;
            } else {
                return entity.getActiveItem().getItem() != this ? 0.0F : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
            }
        });
    }
}