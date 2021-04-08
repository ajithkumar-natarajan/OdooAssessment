# Given the deck ['A',1,2,3,4,5,6,7,8,9,10,'J','K','Q'], write a function that shuffles the deck using the randint function. 
# The random module includes a basic function randint(a, b) that returns a uniformly random integer from a to b (including both endpoints). 

import random

inputDeck =  ['A',1,2,3,4,5,6,7,8,9,10,'J','K','Q']
random.shuffle(inputDeck)

return inputDeck