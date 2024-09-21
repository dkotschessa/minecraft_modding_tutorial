package net.skittlesdada.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties KOHLRABI = new FoodProperties.Builder().nutrition(3).saturationModifier(.25f)
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 400), .20f).build();

    public static final FoodProperties PIZZA = new FoodProperties.Builder().nutrition(8).saturationModifier(.60f)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 400), 1f)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 60, 400), 1f)
            .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 50, 500), 1f).build();

    public static final FoodProperties CHEESE = new
            FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(.50f).build();
    public static final FoodProperties TOMATO = new
            FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(.25f).build(); ;

    public static final FoodProperties TOMATO_SAUCE = new
            FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(.40f).build(); ;
}


