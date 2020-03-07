package net.galaxyblast.galaxylib.item;

import net.minecraft.item.Item;

public class ItemBase extends Item
{
	private final String name;

	public ItemBase(Properties properties, String name)
	{
		super(properties);
		this.name = name;
	}

	public String getItemName()
	{
		return this.name;
	}
}
