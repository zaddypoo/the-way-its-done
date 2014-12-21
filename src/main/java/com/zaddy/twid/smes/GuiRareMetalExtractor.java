package com.zaddy.twid.smes;

import cofh.lib.gui.GuiBase;
import cofh.lib.gui.element.ElementEnergyStored;
import com.zaddy.twid.reference.Reference;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiRareMetalExtractor extends GuiBase {
    private TileEntityRareMetalExtractor tileEntity;

    public GuiRareMetalExtractor(TileEntityRareMetalExtractor tileEntity, InventoryPlayer inventory) {
        super(new ContainerRareMetalExtractor(tileEntity, inventory),
                new ResourceLocation(Reference.MOD_ID, "textures/gui/machine/rareMetalExtractor.png"));
        this.tileEntity = tileEntity;
    }

    @Override
    public void initGui() {
        super.initGui();
        this.addElement(new ElementEnergyStored(this, 8, 8, tileEntity.getBattery()));
    }
}