package io.github.sefiraat.emctech.slimefun.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import io.github.sefiraat.emctech.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.collections.Pair;

import dev.sefiraat.sefilib.itemstacks.ItemStackGenerators;

public class EmcStacks {

    private EmcStacks() {
        throw new IllegalStateException("Utility class");
    }

    // Vanilla
    public static final ItemStack VANILLA_COAL = new ItemStack(Material.COAL);

    // Materials
    public static final SlimefunItemStack UNORTHODOX_COAL;
    public static final SlimefunItemStack UNORTHODOX_COAL_DUST;
    public static final SlimefunItemStack TIGHTLY_PACKED_UNORTHODOX_COAL;
    public static final SlimefunItemStack UNORTHODOX_COAL_BLOCK;
    public static final SlimefunItemStack DEVIANT_COAL;
    public static final SlimefunItemStack DEVIANT_COAL_DUST;
    public static final SlimefunItemStack TIGHTLY_PACKED_DEVIANT_COAL;
    public static final SlimefunItemStack DEVIANT_COAL_BLOCK;
    public static final SlimefunItemStack DIVERGENT_COAL;
    public static final SlimefunItemStack DIVERGENT_COAL_DUST;
    public static final SlimefunItemStack TIGHTLY_PACKED_DIVERGENT_COAL;
    public static final SlimefunItemStack DIVERGENT_COAL_BLOCK;
    public static final SlimefunItemStack ANOMALOUS_COAL;
    public static final SlimefunItemStack ANOMALOUS_COAL_DUST;
    public static final SlimefunItemStack TIGHTLY_PACKED_ANOMALOUS_COAL;
    public static final SlimefunItemStack ANOMALOUS_COAL_BLOCK;
    public static final SlimefunItemStack PERFECTED_COAL;

    // Components
    public static final SlimefunItemStack UNORTHODOX_FRAME;
    public static final SlimefunItemStack DEVIANT_FRAME;
    public static final SlimefunItemStack DIVERGENT_FRAME;
    public static final SlimefunItemStack ANOMALOUS_FRAME;
    public static final SlimefunItemStack PERFECTED_FRAME;
    public static final SlimefunItemStack UNORTHODOX_MACHINE_FRAME;
    public static final SlimefunItemStack DEVIANT_MACHINE_FRAME;
    public static final SlimefunItemStack DIVERGENT_MACHINE_FRAME;
    public static final SlimefunItemStack ANOMALOUS_MACHINE_FRAME;
    public static final SlimefunItemStack PERFECTED_MACHINE_FRAME;

    // Machines
    public static final SlimefunItemStack EMC_DEMATERIALIZER_1;
    public static final SlimefunItemStack EMC_DEMATERIALIZER_2;
    public static final SlimefunItemStack EMC_DEMATERIALIZER_3;
    public static final SlimefunItemStack EMC_DEMATERIALIZER_4;
    public static final SlimefunItemStack EMC_DEMATERIALIZER_5;

    public static final SlimefunItemStack EMC_MATERIALIZER_1;
    public static final SlimefunItemStack EMC_MATERIALIZER_2;
    public static final SlimefunItemStack EMC_MATERIALIZER_3;
    public static final SlimefunItemStack EMC_MATERIALIZER_4;
    public static final SlimefunItemStack EMC_MATERIALIZER_5;

    public static final SlimefunItemStack EMC_NETWORK_MATERIALIZER;

