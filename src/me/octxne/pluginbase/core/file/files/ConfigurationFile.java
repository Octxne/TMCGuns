package me.octxne.pluginbase.core.file.files;

import me.octxne.pluginbase.core.PluginBase;
import me.octxne.pluginbase.core.file.Filer;

public class ConfigurationFile
{
	private static Filer file = new Filer("config.yml");
	
	public static Filer getFile()
	{
		return file;
	}
	
	public static void loadDefaults()
	{
		getFile().addDefault("pluginBase.settings.prefix", "[" + PluginBase.getInstance().getPluginName() + "]");
	}
}
