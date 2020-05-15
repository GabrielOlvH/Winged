package net.adriantodt.winged

import net.adriantodt.winged.data.Wing
import net.adriantodt.winged.item.WingItem
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.Rarity
import net.minecraft.util.registry.Registry

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
    val goldenBeetle = wingItem(identifier("golden_dragon").wing(Wings.goldenBeetle))
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

    fun register() {
        identifier("wing_elytra").item(elytra)
        identifier("wing_mojang_cape").item(mojangCape)
        identifier("wing_mojang_cape_alt").item(mojangCapeAlt)
        identifier("wing_minecon_2011_cape").item(minecon2011Cape)
        identifier("wing_minecon_2012_cape").item(minecon2012Cape)
        identifier("wing_minecon_2013_cape").item(minecon2013Cape)
        identifier("wing_minecon_2015_cape").item(minecon2015Cape)
        identifier("wing_minecon_2016_cape").item(minecon2016Cape)
        identifier("wing_minecon_2019_cape").item(minecon2019Cape)
        identifier("wing_cobalt_cape").item(cobaltCape)
        identifier("wing_scrolls_cape").item(scrollsCape)
        identifier("wing_crowdin_cape").item(crowdinCape)
        identifier("wing_mapmaker_cape").item(mapmakerCape)
        identifier("wing_millionth_cape").item(millionthCape)
        identifier("wing_mojira_mod_cape").item(mojiraModCape)
        identifier("wing_dannybstyle_cape").item(dannybstyleCape)
        identifier("wing_julianclark_cape").item(julianclarkCape)
        identifier("wing_julianclark_cape_alt").item(julianclarkCapeAlt)
        identifier("wing_mrmessiah_cape").item(mrmessiahCape)
        identifier("wing_prismarine_cape").item(prismarineCape)
        identifier("wing_turtle_cape").item(turtleCape)
        identifier("wing_eagle").item(eagle)
        identifier("wing_greenwing_macaw").item(greenwingMacaw)
        identifier("wing_fairyonline").item(fairyonline)
        identifier("wing_angel").item(angel)
        identifier("wing_demon").item(demon)
        identifier("wing_phoenix").item(phoenix)
        identifier("wing_dragonfly").item(dragonfly)
        identifier("wing_green_beetle").item(greenBeetle)
        identifier("wing_purple_beetle").item(purpleBeetle)
        identifier("wing_golden_beetle").item(goldenBeetle)
        identifier("wing_fried_chicken").item(friedChicken)
        identifier("wing_green_dragon").item(greenDragon)
        identifier("wing_red_dragon").item(redDragon)
        identifier("wing_fire_dragon").item(fireDragon)
        identifier("wing_phantom").item(phantom)
        identifier("wing_phantom_alt").item(phantomAlt)
        identifier("wing_phantom_membrane").item(phantomMembrane)
        identifier("wing_bat").item(bat)
        identifier("wing_bat_alt").item(batAlt)
        identifier("wing_mech_dragon").item(mechDragon)
        identifier("wing_redstone").item(redstone)
        identifier("wing_shulker").item(shulker)
        identifier("wing_tnt").item(tnt)
        identifier("wing_tiny_bird").item(tinyBird)
        identifier("wing_vex").item(vex)
        identifier("wing_creamy_white").item(creamyWhite)
        identifier("wing_brazil").item(brazil)
        identifier("wing_usa").item(usa)
        identifier("wing_earth").item(earth)
        identifier("wing_rainbow").item(rainbow)
        identifier("wing_elytra_white").item(elytraWhite)
        identifier("wing_elytra_orange").item(elytraOrange)
        identifier("wing_elytra_magenta").item(elytraMagenta)
        identifier("wing_elytra_light_blue").item(elytraLightBlue)
        identifier("wing_elytra_yellow").item(elytraYellow)
        identifier("wing_elytra_lime").item(elytraLime)
        identifier("wing_elytra_pink").item(elytraPink)
        identifier("wing_elytra_gray").item(elytraGray)
        identifier("wing_elytra_light_gray").item(elytraLightGray)
        identifier("wing_elytra_cyan").item(elytraCyan)
        identifier("wing_elytra_purple").item(elytraPurple)
        identifier("wing_elytra_blue").item(elytraBlue)
        identifier("wing_elytra_brown").item(elytraBrown)
        identifier("wing_elytra_green").item(elytraGreen)
        identifier("wing_elytra_red").item(elytraRed)
        identifier("wing_elytra_black").item(elytraBlack)
        identifier("wing_xmas_tree").item(xmasTree)
        identifier("wing_xmas_star").item(xmasStar)
    }

    private fun wingItem(identifier: Identifier) = WingItem(
        Item.Settings().group(Winged.showcaseGroup).rarity(Rarity.EPIC).maxCount(1),
        identifier
    )

    private fun Identifier.wing(wing: Wing) = apply {
        Registry.register(Winged.wingRegistry, this, wing)
    }
}