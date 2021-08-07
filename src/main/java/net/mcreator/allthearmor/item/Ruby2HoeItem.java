
package net.mcreator.allthearmor.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.allthearmor.itemgroup.AllTheArmorItemGroup;
import net.mcreator.allthearmor.AllthearmorModElements;

@AllthearmorModElements.ModElement.Tag
public class Ruby2HoeItem extends AllthearmorModElements.ModElement {
	@ObjectHolder("allthearmor:ruby_2_hoe")
	public static final Item block = null;
	public Ruby2HoeItem(AllthearmorModElements instance) {
		super(instance, 386);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 660;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubyItem.block, (int) (1)));
			}
		}, 0, -3f, new Item.Properties().group(AllTheArmorItemGroup.tab)) {
		}.setRegistryName("ruby_2_hoe"));
	}
}
