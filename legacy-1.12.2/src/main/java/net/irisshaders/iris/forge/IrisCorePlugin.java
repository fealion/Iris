package net.irisshaders.iris.forge;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixins;

import java.util.Map;

/**
 * Bootstraps the legacy Forge Mixin environment before game classes load.
 *
 * The shader-pipeline mixins are deliberately added in later porting steps.
 */
@IFMLLoadingPlugin.Name("IrisForge1122")
@IFMLLoadingPlugin.MCVersion("1.12.2")
@IFMLLoadingPlugin.SortingIndex(-5000)
@IFMLLoadingPlugin.TransformerExclusions({
    "net.irisshaders.iris.forge"
})
public final class IrisCorePlugin implements IFMLLoadingPlugin {
    public IrisCorePlugin() {
        MixinBootstrap.init();
        MixinEnvironment.getDefaultEnvironment().setObfuscationContext("searge");
        Mixins.addConfiguration("mixins.iris.json");
    }

    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
        // No environment-specific setup is required at bootstrap time.
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
