package austeretony.oxygen_merchants.common.main;

import austeretony.oxygen_core.client.api.ClientReference;
import net.minecraft.util.text.TextComponentTranslation;

public enum EnumMerchantsChatMessage {

    INGAME_MANAGEMENT_DISABLED,
    MERCHANTS_DATA_RELOADED;

    public void show(String... args) {
        switch (this) {
        case INGAME_MANAGEMENT_DISABLED:
            ClientReference.showChatMessage(new TextComponentTranslation("oxygen_merchants.message.ingameManagementDisabled"));
            break;
        case MERCHANTS_DATA_RELOADED:
            ClientReference.showChatMessage(new TextComponentTranslation("oxygen_merchants.message.merchantsDataReloaded"));
            break;
        }
    }
}
