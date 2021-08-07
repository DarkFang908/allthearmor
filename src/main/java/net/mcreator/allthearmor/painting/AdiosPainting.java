
package net.mcreator.allthearmor.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.allthearmor.AllthearmorModElements;

@AllthearmorModElements.ModElement.Tag
public class AdiosPainting extends AllthearmorModElements.ModElement {
	public AdiosPainting(AllthearmorModElements instance) {
		super(instance, 413);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(16, 16).setRegistryName("adios"));
	}
}
