package fi.dy.masa.litematica.config;

import com.google.gson.JsonElement;
import fi.dy.masa.malilib.MaLiLib;
import fi.dy.masa.malilib.config.options.ConfigBoolean;

public class LockedConfigBoolean extends ConfigBoolean
{
    public LockedConfigBoolean(String name, boolean defaultValue) {
        super(name, defaultValue);
    }

    public LockedConfigBoolean(String name, boolean defaultValue, String comment) {
        super(name, defaultValue, comment);
    }

    public LockedConfigBoolean(String name, boolean defaultValue, String comment, String prettyName) {
        super(name, defaultValue, comment, prettyName);
    }

    public LockedConfigBoolean(String name, boolean defaultValue, String comment, String prettyName, String translatedName) {
        super(name, defaultValue, comment, prettyName, translatedName);
    }

    @Override
    public void setBooleanValue(boolean value)
    {

    }

    @Override
    public void setValueFromString(String value)
    {

    }

    @Override
    public void setValueFromJsonElement(JsonElement element)
    {
        MaLiLib.LOGGER.warn("Failed to set config value for '{}' because this config element is immutable",this.getName());
    }
}
