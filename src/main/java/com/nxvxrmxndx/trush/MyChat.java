package com.nxvxrmxndx.trush;

import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MyChat {
	
	private Minecraft mc;
	private String[] phrases_start = {
			"Пора ебашить.", 
			"готовьтесь сосать сучки)", 
			"у меня на альте топ 1 по киллам", 
			"самый професиональный игрок уже тут", 
			"кто тоже играет с TRush?", 
			"я софтер а.к.а. вам всем пизда", 
			"на колени нубляры", 
			"новая катка - новый разьеб школоты.", 
			"станьте на колени перед мастером пвп",
			"этот режим - место где мне сосут.",
			"Ребятки, всем удачной игры!",
			"Ребят, давайте играть без читов",
			"Малыши, не обзывайтесь во время игры! Играйте дружно и мирно!",
			"Так, ботики, ливните из катки!",	
			};
	private String[] phrases_kill = {
			"Игрок, какого быть опущенным?", 
			"Игрок, буквально отсосал мне", 
			"Игрок, с софтом еле-еле и то слил", 
			"Игрок, иди плачь", 
			"Игрок, лобби твое место рождения", 
			"Игрок, байбай", 
			"Игрок - поклонник сосать хуй отправляется в лобби", 
			"Игрок, я не считаю свои киллы, но ты не первый и не последний)", 
			"Игрок, передаю привет в лобби",
			"Игрок - лох",
			"Изичка",
			"Соси, игрок",
			"Легчайший",
			"Легчайшая",
			"Отсосал",
			"Анскил",
			"Разъебал",
			"Разъебал лоха",
			"игрок ботиха",
			"Соснул, игрок?",
			"На колени, сучка",
			"Игрок, тебе нужно больше тренироваться!",
			"Бот",
			"Вынес мусор",
			"Игрок, ливни пж, не позорься",
			"Лежать + сосать",
			"Ебать ты бот конечно",
			"Ахахахахах",
			"Аххахахаах игрок научись играть",
			"Боже, чел, какой ты нулевый",
			"Дружок, тебе надо подучиться играть",				
			"Игрок аххаха ты полный ноль",
			"Игрок = анскил",
			"Скил игрок = 0",
			"Игрок не позорься, пж",
			"Тебя твоя бабушка играть учила, игрок?",		
			"Игрок, ты не няшка <3",								
			"Игрок = мусор",
			"Игрок = позорище",
			"Игрок = кринж",
			"Предупредил",
			"Игрок, криииинж",
			"Игрок, тебя походу твои 2 отца играть учили",
			"Игрок, попробуй во время пвп нажимать на мышку",
			"Игрок, суть игры не умирать, а убивать",
			"Спасибо, + килл в статистику",
			"Больше так не делай)",
			"Игрок, ты что, бот?"
			};
	  
	// CREDITS TO PHRASES - DIMCHIG

	private Random rnd;	
	public MyChat() {
		this.mc = Minecraft.getMinecraft();
		this.rnd = new Random();
	}
	
	@SubscribeEvent
	public void myChat(ClientChatReceivedEvent event) {
		String text = event.message.getUnformattedText();
		
		if (text.contains("Собирайте ресурсы и снаряжения на своем острове,")) {
			String phrase = phrases_start[this.rnd.nextInt(phrases_start.length)];
			this.mc.thePlayer.sendChatMessage(phrase);
		}
		
		if(text.contains("SkyWars ▸")) {
			if(text.contains("был убит игроком " + this.mc.thePlayer.getName()) || text.contains("был скинут в бездну игроком " + this.mc.thePlayer.getName())) {
				
				String phrase = phrases_kill[this.rnd.nextInt(phrases_kill.length)];
				
				this.mc.thePlayer.sendChatMessage("!" + phrase.toLowerCase().replace("игрок", text.split(" ")[2]));
				
			}

}
	}
}
