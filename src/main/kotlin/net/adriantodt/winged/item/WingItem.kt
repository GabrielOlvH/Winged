package net.adriantodt.winged.item

import net.adriantodt.winged.Winged.playerComponentType
import net.adriantodt.winged.Winged.wingRegistry
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.item.TooltipContext
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.sound.SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.util.Hand
import net.minecraft.util.Identifier
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World


class WingItem(settings: Settings, private val wingId: Identifier) : Item(settings) {
    private val wing by lazy { wingRegistry[wingId] }

    override fun use(world: World, user: PlayerEntity, hand: Hand): TypedActionResult<ItemStack> {
        val itemStack = user.getStackInHand(hand)
        val wingedComponent =
            playerComponentType.maybeGet(user).orElse(null) ?: return TypedActionResult.pass(itemStack)
        if (wingedComponent.wing != null) {
            return TypedActionResult.fail(itemStack)
        }
        wingedComponent.wing = wing
        itemStack.count = 0
        user.playSound(ITEM_ARMOR_EQUIP_ELYTRA, 1.0f, 1.0f)
        return TypedActionResult.success(itemStack)
    }

    @Environment(EnvType.CLIENT)
    override fun appendTooltip(stack: ItemStack?, world: World?, tooltip: MutableList<Text?>, ctx: TooltipContext?) {
        tooltip.add(TranslatableText("$translationKey.description"))
        tooltip.add(TranslatableText("tooltip.winged.any_wing_item"))
        tooltip.add(TranslatableText("tooltip.winged.wing_author", wing.authors))
    }
}