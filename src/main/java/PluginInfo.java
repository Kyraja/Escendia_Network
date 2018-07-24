import org.spongepowered.api.Sponge;
import org.spongepowered.api.plugin.PluginContainer;

public class PluginInfo {

    public final static String PLUGIN_ID = "escendianetwork";
    public final static String PLUGIN_NAME = "Escendia Network Plugin";
    public final static String PLUGIN_VERSION = "0.0.1-Alpha";
    public final static String PLUGIN_DESCRIPTION = "Escendia Network Plugin";
    public final static PluginContainer plugin = Sponge.getPluginManager().getPlugin(PLUGIN_ID).get();

}
