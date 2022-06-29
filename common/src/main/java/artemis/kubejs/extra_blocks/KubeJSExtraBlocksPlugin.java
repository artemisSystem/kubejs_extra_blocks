package artemis.kubejs.extra_blocks;

import artemis.kubejs.extra_blocks.block.CraftingTableBlockBuilder;
import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.RegistryObjectBuilderTypes;

public class KubeJSExtraBlocksPlugin extends KubeJSPlugin {
	@Override
	public void init() {
		RegistryObjectBuilderTypes.BLOCK.addType("crafting_table", CraftingTableBlockBuilder.class, CraftingTableBlockBuilder::new);
	}
}