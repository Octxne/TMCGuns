package me.octxne.pluginbase.utilities;

import me.octxne.pluginbase.core.PluginBase;
import me.octxne.pluginbase.utilities.type.PrinterType;

public class Printer
{
	public static void printToConsole(String text, PrinterType type)
	{
		switch (type)
		{
		case NORMAL:
			System.out.println(PluginBase.getInstance().getPrefix() + " " + text);

			break;

		case WARNING:
			System.out.println(PluginBase.getInstance().getPrefix() + " (WARNING) " + text);

			break;

		case ERROR:
			System.out.println(PluginBase.getInstance().getPrefix() + " (ERROR) " + text);
		}
	}
}
