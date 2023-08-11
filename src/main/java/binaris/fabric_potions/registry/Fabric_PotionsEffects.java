package binaris.fabric_potions.registry;

import binaris.fabric_potions.effects.*;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;

public class Fabric_PotionsEffects {

    public static StatusEffect HEALTH_DECREASE;
    public static StatusEffect BLEED;
    public static StatusEffect WELL_FED;
    public static StatusEffect TRUESHOT;
    public static StatusEffect KLUTZ;
    public static StatusEffect ENDERMAN_ESSENCE;
    public static StatusEffect REPAIRING;
    public static StatusEffect BROKEN_ARMOR;
    public static StatusEffect SOLID_BODY;

    public static void registerEffects(){
        HEALTH_DECREASE = new Health_Decrease().addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, "4BC011F2-3606-11EE-BE56-0242AC120002", -4.0, EntityAttributeModifier.Operation.ADDITION);
        BLEED = new Bleed();
        WELL_FED = new Well_Fed();
        TRUESHOT = new TrueShot();
        KLUTZ = new Klutz();
        ENDERMAN_ESSENCE = new Enderman_essence();
        REPAIRING = new Repairing();
        BROKEN_ARMOR = new Broken_Armor().addAttributeModifier(EntityAttributes.GENERIC_ARMOR, "5fA8F46A-388E-11EE-BE56-0242AC120002", -2.0, EntityAttributeModifier.Operation.ADDITION);
        SOLID_BODY = new Solid_Body().addAttributeModifier(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, "4AD16B22-3892-11EE-BE56-0242AC120002", 2.0, EntityAttributeModifier.Operation.ADDITION);
    }
}
