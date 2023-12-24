package net.yelloj.endupdatemod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.yelloj.endupdatemod.EndMod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ALLOY_DETECTOR_VALUABLES = tag("alloy_detector_valuables");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(EndMod.MOD_ID, name));
        }
    }
}
