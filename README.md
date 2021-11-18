## Today's lab: Thanksgiving Simulator

In order to utilize all of the skills we've gained, we will be simulating a thanksgiving dinner using java.  There are a few parts to keep in mind when creating this.

### Food classes

This program will be designed to have different objects for different types of food.  While you certainly could have 1, different foods need different attributes to be represented properly

##### Food

this is the base class for all food items.  It should have a few attributes
 - member variables for tastiness, a level of fillingness on a numerical scale, a name, and whether or not it's been eaten
 - setters and getters for each
 - a basic constructor for a generic food

Think about scope when creating each of these.  Should you really be able to change some of these attributes after creating an instance?


##### Turkey

this is a child of food.  It should have all of the same attributes as food, but it should make some changes as well.
 - add a member variable for whether or not the food is hot
 - change the way tastiness is done.  No one likes cold turkey, so the tastiness should reflect that if the food is cold.
    - (hint:  you need to override one of the setters to accomplish this)
 - add multiple constructors to this one.  Have a basic one, and one where you set the tastiness and heat; some pieces are better than others.


##### get creative

Feel free to add objects for whatever food items you want!  Thanksgiving doesn't just have turkey in it.


### Gathering Attendee

We will also be leveraging the code we wrote for Person earlier.  Make a class attendee that extends person.  Because this person is attending a thanksgiving meal, they need a few more attributes:
 - they are eating food, so they need an appetite, with the ability to set, get and change it
 - they should have the ability to eat food, which would both change things about the person, and about the food.  
   - (Hint: you can intake an object as an input parameter)
   - something to consider: can you really have negative appetite?
 - Because this is a gathering, they need to be able to talk.  there needs to be a way to know who is talking, so consider printing their name somewhere on the same line
 - extra: they should react differently based on how tasty the food is.


### Dinner

Now that all of our objects are in order, we need a dinner to act as the main method with instances of all our objects.  Have the attendees talk and eat the food we've created.  
