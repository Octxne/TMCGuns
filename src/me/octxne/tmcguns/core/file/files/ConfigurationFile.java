package me.octxne.tmcguns.core.file.files;

import me.octxne.tmcguns.core.TMCGuns;
import me.octxne.tmcguns.core.file.Filer;

public class ConfigurationFile
{
	private static Filer file = new Filer("config.yml");
	
	public static Filer getFile()
	{
		return file;
	}
	
	public static void loadDefaults()
	{
		getFile().addDefault("tmcguns.settings.prefix", "[" + TMCGuns.getInstance().getPluginName() + "]");
	}
}
