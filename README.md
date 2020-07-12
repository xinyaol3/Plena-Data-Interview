Time: 4:18 pm- 4:42pm
# Plena-Data-Interview
/*Create an application that will prompt for a user to input a string. Using the user’s inputted string, 
 * find the first letter that is not repeated. For example: If given the string ‘Bubble’, 
 * the letter ‘u’ would be the first character returned from the program. Once the first character is found and displayed back to the user, 
 * rewrite the string in order of number of occurrences and order from the inputted string. 
 * In the above example ‘Bubble’ would then be rewritten as ‘uleBbb’. Display this to the user.
*/
Please open the src and find the code in "Solution";
I first create a HashMap to store the character in string as key and frequency it appear as value; use a for loop to store the map and make all character to lower case.
Second, I use second for loop to go through string and find the value of each character in map, if value greater than 1 which means it'not non repeated letter so move to the end,
else means it's the non repeat letter in currently string just print out the location.
Finally print out the string after rewritten.