    static {

        // region Crafting Materials

        UNORTHODOX_COAL = Theme.themedSlimefunItemStack(
            "ETC_UNORTHODOX_COAL",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "Than kỳ lạ",
            "Cấu trúc phân tử của loại than này đã được tái tổ chức.",
            "Dường như chỉ có một chút năng lượng."
        );

        UNORTHODOX_COAL_DUST = Theme.themedSlimefunItemStack(
            "ETC_UNORTHODOX_COAL_DUST",
            ItemStackGenerators.createEnchantedItemStack(Material.GUNPOWDER, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "Bột than kỳ lạ",
            "Nghiền than kỳ lạ thành bột."
        );

        TIGHTLY_PACKED_UNORTHODOX_COAL = Theme.themedSlimefunItemStack(
            "ETC_TIGHTLY_PACKED_UNORTHODOX_COAL",
            ItemStackGenerators.createEnchantedItemStack(
                Material.POLISHED_BLACKSTONE_BUTTON,
                true,
                new Pair<>(Enchantment.LURE, 1)
            ),
            Theme.CRAFTING,
            "Bột than kỳ lạ (Đã nén)",
            "Than kỳ lạ sau khi nén chặt."
        );

        UNORTHODOX_COAL_BLOCK = Theme.themedSlimefunItemStack(
            "ETC_UNORTHODOX_COAL_BLOCK",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL_BLOCK, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "Khối than kỳ lạ",
            "Một khối than kỳ lạ."
        );

        DEVIANT_COAL = Theme.themedSlimefunItemStack(
            "ETC_DEVIANT_COAL",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "Than bất thường",
            "Cấu trúc phân tử của loại than này đã được tái tổ chức.",
            "Bạn có thể cảm nhận năng lượng yếu ớt bên trong."
        );

        DEVIANT_COAL_DUST = Theme.themedSlimefunItemStack(
            "ETC_DEVIANT_COAL_DUST",
            ItemStackGenerators.createEnchantedItemStack(Material.GUNPOWDER, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "Bột than bất thường",
            "Nghiền than bất thường thành bột."
        );

        TIGHTLY_PACKED_DEVIANT_COAL = Theme.themedSlimefunItemStack(
            "ETC_TIGHTLY_PACKED_DEVIANT_COAL",
            ItemStackGenerators.createEnchantedItemStack(
                Material.POLISHED_BLACKSTONE_BUTTON,
                true,
                new Pair<>(Enchantment.LURE, 1)
            ),
            Theme.CRAFTING,
            "Bột than bất thường (Đã nén)",
            "Than bất thường sau khi nén chặt."
        );

        DEVIANT_COAL_BLOCK = Theme.themedSlimefunItemStack(
            "ETC_DEVIANT_COAL_BLOCK",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL_BLOCK, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "Khối than bất thường",
            "Một khối than bất thường."
        );

        DIVERGENT_COAL = Theme.themedSlimefunItemStack(
            "ETC_DIVERGENT_COAL",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "Than phân kỳ",
            "Cấu trúc phân tử của loại than này đã được tái tổ chức.",
            "Bạn có thể cảm nhận năng lượng mạnh mẽ bên trong."
        );

        DIVERGENT_COAL_DUST = Theme.themedSlimefunItemStack(
            "ETC_DIVERGENT_COAL_DUST",
            ItemStackGenerators.createEnchantedItemStack(Material.GUNPOWDER, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "Bột than phân kỳ",
            "Nghiền than phân kỳ thành bột."
        );

        TIGHTLY_PACKED_DIVERGENT_COAL = Theme.themedSlimefunItemStack(
            "ETC_TIGHTLY_PACKED_DIVERGENT_COAL",
            ItemStackGenerators.createEnchantedItemStack(
                Material.POLISHED_BLACKSTONE_BUTTON,
                true,
                new Pair<>(Enchantment.LURE, 1)
            ),
            Theme.CRAFTING,
            "Bột than phân kỳ (Đã nén)",
            "Than phân kỳ sau khi nén chặt."
        );

        DIVERGENT_COAL_BLOCK = Theme.themedSlimefunItemStack(
            "ETC_DIVERGENT_COAL_BLOCK",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL_BLOCK, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "Khối than phân kỳ",
            "Một khối than phân kỳ."
        );

        ANOMALOUS_COAL = Theme.themedSlimefunItemStack(
            "ETC_ANOMALOUS_COAL",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "Than dị thường",
            "Cấu trúc phân tử của loại than này đã được tái tổ chức.",
            "Bạn có thể cảm nhận năng lượng cực kỳ mạnh mẽ bên trong."
        );

        ANOMALOUS_COAL_DUST = Theme.themedSlimefunItemStack(
            "ETC_ANOMALOUS_COAL_DUST",
            ItemStackGenerators.createEnchantedItemStack(Material.GUNPOWDER, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "Bột than dị thường",
            "Nghiền than dị thường thành bột."
        );

        TIGHTLY_PACKED_ANOMALOUS_COAL = Theme.themedSlimefunItemStack(
            "ETC_TIGHTLY_PACKED_ANOMALOUS_COAL",
            ItemStackGenerators.createEnchantedItemStack(
                Material.POLISHED_BLACKSTONE_BUTTON,
                true,
                new Pair<>(Enchantment.LURE, 1)
            ),
            Theme.CRAFTING,
            "Bột than dị thường (Đã nén)",
            "Than dị thường sau khi nén chặt."
        );

        ANOMALOUS_COAL_BLOCK = Theme.themedSlimefunItemStack(
            "ETC_ANOMALOUS_COAL_BLOCK",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL_BLOCK, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "Khối than dị thường",
            "Một khối than dị thường."
        );

        PERFECTED_COAL = Theme.themedSlimefunItemStack(
            "ETC_PERFECTED_COAL",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "Than hoàn hảo",
            "Cấu trúc phân tử của loại than này đã được tái tổ chức.",
            "Năng lượng bên trong đã được ẩn giấu."
        );

        // endregion

        // region Components

        UNORTHODOX_FRAME = Theme.themedSlimefunItemStack(
            "ETC_UNORTHADOX_FRAME",
            new ItemStack(Material.BLACK_STAINED_GLASS),
            Theme.CRAFTING,
            "Khung kỳ lạ",
            "Một khung đơn giản",
            "Có thể dùng để chế tạo máy hoán đổi"
        );

        DEVIANT_FRAME = Theme.themedSlimefunItemStack(
            "ETC_DEVIANT_FRAME",
            new ItemStack(Material.BLACK_STAINED_GLASS),
            Theme.CRAFTING,
            "Khung bất thường",
            "Một khung đơn giản",
            "Có thể dùng để chế tạo máy hoán đổi"
        );

        DIVERGENT_FRAME = Theme.themedSlimefunItemStack(
            "ETC_DIVERGENT_FRAME",
            new ItemStack(Material.BLACK_STAINED_GLASS),
            Theme.CRAFTING,
            "Khung phân kỳ",
            "Một khung nâng cao",
            "Có thể dùng để chế tạo máy hoán đổi"
        );

        ANOMALOUS_FRAME = Theme.themedSlimefunItemStack(
            "ETC_ANOMALOUS_FRAME",
            new ItemStack(Material.BLACK_STAINED_GLASS),
            Theme.CRAFTING,
            "Khung dị thường",
            "Một khung cao cấp",
            "Có thể dùng để chế tạo máy hoán đổi"
        );

        PERFECTED_FRAME = Theme.themedSlimefunItemStack(
            "ETC_PERFECTED_FRAME",
            new ItemStack(Material.BLACK_STAINED_GLASS),
            Theme.CRAFTING,
            "Khung hoàn hảo",
            "Một khung hoàn hảo",
            "Có thể dùng để chế tạo máy hoán đổi"
        );

        UNORTHODOX_MACHINE_FRAME = Theme.themedSlimefunItemStack(
            "ETC_UNORTHADOX_MACHINE_FRAME",
            new ItemStack(Material.BLUE_STAINED_GLASS),
            Theme.CRAFTING,
            "Khung máy kỳ lạ",
            "Một khung máy đơn giản",
            "Phù hợp để chế tạo máy hoán đổi"
        );

        DEVIANT_MACHINE_FRAME = Theme.themedSlimefunItemStack(
            "ETC_DEVIANT_MACHINE_FRAME",
            new ItemStack(Material.BLUE_STAINED_GLASS),
            Theme.CRAFTING,
            "Khung máy bất thường",
            "Một khung máy đơn giản",
            "Phù hợp để chế tạo máy hoán đổi"
        );

        DIVERGENT_MACHINE_FRAME = Theme.themedSlimefunItemStack(
            "ETC_DIVERGENT_MACHINE_FRAME",
            new ItemStack(Material.BLUE_STAINED_GLASS),
            Theme.CRAFTING,
            "Khung máy phân kỳ",
            "Một khung máy nâng cao",
            "Phù hợp để chế tạo máy hoán đổi"
        );

        ANOMALOUS_MACHINE_FRAME = Theme.themedSlimefunItemStack(
            "ETC_ANOMALOUS_MACHINE_FRAME",
            new ItemStack(Material.BLUE_STAINED_GLASS),
            Theme.CRAFTING,
            "Khung máy dị thường",
            "Một khung máy cao cấp",
            "Phù hợp để chế tạo máy hoán đổi"
        );

        PERFECTED_MACHINE_FRAME = Theme.themedSlimefunItemStack(
            "ETC_PERFECTED_MACHINE_FRAME",
            new ItemStack(Material.BLUE_STAINED_GLASS),
            Theme.CRAFTING,
            "Khung máy hoàn hảo",
            "Một khung máy hoàn hảo",
            "Phù hợp để chế tạo máy hoán đổi"
        );

        // endregion

        // region Machines

        EMC_DEMATERIALIZER_1 = Theme.themedSlimefunItemStack(
            "ETC_DEMATERIALIZER_1",
            new ItemStack(Material.LIGHT_GRAY_WOOL),
            Theme.MACHINE,
            "Máy giải cấu ➊",
            "Máy này có thể giải cấu vật phẩm chậm",
            "và lưu EMC thu được vào tài khoản EMC của người chơi",
            "",
            Theme.CLICK_INFO.applyAsTitle("Tốc độ", "1 vật phẩm / 5 tick Slimefun"),
            Theme.CLICK_INFO.applyAsTitle("Lưu trữ", "1,000 J"),
            Theme.CLICK_INFO.applyAsTitle("Tiêu thụ năng lượng", "Giá trị EMC vật phẩm / 10")
        );

        EMC_DEMATERIALIZER_2 = Theme.themedSlimefunItemStack(
            "ETC_DEMATERIALIZER_2",
            new ItemStack(Material.LIME_WOOL),
            Theme.MACHINE,
            "Máy giải cấu ➋",
            "Máy này có thể giải cấu vật phẩm chậm",
            "và lưu EMC thu được vào tài khoản EMC của người chơi",
            "",
            Theme.CLICK_INFO.applyAsTitle("Tốc độ", "1 vật phẩm / 4 tick Slimefun"),
            Theme.CLICK_INFO.applyAsTitle("Lưu trữ", "10,000 J"),
            Theme.CLICK_INFO.applyAsTitle("Tiêu thụ năng lượng", "Giá trị EMC vật phẩm / 10")
        );

        EMC_DEMATERIALIZER_3 = Theme.themedSlimefunItemStack(
            "ETC_DEMATERIALIZER_3",
            new ItemStack(Material.LIGHT_BLUE_WOOL),
            Theme.MACHINE,
            "Máy giải cấu ➌",
            "Máy này có thể giải cấu vật phẩm chậm",
            "và lưu EMC thu được vào tài khoản EMC của người chơi",
            "",
            Theme.CLICK_INFO.applyAsTitle("Tốc độ", "1 vật phẩm / 3 tick Slimefun"),
            Theme.CLICK_INFO.applyAsTitle("Lưu trữ", "100,000 J"),
            Theme.CLICK_INFO.applyAsTitle("Tiêu thụ năng lượng", "Giá trị EMC vật phẩm / 10")
        );

        EMC_DEMATERIALIZER_4 = Theme.themedSlimefunItemStack(
            "ETC_DEMATERIALIZER_4",
            new ItemStack(Material.PURPLE_WOOL),
            Theme.MACHINE,
            "Máy giải cấu ➍",
            "Máy này có thể giải cấu vật phẩm chậm",
            "và lưu EMC thu được vào tài khoản EMC của người chơi",
            "",
            Theme.CLICK_INFO.applyAsTitle("Tốc độ", "1 vật phẩm / 2 tick Slimefun"),
            Theme.CLICK_INFO.applyAsTitle("Lưu trữ", "1,000,000 J"),
            Theme.CLICK_INFO.applyAsTitle("Tiêu thụ năng lượng", "Giá trị EMC vật phẩm / 10")
        );

        EMC_DEMATERIALIZER_5 = Theme.themedSlimefunItemStack(
            "ETC_DEMATERIALIZER_5",
            new ItemStack(Material.RED_WOOL),
            Theme.MACHINE,
            "Máy giải cấu ➎",
            "Máy này có thể giải cấu vật phẩm chậm",
            "và lưu EMC thu được vào tài khoản EMC của người chơi",
            "",
            Theme.CLICK_INFO.applyAsTitle("Tốc độ", "1 vật phẩm / tick Slimefun"),
            Theme.CLICK_INFO.applyAsTitle("Lưu trữ", "10,000,000 J"),
            Theme.CLICK_INFO.applyAsTitle("Tiêu thụ năng lượng", "Giá trị EMC vật phẩm / 10 (không quá giới hạn điện dung)")
        );

        EMC_MATERIALIZER_1 = Theme.themedSlimefunItemStack(
            "ETC_MATERIALIZER_1",
            new ItemStack(Material.LIGHT_GRAY_CONCRETE),
            Theme.MACHINE,
            "Máy tái cấu ➊",
            "Máy này có thể tái cấu vật phẩm chậm",
            "Sẽ tiêu tốn EMC từ tài khoản người chơi.",
            "",
            Theme.CLICK_INFO.applyAsTitle("Tốc độ", "1 vật phẩm / 5 tick Slimefun"),
            Theme.CLICK_INFO.applyAsTitle("Lưu trữ", "1,000 J"),
            Theme.CLICK_INFO.applyAsTitle("Tiêu thụ năng lượng", "Giá trị EMC vật phẩm")
        );

        EMC_MATERIALIZER_2 = Theme.themedSlimefunItemStack(
            "ETC_MATERIALIZER_2",
            new ItemStack(Material.LIME_CONCRETE),
            Theme.MACHINE,
            "Máy tái cấu ➋",
            "Máy này có thể tái cấu vật phẩm chậm",
            "Sẽ tiêu tốn EMC từ tài khoản người chơi.",
            "",
            Theme.CLICK_INFO.applyAsTitle("Tốc độ", "1 vật phẩm / 4 tick Slimefun"),
            Theme.CLICK_INFO.applyAsTitle("Lưu trữ", "10,000 J"),
            Theme.CLICK_INFO.applyAsTitle("Tiêu thụ năng lượng", "Giá trị EMC vật phẩm")
        );

        EMC_MATERIALIZER_3 = Theme.themedSlimefunItemStack(
            "ETC_MATERIALIZER_3",
            new ItemStack(Material.LIGHT_BLUE_CONCRETE),
            Theme.MACHINE,
            "Máy tái cấu ➌",
            "Máy này có thể tái cấu vật phẩm chậm",
            "Sẽ tiêu tốn EMC từ tài khoản người chơi.",
            "",
            Theme.CLICK_INFO.applyAsTitle("Tốc độ", "1 vật phẩm / 3 tick Slimefun"),
            Theme.CLICK_INFO.applyAsTitle("Lưu trữ", "100,000 J"),
            Theme.CLICK_INFO.applyAsTitle("Tiêu thụ năng lượng", "Giá trị EMC vật phẩm")
        );

        EMC_MATERIALIZER_4 = Theme.themedSlimefunItemStack(
            "ETC_MATERIALIZER_4",
            new ItemStack(Material.PURPLE_CONCRETE),
            Theme.MACHINE,
            "Máy tái cấu ➍",
            "Máy này có thể tái cấu vật phẩm chậm",
            "Sẽ tiêu tốn EMC từ tài khoản người chơi.",
            "",
            Theme.CLICK_INFO.applyAsTitle("Tốc độ", "1 vật phẩm / 2 tick Slimefun"),
            Theme.CLICK_INFO.applyAsTitle("Lưu trữ", "1,000,000 J"),
            Theme.CLICK_INFO.applyAsTitle("Tiêu thụ năng lượng", "Giá trị EMC vật phẩm")
        );

        EMC_MATERIALIZER_5 = Theme.themedSlimefunItemStack(
            "ETC_MATERIALIZER_5",
            new ItemStack(Material.RED_CONCRETE),
            Theme.MACHINE,
            "Máy tái cấu ➎",
            "Máy này có thể tái cấu vật phẩm chậm",
            "Sẽ tiêu tốn EMC từ tài khoản người chơi.",
            "",
            Theme.CLICK_INFO.applyAsTitle("Tốc độ", "1 vật phẩm / tick Slimefun"),
            Theme.CLICK_INFO.applyAsTitle("Lưu trữ", "10,000,000 J"),
            Theme.CLICK_INFO.applyAsTitle("Tiêu thụ năng lượng", "Giá trị EMC vật phẩm (không quá giới hạn điện dung)")
        );

        EMC_NETWORK_MATERIALIZER = Theme.themedSlimefunItemStack(
            "ETC_NETWORK_MATERIALIZER",
            new ItemStack(Material.YELLOW_STAINED_GLASS),
            Theme.MACHINE,
            "Máy tái cấu EMC Mạng",
            "Máy này có thể tái cấu vật phẩm chậm",
            "Sẽ tiêu tốn EMC từ tài khoản người chơi.",
            "",
            "Vật phẩm tạo ra hiển thị trong mạng",
            "nhưng sẽ không tự động lưu vào mạng",
            "",
            Theme.CLICK_INFO.applyAsTitle("Tốc độ", "1 vật phẩm / tick Slimefun"),
            Theme.CLICK_INFO.applyAsTitle("Lưu trữ", "10,000,000 J"),
            Theme.CLICK_INFO.applyAsTitle("Tiêu thụ năng lượng", "Giá trị EMC vật phẩm (không quá giới hạn điện dung)")
        );

        // endregion
    }
}
