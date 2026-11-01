# Forge 1.12.2 shader-pipeline component

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
CI uploads this JAR as a workflow artifact.

## Important compatibility notes

AUSM's upstream documentation says it cannot be installed together with
OptiFine. It lists compatibility paths for mods including Celeritas,
Nothirium, LoliASM, Naughtirium, Lumenized, Efficient Entities, Entity
Culling, Render Lib, and Better Portals, but support depends on the exact
versions installed. Compatibility with the complete All the Mods 3 6.1.1
pack—and especially simultaneous use with the Sodium-derived Relictium
renderer—has not yet been tested.

## Attribution and licensing

See [UPSTREAMS.md](UPSTREAMS.md). The submodule retains the upstream LGPL-3.0
license and the upstream author notices.
