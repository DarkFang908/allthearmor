
package net.mcreator.allthearmor.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import net.mcreator.allthearmor.itemgroup.AllTheArmorItemGroup;
import net.mcreator.allthearmor.AllthearmorModElements;

@AllthearmorModElements.ModElement.Tag
public class RickRollItem extends AllthearmorModElements.ModElement {
	@ObjectHolder("allthearmor:rick_roll")
	public static final Item block = null;
	public RickRollItem(AllthearmorModElements instance) {
		super(instance, 412);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, AllthearmorModElements.sounds.get(new ResourceLocation("allthearmor:rick_roll")),
					new Item.Properties().group(AllTheArmorItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("rick_roll");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
