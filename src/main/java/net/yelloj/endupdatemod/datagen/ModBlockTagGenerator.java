package net.yelloj.endupdatemod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeBlockTagsProvider;
import net.minecraftforge.fml.common.Mod;
import net.yelloj.endupdatemod.EndMod;
import net.yelloj.endupdatemod.block.ModBlocks;
import net.yelloj.endupdatemod.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EndMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.ALLOY_DETECTOR_VALUABLES)
                .add(ModBlocks.TERMINITE_ORE.get()).addTag(Tags.Blocks.ORES_NETHERITE_SCRAP);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TERMINITE_ORE.get(),
                        ModBlocks.TERMINITE_BLOCK.get(),
                        ModBlocks.TERMINITE_ORE.get());
    }
}
