# Forge 1.12.2 shader-pipeline component

This legacy branch intentionally disables the upstream modern Iris build and release workflows. Those workflows build the current modern Iris codebase and are not suitable for Minecraft 1.12.2. The branch-specific CI below only builds the pinned 1.12.2 Forge shader project.

A direct port of modern Iris to Minecraft 1.12.2 is not present in this
branch. Instead, this branch pins **AUSM (Actually Usable Shader Mod) 1.0.9
Java 8**, a separate 1.12.2 shader pipeline which targets Forge
14.23.5.2860 and aims to support shader-pack syntax compatible with Iris /
OptiFine packs.

This is an alternative shader implementation, **not an official Iris port**,
and it does not promise full feature parity with modern Iris.

## Get the source and build

From the repository root:

```sh
git submodule update --init --recursive
cd legacy-1.12.2/shader-pipeline
./gradlew --no-daemon assemble
```

The build uses JDK 25 and produces a Java 8 distributable:
`build/libs/AUSM-1.0.9-Java8.jar`. The Forge runtime target is Java 8.
CI uploads this JAR as the `ausm-1.0.9-forge-1.12.2-java8` workflow artifact. It does not upload the modern `iris-artifacts` build.

## Important compatibility notes

AUSM's upstream documentation says it cannot be installed together with
OptiFine. The official ATM3 6.1.1 mod list does not list OptiFine, so that
specific incompatibility is not an obvious pack-level blocker. This does not
prove that AUSM works with the pack's other rendering or mixin-based mods.

AUSM lists compatibility paths for mods including Celeritas, Nothirium,
LoliASM, Naughtirium, Lumenized, Efficient Entities, Entity Culling, Render
Lib, and Better Portals, but support depends on the exact versions installed.
Compatibility with the complete All the Mods 3 6.1.1 pack—and especially
simultaneous use with the Sodium-derived Relictium renderer—has not yet been
tested. Treat the two artifacts as separate experiments until that combined
runtime test succeeds.

## Attribution and licensing

See [UPSTREAMS.md](UPSTREAMS.md). The submodule retains the upstream LGPL-3.0
license and the upstream author notices.
