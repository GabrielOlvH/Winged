package net.adriantodt.winged

import net.adriantodt.winged.data.Wing
import net.adriantodt.winged.item.WingItem
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.Rarity
import net.minecraft.util.registry.Registry
import java.util.*
import kotlin.collections.ArrayList

@Suppress("MemberVisibilityCanBePrivate")
object WingItems {
    val elytra = wingItem(mcIdentifier("elytra").wing(Wings.elytra))
    val mojangCape = wingItem(identifier("mojang_cape").wing(Wings.mojangCape))
    val mojangCapeAlt = wingItem(identifier("mojang_cape_alt").wing(Wings.mojangCapeAlt))
    val minecon2011Cape = wingItem(identifier("minecon_2011_cape").wing(Wings.minecon2011Cape))
    val minecon2012Cape = wingItem(identifier("minecon_2012_cape").wing(Wings.minecon2012Cape))
    val minecon2013Cape = wingItem(identifier("minecon_2013_cape").wing(Wings.minecon2013Cape))
    val minecon2015Cape = wingItem(identifier("minecon_2015_cape").wing(Wings.minecon2015Cape))
    val minecon2016Cape = wingItem(identifier("minecon_2016_cape").wing(Wings.minecon2016Cape))
    val minecon2019Cape = wingItem(identifier("minecon_2019_cape").wing(Wings.minecon2019Cape))
    val cobaltCape = wingItem(identifier("cobalt_cape").wing(Wings.cobaltCape))
    val scrollsCape = wingItem(identifier("scrolls_cape").wing(Wings.scrollsCape))
    val crowdinCape = wingItem(identifier("crowdin_cape").wing(Wings.crowdinCape))
    val mapmakerCape = wingItem(identifier("mapmaker_cape").wing(Wings.mapmakerCape))
    val millionthCape = wingItem(identifier("millionth_cape").wing(Wings.millionthCape))
    val mojiraModCape = wingItem(identifier("mojira_mod_cape").wing(Wings.mojiraModCape))
    val dannybstyleCape = wingItem(identifier("dannybstyle_cape").wing(Wings.dannybstyleCape))
    val julianclarkCape = wingItem(identifier("julianclark_cape").wing(Wings.julianclarkCape))
    val julianclarkCapeAlt = wingItem(identifier("julianclark_cape_alt").wing(Wings.julianclarkCapeAlt))
    val mrmessiahCape = wingItem(identifier("mrmessiah_cape").wing(Wings.mrmessiahCape))
    val prismarineCape = wingItem(identifier("prismarine_cape").wing(Wings.prismarineCape))
    val turtleCape = wingItem(identifier("turtle_cape").wing(Wings.turtleCape))
    val eagle = wingItem(identifier("eagle").wing(Wings.eagle))
    val greenwingMacaw = wingItem(identifier("greenwing_macaw").wing(Wings.greenwingMacaw))
    val fairyonline = wingItem(identifier("fairyonline").wing(Wings.fairyonline))
    val angel = wingItem(identifier("angel").wing(Wings.angel))
    val demon = wingItem(identifier("demon").wing(Wings.demon))
    val phoenix = wingItem(identifier("phoenix").wing(Wings.phoenix))
    val dragonfly = wingItem(identifier("dragonfly").wing(Wings.dragonfly))
    val greenBeetle = wingItem(identifier("green_beetle").wing(Wings.greenBeetle))
    val purpleBeetle = wingItem(identifier("purple_beetle").wing(Wings.purpleBeetle))
    val goldenBeetle = wingItem(identifier("golden_beetle").wing(Wings.goldenBeetle))
    val friedChicken = wingItem(identifier("fried_chicken").wing(Wings.friedChicken))
    val greenDragon = wingItem(identifier("green_dragon").wing(Wings.greenDragon))
    val redDragon = wingItem(identifier("red_dragon").wing(Wings.redDragon))
    val fireDragon = wingItem(identifier("fire_dragon").wing(Wings.fireDragon))
    val phantom = wingItem(identifier("phantom").wing(Wings.phantom))
    val phantomMembrane = wingItem(identifier("phantom_membrane").wing(Wings.phantomMembrane))
    val phantomAlt = wingItem(identifier("phantom_alt").wing(Wings.phantomAlt))
    val bat = wingItem(identifier("bat").wing(Wings.bat))
    val batAlt = wingItem(identifier("bat_alt").wing(Wings.batAlt))
    val mechDragon = wingItem(identifier("mech_dragon").wing(Wings.mechDragon))
    val redstone = wingItem(identifier("redstone").wing(Wings.redstone))
    val shulker = wingItem(identifier("shulker").wing(Wings.shulker))
    val tnt = wingItem(identifier("tnt").wing(Wings.tnt))
    val tinyBird = wingItem(identifier("tiny_bird").wing(Wings.tinyBird))
    val vex = wingItem(identifier("vex").wing(Wings.vex))
    val creamyWhite = wingItem(identifier("creamy_white").wing(Wings.creamyWhite))
    val brazil = wingItem(identifier("brazil").wing(Wings.brazil))
    val usa = wingItem(identifier("usa").wing(Wings.usa))
    val earth = wingItem(identifier("earth").wing(Wings.earth))
    val rainbow = wingItem(identifier("rainbow").wing(Wings.rainbow))
    val elytraWhite = wingItem(identifier("white_elytra").wing(Wings.whiteElytra))
    val elytraOrange = wingItem(identifier("orange_elytra").wing(Wings.orangeElytra))
    val elytraMagenta = wingItem(identifier("magenta_elytra").wing(Wings.magentaElytra))
    val elytraLightBlue = wingItem(identifier("light_blue_elytra").wing(Wings.lightBlueElytra))
    val elytraYellow = wingItem(identifier("yellow_elytra").wing(Wings.yellowElytra))
    val elytraLime = wingItem(identifier("lime_elytra").wing(Wings.limeElytra))
    val elytraPink = wingItem(identifier("pink_elytra").wing(Wings.pinkElytra))
    val elytraGray = wingItem(identifier("gray_elytra").wing(Wings.grayElytra))
    val elytraLightGray = wingItem(identifier("light_gray_elytra").wing(Wings.lightGrayElytra))
    val elytraCyan = wingItem(identifier("cyan_elytra").wing(Wings.cyanElytra))
    val elytraPurple = wingItem(identifier("purple_elytra").wing(Wings.purpleElytra))
    val elytraBlue = wingItem(identifier("blue_elytra").wing(Wings.blueElytra))
    val elytraBrown = wingItem(identifier("brown_elytra").wing(Wings.brownElytra))
    val elytraGreen = wingItem(identifier("green_elytra").wing(Wings.greenElytra))
    val elytraRed = wingItem(identifier("red_elytra").wing(Wings.redElytra))
    val elytraBlack = wingItem(identifier("black_elytra").wing(Wings.blackElytra))
    val xmasTree = wingItem(identifier("xmas_tree").wing(Wings.xmasTree))
    val xmasStar = wingItem(identifier("xmas_star").wing(Wings.xmasStar))
    val glider = wingItem(identifier("glider").wing(Wings.glider))
    val spooky = wingItem(identifier("spooky").wing(Wings.spooky))
    val irreality = wingItem(identifier("irreality").wing(Wings.irreality))
    val glass = wingItem(identifier("glass").wing(Wings.glass))

