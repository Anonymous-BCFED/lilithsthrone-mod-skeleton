# Mod Skeleton

Mod Skeleton is a basic framework you can use to create your own mod with a plugin.

## Terminology

| Term | Meaning |
|---|---|
| **Mod** | Collection of data, graphics, and plugins that add or modify content in the game. |
| **Plugin** | A JAR containing Java classes and metadata that can modify the game at runtime. |
| **$EDITOR** | Your favorite code editor (e.g. VSCode, Atom, Eclipse, Notepad++, Gedit, Kate, nano, vim, etc.) Eclipse is currently recommended. |

## What can a Plugin Do?

Plugins have access to (almost) all of the game, as Java has a very robust reflection API that allows game code structures to be changed at runtime.

This excludes enums, unfortunately, but Lilith's Throne developers have added some tools to make modifying enums unnecessary.

Examples of Plugin Usage:

* Adding NPC classes
* Adding fetishes
* Overriding hardcoded content
* Changing content from the base game or another mod
* Debugging
* Cheats

## OMG Executable Code

Be aware that plugins can carry all sorts of heinous things, so it's recommended to only download them from trustworthy sources, and only make plugins if you have no other choice.

**If in doubt, don't install it.**

## Getting Started

This is a long list, but you only have to do it once.

1. Install Oracle Java JDK 1.8+ and Maven.
1. Install git or Git for Windows from https://git-scm.org/.
1. Create a new project on GitHub/GitLab/GitGud/etc.
1. Clone your project to your computer (`git clone <SSH URL for your repo> path/to/your/desired/project/folder`)
1. Download this repository as a ZIP
1. Extract contents to your project folder
1. Open a console and `cd` to your project folder.
1. Copy LilithsThrone.jar to the `lib/` folder as `game-1.jar`. Case matters.
    * **Never commit this JAR to the repository.** It is just used for compiling things, and having big binary things in your GitHub is bad.
1. Edit `pom.xml` with $EDITOR and set up everything you need.
1. Edit `build.sh` and `build.bat`.
1. Edit and rename `plugin/myplugin/MyExamplePlugin.java`.
1. Edit `src/PLUGIN_METADATA.xml`.
1. Replace `LICENSE` with whatever license you want.  
    * You should use an open-source license like MIT, BSD, GPLv2, GPLv3, etc.  [This website](https://choosealicense.com/licenses/) can help you choose.  Keep in mind that people may want to *fork* (make their own clone of) your project if you stop maintaining it at some point.
    * While *this repo* is licensed MIT, you are given special permission to relicense the contents and remove credits so you can make your own project.
1. Add any files you'd usually add to `res/mods/$AUTHOR/` to `res/`.  These will be copied to the `dist` folder with the correct directory structure.
1. `git add .` to stage all your files for the commit we're about to make.
1. `git commit -a -m "Initial commit"` to commit all your changes to your local copy of your repository.
1. Open project with your favorite $EDITOR and start editing!

## Building your Project

1. Run build.sh (Linux) or build.bat (Windows).
1. Compress the contents of `dist` with your favorite universal file compression format (ZIP, 7z, etc)

## Oh No, Lilith's Throne Updated!

1. Close $EDITOR (Eclipse/Rider/Notepad/VSCode/Vim/Nano/etc), if it's open.
1. Check this repository for any major changes and merge them if needed.
1. Replace `lib/game-1.jar` with the new LT JAR.
1. Open the project in $EDITOR and check for fires.