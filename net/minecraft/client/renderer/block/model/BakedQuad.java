// 
// Decompiled by Procyon v0.5.30
// 

package net.minecraft.client.renderer.block.model;

import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.EnumFacing;

public class BakedQuad
{
    protected final int[] field_178215_a;
    protected final int field_178213_b;
    protected final EnumFacing face;
    private static final String __OBFID = "CL_00002512";
    private TextureAtlasSprite sprite;
    
    public BakedQuad(final int[] p_i46232_1_, final int p_i46232_2_, final EnumFacing p_i46232_3_, final TextureAtlasSprite sprite) {
        this.sprite = null;
        this.field_178215_a = p_i46232_1_;
        this.field_178213_b = p_i46232_2_;
        this.face = p_i46232_3_;
        this.sprite = sprite;
    }
    
    public TextureAtlasSprite getSprite() {
        return this.sprite;
    }
    
    @Override
    public String toString() {
        return "vertex: " + this.field_178215_a.length / 7 + ", tint: " + this.field_178213_b + ", facing: " + this.face + ", sprite: " + this.sprite;
    }
    
    public BakedQuad(final int[] p_i46232_1_, final int p_i46232_2_, final EnumFacing p_i46232_3_) {
        this.sprite = null;
        this.field_178215_a = p_i46232_1_;
        this.field_178213_b = p_i46232_2_;
        this.face = p_i46232_3_;
    }
    
    public int[] func_178209_a() {
        return this.field_178215_a;
    }
    
    public boolean func_178212_b() {
        return this.field_178213_b != -1;
    }
    
    public int func_178211_c() {
        return this.field_178213_b;
    }
    
    public EnumFacing getFace() {
        return this.face;
    }
}
