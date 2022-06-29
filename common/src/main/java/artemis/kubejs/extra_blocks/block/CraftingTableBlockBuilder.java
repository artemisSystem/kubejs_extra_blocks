package artemis.kubejs.extra_blocks.block;

import dev.latvian.mods.kubejs.block.BlockBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CraftingTableBlock;

public class CraftingTableBlockBuilder extends BlockBuilder {
    public CraftingTableBlockBuilder(ResourceLocation rl) {
        super(rl);
    }

    @Override
    public Block createObject() {
        return new CraftingTableBlock(createProperties());
    }
}
