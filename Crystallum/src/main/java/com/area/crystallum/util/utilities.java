package com.area.crystallum.util;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.util.text.TextFormatting;

// TODO: Auto-generated Javadoc
/**
 * @author jabelar
 *
 */
public class utilities
{

    // Need to call this on item instance prior to registering the item
    /**
     * Sets the item name.
     *
     * @param parItem
     *            the par item
     * @param parItemName
     *            the par item name
     * @return the item
     */
    // chainable
    public static Item setItemName(Item parItem, String parItemName)
    {
        parItem.setRegistryName(parItemName);
        parItem.setUnlocalizedName(parItemName);
        return parItem;
    }

    // Need to call this on block instance prior to registering the block
    /**
     * Sets the block name.
     *
     * @param parBlock
     *            the par block
     * @param parBlockName
     *            the par block name
     * @return the block
     */
    // chainable
    public static Block setBlockName(Block parBlock, String parBlockName)
    {
        parBlock.setRegistryName(parBlockName);
        parBlock.setUnlocalizedName(parBlockName);
        return parBlock;
    }

    /*
     * Text Utilities
     */

    /**
     * String to rainbow.
     *
     * @param parString
     *            the par string
     * @param parReturnToBlack
     *            the par return to black
     * @return the string
     */
    public static String stringToRainbow(String parString, boolean parReturnToBlack)
    {
        int stringLength = parString.length();
        if (stringLength < 1)
        {
            return "";
        }
        String outputString = "";
        TextFormatting[] colorChar = {
                TextFormatting.RED,
                TextFormatting.GOLD,
                TextFormatting.YELLOW,
                TextFormatting.GREEN,
                TextFormatting.AQUA,
                TextFormatting.BLUE,
                TextFormatting.LIGHT_PURPLE,
                TextFormatting.DARK_PURPLE
        };
        for (int i = 0; i < stringLength; i++)
        {
            outputString = outputString + colorChar[i % 8] + parString.substring(i, i + 1);
        }
        // return color to a common one after (most chat is white, but for other GUI might want black)
        if (parReturnToBlack)
        {
            return outputString + TextFormatting.BLACK;
        }
        return outputString + TextFormatting.WHITE;
    }

    /**
     * String to rainbow.
     *
     * @param parString
     *            the par string
     * @return the string
     */
    // by default return to white (for chat formatting).
    public static String stringToRainbow(String parString)
    {
        return stringToRainbow(parString, false);
    }

    /**
     * String to golden.
     *
     * @param parString
     *            the par string
     * @param parShineLocation
     *            the par shine location
     * @param parReturnToBlack
     *            the par return to black
     * @return the string
     */
    public static String stringToGolden(String parString, int parShineLocation, boolean parReturnToBlack)
    {
        int stringLength = parString.length();
        if (stringLength < 1)
        {
            return "";
        }
        String outputString = "";
        for (int i = 0; i < stringLength; i++)
        {
            if ((i + parShineLocation + Minecraft.getSystemTime() / 20) % 88 == 0)
            {
                outputString = outputString + TextFormatting.WHITE + parString.substring(i, i + 1);
            }
            else if ((i + parShineLocation + Minecraft.getSystemTime() / 20) % 88 == 1)
            {
                outputString = outputString + TextFormatting.YELLOW + parString.substring(i, i + 1);
            }
            else if ((i + parShineLocation + Minecraft.getSystemTime() / 20) % 88 == 87)
            {
                outputString = outputString + TextFormatting.YELLOW + parString.substring(i, i + 1);
            }
            else
            {
                outputString = outputString + TextFormatting.GOLD + parString.substring(i, i + 1);
            }
        }
        // return color to a common one after (most chat is white, but for other GUI might want black)
        if (parReturnToBlack)
        {
            return outputString + TextFormatting.BLACK;
        }
        return outputString + TextFormatting.WHITE;
    }

    /**
     * String to golden.
     *
     * @param parString
     *            the par string
     * @param parShineLocation
     *            the par shine location
     * @return the string
     */
    // by default return to white (for chat formatting).
    public static String stringToGolden(String parString, int parShineLocation)
    {
        return stringToGolden(parString, parShineLocation, false);
    }
}