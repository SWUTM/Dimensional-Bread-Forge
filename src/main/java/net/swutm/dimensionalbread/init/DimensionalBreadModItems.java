
package net.swutm.dimensionalbread.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.swutm.dimensionalbread.dimensionalbread;
import net.swutm.dimensionalbread.item.EnderBreadItem;
import net.swutm.dimensionalbread.item.NetherBreadItem;
import net.swutm.dimensionalbread.item.OverworldBreadItem;

public class DimensionalBreadModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, dimensionalbread.MOD_ID);
	public static final RegistryObject<Item> OVERWORLD_BREAD = REGISTRY.register("overworld_bread", OverworldBreadItem::new);
	public static final RegistryObject<Item> NETHER_BREAD = REGISTRY.register("nether_bread", NetherBreadItem::new);
	public static final RegistryObject<Item> ENDER_BREAD = REGISTRY.register("ender_bread", EnderBreadItem::new);
}
