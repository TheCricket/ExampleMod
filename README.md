# ExampleMod
Getting started with minecraft modding? Check out this example!

Current Verion: 1.8.9

## Getting Started
Welcome to the wonderful world of modding. When you start it may seem extremely tough and all the tutorials out there are hard and confusing. Just start with the basics, add an item, then move to a block. You never want to start out making the next thaumcraft or the next thermal expansion. You will get easily frustrated and want to quit and I never want anyone to get that feeling.
My first tip is know an object oriented programming language or an OOP. Java is an OOP and will be pretty easy to learn with modding if you haven't touched it before. If you don't know any OOP's at all then you should learn to write basic java programs first that way you are familiar with the syntax and formatting that goes along with it. Knowing how to fix the errors that syntax errors and casting can produce is the next step. When learning a language make mistakes on purpose that way you know exactly where it is wrong and what error message is given. That way if you ever receive an error message in the future you will know what types of things you did so you can fix it.
Following tutorials is a great way to start but you have to make sure that you are watching the right minecraft version. If you are just starting out you don't really know the difference between minecraft updates and how to port the difference. So if you want to learn 1.7.10 modding watch 1.7.10 tutorials. Along with the last paragraph of making mistakes when learning to code. You need to make mistakes on purpose to learn the errors that minecraft will throw. You can also learn a lot from looking at some open source projects code and learning from them.
Getting help when problems seem tough is crucial. Where to get help is even more crucial. I have told you many times that knowing how to fix common errors is crucial because if you ask one of those problems in the common modding help channels they will have you banned quicker than you can say im sorry. Most modders hang out on IRC we use espernet, I recommend IRCCloud for a client but that is just me. The #minecraftforge channel can be helpful once in a blue moon but in my experience its just a great place to get beaten to a pulp as a new modder. You can ask me in #Chisel if you want :P
I finish with a good luck and enjoy yourself. Make sure you are always having fun when modding or you aren't doing it for the right reason. So go forth with your modding career. Create some awesome stuff and have a great time!

## Setting up your workspace
First you will need to clone the repo
Navigate to a good place that you want your mod to be and open console where you will type the following:
```
git clone https://github.com/TheCricket/ExampleMod.git
```

Once you have this done a new folder will be there called ExampleMod. You can rename this if you want. Open the folder and open another console window. You should be used to this as a coder. You will type:
```
gradlew setupDecompWorkspace
```
This will setup a dev workspace where you can also see the minecraft code. It will take a while and at some points look like it is frozen don't worry. If you wan't to see more progress you can do this instead
```
gradlew setupDecompWorkspace --info
```

This is where you can differ. I prefer Intellij Idea where you have to run genIntellijRuns which can be found in its gradle tab.
If you are using eclipse you are already done :)
