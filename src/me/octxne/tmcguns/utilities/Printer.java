package me.octxne.tmcguns.utilities;

import me.octxne.tmcguns.core.TMCGuns;
import me.octxne.tmcguns.utilities.type.PrinterType;

public class Printer
{
	public static void printToConsole(String text, PrinterType type)
	{
		switch (type)
		{
		case NORMAL:
			System.out.println(TMCGuns.getInstance().getPrefix() + " " + text);

			break;

		case WARNING:
			System.out.println(TMCGuns.getInstance().getPrefix() + " (WARNING) " + text);

			break;

		case ERROR:
			System.out.println(TMCGuns.getInstance().getPrefix() + " (ERROR) " + text);
		}
	}
}
