package com.area.crystallum.common.items.tools;

import com.area.crystallum.crystallum;
import com.area.crystallum.core.init.itemInit;
import com.area.crystallum.config.configsouls;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ToolScythe extends ItemSword {

    /*public static final Set<Block> EFFECTIVE = Sets.newHashSet(
            Blocks.COAL_ORE,
            Blocks.DIAMOND_ORE,
            Blocks.EMERALD_ORE,
            Blocks.GOLD_ORE,
            Blocks.IRON_ORE,
            Blocks.LAPIS_ORE,
            Blocks.LIT_REDSTONE_ORE,
            Blocks.QUARTZ_ORE,
            Blocks.REDSTONE_ORE,
            Blocks.STONE,
            Blocks.COBBLESTONE,
            Blocks.MOSSY_COBBLESTONE,
            Blocks.STONEBRICK);*/

    protected String name = "crystallum_scythe";
    protected double souls;
    static float souls2 = 0;

    public ToolScythe(String name, ToolMaterial material){
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(crystallum.CRYSTALLUMTAB);

        itemInit.ITEMS.add(this);
    }

    @Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot){
        Multimap<String, AttributeModifier> multimap = HashMultimap.<String, AttributeModifier>create();
        if (equipmentSlot == EntityEquipmentSlot.MAINHAND){
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", 11.0f + getAttackMod(), 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.8f, 0));
        }
        return multimap;
    }

    /*@SubscribeEvent //My trash attempt at souls
    public void onMobKill(LivingDeathEvent event) {
        if (event.getEntityLiving() instanceof EntityMob) {
            if (event.getSource().getTrueSource() instanceof EntityPlayer) {
                souls2 = souls2 + 1;
            }
        }
    }

    private float getAttack() {
        if(souls2 > 0) {
            return souls2 * 2.0f;
        }
        return 0;
    }*/

    @Override
    public void onUpdate(ItemStack itemStack, World world, Entity entity, int par4, boolean par5) {
        //Update nbt data
        if(itemStack.hasTagCompound() && itemStack.getTagCompound().hasKey("souls")) {
            this.souls = itemStack.getTagCompound().getInteger("souls");
        } else {
            itemStack.setTagCompound(new NBTTagCompound());
            itemStack.getTagCompound().setInteger("souls", 0);
        }
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn){
        if(stack.hasTagCompound() && stack.getTagCompound().hasKey("souls")) {
            tooltip.add("Souls: " + stack.getTagCompound().getInteger("souls"));
        }
    }

    private float getAttackMod() {
        if (souls > 0) {
            if ((double) (souls / configsouls.getSoulsPerDamage() + configsouls.getAttackDamage()) >= configsouls.getMaxPerDamage()) {
                return (float) configsouls.getMaxPerDamage();
            } else {
                return (float) (souls / (double) configsouls.getSoulsPerDamage());
            }
        } else {
            return 0.0f;
        }
    }

    /*public float getStrVsBlock(ItemStack stack, IBlockState state) {
        Material material = state.getMaterial();
        return material != Material.ROCK ? super.getDestroySpeed(stack, state) : this.efficiency;
    }*/
}
