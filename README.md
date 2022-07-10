# Mod Skeleton

Mod Skeleton is a basic framework you can use to create your own mod with a plugin.

## Getting Started

This is a long list, but you only have to do it once.

1. Install Java JDK 1.8+ and Maven.
1. Create a new project on GitHub/GitLab/GitGud/etc.
1. Clone your project to your computer (`git clone <SSH URL for your repo> path/to/your/desired/project/folder`)
1. Download this repository as a ZIP
1. Extract contents to your project folder
1. Open a console and `cd` to your project folder.
1. Copy LilithsThrone.jar to the `lib/` folder as `game-1.jar`. Case matters.
    * **Never commit the JAR to the repository.**
1. Edit `pom.xml` with your favorite text editor and set up everything you need.
1. Edit and rename `plugin/myplugin/MyExamplePlugin.java`.
1. Edit `src/PLUGIN_METADATA.xml` to taste.
1. Rename the res/mods/authorname folder to something like `yourname` Do not use spaces or symbols other than `_`.
1. Edit `build.sh` and `build.bat`.
1. Replace `LICENSE` with whatever license you want.  
    * You should use an open-source license like MIT, BSD, GPLv2, GPLv3, etc.  [This website](https://choosealicense.com/licenses/) can help you choose.  Keep in mind that people may want to *fork* (make their own clone of) your project if you stop maintaining it at some point.
    * While *this repo* is licensed MIT, you are given special permission to relicense the contents and remove credits so you can make your own project.
1. `git add .` to stage all your files for the commit we're about to make.
1. `git commit -a -m "Initial commit"` to commit all your changes to your local copy of your repository.
1. Open project with your favorite editor and start editing!

## Building

1. Run build.sh or build.bat

##