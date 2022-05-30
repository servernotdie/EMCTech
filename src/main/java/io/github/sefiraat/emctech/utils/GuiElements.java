package io.github.sefiraat.emctech.utils;

import io.github.sefiraat.sefilib.string.StringUtils;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import net.guizhanss.guizhanlib.minecraft.helper.MaterialHelper;
import net.guizhanss.guizhanlib.minecraft.helper.inventory.ItemStackHelper;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.text.MessageFormat;

public final class GuiElements {

    private GuiElements() {
        throw new IllegalStateException("Utility class");
    }

    public static final CustomItemStack TEMPLATE_BACKGROUND = new CustomItemStack(
        Material.BLACK_STAINED_GLASS_PANE,
        Theme.PASSIVE + "模版物品",
        Theme.PASSIVE + "符合模版的物品才会被机器或货运处理"
    );

    public static final CustomItemStack TEMPLATE_INPUT_CARGO = new CustomItemStack(
        Material.BLUE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "输入",
        Theme.PASSIVE + "在这里放入物品",
        Theme.PASSIVE + "可以接收来自货运的输入"
    );

    public static final CustomItemStack TEMPLATE_INPUT_NO_CARGO = new CustomItemStack(
        Material.BLUE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "输入",
        Theme.PASSIVE + "在这里放入物品",
        Theme.PASSIVE + "无法接收来自货运的输入"
    );

    public static final CustomItemStack TEMPLATE_OUTPUT_CARGO = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "输出",
        Theme.PASSIVE + "物品将在这里输出",
        Theme.PASSIVE + "可通过货运取出"
    );

    public static final CustomItemStack TEMPLATE_OUTPUT_NO_CARGO = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "输出",
        Theme.PASSIVE + "物品将在这里输出",
        Theme.PASSIVE + "无法通过货运取出."
    );

    @ParametersAreNonnullByDefault
    public static ItemStack getItemLearnedIcon(@Nonnull Material material,
                                               @Nonnull String name,
                                               double emcValue,
                                               double emcValueLarge
    ) {
        return new CustomItemStack(
            material,
            Theme.SUCCESS + MaterialHelper.getName(material),
            Theme.CLICK_INFO + "EMC (解构): " + Theme.PASSIVE + EmcUtils.EMC_FORMAT.format(emcValue),
            Theme.CLICK_INFO + "EMC (重构): " + Theme.PASSIVE + EmcUtils.EMC_FORMAT.format(emcValueLarge)
        );
    }

    @ParametersAreNonnullByDefault
    public static ItemStack getItemLearnedIcon(@Nonnull ItemStack itemStack,
                                               @Nonnull String name,
                                               double emcValue,
                                               double emcValueLarge
    ) {
        return new CustomItemStack(
            itemStack,
            Theme.SUCCESS + ItemStackHelper.getDisplayName(itemStack),
            Theme.CLICK_INFO + "EMC (解构): " + Theme.PASSIVE + EmcUtils.EMC_FORMAT.format(emcValue),
            Theme.CLICK_INFO + "EMC (重构): " + Theme.PASSIVE + EmcUtils.EMC_FORMAT.format(emcValueLarge)
        );
    }

    @ParametersAreNonnullByDefault
    public static ItemStack getItemNotLearnedIcon(@Nonnull String name) {
        return new CustomItemStack(
            Material.BARRIER,
            Theme.ERROR + name,
            MessageFormat.format("{0}{1}未解锁", Theme.RESEARCH.getColor(), ChatColor.BOLD),
            Theme.ERROR + "该物品暂未解锁."
        );
    }

}
