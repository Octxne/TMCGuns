package me.octxne.pluginbase.core;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import me.octxne.pluginbase.core.file.files.ConfigurationFile;
import me.octxne.pluginbase.utilities.Printer;
import me.octxne.pluginbase.utilities.type.PrinterType;

public class PluginBase extends JavaPlugin
{
	private static PluginBase instance;
	
	private String name, author;
	
	private double version;
	
	@Override
	public void onEnable()
	{
		this.setPlugin(this);
		this.setPluginName("PluginBase");
		this.setPluginAuthor("Octxne");
		this.setPluginVersion(0.1D);
		this.registerCommands();
		this.setupFiles();
		
		Printer.printToConsole("v" + this.getPluginVersion() + " developed by " + this.getPluginAuthor() + " has been enabled!", PrinterType.NORMAL);
	}
	
	@Override
	public void onDisable()
	{
		Printer.printToConsole("v" + this.getPluginVersion() + " developed by \"" + this.getPluginAuthor() + "\" has been disabled!", PrinterType.NORMAL);
		
		this.setPlugin(null);
	}
	
	public static PluginBase getInstance()
	{
		return instance;
	}
	
	public String getPluginName()
	{
		return this.name;
	}
	
	public String getPluginAuthor()
	{
		return this.author;
	}
	
	public double getPluginVersion()
	{
		return this.version;
	}
	
	public String getPrefix()
	{
		return ConfigurationFile.getFile().getConfiguration().getString("pluginBase.settings.prefix");
	}
	
	public void setPlugin(PluginBase plugin)
	{
		instance = plugin;
	}
	
	public void setPluginName(String name)
	{
		this.name = name;
	}
	
	public void setPluginAuthor(String author)
	{
		this.author = author;
	}
	
	public void setPluginVersion(Double version)
	{
		this.version = version;
	}
	
	public void setPrefix(String prefix)
	{
		ConfigurationFile.getFile().getConfiguration().set("pluginBase.settings.prefix", prefix);
		ConfigurationFile.getFile().saveConfiguration();
	}
	
	public void registerCommand(String name, CommandExecutor executor)
	{
		this.getCommand(name).setExecutor(executor);
	}
	
	private void registerCommands()
	{
		
	}
	
	private void setupFiles()
	{
		ConfigurationFile.loadDefaults();
	}
}
