
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vfe.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.vfe.item.ZuckerstangeItem;
import net.mcreator.vfe.item.TeigItem;
import net.mcreator.vfe.item.StgemuesesuppeItem;
import net.mcreator.vfe.item.StampferItem;
import net.mcreator.vfe.item.SchokoteigItem;
import net.mcreator.vfe.item.SchokoladeItem;
import net.mcreator.vfe.item.SchneidebrettItem;
import net.mcreator.vfe.item.RbsuppengemuseItem;
import net.mcreator.vfe.item.MultivitaminsaftItem;
import net.mcreator.vfe.item.MesserItem;
import net.mcreator.vfe.item.MelonensaftItem;
import net.mcreator.vfe.item.MehlItem;
import net.mcreator.vfe.item.MarmeldenpresseItem;
import net.mcreator.vfe.item.MarmeladenbrotfoodItem;
import net.mcreator.vfe.item.KurbisscheibeItem;
import net.mcreator.vfe.item.KakaoItem;
import net.mcreator.vfe.item.JoghurtItem;
import net.mcreator.vfe.item.GemuesesuppeItem;
import net.mcreator.vfe.item.GebratenerrotpilzItem;
import net.mcreator.vfe.item.GebratenerbraunpilzItem;
import net.mcreator.vfe.item.GebackenerKurbisItem;
import net.mcreator.vfe.item.GebackeneSamenItem;
import net.mcreator.vfe.item.FleischspiesItem;
import net.mcreator.vfe.item.ButterItem;
import net.mcreator.vfe.item.BrownieItem;
import net.mcreator.vfe.item.BrotchenItem;
import net.mcreator.vfe.item.BeerensaftItem;
import net.mcreator.vfe.item.BeerenmarmeladeItem;
import net.mcreator.vfe.item.ApfelsaftItem;
import net.mcreator.vfe.item.ApfelmarmeladenbrotItem;
import net.mcreator.vfe.item.ApfelmarmeladeItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VfeModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item MARMELDENPRESSE = register(new MarmeldenpresseItem());
	public static final Item JOGHURT = register(new JoghurtItem());
	public static final Item APFELMARMELADE = register(new ApfelmarmeladeItem());
	public static final Item ZUCKERSTANGE = register(new ZuckerstangeItem());
	public static final Item BEERENMARMELADE = register(new BeerenmarmeladeItem());
	public static final Item BEERENMARMELADEBROT = register(new MarmeladenbrotfoodItem());
	public static final Item APFELMARMELADENBROT = register(new ApfelmarmeladenbrotItem());
	public static final Item BROTCHEN = register(new BrotchenItem());
	public static final Item SCHNEIDEBRETT = register(new SchneidebrettItem());
	public static final Item MESSER = register(new MesserItem());
	public static final Item RBSUPPENGEMUSE = register(new RbsuppengemuseItem());
	public static final Item GEMUESESUPPE = register(new GemuesesuppeItem());
	public static final Item STGEMUESESUPPE = register(new StgemuesesuppeItem());
	public static final Item APFELSAFT = register(new ApfelsaftItem());
	public static final Item BEERENSAFT = register(new BeerensaftItem());
	public static final Item KURBISSCHEIBE = register(new KurbisscheibeItem());
	public static final Item GEBACKENER_KURBIS = register(new GebackenerKurbisItem());
	public static final Item GEBACKENE_SAMEN = register(new GebackeneSamenItem());
	public static final Item SCHOKOLADE = register(new SchokoladeItem());
	public static final Item FLEISCHSPIES = register(new FleischspiesItem());
	public static final Item GEBRATENERBRAUNPILZ = register(new GebratenerbraunpilzItem());
	public static final Item GEBRATENERROTPILZ = register(new GebratenerrotpilzItem());
	public static final Item STAMPFER = register(new StampferItem());
	public static final Item BUTTER = register(new ButterItem());
	public static final Item KAKAO = register(new KakaoItem());
	public static final Item MEHL = register(new MehlItem());
	public static final Item TEIG = register(new TeigItem());
	public static final Item SCHOKOTEIG = register(new SchokoteigItem());
	public static final Item BROWNIE = register(new BrownieItem());
	public static final Item MELONENSAFT = register(new MelonensaftItem());
	public static final Item MULTIVITAMINSAFT = register(new MultivitaminsaftItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
