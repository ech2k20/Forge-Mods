package com.area.crystallum.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.util.MouseHelper;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class ClientProxy implements IProxy
{
    // mouse helper (currently not utilized)
    public static MouseHelper mouseHelperAI; // used to intercept user mouse movement for "bot" functionality

    @Override
    public void preInit(FMLPreInitializationEvent event)
    {

        // DEBUG
        System.out.println("on Client side");
        Minecraft mc = Minecraft.getMinecraft();

        // Replace mouse helper with custom version
        mouseHelperAI = new MouseHelperAI();
        mc.mouseHelper = mouseHelperAI;

    }

    @SuppressWarnings("unchecked")
    @Override
    public void init(FMLInitializationEvent event)
    {
        // DEBUG
        System.out.println("on Client side");
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        // DEBUG
        System.out.println("on Client side");
    }


    @Override
    public void serverStarting(FMLServerStartingEvent event)
    {
        // This will never get called on client side
    }

    public class MouseHelperAI extends MouseHelper
    {
        /**
         * Instantiates a new mouse helper AI.
         */
        public MouseHelperAI()
        {
            super();
            // DEBUG
            System.out.println("Constructing MouseHelper for AI bots");
        }

        /* (non-Javadoc)
         * @see net.minecraft.util.MouseHelper#mouseXYChange()
         */
        @Override
        public void mouseXYChange()
        {
            if (Keyboard.isKeyDown(Keyboard.KEY_COMMA))
            {
                deltaX += 1;
            }
            else
            {
                deltaX = Mouse.getDX();
            }
            deltaY = Mouse.getDY();
        }
    }
}

