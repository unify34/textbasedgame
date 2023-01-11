def play_game():
    print("Welcome to the Text Adventure Game!")
    print("You find yourself in a room with two doors. One leads to the 'left' and the other leads to the 'right'.")
    choice = input("Which direction do you choose? (left/right) ")
    if choice == "left":
        print("You choose to go left.")
        print("You find yourself in a dark forest. You see a glowing sword on the ground.")
        sword_choice = input("Do you pick up the sword? (yes/no) ")
        if sword_choice == "yes":
            print("You pick up the sword and feel its power coursing through you.")
            print("You venture deeper into the forest and come across a dragon.")
            dragon_choice = input("Do you fight the dragon? (yes/no) ")
            if dragon_choice == "yes":
                print("You unsheath your sword and prepare to battle the dragon.")
                print("You strike the dragon with your sword and it falls to the ground, defeated.")
                print("You have completed the game!")
            else:
                print("You turn back and run away from the dragon.")
                print("You lose.")
        else:
            print("You leave the sword on the ground and venture deeper into the forest.")
            print("You come across a dragon.")
            dragon_choice = input("Do you fight the dragon? (yes/no) ")
            if dragon_choice == "yes":
                print("You try to fight the dragon without a weapon. It's too powerful and you are burned alive.")
                print("You lose.")
            else:
                print("You turn back and run away from the dragon.")
                print("You lose.")
    else:
        print("You choose to go right.")
        print("You find yourself in a dark cave.")
        cave_choice = input("Do you explore the cave? (yes/no) ")
        if cave_choice == "yes":
            print("You explore the cave and find a treasure chest.")
            treasure_choice = input("Do you open the treasure chest? (yes/no) ")
            if treasure_choice == "yes":
                print("You open the treasure chest and find a magic wand.")
                print("You have completed the game!")
            else:
                print("You leave the treasure chest unopened and turn back.")
                print("You lose.")
        else:
            print("You leave the cave and return to the starting room.")
            print("You lose.")

play_game()
