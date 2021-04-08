class Solution {
    public String toGoatLatin(String S) {
        String[] tokens = S.split(" ");
        
        for(int token=0;token<tokens.length;token++){
            String firstWord = tokens[token];
            char firstLetter = firstWord.charAt(0);
            if(firstLetter == 'a'||firstLetter == 'e'||firstLetter == 'i'||firstLetter == 'o'||firstLetter == 'u'||firstLetter == 'A'||firstLetter == 'E'||firstLetter == 'I'||firstLetter == 'O'||firstLetter == 'U'){
                tokens[token] = firstWord+"ma";
            }else{
                tokens[token] = firstWord.substring(1)+firstLetter+"ma";
            }
            for(int j=0;j<=token;j++){
                tokens[token]+="a";
            }
        }
        
        return String.join(" ",tokens) ;
    }
}