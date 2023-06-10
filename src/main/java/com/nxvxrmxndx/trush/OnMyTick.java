package com.nxvxrmxndx.trush;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class OnMyTick {
	
	public Minecraft mc;
	public int LAST_HEALTH;

	public OnMyTick() {
		this.mc = Minecraft.getMinecraft();
	}
	
	@SubscribeEvent
	public void onMyTick(TickEvent.PlayerTickEvent event) {
		
		//autoleave
		
		float f_health = this.mc.thePlayer.getHealth();
		int health = Math.round(f_health);
		try { 
			if (health < LAST_HEALTH) {
				int razniza = LAST_HEALTH - health;
				if(health - razniza <= 0) {
					this.mc.thePlayer.sendChatMessage("/leave");
				}
				
			}
		}catch (Exception e) {
			
				LAST_HEALTH = health;
			}
		LAST_HEALTH = health;
		
		if (this.mc.thePlayer.posY == 0) {
			this.mc.thePlayer.sendChatMessage("/leave");
		}
		
		
		
			
	}
	

		
}


