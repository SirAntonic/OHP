package net.antonic.ohp;

import net.fabricmc.api.ModInitializer;
import net.antonic.ohp.common.Items;

public class main implements ModInitializer {
	@Override
	public void onInitialize() {

		Items.init();

	}
}
