
package net.mcreator.allthearmor.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.allthearmor.AllthearmorModElements;

@AllthearmorModElements.ModElement.Tag
public class ChungusPainting extends AllthearmorModElements.ModElement {
	public ChungusPainting(AllthearmorModElements instance) {
		super(instance, 415);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(16, 16).setRegistryName("chungus"));
	}
}
