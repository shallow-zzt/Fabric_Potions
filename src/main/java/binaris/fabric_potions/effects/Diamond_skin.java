package binaris.fabric_potions.effects;

import binaris.fabric_potions.Fabric_Potions;
import binaris.fabric_potions.config.Fabric_Potions_EffectConfig;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Diamond_skin extends StatusEffect {
    public Diamond_skin() {
        super(StatusEffectCategory.BENEFICIAL, 36171181);

        if(Fabric_Potions_EffectConfig.CONFIG.getOrDefault("diamond_skin.enable", true)){
            Registry.register(Registries.STATUS_EFFECT, new Identifier(Fabric_Potions.MOD_ID, "diamond_skin"), this);
        }
    }
}
