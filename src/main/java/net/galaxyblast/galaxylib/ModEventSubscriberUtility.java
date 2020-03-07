package net.galaxyblast.galaxylib;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class ModEventSubscriberUtility
{
	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name, final String modid)
	{
		return setup(entry, new ResourceLocation(modid, name));
	}
	
	/*
	 * public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final
	 * String name) { return setup(entry, new ResourceLocation(ExampleMod.MODID,
	 * name)); }
	 */

	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName)
	{
		entry.setRegistryName(registryName);
		return entry;
	}
}
