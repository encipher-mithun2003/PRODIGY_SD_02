import random
def guessing_game():
    secret_number = random.randint(1, 100)
    attempts = 0 
    print("..........Welcome to the Guessing Game!..........")
    print("I have selected a number between 1 and 100. Try to guess it")
    while True:
        try:
            guess = int(input("Enter your guess: "))
            attempts += 1
            if guess == secret_number:
                print(f"Congratulations! You've guessed the number {secret_number} correctly in {attempts} attempts!")
                break
            elif guess < secret_number:
                print("Too low! Try again.")
            else:
                print("Too high! Try again.")
        except ValueError:
            print("Please enter a valid number.")
guessing_game()
