package com.github.kotaro.kotaro_mod.init;
import net.minecraft.item.Item;
import com.github.kotaro.kotaro_mod.items.Kotaro_ModItem;
import scala.reflect.internal.Trees.New;

import com.github.kotaro.kotaro_mod.help.RegisterHelper;

public class ModItems {
	
	public static Item skysteelIngot = new Kotaro_ModItem().setUnlocalizedName("skysteelIngot");
	public static Item lighterTest = new Kotaro_ModItem().setUnlocalizedName("lighterTest");
	
	
	public static void init() {
		RegisterHelper.registerItem(skysteelIngot);
		RegisterHelper.registerItem(lighterTest);
	}
}