    //TEMPLATE -- FOR MODDERS/ARTISTS -- /GIVE ONLY
    val template = WingItem(Item.Settings().maxCount(1), identifier("template").wing(Wings.template))

    fun register() {
        identifier("wing_elytra").item(elytra.giftable())
        identifier("wing_mojang_cape").item(mojangCape.giftable())
        identifier("wing_mojang_cape_alt").item(mojangCapeAlt.giftable())
        identifier("wing_minecon_2011_cape").item(minecon2011Cape.giftable())
        identifier("wing_minecon_2012_cape").item(minecon2012Cape.giftable())
        identifier("wing_minecon_2013_cape").item(minecon2013Cape.giftable())
        identifier("wing_minecon_2015_cape").item(minecon2015Cape.giftable())
        identifier("wing_minecon_2016_cape").item(minecon2016Cape.giftable())
        identifier("wing_minecon_2019_cape").item(minecon2019Cape.giftable())
        identifier("wing_cobalt_cape").item(cobaltCape.giftable())
        identifier("wing_scrolls_cape").item(scrollsCape.giftable())
        identifier("wing_crowdin_cape").item(crowdinCape.giftable())
        identifier("wing_mapmaker_cape").item(mapmakerCape.giftable())
        identifier("wing_millionth_cape").item(millionthCape.giftable())
        identifier("wing_mojira_mod_cape").item(mojiraModCape.giftable())
        identifier("wing_dannybstyle_cape").item(dannybstyleCape.giftable())
        identifier("wing_julianclark_cape").item(julianclarkCape.giftable())
        identifier("wing_julianclark_cape_alt").item(julianclarkCapeAlt.giftable())
        identifier("wing_mrmessiah_cape").item(mrmessiahCape.giftable())
        identifier("wing_prismarine_cape").item(prismarineCape.giftable())
        identifier("wing_turtle_cape").item(turtleCape.giftable())
        identifier("wing_eagle").item(eagle.giftable())
        identifier("wing_greenwing_macaw").item(greenwingMacaw.giftable())
        identifier("wing_fairyonline").item(fairyonline.giftable())
        identifier("wing_angel").item(angel.giftable())
        identifier("wing_demon").item(demon.giftable())
        identifier("wing_phoenix").item(phoenix.giftable())
        identifier("wing_dragonfly").item(dragonfly.giftable())
        identifier("wing_green_beetle").item(greenBeetle.giftable())
        identifier("wing_purple_beetle").item(purpleBeetle.giftable())
        identifier("wing_golden_beetle").item(goldenBeetle.giftable())
        identifier("wing_fried_chicken").item(friedChicken.giftable())
        identifier("wing_green_dragon").item(greenDragon.giftable())
        identifier("wing_red_dragon").item(redDragon.giftable())
        identifier("wing_fire_dragon").item(fireDragon.giftable())
        identifier("wing_phantom").item(phantom.giftable())
        identifier("wing_phantom_alt").item(phantomAlt.giftable())
        identifier("wing_phantom_membrane").item(phantomMembrane.giftable())
        identifier("wing_bat").item(bat.giftable())
        identifier("wing_bat_alt").item(batAlt.giftable())
        identifier("wing_mech_dragon").item(mechDragon.giftable())
        identifier("wing_redstone").item(redstone.giftable())
        identifier("wing_shulker").item(shulker.giftable())
        identifier("wing_tnt").item(tnt.giftable())
        identifier("wing_tiny_bird").item(tinyBird.giftable())
        identifier("wing_vex").item(vex.giftable())
        identifier("wing_creamy_white").item(creamyWhite.giftable())
        identifier("wing_brazil").item(brazil.giftable())
        identifier("wing_usa").item(usa.giftable())
        identifier("wing_earth").item(earth.giftable())
        identifier("wing_rainbow").item(rainbow.giftable())
        identifier("wing_elytra_white").item(elytraWhite.giftable())
        identifier("wing_elytra_orange").item(elytraOrange.giftable())
        identifier("wing_elytra_magenta").item(elytraMagenta.giftable())
        identifier("wing_elytra_light_blue").item(elytraLightBlue.giftable())
        identifier("wing_elytra_yellow").item(elytraYellow.giftable())
        identifier("wing_elytra_lime").item(elytraLime.giftable())
        identifier("wing_elytra_pink").item(elytraPink.giftable())
        identifier("wing_elytra_gray").item(elytraGray.giftable())
        identifier("wing_elytra_light_gray").item(elytraLightGray.giftable())
        identifier("wing_elytra_cyan").item(elytraCyan.giftable())
        identifier("wing_elytra_purple").item(elytraPurple.giftable())
        identifier("wing_elytra_blue").item(elytraBlue.giftable())
        identifier("wing_elytra_brown").item(elytraBrown.giftable())
        identifier("wing_elytra_green").item(elytraGreen.giftable())
        identifier("wing_elytra_red").item(elytraRed.giftable())
        identifier("wing_elytra_black").item(elytraBlack.giftable())
        identifier("wing_xmas_tree").item(xmasTree.giftable())
        identifier("wing_xmas_star").item(xmasStar.giftable())
        identifier("wing_glider").item(glider.giftable())
        identifier("wing_spooky").item(spooky.giftable())
        identifier("wing_irreality").item(irreality.giftable())
        identifier("wing_glass").item(glass.giftable())

        //TEMPLATE -- FOR MODDERS/ARTISTS -- /GIVE ONLY
        identifier("wing_template").item(template)
    }

    private fun wingItem(identifier: Identifier) = WingItem(
        Item.Settings().group(Winged.showcaseGroup).rarity(Rarity.EPIC).maxCount(1),
        identifier
    )

    val giftableWings = ArrayList<WingItem>()

    fun randomWing(random: Random) = giftableWings.elementAt(random.nextInt(giftableWings.size))

    private fun Identifier.wing(wing: Wing) = apply {
        Registry.register(Winged.wingRegistry, this, wing)
    }

    private fun WingItem.giftable() = apply { giftableWings += this }
}