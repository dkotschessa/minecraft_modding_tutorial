package net.skittlesdada.tutorialmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.skittlesdada.tutorialmod.TutorialMod;
import net.skittlesdada.tutorialmod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output,  ExistingFileHelper existingFileHelper) {
        super(output, TutorialMod.MOD_ID, existingFileHelper);
    }




    protected void registerModels() {
        basicItem(ModItems.ALEXANDRITE.get());
        basicItem(ModItems.RAW_ALEXANDRITE.get());

        basicItem(ModItems.CHISEL.get());
        basicItem(ModItems.ALEXANDRITE.get());
        basicItem(ModItems.KOHLRABI.get());
        basicItem(ModItems.AURORA_ASHES.get());
        basicItem(ModItems.ALEXANDRITE_SWORD.get());
        basicItem(ModItems.CHEESE.get());
        basicItem(ModItems.PIZZA.get());
        basicItem(ModItems.TOMATO.get());
        basicItem(ModItems.TOMATO_SAUCE.get());









    }
}
