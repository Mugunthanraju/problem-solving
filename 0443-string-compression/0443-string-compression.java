class Solution {
    public int compress(char[] chars) {
        if (chars.length < 2)
            return chars.length;
        
        int newlength = 0, index = 0; 

        // Traverse the entire array
        while (index < chars.length) {
            char currentChar = chars[index]; // Current character to compress
            int count = 0;                   // Count occurrences of the current character

            // Count consecutive occurrences of the current character
            while (index < chars.length && currentChar == chars[index]) {
                count++;
                index++;
            }

            // Write the character to the compressed array
            chars[newlength++] = currentChar;
            
            // If character repeats more than once, write its count as characters
            if (count > 1) {
                // Convert count to characters and write them one by one
                for (char num : Integer.toString(count).toCharArray()) {
                    chars[newlength++] = num;
                }
            }
        }

        // Return the length of the compressed array
        return newlength;
    }
}