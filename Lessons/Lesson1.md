# Lesson 1
Running through the basics!
## Part 1
These are your base files that you get from forge itself. You can obtain it by going to files.minecraftforge.net and downloading the MDK or ModDevelopmentKit for the version of forge that you want to develop.
Your build.gradle is how you customize how your mod is built. I will comment everything in there for you.

## Part 2
This is the @Mod file and and your mcmod.info
The mcmod.info is what shows up in the mod list in-game you can have banners, credits and show all the authors.
The @Mod file is where forge starts reading your mod. Its where everything in your mod starts. Technically you have made a mod in forge's eyes at this point! In the next lesson we will add content though.

## Part 3
Proxies are your key to separation. You will use the ClientProxy for registering your rendering. The ServerProxy will be used for anything you want to do purely on the server!