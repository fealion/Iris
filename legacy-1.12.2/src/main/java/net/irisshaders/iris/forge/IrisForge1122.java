package net.irisshaders.iris.forge;

import net.minecraftforge.fml.common.Mod;

/**
 * Minimal Forge 1.12.2 bootstrap.
 *
 * Shader-pack loading and the legacy OpenGL pipeline are not implemented in
 * this bootstrap. Do not advertise this as a working shaders mod yet.
 */
@Mod(
    modid = IrisForge1122.MOD_ID,
    name = IrisForge1122.NAME,
    version = IrisForge1122.VERSION,
    acceptedMinecraftVersions = "[1.12.2]"
)
public final class IrisForge1122 {
    public static final String MOD_ID = "iris";
    public static final String NAME = "Iris (Forge 1.12.2)";
    public static final String VERSION = "0.1.0-1.12.2";
}
