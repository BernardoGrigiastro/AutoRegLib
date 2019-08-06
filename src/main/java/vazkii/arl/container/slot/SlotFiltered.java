package vazkii.arl.container.slot;

import java.util.function.Predicate;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;

public class SlotFiltered extends Slot {

	private final Predicate<ItemStack> pred;
	
	public SlotFiltered(IInventory inventoryIn, int index, int xPosition, int yPosition, Predicate<ItemStack> pred) {
		super(inventoryIn, index, xPosition, yPosition);
		this.pred = pred;
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		return pred.test(stack);
	}
	

}
