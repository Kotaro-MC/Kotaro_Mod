package com.github.kotaro.kotaro_mod.init;
import net.minecraft.block.Block;
import com.github.kotaro.kotaro_mod.blocks.BlockSkysteelOre;
import com.github.kotaro.kotaro_mod.help.RegisterHelper;

public class ModBlocks {
	
	public static Block skysteelOre = new BlockSkysteelOre();

	public static void init() {
		RegisterHelper.registerBlock(skysteelOre);
	}
	
}
