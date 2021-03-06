package xt9.inworldcrafting.common.crafttweaker;

import crafttweaker.api.item.IIngredient;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;
import xt9.inworldcrafting.common.recipe.ExplodeBlockRecipe;
import xt9.inworldcrafting.common.recipe.ExplodeItemRecipe;

/**
 * Created by xt9 on 2019-01-19.
 */
@SuppressWarnings("unused")
@ZenClass("mods.inworldcrafting.ExplosionCrafting")
public class ExplosionCrafting {

    @ZenMethod
    public static void explodeItemRecipe(IItemStack output, IIngredient ingredient) {
        explodeItemRecipe(output, ingredient, 100);
    }

    @ZenMethod
    public static void explodeItemRecipe(IItemStack output, IIngredient ingredient, int survivechance) {
        /* Inputs should only be items or oredicts */
        if(ingredient.getLiquids().size() > 0) { return; }

        ExplodeItemRecipe.addRecipe(CraftTweakerMC.getItemStack(output), ingredient, ingredient.getAmount(), survivechance);
    }

    @ZenMethod
    public static void explodeBlockRecipe(IItemStack output, IItemStack input) {
        explodeBlockRecipe(output, input, 100);
    }

    @ZenMethod
    public static void explodeBlockRecipe(IItemStack output, IItemStack input, int itemSpawnChance) {
        ExplodeBlockRecipe.addRecipe(CraftTweakerMC.getItemStack(output), CraftTweakerMC.getItemStack(input), itemSpawnChance);
    }
}
