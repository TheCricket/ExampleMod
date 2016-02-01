# Lesson 2

## Part 1: Adding an Item!
Notes from last time:
    - You need to make the proxy static so forge can access it
    - I meant com.example.example.proxy.ClientProxy. Just a derp :)
Congrats you have your first item! I made a quick texture I know its not good.
To recap the things you need for an item are:
    - An item object in ModItems that you then register with registerItem()
    - Registering the item in ItemModelRegistry so it can render
    - A class for the item if you want it to have special properties
    - An Item json found in assets.example.models.item
    - Finally a texture! which you give the path to in your json
    
