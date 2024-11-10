package net.skittlesdada.tutorialmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.skittlesdada.tutorialmod.TutorialMod;
import net.skittlesdada.tutorialmod.item.custom.ChiselItem;
import net.skittlesdada.tutorialmod.item.custom.FuelItem;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPERSTAR = ITEMS.register("superstar", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel", () -> new ChiselItem(new Item.Properties().durability(32)));

//        FOOD ITEMS
    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza", () -> new Item(new Item.Properties().food(ModFoodProperties.PIZZA)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().food(ModFoodProperties.TOMATO)));
    public static final RegistryObject<Item> TOMATO_SAUCE = ITEMS.register("tomato_sauce", () -> new Item(new Item.Properties().food(ModFoodProperties.TOMATO_SAUCE)));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().food(ModFoodProperties.CHEESE)));

// WEAPONS!




    public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi", () -> new Item(new Item.Properties().food(ModFoodProperties.KOHLRABI))
    {
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.translatable("tooltip.tutorialmod.kohlrabi"));
            super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
        }
    });
    public static final RegistryObject<Item> AURORA_ASHES = ITEMS.register("aurora_ashes",
            () -> new FuelItem(new Item.Properties(), 1200));

//   Alexandrite Tools
    public static final RegistryObject<Item> ALEXANDRITE_SWORD = ITEMS.register("alexandrite_sword",
                                                                                () -> new SwordItem(ModToolTiers.ALEXANDRITE, new Item.Properties()
                                                                                        .attributes(SwordItem.createAttributes(ModToolTiers.ALEXANDRITE, 3, -2.4f))));
    public static final RegistryObject<Item> ALEXANDRITE_PICKAXE = ITEMS.register("alexandrite_pickaxe",
                                                                                () -> new PickaxeItem(ModToolTiers.ALEXANDRITE, new Item.Properties()
                                                                                        .attributes(PickaxeItem.createAttributes(ModToolTiers.ALEXANDRITE, 1, -2.8f))));
    public static final RegistryObject<Item> ALEXANDRITE_SHOVEL = ITEMS.register("alexandrite_shovel",
                                                                                () -> new ShovelItem(ModToolTiers.ALEXANDRITE, new Item.Properties()
                                                                                        .attributes(ShovelItem.createAttributes(ModToolTiers.ALEXANDRITE, 1.5f, -3.0f))));
    public static final RegistryObject<Item> ALEXANDRITE_AXE= ITEMS.register("alexandrite_axe",
                                                                                () -> new AxeItem(ModToolTiers.ALEXANDRITE, new Item.Properties()
                                                                                        .attributes(AxeItem.createAttributes(ModToolTiers.ALEXANDRITE, 6, -3.2f))));

    public static final RegistryObject<Item> ALEXANDRITE_HOE= ITEMS.register("alexandrite_hoe",
                                                                                () -> new HoeItem(ModToolTiers.ALEXANDRITE, new Item.Properties()
                                                                                        .attributes(HoeItem.createAttributes(ModToolTiers.ALEXANDRITE, 0, -3.0f))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
