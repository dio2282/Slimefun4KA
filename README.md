# Slimefun Chinese Version

Looking for English (or Original) Version? [**Click here**](https://github.com/Slimefun/Slimefun4/)

Want to download directly? [**Click here**](https://github.com/SlimefunGuguProject/Slimefun4/blob/master/README.md#floppy_disk-download-slimefun4)

Welcome to join QQ group: 807302496

Download [SlimeGlue](https://github.com/Xzavier0722/SlimeGlue/) to ensure compatibility between Slimefun and other protection plugins

### Subscription Plan

⚡ Translation is not easy, welcome to support [Afdian](https://afdian.net/a/nora1ncity)

Join the Afdian subscription plan to get early access to the latest Slimefun builds, as well as higher priority for issue handling.

Note: **Non-annual plan users** can get automatically synced source code 15+ days after the last public repository update, it is not closed source. We strictly follow the GPLv3 license :)

Learn about the subscription plan: [Subscription Plan](https://builds.guizhanss.com/sf-subscription)

![Current Version](https://img.shields.io/github/v/release/SlimefunGuguProject/Slimefun4?include_prereleases)
![Build Status](https://builds.guizhanss.com/SlimefunGuguProject/Slimefun4/master/badge.svg)
[![Issues](https://img.shields.io/github/issues/SlimefunGuguProject/Slimefun4.svg?style=popout)](https://github.com/SlimefunGuguProject/Slimefun4/issues)
![Downloads](https://img.shields.io/github/downloads/SlimefunGuguProject/Slimefun4/total)

After using the Chinese version, **it is prohibited** to create new issues on the official issue tracker using the Chinese version!  
If you insist on doing so, please use the **official** development version and submit issues in **English** when reporting.  
Otherwise, please create issues here or join the group for discussion.

Slimefun is a plugin dedicated to providing a mod-like experience. It provides everything you can think of, from jetpacks to magic altars!

Slimefun allows each player to decide whether to develop in magic or technology.  
From wands to nuclear reactors, we have everything.  
In addition, we also have magic altars, energy networks, and even item transport systems.

This project started in 2013 and is still developing.
It has grown from an independent small plugin to a community with thousands of participants and hundreds of contributors.  
Currently, Slimefun has added more than **500 new items/recipes**
([View the history of Slimefun](https://slimefun-wiki.guizhanss.cn/Slimefun-in-a-nutshell)).

At the same time, Slimefun also has a wide variety of addons to choose from!<br>
Open the [Addon List](https://slimefun-wiki.guizhanss.cn/Addons) to find the addon you want!

### Navigation

* **[Download Slimefun 4](#floppy_disk-download-slimefun4)**
* **[Discord Server](#discord)**
* **[Bug Reports](https://github.com/SlimefunGuguProject/Slimefun4/issues)**
* **[Official Wiki](https://github.com/Slimefun/Slimefun4/wiki)**
* **[Unofficial Chinese Wiki](https://slimefun-wiki.guizhanss.cn/)**
* **[FAQ](https://slimefun-wiki.guizhanss.cn/FAQ)**

## :floppy_disk: Download Slimefun4

(You can check: [How to Install Slimefun](https://slimefun-wiki.guizhanss.cn/Installing-Slimefun))

Slimefun 4 can be **downloaded for free** from [Guizhan Builds](https://builds.guizhanss.com/SlimefunGuguProject/Slimefun4).

The following are the differences between the two versions:

|                      | Beta Version (Latest Updates)                                                                                | "Stable" Version                                                                                        |
|----------------------|-------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------|
| **Supported Minecraft Versions** | :video_game: 1.19.X - 1.21.X                                                              | :video_game: 1.16.X - 1.21.4                                                                 |
| **Java Version**          | :computer: **Java 17+**                                                                   | :computer: **Java 17+**                                                                      |
| **Auto Update System**           | :heavy_check_mark:                                                                        | :heavy_check_mark:                                                                           |
| **Frequent Updates**             | :heavy_check_mark:                                                                        | :x:                                                                                          |
| **Latest Content**           | :heavy_check_mark:                                                                        | :x:                                                                                          |
| **Bug Reports**           | :heavy_check_mark:                                                                        | :x:                                                                                          |
| **Download Link**             | :package: **[Download Latest](https://builds.guizhanss.com/SlimefunGuguProject/Slimefun4/master)** | :package: **[Download "Stable"](https://builds.guizhanss.com/SlimefunGuguProject/Slimefun4/release)** |


**Please note: The supported Minecraft versions listed here do not represent the available range of the latest version, and may refer to support for a certain historical version. The supported version labels are for reference only.**

**! We recommend using the latest beta version to get the latest content updates and bug fixes!**

## :computer: (Development) Adding Dependencies

<details>

<summary>How to Add Slimefun 4 as a Dependency</summary>
First, add our private repository:

Maven:

Release version:
```xml
<repository>
    <id>gugu-maven-repo</id>
    <url>https://maven.norain.city/releases</url>
</repository>
```

Development version (Slimefun Insider / DEV branch):
```xml
<repository>
    <id>gugu-maven-repo</id>
    <url>https://maven.norain.city/snapshots</url>
    <snapshots>
        <enabled>true</enabled>
    </snapshots>
</repository>
```

Gradle: Add the following to `build.gradle`:

Release version:
```groovy
repositories {
    maven {
        url "https://maven.norain.city/releases"
    }
}
```

Development version (Slimefun Insider / DEV branch):
```groovy
repositories {
    maven {
        url "https://maven.norain.city/snapshots"
    }
}
```

Next, add Slimefun 4 as a dependency:
Maven:

```xml
<dependency>
    <groupId>com.github.SlimefunGuguProject</groupId>
    <artifactId>Slimefun4</artifactId>
    <version>DEV-SNAPSHOT</version>
    <scope>provided</scope>
</dependency>
```

Gradle:

```groovy
dependencies {
    compileOnly 'com.github.SlimefunGuguProject:Slimefun4:DEV-SNAPSHOT'
}
```
</details>


## :computer: Building Slimefun
To build Slimefun4, you must first install [Git](https://git-scm.com/)

Open a terminal or command prompt in the location where you want to store the code, and run the following command:

```bash
git clone https://github.com/SlimefunGuguProject/Slimefun4.git --depth=1
```
This will pull the Slimefun code to your local machine.

Finally, open the `Slimefun4` folder, and open a terminal or command prompt in that folder and enter the following command to build:
- If you are on Windows: `.\mvnw.cmd package`
- If you are on a Unix-like system: `.\mvnw package`

After building, you can find the compiled plugin file in the `Slimefun4/target` folder.

## :framed_picture: Screenshots

So, what does Slimefun look like?<br>
We asked some people from the [Discord server](#discord) to send us some screenshots:
| Reactors and Power | Amazing Automated Factory | Magic Laboratory |
| :-------------------------------------------: | :--------------------------------------: | :----------------------------------------: |
| ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase1.png) | ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase6.png) | ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase5.png) |
| *Screenshot provided by HamtaBot#0001* | *Screenshot provided by Piͭxͪeͤl (mnb)#5049* | *Screenshot provided by Kilaruna#4981* |
| ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase4.png) | ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase3.png) | ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase2.png) |
| *Screenshot provided by GalaxyKat11#3816* | *Screenshot provided by TamThan#7987* | *Screenshot provided by Kilaruna#4981* |

## :headphones: Community

### Chinese Version QQ Groups

Chinese version discussion QQ group: 807302496 (Slimefun Chinese Version Discussion)
Addon discussion QQ group: 205679802 (Slimefun Addon Discussion, and translation group plugin update notifications)

### KOOK Communication Channel

Welcome to join the KOOK [Slimefun Simplified Chinese Community](https://kook.top/oqZwh8) server

### Official Discord

You can find Slimefun's community server on Discord and communicate with **over 7000** users from around the world.  
Click the image below to join the Discord server to report issues and suggestions, or discuss content about this plugin.  
Slimefun officials often hold community events, join to learn more.  
**Note**: Slimefun officials **do not** accept any form of issue reports on the Discord server, please use the [Issue Tracker](https://github.com/SlimefunGuguProject/Slimefun4/issues) to report issues!

Before joining, please understand the official Discord server's [important rules](https://github.com/Slimefun/Slimefun4/wiki/Discord-Rules).  
Those who do not follow the above rules may be kicked or even banned from the server.

<p align="center">
  <a href="https://discord.gg/slimefun">
    <img src="https://discordapp.com/api/guilds/565557184348422174/widget.png?style=banner3" alt="Discord Invite"/>
  </a>
</p>

## :open_book: Wiki

Slimefun has a (detailed and frequently maintained - *ahem*) Wiki for new players,
you can also consider contributing to the Wiki.
Official Wiki: https://github.com/Slimefun/Slimefun4/wiki  
Unofficial Chinese Wiki: https://slimefun-wiki.guizhanss.cn/

#### :star: Useful Documentation (Chinese)

* [What is Slimefun?](https://slimefun-wiki.guizhanss.cn/Slimefun-in-a-nutshell)
* [How to Install Slimefun](https://slimefun-wiki.guizhanss.cn/Installing-Slimefun)
* [Slimefun 4 Addon List](https://slimefun-wiki.guizhanss.cn/Addons)
* [Slimefun 4 Addon Development Tutorial](https://slimefun-wiki.guizhanss.cn/Developer-Guide)
* [Getting Started](https://slimefun-wiki.guizhanss.cn/Getting-Started)
* [FAQ](https://slimefun-wiki.guizhanss.cn/FAQ)
* [Common Issues in Use](https://slimefun-wiki.guizhanss.cn/Common-Issues)
* [Help Us Expand the Wiki!](https://slimefun-wiki.guizhanss.cn/Expanding-the-Wiki)
* [Help Us Translate Slimefun!](https://slimefun-wiki.guizhanss.cn/Translating-Slimefun)

This Wiki is maintained by @ybw0014. If you find any missing articles, please report them on the Wiki's Issues page.

## :handshake: Contributing to the Project

Slimefun 4 is an open-source project under the [GNU GPLv3 license](https://github.com/Slimefun/Slimefun4/blob/master/LICENSE).
More than 100 people have contributed to this project, and these people are amazing.  
We encourage you to contribute to Slimefun 4 by submitting PRs. Your contributions will keep us alive <3.

## :exclamation: Disclaimer

Slimefun4 uses multiple systems to collect plugin usage data, and automatic updates to push new versions to you.
The plugin does not collect personal privacy information stored in any form. The specific types of information collected can be seen below.

Of course, you can turn off data telemetry and automatic updates at any time.

<details>
  <summary>Automatic Updates</summary>

Slimefun Chinese Version uses Github API + GuizhanBuild API to detect and download updates.  
We have automatic updates enabled by default, but you can turn it off in `/plugins/Slimefun/config.yml`.  
We strongly recommend that you enable automatic updates to ensure you get the latest features/fixes.

</details>

<details>
  <summary>Server Anonymous Data</summary>

Slimefun4 uses [bStats](https://bstats.org/plugin/bukkit/Slimefun/4574) to collect anonymous information about the plugin, because we are interested in how server players use the plugin.  
However, all data published on bStats is anonymous, and we absolutely cannot trace back to specific servers or players based on the reported data.  
All collected data is publicly accessible: https://bstats.org/plugin/bukkit/Slimefun/4574

You can also turn off data collection under `/plugins/bStats/config.yml`.  
Learn more by viewing the [bStats Privacy Policy](https://bstats.org/privacy-policy).

</details>

<details>
  <summary>GitHub Data</summary>

Slimefun4 uses the [GitHub API](https://api.github.com/) to collect usage data about this open-source project.  
Rest assured, your Minecraft server information will not be sent to Github.

This information includes but is not limited to:

* List of collaborators, their usernames and profile links (from repositories `Slimefun/Slimefun4`, `Slimefun/Slimefun-Wiki` and `Slimefun/Resourcepack`)
* Number of open issues in the repository
* Number of pending pull requests in the repository
* Number of repository Stars
* Number of repository branches
* Repository code size
* Date of last commit in the repository

  </details>

In addition, the plugin also uses [textures.minecraft.net](https://www.minecraft.net/en-us) to obtain collaborators' Minecraft skins.  
Please note: Slimefun is not affiliated with `Mojang Studios` or Minecraft.
