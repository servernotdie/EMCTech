package io.github.sefiraat.emctech.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.github.sefiraat.emctech.EmcTech;
import io.github.sefiraat.emctech.emc.EmcStorage;
import io.github.sefiraat.emctech.utils.EmcUtils;
import io.github.sefiraat.emctech.utils.Theme;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandCompletion;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Subcommand;
import co.aikar.commands.bukkit.contexts.OnlinePlayer;

@CommandAlias("emctech|emc")
public class EmcTechMain extends BaseCommand {

    @Default
    public void onDefault(CommandSender sender) {
        sender.sendMessage(Theme.ERROR + "Vui lòng nhập lệnh hợp lệ.");
    }

    @Subcommand("emc")
    @Description("Hiển thị EMC của bạn")
    public void viewEmc(CommandSender sender) {
        if (sender instanceof Player player) {
            player.sendMessage(Theme.MAIN + "Giá trị EMC hiện tại: " + EmcUtils.EMC_FORMAT.format(EmcStorage.getEmc(player)));
        } else {
            sendPlayerOnlyMessage(sender);
        }
    }

    @Subcommand("viewemc")
    @CommandPermission("EMCTech.Admin")
    @CommandCompletion("@players")
    @Description("Hiển thị EMC của người chơi")
    public void viewEmc(CommandSender sender, Player player) {
        if (sender instanceof Player commandIssuer) {
            commandIssuer.sendMessage(Theme.MAIN + player.getName() + " Giá trị EMC hiện tại: " + EmcStorage.getEmc(player));
        } else {
            EmcTech.getInstance()
                   .getLogger()
                   .info(Theme.MAIN + player.getName() + "Giá trị EMC hiện tại: " + EmcUtils.EMC_FORMAT.format(EmcStorage.getEmc(
                       player)));
        }
    }

    @Subcommand("addemc")
    @CommandPermission("EMCTech.Admin")
    @CommandCompletion("@players <amount>")
    @Description("Thêm EMC cho người chơi")
    public void addEmc(CommandSender sender, OnlinePlayer player, double amount) {
        EmcStorage.addEmc(player.getPlayer(), amount);
    }

    @Subcommand("setemc")
    @CommandPermission("EMCTech.Admin")
    @CommandCompletion("@players <amount>")
    @Description("Đặt EMC cho người chơi")
    public void setEmc(CommandSender sender, OnlinePlayer player, double amount) {
        EmcStorage.setEmc(player.getPlayer(), amount);
    }

    public void sendPlayerOnlyMessage(CommandSender sender) {
        sender.sendMessage(Theme.ERROR + "Chỉ người chơi mới có thể thực thi lệnh này.");
    }
}

