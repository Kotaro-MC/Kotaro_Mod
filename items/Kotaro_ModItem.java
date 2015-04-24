package com.github.kotaro.kotaro_mod.items;
import com.github.kotaro.kotaro_mod.help.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Kotaro_ModItem extends Item {
	
	public Kotaro_ModItem() {
		super();
		setCreativeTab(CreativeTabs.tabMisc);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}


