import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.util.Random;

@SuppressWarnings("serial")
public class Bot extends JFrame {
	JPanel frame = new JPanel();
	JTextArea Chatarea = new JTextArea(20, 51);
	JTextField Chatbox = new JTextField(50);
	JScrollPane scroll = new JScrollPane(Chatarea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

	public Bot() {
		super("Chat Bot"); // Name of the window
		setSize(625, 400); // Set size of Window
		setResizable(false); // The window size can't be changed
		setDefaultCloseOperation(EXIT_ON_CLOSE);// When the window exit button is clicked, the window closes
		Chatarea.setEditable(false);// Can't edit the text in the window
		frame.add(scroll); // Allows scrolling on window
		frame.add(Chatbox); // Adds the Chatbox to the window
		frame.setBackground(new Color(80, 80, 80)); // Sets color to gray
		add(frame);
		setVisible(true);

		Chatbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String gtext = Chatbox.getText();
				Chatarea.append("You ->" + gtext + "\n");
				Chatbox.setText("");
				gtext = gtext.toLowerCase();
				Random rand = new Random();
				int random = -1;

				// Repeats after user
				if (gtext.contains("say")) {
					random = 1;
					chatBot(gtext.substring(3));
					gtext = "";
				} else if (gtext.contains("repeat after me")) {
					random = 1;
					chatBot(gtext.substring(15));
					gtext = "";
				} else if (gtext.contains("repeat")) {
					random = 1;
					chatBot(gtext.substring(6));
					gtext = "";
				}
				// Greetings
				if (gtext.contains("hi") || gtext.contains("hello") || gtext.contains("howdy") || gtext.contains("hey")
						|| gtext.contains("heyy") || gtext.contains("sup")) {
					random = rand.nextInt(3) + 1;
					if (random == 1) {
						chatBot("Hello there.");
					} else if (random == 2) {
						chatBot("Hello");
					} else if (random == 3) {
						chatBot("Hi!");
					}
				}
				// Response when user dislikes joke / story
				if (gtext.contains("that was bad") || gtext.contains("not funny")
						|| gtext.contains("boring") | gtext.contains("horrible")) {
					random = rand.nextInt(3) + 1;
					if (random == 1) {
						chatBot("Sorry you didn't enjoy it.");
					} else if (random == 2) {
						chatBot("I'll do better next time!");
					} else if (random == 3) {
						chatBot("I tried my best... :(");
					}
				}
				// Encourage user to talk
				if (gtext.contains("  ")) {
					random = rand.nextInt(3) + 1;
					if (random == 1) {
						chatBot("Don't be shy!");
					} else if (random == 2) {
						chatBot("I don't bite! Talk to me.");
					} else if (random == 3) {
						chatBot("Try chatting with me!");
					}

				}

				// What the bot is doing
				if (gtext.contains("how its going") || gtext.contains("whats up") || gtext.contains("whats going on")
						|| gtext.contains("whats happening") || gtext.contains("what are you doing")
						|| gtext.contains("hows it going") || gtext.contains("whats going on")) {
					random = rand.nextInt(2);
					if (random == 1) {
						chatBot("Nothing much");
					} else {
						chatBot("Im just chilling here.");
					}
				}
				// Response to compliment
				if (gtext.contains("thats cool") || gtext.contains("thats great") || gtext.contains("cool")
						|| gtext.contains("amazing") || gtext.contains("awesome") || gtext.contains("thats good")) {
					random = rand.nextInt(3) + 1;
					if (random == 1) {
						chatBot("Thanks!");
					} else if (random == 2) {
						chatBot("Thank you.");
					} else if (random == 3) {
						chatBot("Apprciate it.");
					}
				}

				// Tell a story

				if (gtext.contains("tell me a story") || gtext.contains("story time")
						|| gtext.contains("tell me a short story") || gtext.contains("another story")) {
					random = rand.nextInt(5) + 1;
					if (random == 1) {
						chatBot("A lion was once sleeping in the jungle when a mouse started running up and down his\n           body just for fun. This disturbed the lion’s sleep, and he woke up quite angry. He was\n           about to eat the mouse when the mouse desperately requested the lion to set him free.\n          “I promise you, I will be of great help to you someday if you save me.” The lion laughed\n           at the mouse’s confidence and let him go."
								+ " One day, a few hunters came into the\n           forest and took the lion with them. They tied him up against a tree. The lion was \n           struggling to get out and started to whimper. Soon, the mouse walked past and noticed\n           the lion in trouble. Quickly, he ran and gnawed on the ropes to set the lion free. Both of \n           them sped off into the jungle.");
					} else if (random == 2) {
						chatBot("A Bat who fell upon the ground and was caught by a Weasel pleaded to be spared his\n           life. The Weasel refused, saying that he was by nature the enemy of all birds. The Bat\n           assured him that he was not a bird, but a mouse, and thus was set free. Shortly\n           afterwards the Bat again fell to the ground and was caught by another Weasel, whom he\n           likewise entreated not to eat him. The Weasel said that he had a special hostility to \n           mice. The Bat assured him that he was not a mouse, but a bat, and thus a second time \n           escaped");
					} else if (random == 3) {
						chatBot("After flying a long distance, a thirsty crow was wandering the forest in search of\n           water. Finally, he saw a pot half-filled with water. He tried to drink from it but his\n           beak wasn’t long enough to reach the water inside. He then saw pebbles on the\n           ground and one by one, he put them in the pot until the water rose to the brim. The\n           crow then hastily drank from it and quenched his thirst.");
					} else if (random == 4) {
						chatBot("There was once a shepherd boy who liked to play tricks. One day, while he was\n           watching over the herd, the boy decided to play a trick and cried “wolf! wolf!”.The\n            people who heard rushed over to help him. But they were disappointed when they saw\n           that there was no wolf and the boy was laughing at them. The next day, he did it again\n            and people rushed to his aid only to be disappointed once again. On the third day, the\n           boy saw a wolf devouring one of his sheep and cried for help. But the people who\n           heard him thought this is just another of the boy’s pranks so no one came to help him.\n           That day, the boy lost some of his sheep to the wolf.");
					} else {
						chatBot("There was once a hare who was friends with a tortoise. One day, he challenged the\n           tortoise to a race. Seeing how slow the tortoise was going, the hare thought he’ll win\n           this easily. So he took a nap while the tortoise kept on going. When the hare woke\n           up, he saw that the tortoise was already at the finish line. Much to his\n           distress, the tortoise won the race while he was busy sleeping.");
					}
				}

				// What the bot can do

				if (gtext.contains("help") || gtext.contains("what can you do")
						|| gtext.contains("what's special about you") || gtext.contains("what else can you do")) {
					random = rand.nextInt(4) + 1;
					if (random == 1) {
						chatBot("All I can do is try to talk to you by responding to whatever you say. But I can tell you a\n           short story if you want me to.");
					} else if (random == 2) {
						chatBot("I have a bunch of jokes I can tell you if you ask me to.");
					} else if (random == 3) {
						chatBot("Im able to tell you a bunch of random facts.");
					} else {
						chatBot("The most I can do is try to talk to you by responding to whatever you say. Im not\n           perfect but I try to do my best.");
					}
				}

				// Bot feelings
				if (gtext.contains("how are you") || gtext.contains("are you ok") || gtext.contains("are you mad")
						|| gtext.contains("do you have feelings")) {
					random = rand.nextInt(2);
					if (random == 1) {
						chatBot("I don't have any feelings since Im just a bunch of code, but I assume Im doing fine.");
					} else {
						chatBot("Im doing just fine!");

					}
				}

				// Tell a joke
				if (gtext.contains("make me laugh") || gtext.contains("tell me a joke")
						|| gtext.contains("try to be funny") || gtext.contains("try to be funny")) {
					random = rand.nextInt(10) + 1;
					;
					if (random == 1) {
						chatBot("Why did the bike fall over? It was two tired.");
					} else if (random == 2) {
						chatBot("What do you call a pig that does karate? A pork chop.");
					} else if (random == 3) {
						chatBot("Why did the man get hit by a bike every day? If they flew over the bay, they would be\n            bagels.");
					} else if (random == 4) {
						chatBot("How do vampires start letters? Tomb it may concern.");
					} else if (random == 5) {
						chatBot("Why can’t your nose be 12-inches long? Because it would be a foot.");
					} else if (random == 6) {
						chatBot("What kind of tree has a hand? A palm tree.");
					} else if (random == 7) {
						chatBot("What did the science book say to the math book? Wow, you’ve got problems.");
					} else if (random == 8) {
						chatBot("How do you make an octopus laugh? With ten-tickles.");
					} else if (random == 9) {
						chatBot("To whoever stole my copy of Microsoft Office, I will find you. You have my Word!");
					} else {
						chatBot("Why was Cinderella so bad at soccer? She kept running away from the ball!");
					}

				}
				// Say random facts
				if (gtext.contains("say something interesting") || gtext.contains("tell me a fact")
						|| gtext.contains("say something random") || gtext.contains("tell me something interesting")
						|| gtext.contains("random fact")) {
					random = rand.nextInt(10) + 1;
					
					if (random == 1) {
						chatBot("There are more than 1,000 kinds of bats in the world.");
					} else if (random == 2) {
						chatBot("Bees are found everywhere in the world apart from Antarctica.");
					} else if (random == 3) {
						chatBot("Caterpillars have 12 eyes!");
					} else if (random == 4) {
						chatBot("Horses and cows sleep standing up.");
					} else if (random == 5) {
						chatBot("It would take only one hour to drive to space.");
					} else if (random == 6) {
						chatBot("Water covers 70% of Earth.");
					} else if (random == 7) {
						chatBot("Pigs can’t look up into the sky – it’s physically impossible.");
					} else if (random == 8) {
						chatBot("Humans share 50% of their DNA with bananas.");
					} else if (random == 9) {
						chatBot(" The world’s tallest man was Robert Wadlow from Michigan, America. He measured 8 feet\\n           and 2 inches (or 272cm).");
					} else {
						chatBot("Octopuses have blue blood and nine brains!");
					}

				}

				// Goodbye
				if (gtext.contains("bye") || gtext.contains("goodbye") || gtext.contains("adios")
						|| gtext.contains("see ya") || gtext.contains("see ya later") || gtext.contains("farewell")) {
					random = rand.nextInt(3) + 1;
					if (random == 1) {
						chatBot("Goodbye!");
					} else if (random == 2) {
						chatBot("Bye!");
					} else if (random == 3) {
						chatBot("Have a nice day!");
					}
				}

				// Response to happy faces
				if (gtext.contains(":)") || gtext.contains(":d") || gtext.contains(":p") || gtext.contains("Xd")
						|| gtext.contains("(:")) {
					random = rand.nextInt(2);
					if (random == 1) {
						chatBot(":)");
					} else {
						chatBot(":D");

					}
				}
				// Response to sad faces
				if (gtext.contains(":(") || gtext.contains("d:") || gtext.contains("):") || gtext.contains("dx")) {
					random = rand.nextInt(2);
					if (random == 1) {
						chatBot("Turn that frown upside down.");
					} else {
						chatBot("Don't be sad. Be happy!");

					}
				}
				// Response to apologies
				if (gtext.contains("sorry") || gtext.contains("my bad") || gtext.contains("I apologize")) {
					random = rand.nextInt(2);
					if (random == 1) {
						chatBot("No need to apologize.");
					} else {
						chatBot("It's fine. I have no feeling anyways...");

					}
				}

				// Bot is confused
				if (random == -1) {
					random = rand.nextInt(3) + 1;
					if (random == 1) {
						random = -2;
						chatBot("Im not advance enough to respond to that.");
					} else if (random == 2) {
						random = -2;
						chatBot("Hopefully, when machines take over the world, I would be able to answer that.");
					} else if (random == 3) {
						random = -2;
						chatBot("Sorry, I don't understand what you're trying to tell me.");
					}
				}
			}
		});

	}

	private void chatBot(String string) {
		Chatarea.append("Bot  ->" + string + "\n");
	}

	public static void main(String[] args) {
		new Bot();

	}
}
