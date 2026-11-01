# Iris — Forge 1.12.2 port (bootstrap)

This directory is an isolated legacy target for Minecraft 1.12.2 / Forge
14.23.5.2860 / Java 8. It leaves the modern Fabric and NeoForge project intact.

## Current status

This is **only the initial Forge mod bootstrap**. It registers a minimal mod
entry point. It does not load shader packs, implement shader programs, or
provide compatibility with Sodium yet.

## Build

Use JDK 8 and Gradle 4.10.3:

```sh
cd legacy-1.12.2
gradle setupDecompWorkspace
gradle build
```

The output JAR is written to `build/libs/`.

## Porting milestones

1. Establish a reproducible ForgeGradle 2.3 / Java 8 build.
2. Implement a 1.12.2 shader-pack parser and pack lifecycle.
3. Rebuild the OpenGL shader pipeline for the legacy fixed-function / LWJGL
   environment and 1.12.2 render passes.
4. Integrate with the Sodium legacy renderer through a small stable bridge,
   while retaining vanilla-renderer fallback.
5. Test shader packs and mod interactions against ATM3 6.1.1.

Do not install this bootstrap as a shaders mod: shader-pack support is not
implemented.
