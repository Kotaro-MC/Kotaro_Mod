package com.github.kotaro.kotaro_mod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.github.kotaro.kotaro_mod.help.Reference;
import com.github.kotaro.kotaro_mod.init.ModItems;

public class BlockSkysteelOre extends Block {
	Random rnd = new Random();
	
	public BlockSkysteelOre() {
		super(Material.iron);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockName("skysteelOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setHardness(3.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(6.0F);
		}
	
	@Override
	public int getExpDrop(IBlockAccess world, int metadata, int fortune) {
		return 6;
	}
	
	@Override
	public Item getItemDropped(int x,
            Random z,
            int y) {
		return ModItems.skysteelIngot;		
	}
	
	@Override
	public int quantityDropped(Random chance) {
		
		int amtGiven = rnd.nextInt(10);
		if (amtGiven <= 1) {
			return 1;
		}
		else {
			return amtGiven;
		}
		}
}
	

	
