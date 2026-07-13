package io.github.sefiraat.emctech.utils;

import java.text.MessageFormat;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import dev.sefiraat.sefilib.string.TextUtils;
import net.md_5.bungee.api.ChatColor;

public final class GuiElements {

    private GuiElements() {
        throw new IllegalStateException("Utility class");
    }

    public static final ItemStack TEMPLATE_BACKGROUND = new CustomItemStack(
        Material.BLACK_STAINED_GLASS_PANE,
        Theme.PASSIVE + "Vật phẩm mẫu",
        Theme.PASSIVE + "Chỉ vật phẩm khớp mẫu mới được máy hoặc vận chuyển xử lý"
    );

    public static final ItemStack TEMPLATE_INPUT_CARGO = new CustomItemStack(
        Material.BLUE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "Đầu vào",
        Theme.PASSIVE + "Đặt vật phẩm vào đây",
        Theme.PASSIVE + "Có thể nhận đầu vào từ vận chuyển"
    );

    public static final ItemStack TEMPLATE_INPUT_NO_CARGO = new CustomItemStack(
        Material.BLUE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "Đầu vào",
        Theme.PASSIVE + "Đặt vật phẩm vào đây",
        Theme.PASSIVE + "Không thể nhận đầu vào từ vận chuyển"
    );

    public static final ItemStack TEMPLATE_OUTPUT_CARGO = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "Đầu ra",
        Theme.PASSIVE + "Vật phẩm sẽ được xuất ra đây",
        Theme.PASSIVE + "Có thể lấy qua vận chuyển"
    );

    public static final ItemStack TEMPLATE_OUTPUT_NO_CARGO = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "Đầu ra",
        Theme.PASSIVE + "Vật phẩm sẽ được xuất ra đây",
        Theme.PASSIVE + "Không thể lấy qua vận chuyển."
    );

    public static final ItemStack INFO_NOT_WORKING = new CustomItemStack(
        Material.RED_STAINED_GLASS_PANE,
        Theme.PASSIVE + "Không hoạt động",
        Theme.PASSIVE + "Máy này không hoạt động."
    );

    public static final ItemStack INFO_INVALID_ITEM = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "Vật phẩm không hợp lệ",
        Theme.PASSIVE + "Vật phẩm này không thể chuyển đổi EMC."
    );

    public static final ItemStack INFO_UNLEARNED_ITEM = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "Vật phẩm chưa mở khóa",
        Theme.PASSIVE + "Vật phẩm này chưa được mở khóa."
    );

    public static final ItemStack INFO_PLAYER_OFFLINE = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "Chủ máy đang ngoại tuyến",
        Theme.PASSIVE + "Chủ sở hữu máy này không trực tuyến."
    );

    public static ItemStack getWorkingOnIcon(@Nonnull String name,
                                             double emcValue,
                                             int powerRequirement,
                                             int currentPower
    ) {
        return new CustomItemStack(
            Material.GREEN_STAINED_GLASS_PANE,
            Theme.PASSIVE + "Đang chạy",
            Theme.CLICK_INFO.applyAsTitle("Vật phẩm", name),
            Theme.CLICK_INFO.applyAsTitle("Giá trị EMC", emcValue),
            Theme.CLICK_INFO.applyAsTitle("Năng lượng mỗi lần", powerRequirement),
            Theme.CLICK_INFO.applyAsTitle("Năng lượng đã lưu", currentPower)
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
            Theme.SUCCESS + name,
            Theme.CLICK_INFO.applyAsTitle("EMC (Giải cấu)", EmcUtils.EMC_FORMAT_GUIDE.format(emcValue)),
            Theme.CLICK_INFO.applyAsTitle("EMC (Tái cấu)", EmcUtils.EMC_FORMAT_GUIDE.format(emcValueLarge))
        );
    }

    @ParametersAreNonnullByDefault
    public static ItemStack getItemLearnedIcon(@Nonnull Material material,
                                               @Nonnull String name,
                                               double emcValue,
                                               double emcValueLarge
    ) {
        return new CustomItemStack(
            material,
            Theme.SUCCESS + TextUtils.toTitleCase(name),
            Theme.CLICK_INFO.applyAsTitle("EMC (Giải cấu)", EmcUtils.EMC_FORMAT_GUIDE.format(emcValue)),
            Theme.CLICK_INFO.applyAsTitle("EMC (Tái cấu)", EmcUtils.EMC_FORMAT_GUIDE.format(emcValueLarge))
        );
    }

    @ParametersAreNonnullByDefault
    public static ItemStack getItemNotLearnedIcon(@Nonnull String name) {
        return new CustomItemStack(
            Material.BARRIER,
            Theme.ERROR + name,
            MessageFormat.format("{0}{1}Chưa mở khóa", Theme.RESEARCH.getColor(), ChatColor.BOLD),
            Theme.ERROR + "Vật phẩm này chưa được mở khóa."
        );
    }

}
