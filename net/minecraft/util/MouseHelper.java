// 
// Decompiled by Procyon v0.5.30
// 

package net.minecraft.util;

import org.lwjgl.opengl.Display;
import org.lwjgl.input.Mouse;

public class MouseHelper
{
    public int deltaX;
    public int deltaY;
    private static final String __OBFID = "CL_00000648";
    
    public void grabMouseCursor() {
        Mouse.setGrabbed(true);
        this.deltaX = 0;
        this.deltaY = 0;
    }
    
    public void ungrabMouseCursor() {
        Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2);
        Mouse.setGrabbed(false);
    }
    
    public void mouseXYChange() {
        this.deltaX = Mouse.getDX();
        this.deltaY = Mouse.getDY();
    }
}
