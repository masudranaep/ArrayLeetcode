    public List<String> letterCombinations(String digits) {
             LinkedList<String> input_arr = new LinkedList();
        if(digits.length() == 0 ) return input_arr;
        input_arr.add("");
        String[] char_map = new String[]{"0", "1", "abc", "def", "ghi", "jkl","mno", "pqrs", "tuv", "wxyz"};
        
        for(int i = 0; i <digits.length(); i++){
            int index = Character.getNumericValue(digits.charAt(i));
            while(input_arr.peek().length() == i){
                String permision = input_arr.remove();
                for(char  c : char_map[index].toCharArray()){
                    input_arr.add(permision + c);
                }
            }
        }
        return input_arr;
    
    }
}