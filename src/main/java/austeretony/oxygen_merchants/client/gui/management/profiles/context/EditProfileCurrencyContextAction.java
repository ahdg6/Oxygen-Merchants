package austeretony.oxygen_merchants.client.gui.management.profiles.context;

import austeretony.alternateui.screen.core.GUIBaseElement;
import austeretony.oxygen_core.client.api.ClientReference;
import austeretony.oxygen_core.client.gui.elements.OxygenGUIContextMenuElement.ContextMenuAction;
import austeretony.oxygen_merchants.client.gui.management.ProfilesManagementGUISection;

public class EditProfileCurrencyContextAction implements ContextMenuAction {

    private final ProfilesManagementGUISection section;

    private final String name;

    public EditProfileCurrencyContextAction(ProfilesManagementGUISection section) {
        this.section = section;
        this.name = ClientReference.localize("oxygen_merchants.gui.management.editProfileCurrency");
    }

    @Override
    public String getName(GUIBaseElement currElement) {
        return this.name;
    }

    @Override
    public boolean isValid(GUIBaseElement currElement) {
        return true;
    }

    @Override
    public void execute(GUIBaseElement currElement) {
        this.section.openProfileCurrencyManagementCallback();
    }
}
