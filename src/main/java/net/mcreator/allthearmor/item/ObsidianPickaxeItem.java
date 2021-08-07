
package net.mcreator.allthearmor.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.mcreator.allthearmor.itemgroup.AllTheArmorItemGroup;
import net.mcreator.allthearmor.AllthearmorModElements;

@AllthearmorModElements.ModElement.Tag
public class ObsidianPickaxeItem extends AllthearmorModElements.ModElement {
	@ObjectHolder("allthearmor:obsidian_pickaxe")
	public static final Item block = null;
	public ObsidianPickaxeItem(AllthearmorModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 70;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.OBSIDIAN, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(AllTheArmorItemGroup.tab)) {
		}.setRegistryName("obsidian_pickaxe"));
	}
}
